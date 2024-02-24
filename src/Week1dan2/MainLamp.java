package Week1dan2;

class Lamp {
    private String brand;
    private int voltage;
    private int price;

    void turnOn() {
        System.out.println("The light is on");
    }
    void turnOff() {
        System.out.println("The light is off");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
class Switch{
    Lamp lamp = new Lamp();
    public void press(){
        lamp.turnOn();
    }
    public void unpress(){
        lamp.turnOff();
    }
    public void displayDetail(Lamp lamp){
        System.out.println(lamp.getBrand());
        System.out.println(lamp.getPrice());
        System.out.println(lamp.getVoltage());
    }
}
public class MainLamp {
    public static void main(String[] args) {
        Lamp mylamp = new Lamp();
        mylamp.setBrand("Philips");
        mylamp.setPrice(10000);
        mylamp.setVoltage(12);

        Switch mySwitch = new Switch();
        mySwitch.press();
        mySwitch.displayDetail(mylamp);
        mySwitch.unpress();
    }

}
