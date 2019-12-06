package com.practise2;

/*
类的多态现象:
1. i1和i2都是Item类型
2. 都调用effect方法
3. 输出不同的结果
多态: 都是同一个类型，调用同一个方法，却能呈现不同的状态
* */
public class p04_duoTai {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果 ");
    }
    public static void main(String[] args) {
        p04_duoTai i1= new LifePotion2();
        p04_duoTai i2 = new MagicPotion();
        System.out.print("i1  是p04_duoTai类型，执行effect打印:");
        i1.effect();
        System.out.print("i2也是p04_duoTai类型，执行effect打印:");
        i2.effect();
    }
    /*
i1  是Item类型，执行effect打印:血瓶使用后，可以回血
i2也是Item类型，执行effect打印:蓝瓶使用后，可以回魔法
    * */
}
class LifePotion2 extends p04_duoTai {
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
}
class MagicPotion extends p04_duoTai{

    public void effect(){
        System.out.println("蓝瓶使用后，可以回魔法");
    }
}

/*02.知识：
要实现类的多态，需要如下条件
1. 父类（接口）引用指向子类对象
2. 调用的方法有重写
* */

/*
实例：
如果物品的种类特别多，那么就需要设计很多的方法
比如useArmor,useWeapon等等

这个时候采用多态来解决这个问题
设计一个方法叫做useItem，其参数类型是Item：
    如果是使用血瓶，调用该方法
    如果是使用魔瓶，还是调用该方法
无论英雄要使用什么样的物品，只需要一个方法即可
package charactor;

import property.Item;
import property.LifePotion;
import property.MagicPotion;

public class Hero {
    public String name;
    protected float hp;

    public void useItem(Item i){
        i.effect();
    }

    public static void main(String[] args) {

        Hero garen =  new Hero();
        garen.name = "盖伦";

        LifePotion lp =new LifePotion();
        MagicPotion mp =new MagicPotion();

        garen.useItem(lp);
        garen.useItem(mp);
    }
}
* */