package cominnovaa.inheritance;
// nesne değişkenleri
public class Computer {
    private int computerId;
    private String computerRam;
// parametresiz constructor
    public Computer() {
    }
    public Computer(int computerId, String computerRam) {
        this.computerId = computerId;
        this.computerRam = computerRam;
    }
 // toString
    @Override
    public String toString() {
        return "Computer{" +
                "computerId=" + computerId +
                ", computerRam='" + computerRam + '\'' +
                '}';
    }
    public void getInheritanceMethod(){
        System.out.println("merhabalar inheritance");
    }


    // getter setter
    public int getComputerId() {
        return computerId;
    }

    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    public String getComputerRam() {
        return computerRam;
    }

    public void setComputerRam(String computerRam) {
        this.computerRam = computerRam;
    }
}
