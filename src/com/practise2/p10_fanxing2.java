package com.practise2;

//--------------->如何设置支持泛型的类
//-------------->01.不支持泛型的Stack
/*
以Stack栈为例子，如果不使用泛型
当需要一个只能放Hero的栈的时候，就需要设计一个HeroStack
当需要一个只能放Item的栈的时候，就需要一个ItemStack
* */
//HeroStack
public class p10_fanxing2 {

}
/*实例代码1
package generic;
import java.util.LinkedList;
import charactor.Hero;
public class HeroStack {
    LinkedList<Hero> heros = new LinkedList<Hero>();
    public void push(Hero h) {
        heros.addLast(h);
    }
    public Hero pull() {
        return heros.removeLast();
    }
    public Hero peek() {
        return heros.getLast();
    }
    public static void main(String[] args) {
        HeroStack heroStack = new HeroStack();
        for (int i = 0; i < 5; i++) {
            Hero h = new Hero("hero name " + i);
            System.out.println("压入 hero:" + h);
            heroStack.push(h);
        }
        for (int i = 0; i < 5; i++) {
            Hero h =heroStack.pull();
            System.out.println("弹出 hero" + h);
        }
    }
}
* */

/*实例代码2
package generic;
import java.util.LinkedList;
import property.Item;
public class ItemStack {
    LinkedList<Item> Items = new LinkedList<Item>();
    public void push(Item h) {
        Items.addLast(h);
    }
    public Item pull() {
        return Items.removeLast();
    }
    public Item peek() {
        return Items.getLast();
    }
    public static void main(String[] args) {
        ItemStack ItemStack = new ItemStack();
        for (int i = 0; i < 5; i++) {
            Item item = new Item("Item name " + i);
            System.out.println("压入 Item:" + item);
            ItemStack.push(item);
        }
        for (int i = 0; i < 5; i++) {
            Item item =ItemStack.pull();
            System.out.println("弹出 Item" + item);
        }
    }
}
* */



//----------------->02.支持泛型的Stack
/*
设计一个支持泛型的栈MyStack
设计这个类的时候，在类的声明上，加上一个<T>，表示该类支持泛型。
T是type的缩写，也可以使用任何其他的合法的变量，比如A,B,X都可以，但是一般约定成俗使用T，代表类型。
* */
/*
package generic;

import java.util.HashMap;
import java.util.LinkedList;
import charactor.Hero;
import property.Item;

public class MyStack<T> {
    LinkedList<T> values = new LinkedList<T>();
    public void push(T t) {
        values.addLast(t);
    }
    public T pull() {
        return values.removeLast();
    }
    public T peek() {
        return values.getLast();
    }
    public static void main(String[] args) {
        //在声明这个Stack的时候，使用泛型<Hero>就表示该Stack只能放Hero
        MyStack<Hero> heroStack = new MyStack<>();
        heroStack.push(new Hero());
        //不能放Item
        heroStack.push(new Item());

        //在声明这个Stack的时候，使用泛型<Item>就表示该Stack只能放Item
        MyStack<Item> itemStack = new MyStack<>();
        itemStack.push(new Item());
        //不能放Hero
        itemStack.push(new Hero());
    }
}
* */

