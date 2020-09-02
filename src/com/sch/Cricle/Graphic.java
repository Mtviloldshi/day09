package com.sch.Cricle;
//形状父类
class Graphic {
    private String name;

    public Graphic(String name){
        super();
        this.name = name;
    }
    public double getArea(){
        return 0.0;
    }
    public double getPerimeter(){
        return 0.0;
    }
    public String getinfo(){
        return name +"\t"+ getArea() +"\t"+  getPerimeter() + "\t"+ "";
    }





}
