package interfaceDemo;

public class Person implements Fly{
    @Override
    public void fly() {
        System.out.println("背助推器实现飞行");
    }
}
