/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huong_doi_tuong_2;

/**
 *
 * @author Admin
 */
class Person
{
    private String name;
    private String gender;
    private int birthYear;
    
    public Person(String name, String gender, int birthYear)
    {
        this.name = name;
        this.gender = gender;
        this.birthYear = birthYear;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getGender()
    {
        return gender;
    }
    
    public int getBirthYear()
    {
        return birthYear;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setGender(String gender)
    {
        this.gender = gender;
    }
    
    public void setBirthYear(int birthYear)
    {
        this.birthYear = birthYear;
    }
    
    public void hien_thi_person()
    {
        System.out.println("Ten: " + name);
        System.out.println("Gioi tinh: " + gender);
        System.out.println("Nam sinh: " + birthYear);
    }
}

class Student extends Person
{
    private String studentId;
    private double GPA;
    
    public Student(String name, String gender, int birthYear, String studentId, double GPA)
    {
        super(name, gender, birthYear);
        this.studentId = studentId;
        this.GPA = GPA;
    }
    
    public String getId()
    {
        return studentId;
    }
    public double getGPA()
    {
        return GPA;
    }
    
    public void setId(String studentId)
    {
        this.studentId = studentId;
    }
    public void setGPA(double GPA)
    {
        this.GPA = GPA;
    }
    
    public void hien_thi_student()
    {
        hien_thi_person();
        System.out.println("Ma sinh vien: " + studentId);
        System.out.println("GPA: " + GPA);
    }
}

class Employee extends Person
{
    private double salary;
    
    public Employee(String name, String gender, int birthYear, double salary)
    {
        super(name, gender, birthYear);
        this.salary = salary;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void hien_thi_employee()
    {
        hien_thi_person();
        System.out.println("Luong: " + salary);
    }
}
public class bai1_phan_cap_nhan_su {
    public static void main(String[] args) {
        Student student = new Student("Nguyen Van An", "Nam", 2005,"24810310202",3.5);
        
        System.out.println("Thong tin sinh vien");
        student.hien_thi_student();
        System.out.println();
        
        Employee employee = new Employee("Nguyen Van An", "Nam", 2005, 150000);
        System.out.println("Thong tin nhan vien");
        employee.hien_thi_employee();
    }
}
