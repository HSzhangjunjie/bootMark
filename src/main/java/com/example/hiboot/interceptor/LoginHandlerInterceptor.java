package com.example.hiboot.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: hiboot
 * @Package: com.example.hiboot.interceptor
 * @ClassName: LoginHandlerInterceptor
 * @Author: ZhangJunjie
 * @Description:
 * @Date: 2020/7/6 15:52
 * @Version: 1.0
 */
public class LoginHandlerInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("username");
        if (user == null) {
            request.setAttribute("message", "请登录！");
            request.getRequestDispatcher("/login.html").forward(request, response);
            return false;
        } else {
            return true;
        }
    }
}
