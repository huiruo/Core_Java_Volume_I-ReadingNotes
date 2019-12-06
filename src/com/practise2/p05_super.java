package com.practise2;

/*
父类Hero提供了一个有参的构造方法,但是没有提供无参的构造方法子类应该怎么处理？

实例化子类，父类的构造方法一定会被调用:
实例化一个ADHero(), 其构造方法会被调用
其父类的构造方法也会被调用
并且是父类构造方法先调用
子类构造方法会默认调用父类的 无参的构造方法
* */
public class p05_super {
    public String name;
    protected float hp;

    public p05_super(String name){
        this.name = name;
    }

//    故意不提供无参的构造方法
//    public Hero(){
//
//    }

    public static void main(String[] args) {

    }
}
/*
作为子类，无论如何 都会调用父类的构造方法。
默认情况下，会调用父类的无参的构造方法。
但是，当父类没有无参构造方法的时候( 提供了有参构造方法，并且不显示提供无参构造方法)，子类就会抛出异常，因为它尝试去调用父类的无参构造方法。
这个时候，必须通过super去调用父类声明的、存在的、有参的构造方法
* */
class ADHeroSuper extends p05_super implements AD{
    public ADHeroSuper() {
        super("");
    }

    @Override
    public void physicAttack() {
        System.out.println("进行物理攻击");
    }
}
