package com.volume1;

/*
* 每一个 Java 应用程序都有一个带 String arg[]，参数的 main 方法。这个参数表明 main 方法将接收一个字符串数组， 也就是命令行参数。
*
* 需要注意， 不需要使用对象调用静态方法。例如，不需要构造 Math 类对象就可以调用Math.pow。
*同理， main 方法也是一个静态方法。
* main 方法不对任何对象进行操作。事实上，在启动程序时还没有任何一个对象。静态的main 方法将执行并创建程序所需要的对象。
* */
public class helloJava {
    public static void main(String[] args){
        System.out.println("hello java,I am comming back!");
    }
}
