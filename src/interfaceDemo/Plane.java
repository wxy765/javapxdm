package interfaceDemo;

public class Plane implements Fly {
    @Override
    public void fly() {
        System.out.println("燃烧煤油实现飞行");
    }
}
