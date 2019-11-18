

#### 01.  为什么引入 lambda 表达式  

>   lambda 表达式是一个可传递的代码块， 可以在以后执行一次或多次。
>
> ```
> 这里先给简要的定义：将匿名函数复制给变量的简写方式的函数称为 lambda 表达式。
> 
> Lambda 是一个匿名函数，我们可以把 Lambda 表达式理解为是一段可以传递的代码（将代码像数据一样进行传递）。可以写出更简洁、更灵活的代码。作为一种更紧凑的代码风格，使Java的语言表达能力得到了提升。
> ```
>
> 

#### 01.1.Lambda表达式的语法

>  Lambda 表达式的基础语法：Java8中引入了一个新的操作符 "->" 该操作符称为箭头操作符或 Lambda 操作符
> 箭头操作符将 Lambda 表达式拆分成两部分：
> 左侧：Lambda 表达式的参数列表
> 右侧：Lambda 表达式中所需执行的功能， 即 Lambda 体 
>
> -  语法格式一：无参数，无返回值 
>
> ```java
> //平时的写法
> @Test
>     public void test1() {
>         Runnable runnable = new Runnable() {
>             
>             @Override
>             public void run() {
>         System.out.println("线程启动了");        
>             }
>         };
>         runnable.run();
>     }
>   /**
>    * 语法格式一：无参数，无返回值
>    *        () -> System.out.println("Hello Lambda!");
>    */
>     @Test
>     public void test2() {
>         //“->”左边只有一个小括号，表示无参数，右边是Lambda体(就相当于实现了匿名内部类里面的方法了，(即就是一个可用的接口实现类了。))
>     Runnable runnable = ()->System.out.println("线程启动了");    
>     runnable.run();
>     }
> ```
>
> ```java
> public static void main(String[] args) {
>     new Thread(new Runnable() {
>         @Override
>         public void run() {
>             System.out.println("匿名内部类的执行");
>         }
>     }).start();
> }
> //设计匿名内部类的目的，就是为了方便程序猿将代码作为数据来传递。但是你会发现，这个对象看起来是很多余的，所以我们不想传入对象，只想传入行为。
> 
> new Thread(()->{
>     System.out.println("lambda代替内部类");
> }).start();
> //和实现某接口的对象不同，我们传入了一段代码块--一个没有名字的函数。->将参数和表达式主体分开，左边是参数，右边是方法体。
> ```
>



####  01.2.书籍说的lanbda 表达式

> ```java
> 我们传入代码来检查一个字符串是否比另一个字符串
> 短。这里要计算：
>     first.length() - second.length()
> first 和 second 是什么？ 它们都是字符串。Java 是一种强类型语言， 所以我们还要指定它们的类型：
>     (String first, String second)
>     -> first.length() - second.length()
>     
> //这 就 是 你 看 到 的 第 一 个 表 达 式。 lambda 表达式就是一个代码块， 以及必须传人
> //代码的变量规范。
> ```
>
> ```java
> 为什么起这个名字呢？ 很多年前，那时还没有计算机，逻辑学家 Alonzo Church 想要形式化地表示能有效计算的数学函数。（奇怪的是， 有些函数已经知道是存在的， 但是没有人知道该如何计算这些函数的值。） 他使用了希腊字母 lambda(y) 来标记参数。 如 果 他 知 道 Java API, 可能就会写为
> yfirst.ysecond.first.length() - second.length()
> ```
>
> ```java
> 你已经见过 Java 中的一种 lambda 表达式形式：参数， 箭头（->) 以及一个表达式。如果代码要完成的计算无法放在一个表达式中，就可以像写方法一样，把这些代码放在 {}中，并包含显式的 return 语句。例如：
> (String first, String second) ->
> {
> if (first.length() < second.length()) return -1;
> else if (first.length() > second.length()) return 1;
> else return 0
> }
> ```
>
> **即使 lambda 表达式没有参数， 仍然要提供空括号：**
>
> ```java
> () -> { for (inti = 100;i >= 0;i ) System.out.println(i); }
> ```
>
> **如果可以推导出一个 lambda 表达式的参数类型，则可以忽略其类型**
>
> ```java
> Comparator<String> comp
> = (first, second) // Same as (String first, String second)
> -> first.length() - second.length();
> //在这里， 编译器可以推导出 first 和 second 必然是字符串， 因为这个 lambda 表达式将赋
> //给一个字符串比较器
> ```
>
> **如果方法只有一 参数， 而且这个参数的类型可以推导得出，那么甚至还可以省略小括号**
>
> ```java
> ActionListener listener = event ->
> System.out.println("The time is " + new Date()");
> // Instead of (event) -> . . . or (ActionEvent event) -> . . .
> ```
>
> **无需指定 lambda 表达式的返回类型。lambda 表达式的返回类型总是会由上下文推导得出:**
>
> ```java
> 例如，下面的表达式
> (String first, String second) -> first.length() - second.length()
> 可以在需要 int 类型结果的上下文中使用。
> ```



