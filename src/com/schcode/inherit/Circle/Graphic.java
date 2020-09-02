package com.schcode.inherit.Circle;

public class Graphic {
    private String name;

    public Graphic(String name){
        this.name = name;
    }
    public double getArea(){
        System.out.println("面积");
        return 0;
    }
    public double getPerimeter(){
        System.out.println("周长");
        return 0;
    }
    public String getInfo(){
        return  name+"-面积：" + getArea()+"周长" + getPerimeter();
    }
}
