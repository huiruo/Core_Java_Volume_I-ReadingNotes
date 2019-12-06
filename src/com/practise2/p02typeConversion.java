package com.practise2;

/*
01.明确引用类型与对象类型的概念

首先，明确引用类型与对象类型的概念
在这个例子里，有一个对象 new ADHero(), 同时也有一个引用ad
对象是有类型的， 是ADHero
引用也是有类型的，是ADHero
通常情况下，引用类型和对象类型是一样的
接下来要讨论的类型转换的问题，指的是引用类型和对象类型不一致的情况下的转换问题
package charactor;
public class Hero {
    public String name;
    protected float hp;
    public static void main(String[] args) {
        ADHero ad = new ADHero();
    }
}
* */

/* ---------------------->01.子类转父类(向上转型):所有的子类转换为父类，都是说得通的
所谓的转型，是指当引用类型和对象类型不一致的时候，才需要进行类型转换
类型转换有时候会成功，有时候会失败
到底能否转换成功？ 教大家一个很简单的判别办法
把右边的当做左边来用，看说得通不?
Hero h = new Hero();
ADHero ad = new ADHero();
h = ad;

右边ad引用所指向的对象的类型是 物理攻击英雄
左边h引用的类型是 普通英雄
把物理攻击英雄 当做 普通英雄，说不说得通？ 说得通，就可以转

所有的子类转换为父类，都是说得通的。比如你身边的例子:
苹果手机 继承了 手机，把苹果手机当做普通手机使用
怡宝纯净水 继承了 饮品， 把怡宝纯净水 当做饮品来使用

package charactor;

public class Hero {
    public String name;
    protected float hp;

    public static void main(String[] args) {

        Hero h = new Hero();

        ADHero ad = new ADHero();

        //类型转换指的是把一个引用所指向的对象的类型，转换为另一个引用的类型

        //把ad引用所指向的对象的类型是ADHero
        //h引用的类型是Hero
        //把ADHero当做Hero使用，一定可以
        h = ad;
    }
}

**/
public class p02typeConversion {

}



//------------>02.父类转子类(向下转型)
/*
父类转子类，有的时候行，有的时候不行，所以必须进行强制转换。
强制转换的意思就是 转换有风险，风险自担。

01.什么时候行呢？
Hero h =new Hero();
ADHero ad = new ADHero();
h = ad;     //line 3
ad = (ADHero) h;

第3行，是子类转父类，一定可以的
第4行，就是父类转子类，所以要进行强转。
h这个引用，所指向的对象是ADHero, 所以第4行，就会把ADHero转换为ADHero，就能转换成功。


02.什么时候转换不行呢？
1.        Hero h =new Hero();
2.        ADHero ad = new ADHero();
3.        Support s =new Support();
4.        h = s;
5.        ad = (ADHero)h;

第4行，是子类转父类，是可以转换成功的
第5行，是把h引用所指向的对象 Support，转换为ad引用的类型ADHero。 从语义上讲，把物理攻击英雄，当成辅助英雄来用，说不通，所以会强制转换失败，并且抛出异常

03.实例：
package charactor;

import charactor1.Support;

public class Hero {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        Hero h =new Hero();
        ADHero ad = new ADHero();
        Support s =new Support();

        h = ad;  //line 14
        ad = (ADHero) h; //line 15: h引用有可能指向一个ad对象，也有可能指向一个support对象,所以把h引用转换成AD类型的时候，就有可能成功，有可能失败
        h = s;  //line 16:16行：把一个support对象当做Hero使用，一定可以,转换之后，h引用指向一个support对象
        ad = (ADHero)h;  //17行：这个时候，h指向的是一个support对象，所以转换成ADHero类型，会失败。失败的表现形式是抛出异常 ClassCastException 类型转换异常
    }
}

14行： 把ad当做Hero使用，一定可以
转换之后，h引用指向一个ad对象
15行： h引用有可能指向一个ad对象，也有可能指向一个support对象
所以把h引用转换成AD类型的时候，就有可能成功，有可能失败
因此要进行强制转换，换句话说转换后果自负
到底能不能转换成功，要看引用h到底指向的是哪种对象
在这个例子里，h指向的是一个ad对象，所以转换成ADHero类型，是可以的
16行：把一个support对象当做Hero使用，一定可以
转换之后，h引用指向一个support对象
17行：这个时候，h指向的是一个support对象，所以转换成ADHero类型，会失败。
失败的表现形式是抛出异常 ClassCastException 类型转换异常
* */




//---------------->03.实现类转换成接口(向上转型)
/*
引用ad指向的对象是ADHero类型，这个类型实现了AD接口
10行： 把一个ADHero类型转换为AD接口
从语义上来讲，把一个ADHero当做AD来使用，而AD接口只有一个physicAttack方法，这就意味着转换后就有可能要调用physicAttack方法，而ADHero一定是有physicAttack方法的，所以转换是能成功的。

package charactor;
public class Hero {
    public String name;
    protected float hp;
    public static void main(String[] args) {
        ADHero ad = new ADHero();
        AD adi = ad;  //line 10
    }
}
* */



//------------------>04.接口转换成实现类(向下转型)
/*
10行： ad引用指向ADHero， 而adi引用是接口类型：AD，实现类转换为接口，是向上转型，所以无需强制转换，并且一定能成功
12行: adi实际上是指向一个ADHero的，所以能够转换成功
14行： adi引用所指向的对象是一个ADHero，要转换为ADAPHero就会失败。

package charactor;

public class Hero {
    public String name;
    protected float hp;

    public static void main(String[] args) {
        ADHero ad = new ADHero();

        AD adi = ad;  //line 10

        ADHero adHero = (ADHero) adi;  //line 12

        ADAPHero adapHero = (ADAPHero) adi;  //line 14
        adapHero.magicAttack();
    }
}
* */
