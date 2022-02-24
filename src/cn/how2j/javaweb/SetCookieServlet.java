package cn.how2j.javaweb;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SetCookieServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            Cookie c = new Cookie("name", "Gareen(cookie)");
            c.setMaxAge(60 * 24 * 60);
            c.setPath("/");
            response.addCookie(c);
            Cookie c1 = new Cookie("sex", "superwoman");
            response.addCookie(c1);
            response.getWriter().println("set cookie successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
