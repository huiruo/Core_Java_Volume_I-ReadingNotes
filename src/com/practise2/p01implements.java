package com.practise2;

/*实现某个接口，就相当于承诺了某种约定
* 在设计LOL的时候，进攻类英雄有两种，一种是进行物理系攻击，一种是进行魔法系攻击
这时候，就可以使用接口来实现这个效果。
接口就像是一种约定，我们约定某些英雄是物理系英雄，那么他们就一定能够进行物理攻击。
* */
public class p01implements {
    public static void main(String[] args) {
        System.out.println("hello");
    }
}


//01.AD ，声明一个方法 physicAttack 物理攻击，但是没有方法体，是一个“空”方法
interface AD {
    //物理伤害
    public void physicAttack();
}
//02.AP
interface AP {
    public void magicAttack();
}


/* 02.设计一类英雄，能够使用物理攻击，这类英雄在LOL中被叫做AD
类：ADHero
继承了Hero 类，所以继承了name,hp,armor等属性

实现某个接口，就相当于承诺了某种约定

所以，实现了AD这个接口，就必须提供AD接口中声明的方法physicAttack()
实现在语法上使用关键字 implements

class ADHero extends Hero implements AD{
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
* */


/*03.设计一类英雄，只能使用魔法攻击，这类英雄在LOL中被叫做AP
类：APHero
继承了Hero 类，所以继承了name,hp,armor等属性
同时，实现了AP这个接口，就必须提供AP接口中声明的方法magicAttack()
实现在语法上使用关键字 implements


class APHero extends Hero implements AP{
    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }
}
* */


//***04_设计一类英雄，既能进行物理攻击，又能进行魔法攻击
/*

class ADAPHero extends Hero implements AD,AP{

    @Override
    public void magicAttack() {
        System.out.println("进行魔法攻击");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}

* */
