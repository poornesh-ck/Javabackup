public class students {
    public students(int sid, String sname, int marks) {
        this.sid = sid;
        this.sname = sname;
        this.marks = marks;
    }

    int sid;
    String sname;
    int marks;

    public int getSid() {
        return sid;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student \n   ID : " + sid +"\n   Name : " +   sname +"\n   marks: " + marks ;
    }



}
