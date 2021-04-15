import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AllPeople extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String age = request.getParameter("age");
        String gender = request.getParameter("allRadio");
        HttpSession session = request.getSession();
        session.setAttribute("name", name);
        session.setAttribute("id", id);
        session.setAttribute("age", age);
        session.setAttribute("gender", gender);
        try {
            if (gender.equals("Male") || gender.equals("FeMale")) {

                out.println("<html><title>Profession</title><body>");
                out.println("<FORM  action='Profession' METHOD=Post>");
                out.println("<table><tr><td>");
                out.println("<B>Select Profession:</B>");
                out.print("<SELECT NAME=Profession>");
                out.print("<OPTION VALUE=Teacher>Teacher</OPTION>");
                out.print("<OPTION VALUE=Student>Student </OPTION>");
                out.print("</SELECT></td></tr>");

                out.println("<tr><td>");
                out.println("<INPUT TYPe=Submit value=Continue>");
                out.println("<tr><td>");

                out.println(" </form></body></html>");

            } else {
                out.print("Plese Select A Option To Perform Operation...");
                RequestDispatcher dis = request.getRequestDispatcher("index.html");
                dis.include(request, response);
            }
        }

        catch (Exception ee) {
            out.println(ee.getMessage());
        }
    }
}