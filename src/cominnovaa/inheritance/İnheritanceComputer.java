package cominnovaa.inheritance;

public class İnheritanceComputer {
    public static void main(String[] args) {

        try {
            Msi msi = new Msi();
            msi.setComputerRam("sx2434");
            msi.setComputerId(7);
            System.out.println(msi);
            msi.inheritanceMethod(); // polimorfizm

            Asus asus = new Asus();
            asus.setComputerId(44);
            asus.setComputerRam("asus ram:34254");
            asus.setAsusPrimary("special Asus property");
            asus.inheritanceMethod(); // polimorfizm
            System.out.println(asus);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
