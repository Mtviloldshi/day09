package com.sch.Cricle;
//圆的子类
public class Cricle extends Graphic{
        private  double radius;

        public Cricle(String name,double radius){
            super(name);
            this.radius = radius;
        }
        @Override
        public double getArea(){
            return Math.PI * radius *radius;
        }
        @Override
        public double getPerimeter(){
            return Math.PI *2 * radius;
        }
        @Override
        public String getinfo(){
            return super.getinfo() +"\t" + radius;
        }

}
