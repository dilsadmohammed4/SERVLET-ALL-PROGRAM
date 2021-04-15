public class Login {
    private String userName;
    private String userPass;

    public void setuserName(String userName) {
        this.userName = userName;
    }

    public String getuserName() {
        return userName;
    }

    public void setuserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getuserPass() {
        return userPass;
    }

    public static void main(String[] args) {
        Login c = new Login();
        c.setuserName("dilsadmohammed4@gmail.com");
        System.out.println(c.getuserName());
        c.setuserPass("dilsad123");
        System.out.println(c.getuserPass());

    }
}
