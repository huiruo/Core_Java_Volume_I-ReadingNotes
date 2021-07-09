#### 01.Object

>   如果没有明确地指出超类，Object 就被认为是这个类的超类。  
>
> ```java
> 在 Java 中， 只有基本类型 （ primitive types) 不是对象， 例如，数值、 字符和布尔类型的
> 值都不是对象。
> 所有的数组类塱，不管是对象数组还是基本类型的数组都扩展了 Object 类。
> Employee[] staff = new Employee[10];
> obj = staff; // OK
> obj = new int[10]; // OK
> ```





#### 02.  泛型数组列表  

>   在许多程序设计语言中， 特别是在 C++ 语言中， 必须在编译时就确定整个数组的大小。
> 程序员对此十分反感， 因为这样做将迫使程序员做出一些不情愿的折中 . 
>
>  ArrayList 是一个采用类型参数（ type parameter ) 的泛型类（ generic class )。 为了指定数
> 组列表保存的元素对象类型，需要用一对尖括号将类名括起来加在后面， 例如， ArrayList
> <Employee>。  
>
> ```java
> 下面声明和构造一个保存 Employee 对象的数组列表：
> ArrayList<Employee> staff = new ArrayList<Eniployee>();
> 
> //两边都使用类型参数 Employee， 这有些繁琐。 Java SE 7中， 可以省去右边的类型参数：
> ArrayList<Employee> staff = new ArrayList<>()
> ```
>
> **使用:**
>
> ```java
> 例如，下面展示了如何将雇员对象添加到数组列表中的方法：
> staff.add(new Employee("Harry Hacker", . . .));
> staff.add(new Eraployee("Tony Tester", . . .));
> ```
>
> 