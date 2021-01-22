/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema_1;

/**
 *
 * @author YaIlushaMolodec
 */
public class Circle extends Figure {
    private static final String NAME = "Circle";
    
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
    
    @Override
    public String getName() {
        return NAME;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
