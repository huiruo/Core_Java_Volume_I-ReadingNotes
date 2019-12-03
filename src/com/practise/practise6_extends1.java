package com.practise;

/*
* 这一次Weapon继承Item
虽然Weapon自己没有设计name和price,但是通过继承Item类，也具备了name和price属性
* */
public class practise6_extends1 extends Item{
    int damage; //攻击力

    public static void main(String[] args) {
        practise6_extends1 infinityEdge = new practise6_extends1();
        infinityEdge.damage = 65; //damage属性在类Weapon中新设计的

        infinityEdge.name = "无尽之刃";//name属性，是从Item中继承来的，就不需要重复设计了
        infinityEdge.price = 3600;
        System.out.println(infinityEdge.name);
    }
    }
//***物品类Item 有属性 name,price
class Item {
    String name;
    int price;
}