#### 01.3.  函 数 式 接 口  

>   对于只有一个抽象方法的接口， 需要这种接口的对象时， 就可以提供一个 lambda 表达式。这种接口称为函数式接口。
>

#### 01.4.  方法引用

> ```java
> 有时， 可能已经有现成的方法可以完成你想要传递到其他代码的某个动作。例如， 假设你希望只要出现一个定时器事件就打印这个事件对象。 当然， 为此也可以调用:
>        Timer t = new Timer(1000, event -> System.out.println(event)):
> 
> 但是， 如果直接把 println 方法传递到 Timer 构造器就更好了。具体做法如下：
> 	  Timer t = new Timer(1000, System.out::println);
> 表达式 System.out::println 是一个方法引用（ method reference ), 它等价于 lambda 表达式
> 	  x -> System.out.println(x)
> ```
>
> 例子2：
>
> ```java
> 再来看一个例子， 假设你想对字符串排序， 而不考虑字母的大小写。可以传递以下方法
> 表达式：
> Arrays.sort(strings，String::conpareToIgnoreCase)
> ```
>
> ```java
> 从这些例子可以看出， 要用：: 操作符分隔方法名与对象或类名。主要有 3 种情况：
> •object::instanceMethod
> •Class::staticMethod
> •Class::instanceMethod
> 在前 2 种情况中， 方法引用等价于提供方法参数的 lambda 表达式。
> ```

#### 01.5.  构造器引用  

>   构造器引用与方法引用很类似，只不过方法名为 new。
>
> ```java
> 例如，Person::new 是 Person 构造器的一个引用。哪一个构造器呢？ 这取决于上下文。假设你有一个字符串列表。可以把它转换为一个 Person 对象数组，为此要在各个字符串上调用构造器，调用如下：
> ArrayList<String> names = . . .;
> Stream<Person> stream = names.stream().map(Person::new);
> List<Person> people = stream.col1ect(Col1ectors.toList());
> ```
>
> 例如：
>
> ```jav
> 可以用数组类型建立构造器引用。例如， int[]::new 是一个构造器引用，它有一个参数：
>     即数组的长度。这等价于 lambda 表达式 x-> new int[x]
> ```

#### 01.6.  变量作用域  

