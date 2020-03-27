package com.MyCookie;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ReqCookie {

    @RequestMapping("/addCookie")
    public void addCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie cookie1 = new Cookie("cookiename", "cookievalue");
        Cookie cookie2 = new Cookie("cookiename1", "cookievalue1");
        Cookie cookie3 = new Cookie("cookiename2", "cookievalue2");
        cookie1.setMaxAge(3);
        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
    }

    @RequestMapping("/getCookie")
    public void getCookie(HttpServletRequest request, HttpServletResponse response) {
        Cookie[] cookies = request.getCookies();//这样便可以获取一个cookie数组
        for (Cookie cookie : cookies) {
            cookie.getName();// get the cookie name
            cookie.getValue(); // get the cookie value
            System.out.println(cookie.getName() + "   " + cookie.getValue());
        }
    }
}
