package chouxianglei;

import chouxianglei.Square;
import chouxianglei.Tnangle;

public class Test {
    public static void main(String[] args) {
        Square square=new Square(5);
        System.out.println(square.calcarea());
        Tnangle tnangle=new Tnangle(5,6);
        System.out.println(tnangle.calcarea());
    }
}
