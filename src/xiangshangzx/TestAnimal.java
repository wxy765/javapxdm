public class TestAnimal {
    public static void main(String[] args) {
        Cat animal = new Dog("哈士奇", "金色");//这就是对象向上转型，即把子类对象的引用赋给父类的对象
        animal.sayHi();
        animal.call();
        Cat animal1=new Cat("小花猫");
        animal1.sayHi();
        animal1.call();
    }
}
