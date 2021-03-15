package ui.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/DynamischePagina")
public class EersteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html lang=en>");
        out.println("<head>");
        out.println("<meta charset=UTF-8>");
        out.println("<title>Thomas Slegers</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p id=dynamisch>LOLOL TEST 3</p>");
        out.println("<a id=home href=index.html>Home</a>");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
