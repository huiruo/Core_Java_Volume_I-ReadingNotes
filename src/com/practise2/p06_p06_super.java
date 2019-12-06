package com.practise2;

//-------->调用父类构造函数的方法/属性/构造方法
public class p06_p06_super {

}
/*
分别是无参的构造方法和带一个参数的构造方法:
package charactor;
import property.Item;
public class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    public void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
    }
    public Hero(){
        System.out.println("Hero的无参的构造方法 ");
    }
    public Hero(String name){
        System.out.println("Hero的有一个参数的构造方法 ");
        this.name = name;
    }
    public static void main(String[] args) {
        new Hero();
    }
}
* */

//02.使用关键字super 显式调用父类带参的构造方法
/*
package charactor;
public class ADHero extends Hero implements AD{
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public ADHero(String name){
        super(name);
        System.out.println("AD Hero的构造方法");
    }
    public static void main(String[] args) {
        new ADHero("德莱文");
    }
}
* */


//03.调用父类属性
/*
通过super调用父类的moveSpeed属性
ADHero也提供了属性moveSpeed

public int getMoveSpeed(){
   return this.moveSpeed;
}
public int getMoveSpeed2(){
   return super.moveSpeed;
}
* */

//调用父类属性实例
/*
package charactor;
public class ADHero extends Hero implements AD{
    int moveSpeed=400; //移动速度
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public int getMoveSpeed(){
        return this.moveSpeed;
    }
    public int getMoveSpeed2(){
        return super.moveSpeed;
    }
    public static void main(String[] args) {
        ADHero h= new ADHero();
        System.out.println(h.getMoveSpeed());
        System.out.println(h.getMoveSpeed2());
    }
}
* */


//04.调用父类方法，ADHero重写了useItem方法，并且在useItem中通过super调用父类的useItem方法
/*
package charactor;
import property.Item;
import property.LifePotion;

public class ADHero extends Hero implements AD {
    int moveSpeed = 400; // 移动速度
    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
    public int getMoveSpeed() {
        return this.moveSpeed;
    }
    public int getMoveSpeed2() {
        return super.moveSpeed;
    }
    // 重写 useItem，并在其中调用父类的userItem方法
    public void useItem(Item i) {
        System.out.println("adhero use item");
        super.useItem(i);
    }
    public static void main(String[] args) {
        ADHero h = new ADHero();
        LifePotion lp = new LifePotion();
    }
}
* */