>   通常， 你可能希望能够在 lambda 表达式中访问外围方法或类中的变量。 考虑下面这个例子：
>
>   ```java
>   public static void repeatMessage(String text, int delay)
>   {
>   ActionListener listener = event ->
>   System.out.println(text):
>   Toolkit.getDefaultToolkitO.beep():
>   }；
>   new Timer(delay, listener).start();
>   }
>   
>   来看这样一个调用：
>   repeatMessage("Hello", 1000); // Prints Hello every 1,000 milliseconds
>   现在来看 lambda 表达式中的变量 text。 注意这个变量并不是在这个 lambda 表达式中定
>   义的。实际上，这是 repeatMessage 方法的一个参数变量。
>    
>   //问题：
>    如果再想想看， 这里好像会有问题， 尽管不那么明显。 lambda 表达式的代码可能会在
>   repeatMessage 调用返回很久以后才运行， 而那时这个参数变量已经不存在了。 如何保留 text
>   变量呢？
>   ```
>
>   **可以看到**，lambda 表达式可以捕获外围作用域中变量的值。 在 Java 中， 要确保所捕获
>   的值是明确定义的，这里有一个重要的限制。**1.在 lambda 表达式中， 只能引用值不会改变的**
>   **变量。**例如， 下面的做法是不合法的：  
>
>   ```java
>   public static void countDown(int start, int delay)
>   {
>   ActionListener listener = event ->
>   {
>   start--; // Error: Can't mutate captured variable
>   System.out.println(start);
>   }；
>   new Timer(delay, listener) ,start();
>   }
>   之所以有这个限制是有原因的。 如果在 lambda 表达式中改变变量， 并发执行多个动作
>   时就会不安全。
>   ```
>
>   另外如果在 lambda 表达式中引用变量， 而这个变量可能在外部改变，这也是不合法的。
>   例如，下面就是不合法的：  
>
>   ```java
>   public static void countDown(int start, int delay)
>   {
>   ActionListener listener = event ->
>   {
>   start ; // Error: Can't mutate captured variable
>   System.out.println(start);
>   }；
>   new Timer(delay, listener) ,start();
>   }
>   //之所以有这个限制是有原因的。 如果在 lambda 表达式中改变变量， 并发执行多个动作
>   //时就会不安全。
>   ```
>
>     另外如果在 lambda 表达式中引用变量， 而这个变量可能在外部改变，这也是不合法的。
>   例如，下面就是不合法的：  
>
>   ```java
>   public static void repeat(String text, int count)
>   {
>   for (int i = 1; i <= count; i++)
>   {
>   ActionListener listener = event ->
>   {
>   System.out.print1n(i + ": " + text);
>   // Error: Cannot refer to changing i
>   }；
>   new Timer(1000, listener).start();
>   }
>   }
>   ```
>
>     这里有一条规则：lambda 表达式中捕获的变量必须实际上是最终变量 ( effectivelyfinal。)
>   实际上的最终变量是指， 这个变量初始化之后就不会再为它赋新值。在这里，text 总是指示
>   同一个 String 对象，所以捕获这个变量是合法的。不过，i 的值会改变，因此不能捕获。  
>
>   
>
>   ​    lambda 表达式的体与嵌套块有相同的作用域。这里同样适用命名冲突和遮蔽的有关规
>   则。在 lambda 表达式中声明与一个局部变量同名的参数或局部变量是不合法的。  
>
>   ```java
>   Path first = Paths.get("/usr/Mn");
>   Couparator<String> comp =
>   (first, second) -> first.length() - second.length();
>   //Error: Variable first already defined
>   ```
>
>     在一个 lambda 表达式中使用 this 关键字时， 是指创建这个 lambda 表达式的方法的 this
>   参数。 例如，考虑下面的代码：  
>
>   ```java
>   public class Application()
>   {
>   public void init()
>   {
>   ActionListener listener = event ->
>       {
>       System.out.print n(thi s.toString());
>       ...
>       }
>       ...
>       }
>   }
>   /*
>   表达式 this.toString() 会调用 Application 对象的 toString方法， 而不是 ActionListener 实
>   例的方法。在 lambda 表达式中， this 的使用并没有任何特殊之处。lambda 表达式的作用域嵌
>   套在 init 方法中，与出现在这个方法中的其他位置一样， lambda 表达式中 this 的含义并没有
>   变化。
>   */
>   ```



#### 01.7.  处理 lambda 表达式  

>   使用 lambda 表达式的重点是延迟执行,  毕竟， 如果想耍立即执行代码，完全可以直接执行， 而无需把它包装在一个丨ambda 表达式中。之所以希望以后再执行代码， 这有很多原因， 如：
>
> ```java
> 在一个单独的线程中运行代码；
> •多次运行代码；
> •在算法的适当位置运行代码 （例如， 排序中的比较操作；)
> •发生某种情况时执行代码 （如， 点击了一个按钮， 数据到达， 等等；)
> •只在必要时才运行代码
> ```
>
>   
>
> ```java
> 下面来看一个简单的例子。 假设你想要重复一个动作 n 次。 将这个动作和重复次数传递
> 到一个 repeat 方法：
> repeat(10, 0 -> System.out.println("Hello, World!"))；
> ```
>
> 

