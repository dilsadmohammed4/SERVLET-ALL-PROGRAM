import java.sql.*;

public class LoginDao {
    public static boolean validate(String Email_id, String Password) {
        boolean status = false;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "SYSTEM");
            PreparedStatement ps = con
                    .prepareStatement("select Email_id,Password from PRegister where Email_id=? and Password=?");
            ps.setString(1, Email_id);
            ps.setString(2, Password);

            ResultSet rs = ps.executeQuery();
            status = rs.next();

        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }
}