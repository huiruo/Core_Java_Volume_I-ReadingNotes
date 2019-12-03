>  枚举enum是一种特殊的类(还是类)，使用枚举可以很方便的定义常量
> 比如设计一个枚举类型 季节，里面有4种常量 :
>
>  Season.java 
>
> ```java
> public enum Season {
> 	SPRING,SUMMER,AUTUMN,WINTER
> }
> ```
>
>  HelloWorld.java 
>
> ```java
> public class HelloWorld {
>     public static void main(String[] args) {
>         Season season = Season.SPRING;
>         switch (season) {
>         case SPRING:
>             System.out.println("春天");
>             break;
>         case SUMMER:
>             System.out.println("夏天");
>             break;
>         case AUTUMN:
>             System.out.println("秋天");
>             break;
>         case WINTER:
>             System.out.println("冬天");
>             break;
>         }
>     }
> }
> ```





#### 01.实例：

>  英雄联盟中有这么一些分类
> TANK (坦克)
> WIZARD (法师 )
> ASSASSIN (刺客)
> ASSIST (辅助)
> WARRIOR (近战)
> RANGED (远程 )
> PUSH (推进)
> FARMING (打野)
> 设计一个枚举类型HeroType,使用上述分类作为常量 
>
>  再编写一段switch语句，把每种枚举常量输出为中文字符串 
>
>  HeroType.java 
>
> ```java
> package charactor;
>  
> public enum HeroType {
>     TANK, WIZARD, ASSASSIN, ASSIST, WARRIOR, RANGED, PUSH, FARMING
> }
> ```
>
>  Hero.java 
>
> ```java
> package charactor;
>  
> public class Hero {
>     public String name; // 姓名
>  
>     public static void main(String[] args) {
>  
>         HeroType type = HeroType.ASSASSIN;
>         switch (type) {
>         case TANK:
>             System.out.println("坦克");
>             break;
>         case WIZARD:
>             System.out.println("法师");
>             break;
>         case ASSASSIN:
>             System.out.println("刺客");
>             break;
>         case ASSIST:
>             System.out.println("辅助");
>             break;
>         case WARRIOR:
>             System.out.println("近战");
>             break;
>         case RANGED:
>             System.out.println("远程战");
>             break;
>         case PUSH:
>             System.out.println("推进");
>             break;
>         case FARMING:
>             System.out.println("打野");
>             break;
>         }
>     }
> }
> ```