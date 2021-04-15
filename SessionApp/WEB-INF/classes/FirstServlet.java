import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class FirstServlet extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String age = req.getParameter("age");

        HttpSession session = req.getSession();
        session.setAttribute("name", name);
        session.setAttribute("Addr", address);
        session.setAttribute("age", age);

        pw.println("<BODY BGCOLOR=cyan>");
        pw.println("<CENTER><H1><FONT COLOR=red>Provide Your Exp & Skils</FONT></H1></CENTER>");
        pw.println("<FORM  ACTION='SecondServlet' METHOD=GET>");
        pw.println("<TABLE ALIGN=CENTER>");
        pw.println("<TR>");
        pw.println("<TD>");
        pw.println("<H2><FONT COLOR=BLUE>Enter Number of Years Exp:");
        pw.println("<INPUT TYPE=TEXT NAME=exp SIZE=6>");
        pw.println("</TD></TR>");
        pw.println("<TR>");
        pw.println("<TD>");
        pw.println(" <H2><FONT COLOR=blue><B>Select Skils:</B>");
        pw.print("<SELECT NAME=skils>");
        pw.print("<OPTION VALUE=JAVA>JAVA/J2EE </OPTION>");
        pw.print("<OPTION VALUE=.NET>.Net </OPTION>");
        pw.print("<OPTION VALUE=ORACLE>ORACLE 10G </OPTION>");
        pw.print("<OPTION VALUE=XML>XML & Web Services </OPTION>");
        pw.print("</SELECT>");
        pw.println("</TD></TR>");
        pw.println("<TR><TD>");
        pw.println("<INPUT TYPe=Submit value=Continue>");
        pw.println("</TABLE></BODY>");
    } // service()
} // class