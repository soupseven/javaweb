package cn.how2j.javaweb;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServerJumpServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            request.setAttribute("name", "gareen");
            request.getRequestDispatcher("hello").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        }

    }
}
