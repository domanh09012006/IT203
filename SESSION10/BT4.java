package SESSION10;

interface RemoteControl {
    void powerOn();
    default void checkBattery() {
        System.out.println("Pin on dinh");
    }
}
class SmartLight implements RemoteControl {
    @Override
    public void powerOn() {
        System.out.println("Den da bat");
    }
}
public class BT4 {
    public static void main(String[] args) {
        SmartLight smartLight = new SmartLight();
        smartLight.powerOn();
        smartLight.checkBattery();
    }
}
