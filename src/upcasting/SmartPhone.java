package upcasting;

public class SmartPhone extends CellPhone {
    @Override
    void sendSMS() {
        System.out.println("智能手机发短信");
    }

    @Override
    void call() {
        System.out.println("智能手机打电话");
    }
}
