import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AllInput extends HttpServlet {
    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String fName = req.getParameter("fName");
        String lName = req.getParameter("lName");
        String mail = req.getParameter("mail");
        PrintWriter out = res.getWriter();
        try {
            if (!fName.equals("") && !lName.equals("") && !mail.equals("")) {
                out.println(fName + " " + lName);
                out.println("Email: " + mail);

            } else {

                out.println("Input field is Emplty Pls Check Input Field");

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}