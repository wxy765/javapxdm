package upcasting;

public class ColorPhone extends CellPhone {

    @Override
    void sendSMS() {
        System.out.println("彩屏手机发短信");
    }

    @Override
    void call() {
        System.out.println("彩屏手机打电话");
    }
}
