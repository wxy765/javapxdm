public class Cat {
    public String name;//成员变量name
    public int legs=2;//成员变量legs,
    public Cat(){}//无参数构造方法
    public Cat(String name){//有参数的构造方法，用于对成员变量name进行初始化操作
        this.name=name;
    }
    protected void sayHi(){
        System.out.println("我的名字："+name);
        System.out.println("我有："+legs+"条腿");
    }
    public void call(){
        System.out.println("喵喵叫");
    }
}
