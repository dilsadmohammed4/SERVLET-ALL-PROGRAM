import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class FirstSrv1 extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter pw;
        // set content type and other response header fields first
        response.setContentType("text/html");
        // then write the data of the response
        pw = response.getWriter();
        // get values submitted by the form
        String name = request.getParameter("name");
        String fname = request.getParameter("Fname");
        // create a cookie to store the values of name and fname
        Cookie c1 = new Cookie("name", name);
        Cookie c2 = new Cookie("fname", fname);
        response.addCookie(c1);
        response.addCookie(c2);
        pw.println("<center><b>");
        // now we need to genetare the second form dynamically from here
        pw.println("<form action='second' method=get>");
        pw.println("Income For This Year: <input type='text' name='income'><BR>");
        pw.println(" Tax: <input type=text name=tax>");
        pw.println("<br><br><BR><BR><input type='submit'  value ='SUBMIT'>");
        pw.println("</form></center>");
        pw.close();
    }
}