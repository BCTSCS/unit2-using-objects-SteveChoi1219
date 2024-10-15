import greenfoot.*;
public class Person  
{
    private String name;
    private int age;
    
    public Person(String s) {
        name = s;
        age = 0;
    }
    
    public Person(String s, int a) {
        name = s;
        age = a;
    }
    
    public void changeName(String s) {
        name = s;
    }
    
    public void changeAge(int a) {
        age = a;
    }
    
    public void printInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String [] args) {
        Person person1 = new Person("Steve");
        Person person2 = new Person("Bob", 17);
        
        person1.printInfo();
        person2.printInfo();
        
        person1.changeName("Choi");
        person1.changeAge(91);
        
        System.out.println("After update: ");
        person1.printInfo();
    }
 }
