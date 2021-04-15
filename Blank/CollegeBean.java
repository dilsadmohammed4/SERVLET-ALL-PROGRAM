public class CollegeBean {
    /* JavaBean properties */
    private int studregno;
    private String bname;
    private String sname;

    /* getter() and setter() methods */
    public void setStudregno(int studregno) {
        this.studregno = studregno;
    }

    public int getStudregno() {
        return studregno;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public String getBname() {
        return bname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    public static void main(String[] args) {

        CollegeBean c = new CollegeBean();
        c.setStudregno(123);
        System.out.println(c.getStudregno());
        c.setSname("Dilsad Mohammed");
        System.out.println(c.getSname());
        c.setBname("MCA");
        System.out.println(c.getBname());

    }
}