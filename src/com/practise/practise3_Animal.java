package com.practise;

/*
*编写类Animal，该类包含私有属性name、age，公有方法void showInfo()。为Animal类添加构造器和属性访问器。
* 定义主类Demo9，在主方法中实例化Animal类，并且用构造器和属性访问器分别为name和age赋值，调用showInfo方法输出属性信息。
* */
public class practise3_Animal {
    public static void main(String[] args) {
        Animal a = new Animal("cat",10);
//        a.setAge(5);
        a.showInfo();
    }
}
/*一个文件只能有一个public,Animal必须为内部类*/
class Animal{
    private String name;
    private int age;
    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
    //属性访问器 start
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //属性访问器 end
    public void showInfo(){
        System.out.println("名字是："+name);
        System.out.println("年龄是："+age+"岁");
    }
}
