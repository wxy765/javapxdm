package upcasting;

import javafx.scene.control.Cell;

public class Test02 {
    public static void main(String[] args) {
        ColorPhone colorPhone=new ColorPhone();
        SmartPhone smartPhone=new SmartPhone();
        m1(colorPhone);
        m1(smartPhone);
    }
    public static void m1(CellPhone cellPhone){
        cellPhone.sendSMS();
        cellPhone.call();
    }
    /*
    overload：方法重载
     */
    /*public static void m1(ColorPhone colorPhone){
        colorPhone.sendSMS();
        colorPhone.call();
    }
    public static void m1(SmartPhone smartPhone){
        smartPhone.sendSMS();
        smartPhone.call();
    }*/
}
