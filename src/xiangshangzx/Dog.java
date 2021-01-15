public class Dog extends Cat {
    public int legs = 4;//在Cat类中定的成员变量legs与父类中定义的成员变量legs是同名，所以父类中的legs成员变量在子类中将被隐藏
    String color;
    public Dog() {
    }
    protected Dog(String name, String color) {
        super(name);
        this.color = color;
    }
    protected void sayHi() {
        System.out.println("我的名字：" + name);
        System.out.println("我有：" + legs + "条腿");
        System.out.println("我身上的颜色是：" + color);
    }

    @Override
    public void call() {
        System.out.println("汪汪叫");
    }
}