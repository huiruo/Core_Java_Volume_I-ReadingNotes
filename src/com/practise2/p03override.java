package com.practise2;

/*重写概念：
子类可以继承父类的对象方法.在继承后，重复提供该方法，就叫做方法的重写
* */
public class p03override {
    String name;
    int price;

    public void buy(){
        System.out.println("购买");
    }
    public void effect() {
        System.out.println("物品使用后，可以有效果");
    }
    //02.step 02
    /*
    调用就会执行重写的方法，而不是从父类的方法
    所以LifePotion的effect会打印：
    "血瓶使用后，可以回血"
    * */
    public static void main(String[] args) {
        p03override i = new p03override();
        i.effect();
        LifePotion lp =new LifePotion();
        lp.effect();
    }
}
//01.step 01
//**子类LifePotion继承p03override,同时也提供了方法effect
class LifePotion extends p03override{
    public void effect(){
        System.out.println("血瓶使用后，可以回血");
    }
}

