package com.practise;

/*
* 类属性： 又叫做静态属性
对象属性： 又叫实例属性，非静态属性
如果一个属性声明成类属性，那么所有的对象，都共享这么一个值
给英雄设置一个类属性叫做“版权" (copyright), 无论有多少个具体的英雄，所有的英雄的版权都属于 Riot Games公司。
* */
public class practise7_classAttribute {
    public String name; //实例属性，对象属性，非静态属性
    protected float hp;
    static String copyright;//类属性,静态属性

    public static void main(String[] args) {
        practise7_classAttribute garen =  new practise7_classAttribute();
        garen.name = "盖伦";

        practise7_classAttribute.copyright = "版权由Riot Games公司所有";

        System.out.println(garen.name);
        System.out.println(garen.copyright);

        practise7_classAttribute teemo =  new practise7_classAttribute();
        teemo.name = "提莫";
        System.out.println(teemo.name);
        System.out.println(teemo.copyright);
    }
}
