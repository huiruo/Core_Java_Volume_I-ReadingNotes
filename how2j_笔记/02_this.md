#### 01. this代表当前对象 

> this这个关键字，相当于普通话里的“**我**”
>
> 小明说 “我吃了” 这个时候，“**我**” 代表小明
> 小红说 “我吃了” 这个时候，“**我**” 代表小红
> "**我**"代表当前人物
>
> **this**这个关键字，相当于普通话里的“**我**”
> **this即代表当前对象** 



#### 02. 通过this访问属性 

> ```java
> public class Hero {
>      
>     String name; //姓名
>      
>     float hp; //血量
>      
>     float armor; //护甲
>      
>     int moveSpeed; //移动速度
>  
>     //参数名和属性名一样
>     //在方法体中，只能访问到参数name
>     public void setName1(String name){
>         name = name;
>     }
>      
>     //为了避免setName1中的问题，参数名不得不使用其他变量名
>     public void setName2(String heroName){
>         name = heroName;
>     }
>      
>     //通过this访问属性
>     public void setName3(String name){
>         //name代表的是参数name
>         //this.name代表的是属性name
>         this.name = name;
>     }
>      
>     public static void main(String[] args) {
>         Hero  h =new Hero();
>          
>         h.setName1("teemo");
>         System.out.println(h.name);
>          
>         h.setName2("garen");
>         System.out.println(h.name);    
>          
>         h.setName3("死歌");
>         System.out.println(h.name);    
>     }
> }
> ```



#### 03. 通过this调用其他的构造方法 

>  如果要在一个构造方法中，调用另一个构造方法，可以使用this() 
>
> ```java
> public class Hero {
>         
>     String name; //姓名
>         
>     float hp; //血量
>         
>     float armor; //护甲
>         
>     int moveSpeed; //移动速度
>         
>     //带一个参数的构造方法
>     public Hero(String name){
>         System.out.println("一个参数的构造方法");
>         this.name = name;
>     }
>       
>     //带两个参数的构造方法
>     public Hero(String name,float hp){
>         this(name);
>         System.out.println("两个参数的构造方法");
>         this.hp = hp;
>     }
>  
>     public static void main(String[] args) {
>         Hero teemo =  new Hero("提莫",383);
>          
>         System.out.println(teemo.name);
>          
>     }
>       
> }
> ```



#### 04.练习。直接用this调用已有的构造函数

> 参考[练习-构造方法](https://how2j.cn/k/class-object/class-object-constructor/292.html#step2209)
> String name
> float armor
> 不仅如此，在这个构造方法中，调用这个构造方法
>
> public Hero(String name,float hp)
>
> ```java
> public class Hero {
>  
>     String name; // 姓名
>  
>     float hp; // 血量
>  
>     float armor; // 护甲
>  
>     int moveSpeed; // 移动速度
>  
>     // 带一个参数的构造方法
>     public Hero(String name) {
>         System.out.println("一个参数的构造方法");
>         this.name = name;
>     }
>  
>     // 带两个参数的构造方法
>     public Hero(String name, float hp) {
>         this(name);
>         System.out.println("两个参数的构造方法");
>         this.hp = hp;
>     }
>  
>     // 带有四个参数的构造方法,直接用this调用已有的构造函数
>     public Hero(String name, float hp, float armor, int moveSpeed) {
>         this(name,hp);
>         this.armor = armor;
>         this.moveSpeed = moveSpeed;
>     }
>  
>     public static void main(String[] args) {
>         Hero teemo = new Hero("提莫", 383);
>         System.out.println(teemo.name);
>         Hero db =  new Hero("死哥",400,27,360);
>         System.out.println(db.moveSpeed);
>     }
> }
> ```
>
> 