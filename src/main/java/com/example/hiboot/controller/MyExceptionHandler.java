package com.example.hiboot.controller;

import com.example.hiboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.controller
 * @ClassName: MyExceptionHandler
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/8 19:33
 * @Version: 1.0
 */
@ControllerAdvice
public class MyExceptionHandler {
    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(Exception e, HttpServletRequest request) {
        // 传入错误状态码
        request.setAttribute("javax.servlet.error.status_code", 500);
        Map<String, Object> map = new HashMap<>();
        map.put("code", "not Exist");
        map.put("message", e.getMessage());
        request.setAttribute("ext", map);
        // 转发到/error
        return "forward:/error";
    }
}
