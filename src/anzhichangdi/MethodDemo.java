public class MethodDemo {
    public static void main(String[] args) {
        int a=3;
        m1(a);
        System.out.println("AAAAAA: "+a);
    }
    /*
    局部变量
     */
    public static void m1(int a){
        a=5;
        System.out.println("CCCCCC: "+a);
    }
}
