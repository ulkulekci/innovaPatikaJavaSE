package cominnovaa.inheritance;

public class Asus extends Computer {
    private String asusPrimary;

    public Asus() {
    }
    public Asus(int computerId, String computerRam, String asusPrimary) {
        super(computerId, computerRam); // atadan gelen
        this.asusPrimary = asusPrimary; // this nesneden gelen
    }

    @Override
    public String toString() {
        return "Asus{" +
                "asusPrimary='" + asusPrimary + '\'' +
                '}' + super.toString();
    }
    @Override
    public void getInheritanceMethod() {
        super.getInheritanceMethod();
        System.out.println("asus override");
    }
    
    
    
  // getter setter
    public String getAsusPrimary() {
        return asusPrimary;
    }

    public void setAsusPrimary(String asusPrimary) {
        this.asusPrimary = asusPrimary;
    }

    public void inheritanceMethod() {
    }
}
