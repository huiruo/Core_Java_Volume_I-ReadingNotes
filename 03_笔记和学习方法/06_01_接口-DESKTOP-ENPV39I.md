

#### 1.1.  接口概念  

>   在 Java 程序设计语言中， 接口不是类，而是对类的一组需求描述，这些类要遵从接口描述的统一格式进行定义。  
>
>   实际上， 接口可以提供多重继承的大多数好处，同时还能避免多重继承的复杂性和低效性  
>
> ```java
> 我们经常听到服务提供商这样说：“ 如果类遵从某个特定接口，那么就履行这项服务。”
> 例如，Arrays 类中的sort 方法承诺可以对对象数组进行排序，但要求满足下列前提：对象所属的类必须实现了 Comparable接口。
> public interface Comparable
> {
> int compareTo(Object other);
> }
> 
> /*
> 这就是说， 任何实现 Comparable 接口的类都需要包含 compareTo 方法，并且这个方法的参
> 数必须是一个 Object 对象， 返回一个整型数值。
> */
> ```
>
> 接口中的所有方法自动地属于 public。 因此， 在接口中声明方法时， 不必提供关键字
> public 。
>
> 提供实例域和方法实现的任务应该由实现接口的那个类来完成。因此， 可以将接口看成是没有实例域的抽象类 。
>
> ```java
> 假设希望使用 Arrays 类的 sort 方法对 Employee 对象数组进行排序， Employee 类
> 就必须实现 Comparable 接口。
> 为了让类实现一个接口， 通常需要下面两个步骤：
> 1.将类声明为实现给定的接口
> 2.对接口中的所有方法进行定义
> 要将类声明为实现某个接口， 需要使用关键字 implements:
> 	class Employee impleients Comparable
>     
>     当然， 这里的 Employee 类需要提供 compareTo 方法。 假设希望根据雇员的薪水进行比较.
>     以下是 compareTo 方法的实现:
> 	public int compareTo(Object otherObject)
>     {
>   	  Employee other = (Employee) otherObject ;
>  	  return Double,compare(salary, other ,salary);
>     }
> ```



#### 1.2.接口的特性

>   1.然而， 尽管不能构造接口的对象，却能声明接口的变量：
>
> ```java
> Comparable x; // OK  
> ```
>
>   接口变量必须引用实现了接口的类对象：
>
> ```java
> x = new Employee(. . .); // OK provided Employee implements Comparable  
> ```
>
>   2.接下来， 如同使用 instanceof检查一个对象是否属于某个特定类一样， 也可以使用
> instance 检查一个对象是否实现了某个特定的接口：  
>
> ```java
> if (anObject instanceof Comparable) { . . . }
> ```
>
>   3.与可以建立类的继承关系一样，接口也可以被扩展。这里允许存在多条从具有较高通用
> 性的接口到较高专用性的接口的链。例如， 假设有一个称为 Moveable 的接口：  
>
> ```java
> public interface Moveable
> {
> void move(double x, double y);
> }
> 然后， 可以以它为基础扩展一个叫做 Powered 的接口：
> public interface Powered extends Moveable
> {
>    double milesPerCallon();
> }
> ```
>
> 4.  虽然在接口中不能包含实例域或静态方法，但却可以包含常量。例如  
>
> ```java
> public interface Powered extends Moveable
> {
> 	double milesPerCallon();
> 	double SPEED_LIHIT = 95; // a public static final constant
> }
> //与接口中的方法都自动地被设置为 public —样， 接口中的域将被自动设为 public static final 。
> ```
>
> 