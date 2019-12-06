package com.practise2;


/*
在类中声明一个方法，这个方法没有实现体，是一个“空”方法
这样的方法就叫抽象方法，使用修饰符“abstract"
当一个类有抽象方法的时候，该类必须被声明为抽象类
* */


//--------->01.抽象类
//Hero.java
/*
为Hero增加一个抽象方法 attack，并且把Hero声明为abstract的。
APHero,ADHero,ADAPHero是Hero的子类，继承了Hero的属性和方法。
但是各自的攻击手段是不一样的，所以继承Hero类后，这些子类就必须提供不一样的attack方法实现。
* */
public abstract class p07_abstract_keyword {
    String name;

    float hp;

    float armor;

    int moveSpeed;

    public static void main(String[] args) {

    }
    // 抽象方法attack
    // Hero的子类会被要求实现attack方法
    public abstract void attack();
}
//ADHero
class ADHeroA extends p07_abstract_keyword implements AD {
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    @Override
    public void attack() {
        physicAttack();
    }
}
//APHero
class APHeroA extends p07_abstract_keyword implements AP {
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
    @Override
    public void attack() {
        magicAttack();
    }
}



//------------>02.抽象类可以没有抽象方法,一旦一个类被声明为抽象类，就不能够被直接实例化
/*
Hero类可以在不提供抽象方法的前提下，声明为抽象类
一旦一个类被声明为抽象类，就不能够被直接实例化
package charactor;
public abstract class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;
    public static void main(String[] args) {
        //虽然没有抽象方法，但是一旦被声明为了抽象类，就不能够直接被实例化
        Hero h= new Hero();
    }
}
* */

//------------>03.抽象类和接口的区别
/*
区别1：
子类只能继承一个抽象类，不能继承多个
子类可以实现多个接口

区别2：
抽象类可以定义public,protected,package,private静态和非静态属性final和非final属性,

但是接口中声明的属性，只能是public,静态final的即便没有显式的声明

注: 抽象类和接口都可以有实体方法。 接口中的实体方法，叫做默认方法
* */
