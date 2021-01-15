package chouxianglei;

import chouxianglei.Shape;

public class Tnangle extends Shape {
    private float bottom;
    private float height;

    public Tnangle(float bottom, float height) {
        this.bottom = bottom;
        this.height = height;
    }

    @Override
    public float calcarea() {
        System.out.println("计算三角形的面积：");
        return (bottom*height)/2;
    }
}
