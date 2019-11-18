package com.volume1;

/**
   @version 1.01 2015-05-12
   @author Cay Horstmann
*/

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer; 
// to resolve conflict with java.util.Timer
/*
* 程序启动后， 将会立即显示一个包含“ Quit program?”
字样的对话框， 10 秒钟之后， 第 1 条定时器消息才会显示出来。
*
* 接口与回调 :
*  java.swing 包中有一个 Timer 类，可以使用它在到达给定的时间间隔时发出通告。 例
如，假如程序中有一个时钟， 就可以请求每秒钟获得一个通告， 以便更新时钟的表盘。
在构造定时器时，需要设置一个时间间隔， 并告之定时器，当到达时间间隔时需要做些
什么操作
    如何告之定时器做什么呢？ 在很多程序设计语言中，可以提供一个函数名， 定时器周期性地调用它。
    但是， 在 Java 标准类库中的类采用的是面向对象方法。它将某个类的对象传递给定时器，然后，定时器调用这个对象的方法。由于对象可以携带一些附加的信息，所以传递一个对象比传递一个函数要灵活得多。
    当然， 定时器需要知道调用哪一个方法，并要求传递的对象所属的类实现了java.awt.event 包的ActionListener 接口。下面是这个接口：
    public interface ActionListener
    {
    void actionPerfonned(ActionEvent event);
    }

当到达指定的时间间隔时，定时器就调用 actionPerformed 方法。
假设希望每隔 10 秒钟打印一条信息“ At the tone, the time is . . .”， 然后响一声， 就应该
定义一个实现 ActionListener 接口的类， 然后将需要执行的语句放在 actionPerformed 方法中。
class TinePrinter implements ActionListener
{
public void actionPerformed(ActionEvent event)
    {
        System.out.println("At the tone, the time is " + new Date());
        Toolkit.getDefaultToolkit().beep();
    }
}
* */
public class TimerTest
{  
   public static void main(String[] args)
   {  
      ActionListener listener = new TimePrinter();

      // construct a timer that calls the listener
      // once every 10 seconds
      Timer t = new Timer(10000, listener);
      t.start();

      JOptionPane.showMessageDialog(null, "Quit program?");
      System.exit(0);
   }
}
/*当到达指定的时间间隔时，定时器就调用 actionPerformed 方法。
假设希望每隔 10 秒钟打印一条信息“ At the tone, the time is . . .”， 然后响一声， 就应该
定义一个实现 ActionListener 接口的类， 然后将需要执行的语句放在 actionPerformed 方法中。*/
class TimePrinter implements ActionListener
{  
   public void actionPerformed(ActionEvent event)
   {  
      System.out.println("At the tone, the time is " + new Date());
      Toolkit.getDefaultToolkit().beep();
   }
}
