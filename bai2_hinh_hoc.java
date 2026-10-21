/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package huong_doi_tuong_2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
class Shape
{
    public double getArea()
    {
        return 0;
    }
}

class Circle extends Shape
{
    private double radius;
    
    public Circle(double radius)
    {
        this.radius = radius;
    }
    
    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape
{
    private double width;
    private double height;
    
    public Rectangle(double width, double height)
    {
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double getArea()
    {
        return width * height;
    }
}

public class bai2_hinh_hoc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ban kinh: ");
        double r = sc.nextDouble();
        
        System.out.println("Nhap chieu rong: ");
        double a = sc.nextDouble();
        
        System.out.println("Nhap chieu cao: ");
        double b = sc.nextDouble();
        
        Circle circle = new Circle(r);
        Rectangle rectangle = new Rectangle(a, b);
        
        System.out.println("Dien tich hinh tron: " + circle.getArea());
        System.out.println("Dien tich hinh chu nhat: " + rectangle.getArea());
    }
}
