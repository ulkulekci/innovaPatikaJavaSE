package cominnovaa.inheritance;

public class Msi extends Computer{

    @Override
    public void getInheritanceMethod() {
        super.getInheritanceMethod();
        System.out.println("Msi override");
    }

    public void inheritanceMethod() {
    }
}
