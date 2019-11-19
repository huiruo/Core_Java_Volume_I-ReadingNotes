package com.practise;

/*
* 编写类Person，该类包含公有属性name、age，公有方法void showInfo()，方法输出两个属性name和age。
* 编写Person类的子类Student类，该类中定义公有属性StuID，重写父类的showInfo方法，输出三个属性的信息。
* 定义主类，在主方法中实例化Student类和Person类，为每个属性赋值，调用showInfo()方法输出所有属性信息。
* */
public class practise4_Person {
    public static void main(String[] args) {
        Person person = new Person("ash",23);
        Student student = new Student("taom",21,"efetr345");
        person.showInfo();
        student.showInfo();
    }
}

class Person {
    public String name;
    public int age;
    //***必须有空构造函数，否则 Student 的构造函数或报错
    public Person(){
    }
    public Person (String name,int age){
        this.name = name;
        this.age = age;
    }
    public void showInfo() {
        System.out.println("名字是："+name);
        System.out.println("年龄是："+age+"岁");
    }
}
class Student extends Person{
   public String StuID;
   public Student(String name, int age, String StuID) {
        this.name=name;
        this.age=age;
        this.StuID=StuID;
    }
   public void showInfo() {
        System.out.println("名字是："+name);
        System.out.println("年龄是："+age+"岁");
        System.out.println("ID是："+StuID);
   }
}

