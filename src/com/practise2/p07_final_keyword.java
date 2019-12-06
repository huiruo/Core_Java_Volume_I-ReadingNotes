package com.practise2;

public class p07_final_keyword {
}


//final修饰类，方法，基本类型变量，引用的时候分别有不同的意思。


//01.final修饰类,当Hero被修饰成final的时候，表示Hero不能够被继承其子类会出现编译错误
/*
package charactor;
public final class Hero extends Object {
    String name; //姓名
    float hp; //血量
}
* */



//02.final修饰方法，Hero的useItem方法被修饰成final,那么该方法在ADHero中，不能够被重写
/*
public final void useItem(Item i){
        System.out.println("hero use item");
        i.effect();
}
* */



//03.final修饰基本类型变量
/*
final修饰基本类型变量，表示该变量只有一次赋值机会
16行进行了赋值，17行就不可以再进行赋值了
* */
/*
package charactor;
public class Hero extends Object {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    public static void main(String[] args) {
    	final int hp;   //final修饰基本类型变量，表示该变量只有一次赋值机会
    	hp = 5;
    	hp = 6;        //17行就不可以再进行赋值了
	}
}
* */




//04.常量
/*
常量指的是可以公开，直接访问，不会变化的值比如 itemTotalNumber 物品栏的数量是6个
* */
/*
package charactor;
public class Hero extends Object {
    public static final int itemTotalNumber = 6;//物品栏的数量
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    public static void main(String[] args) {
        final Hero h;
        h  =new Hero();
        h.hp = 5;
    }
}
* */
