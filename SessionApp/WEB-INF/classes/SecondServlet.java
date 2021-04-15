import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.net.*;
import java.util.*;

public class SecondServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String exp = req.getParameter("exp");
        String skils = req.getParameter("skils");
        HttpSession session = req.getSession();
        session.setAttribute("exp", exp);
        session.setAttribute("skils", skils);
        pw.println("<BODY BGCOLOR=cyan>");
        pw.println("<CENTER><H1><FONT COLOR=red>Provide City & Salary</FONT></H1></CENTER>");
        pw.println("<FORM  ACTION='ThirdServlet' METHOD=GET>");
        pw.println("<TABLE ALIGN=CENTER>");
        pw.println("<TR>");
        pw.println("<TD>");
        pw.println("<H2><FONT COLOR=BLUE>Enter Preference City :");
        pw.println("<INPUT TYPE=TEXT NAME=city SIZE=6>");
        pw.println("</TD></TR>");
        pw.println("<TR>");
        pw.println("<TD>");
        pw.println("<H2><FONT COLOR=BLUE>Enter Expected Salary :");
        pw.println("<INPUT TYPE=TEXT NAME=sal SIZE=16>");
        pw.println("</TD></TR>");
        pw.println("<TR><TD>");
        pw.println("<INPUT TYPE=SUBMIT VALUE=Submit >");
        pw.println("</TABLE></BODY>");
    } // service
} // class