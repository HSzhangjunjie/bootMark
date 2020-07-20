package com.example.hiboot.controller;

import com.example.hiboot.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.controller
 * @ClassName: HelloController
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/2 19:02
 * @Version: 1.0
 */
@Controller
public class LoginController {

    // @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    // 简化为下述Rest风格注解
    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session) {
        if (!StringUtils.isEmpty(username.trim()) && "123456".equals(password.trim())) {
            session.setAttribute("username", username);
            session.setAttribute("password", password);
            return "redirect:/main.html";
        } else {
            map.put("message", "用户名密码错误!");
            return "login";
        }

    }

    @RequestMapping("/level1")
    public String level1(){
        return "success";
    }
    @RequestMapping("/level2")
    public String level2(){
        return "success";
    }
    @RequestMapping("/level3")
    public String level3(){
        return "success";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user) {
        if ("aaa".equals(user)) {
            throw new UserNotExistException();
        } else {
            return "hello world!";
        }
    }
}
