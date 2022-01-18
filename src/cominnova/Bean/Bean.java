package cominnova.Bean;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Bean implements Serializable {
    // nesne değişkenleri(object variable)
    // global değişkenler
    private int studentid;
    private String studentName;
    private String studentSurname;
    private Date createdDate;


    // paremetresiz constructor
    public Bean() {
      this.studentName="ülkü";
        createdDate=new Date(System.currentTimeMillis());
        //this("dfsg","fdgg"); bu yapının 2. özelliği
    }
    // parametreli constructor
    public Bean(int studentid, String studentName, String studentSurname) {
        this.studentid = studentid;
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }
    public Bean(String studentName, String studentSurname) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
    }
    // toString

    @Override
    public String toString() {
        return "Bean{" +
                "studentid=" + studentid +
                ", studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
    // equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bean bean = (Bean) o;
        return studentid == bean.studentid && Objects.equals(studentName, bean.studentName) && Objects.equals(studentSurname, bean.studentSurname) && Objects.equals(createdDate, bean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentid, studentName, studentSurname, createdDate);
    }
    // method
    public void fullname(){
        System.out.println(this.studentName+" "+this.studentSurname);
    }
    // getter and setter


    public int getStudentid() {
        return studentid;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
