package com.practise2;

/*
内部类分为四种：
  非静态内部类
  静态内部类
  匿名类
  本地类
* */
public class p08_InnerClass {

}

/*----------->01.内部类实例:语法: new 外部类().new 内部类()
非静态内部类 BattleScore “战斗成绩”
非静态内部类可以直接在一个类里面定义
比如：
   战斗成绩只有在一个英雄对象存在的时候才有意义
   所以实例化BattleScore 的时候，必须建立在一个存在的英雄的基础上
   作为Hero的非静态内部类，是可以直接访问外部类的private实例属性name的
package charactor;
public class Hero {
    private String name; // 姓名
    float hp; // 血量
    float armor; // 护甲
    int moveSpeed; // 移动速度

    // 非静态内部类，只有一个外部类对象存在的时候，才有意义
    // 战斗成绩只有在一个英雄对象存在的时候才有意义
    class BattleScore {
        int kill;
        int die;
        int assit;
        public void legendary() {
            if (kill >= 8)
                System.out.println(name + "超神！");
            else
                System.out.println(name + "尚未超神！");
        }
    }
    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        // 实例化内部类
        // BattleScore对象只有在一个英雄对象存在的时候才有意义
        // 所以其实例化必须建立在一个外部类对象的基础之上
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
    }
}
* */


/*----------------->02.静态内部类,语法：new 外部类.静态内部类();
在一个类里面声明一个静态内部类
        比如敌方水晶，当敌方水晶没有血的时候，己方所有英雄都取得胜利，而不只是某一个具体的英雄取得胜利。
        与非静态内部类不同，静态内部类水晶类的实例化 不需要一个外部类的实例为基础，可以直接实例化
因为没有一个外部类的实例，所以在静态内部类里面不可以访问外部类的实例属性和方法
除了可以访问外部类的私有静态成员外，静态内部类和普通类没什么大的区别

package charactor;
public class Hero {
    public String name;
    protected float hp;

    private static void battleWin(){
        System.out.println("battle win");
    }
    //敌方的水晶
    static class EnemyCrystal{
        int hp=5000;

        //如果水晶的血量为0，则宣布胜利
        public void checkIfVictory(){
            if(hp==0){
                Hero.battleWin();

                //静态内部类不能直接访问外部类的对象属性
                System.out.println(name + " win this game");
            }
        }
    }
    public static void main(String[] args) {
        //实例化静态内部类
        Hero.EnemyCrystal crystal = new Hero.EnemyCrystal();
        crystal.checkIfVictory();
    }
}
* */



/*---------------->03.匿名类
匿名类指的是在声明一个类的同时实例化它，使代码更加简洁精练
通常情况下，要使用一个接口或者抽象类，都必须创建一个子类

有的时候，为了快速使用，直接实例化一个抽象类，并“当场”实现其抽象方法。
既然实现了抽象方法，那么就是一个新的类，只是这个类，没有命名。
这样的类，叫做匿名类

package charactor;
public abstract class Hero {
    String name; //姓名
    float hp; //血量
    float armor; //护甲
    int moveSpeed; //移动速度
    public abstract void attack();
    public static void main(String[] args) {
        ADHero adh=new ADHero();
        //通过打印adh，可以看到adh这个对象属于ADHero类
        adh.attack();
        System.out.println(adh);
        //--------->使用匿名类
        Hero h = new Hero(){
            //当场实现attack方法
            public void attack() {
                System.out.println("新的进攻手段");
            }
        };
        h.attack();
        //通过打印h，可以看到h这个对象属于Hero$1这么一个系统自动分配的类名
        System.out.println(h);
    }
}
* */