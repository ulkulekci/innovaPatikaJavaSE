package cominnova.Bean;

public class BeanMainTest {
    public static void main(String[] args) {
        Bean_lombok beann=new Bean_lombok();
        beann.setStudentName("ülkü");
        System.out.println(beann.getStudentName());
        System.out.println(beann.hashCode());
        String statickey = StaticTutorials.URL;
    }
}
