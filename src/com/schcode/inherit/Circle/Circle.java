package com.schcode.inherit.Circle;

public class Circle extends Graphic{
    double radius;// 半径
    public Circle(String name,double radius){
        super(name);
        this.radius = radius;
    }
    //求原型面积 重写方法
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

}
