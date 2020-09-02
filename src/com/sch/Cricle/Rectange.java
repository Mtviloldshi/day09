package com.sch.Cricle;

public class Rectange extends Graphic{
    private double width;
    private double length;
    public Rectange(String name,double length,double width){
        super(name);
        this.width = width;
        this.length = length;
    }
    @Override
    public double getArea(){
        return length * width;
    }
    @Override
    public  double getPerimeter(){
        return (length + width)*2;
    }
    @Override
    public String getinfo(){
        return super.getinfo() + "\t" +length + "\t"+width;
    }
}
