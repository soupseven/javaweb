package cn.how2j.javaweb;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ParamServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response){
        try {
            String name = request.getParameter("name");
            response.getWriter().println("get name:" + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response){
        try {
            String name = request.getParameter("name");
            response.getWriter().println("post name:" + name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
