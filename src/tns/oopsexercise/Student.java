package tns.oopsexercise;

public class Student {
    private int sid;
    private String sname;

    public int getSid() {
        return sid;
    }
    void display(){
        System.out.println(this.sid);
        System.out.println(this.sname);
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
