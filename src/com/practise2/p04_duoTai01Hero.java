package com.practise2;

/*
immortal是不朽的，不死的意思
mortal就是终有一死的，凡人的意思
1. 设计一个接口
接口叫做Mortal,其中有一个方法叫做die
2. 实现接口
分别让ADHero,APHero,ADAPHero这三个类，实现Mortal接口，不同的类实现die方法的时候，都打印出不一样的字符串
3. 为Hero类，添加一个方法,在这个方法中调用 m的die方法。

public void kill(Mortal m)

4. 在主方法中
首先实例化出一个Hero对象:盖伦
然后实例化出3个对象，分别是ADHero,APHero,ADAPHero的实例
然后让盖伦 kill 这3个对象
* */
//hero.java
public class p04_duoTai01Hero {
    public String name;
    protected float hp;

    public void kill(Mortal m){
        System.out.println(name + " 放了一个大招" );
        m.die();
    }

    public static void main(String[] args) {
        p04_duoTai01Hero h =new p04_duoTai01Hero();
        h.name = "盖伦";

        ADHero ad = new ADHero();
        ad.name = "艾希";

        APHero ap = new APHero();
        ap.name = "安妮";

        ADAPHero adap = new ADAPHero();
        adap.name = "库奇";

        h.kill(ad);
        h.kill(ap);
        h.kill(adap);
        /*
盖伦 放了一个大招
艾希 这个物理英雄挂了
盖伦 放了一个大招
安妮 这个魔法英雄挂了
盖伦 放了一个大招
库奇 这个混合英雄挂了
        * */
    }
}
//Mortal.java
interface Mortal {
    public void die();
}
interface ADU {
     void physicAttack();
}
interface APU {
     void magicAttack();
}

//ADHero.java
class ADHero extends p04_duoTai01Hero implements ADU ,Mortal{

    @Override
    public void physicAttack() {

    }
    @Override
    public void die() {
        System.out.println(name+ " 这个物理英雄挂了");
    }
}
//APHero.java
class APHero extends p04_duoTai01Hero implements APU,Mortal {
    public void magicAttack() {

    }

    @Override
    public void die() {
        System.out.println(name+ " 这个魔法英雄挂了");
    }

}
//ADAPHero.java
class ADAPHero extends p04_duoTai01Hero implements ADU,APU,Mortal{
    @Override
    public void magicAttack() {
        // TODO Auto-generated method stub
    }
    @Override
    public void physicAttack() {
        // TODO Auto-generated method stub
    }
    @Override
    public void die() {
        System.out.println(name+ " 这个混合英雄挂了");
    }
}
