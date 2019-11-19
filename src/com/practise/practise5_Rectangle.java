package com.practise;

/*
* 编写接口Shape，该接口包含符号常量PI，抽象方法getArea()。定义两个普通类Rectangle和Circle，两个类都要求声明Shape接口。
* 在Rectangle类中复写getArea()方法求矩形面积，在Circle类中复写getArea()方法求圆形面积。在主函数中分别定义两个类的实例，
* 矩形边长输入4和6，圆形输入半径值为3，求各自的面积并输出。
* */
public class practise5_Rectangle {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int r = 3;
        Rectangle rec = new Rectangle(a,b);
        Circle cir = new Circle(r);
        System.out.println("矩形的面积是"+rec.getArea());
        System.out.println("圆形的面积是"+cir.getArea());
    }
}
interface Shape {
    public static final double PI=3.14;
    public abstract double getArea();
}

class Rectangle implements Shape{
    private double a;
    private double b;
    public Rectangle(double a, double b) {
        this.a=a;
        this.b=b;
    }
    public double getArea() {
        return a*b;
    }
}
class Circle implements Shape{
    double r;
    public Circle(double r) {
        this.r=r;
    }
    public double getArea() {
        return PI*r*r;
    }
}
