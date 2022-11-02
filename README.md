# Java-API
常用得到Java API
## 1.API

### 1.1API概述

什么是API

​	API (Application Programming Interface) ：应用程序编程接口

java中的API

​	指的就是 JDK 中提供的各种功能的 Java类，这些类将底层的实现封装了起来，我们不需要关心这些类是如何实现的，只需要学习这些类如何使用即可，我们可以通过帮助文档来学习这些API如何使用。

## 2.String类

### 2.1String类概述

​	String 类代表字符串，Java 程序中的所有字符串文字（例如“abc”）都被实现为此类的实例。也就是说，Java 程序中所有的双引号字符串，都是 String 类的对象。String 类在 java.lang 包下，所以使用的时候不需要导包！

### 2.2String类的特点

- 字符串不可变，它们的值(对象)在创建后不能被更改
- 虽然 String 的值是不可变的，但是它们可以被共享
- 字符串效果上相当于字符数组( char[] )，但是底层原理是字节数组( byte[] )

### 2.3 String是什么，可以做什么？ 

字符串类型，可以定义字符串变量指向字符串对象。

### 2.4String是不可变字符串的原因？ 

 String变量每次的修改其实都是产生并指向了新的字符串对象。

 原来的字符串对象都是没有改变的，所以称不可变字符串

### 2.5String类的构造方法

- 常用的构造方法

- 直接使用“”定义。（推荐方式）  String name = "传智教育";

- 方式二：通过String类的构造器创建对象。

  | 方法名                      | 说明                                      |
  | --------------------------- | ----------------------------------------- |
  | public   String()           | 创建一个空白字符串对象，不含有任何内容    |
  | public   String(char[] chs) | 根据字符数组的内容，来创建字符串对象      |
  | public   String(byte[] bys) | 根据字节数组的内容，来创建字符串对象      |
  | String s =   “abc”;         | 直接赋值的方式创建字符串对象，内容就是abc |

  ```java
  package String;
  
  import org.w3c.dom.ls.LSOutput;
  
  public class stringDemo1 {
      public static void main(String[] args) {
          //1直接使用“”定义。（推荐方式）
          String name = "我爱你";
          System.out.println(name);
          //2创建一个空白字符串对象，不含有任何内容
          String s1 = new String();
          System.out.println(s1);
          //3根据传入的字符串内容，来创建字符串对象
          String s2 = new String("我爱你");
          System.out.println(s2);
          //4根据字符数组的内容，来创建字符串对象
          char[] chars = {'a','b','中','国',};//ab中国
          String s3 = new String(chars);
          System.out.println(s3);
          //5根据字节数组的内容，来创建字符串对象
          byte[] bytes = {12,3,4,52,23,};
          String s4 = new String(bytes);
          System.out.println(s4);
          System.out.println("************************");
          //"abc"在字符串常量池；双引号创建的字符串对象，在字符串常量池中存储同一个
          String ss1 = "abc";
          String ss2 = "abc";
          System.out.println(ss1 == ss2);//true
  
         //通过new 构造器创建的字符串对象，在堆内存中分开存储
          char[] chars1 = {'a','b','c'};
          String ss3 = new String(chars1);
          String ss4 = new String(chars1);
          System.out.println(ss3 == ss4);//false
  
      }
  }
  
  ```

1.**有什么区别吗？（面试常考）**

 以“”方式给出的字符串对象，在字符串常量池中存储，而且相同内容只会在其中存储一份。  通过构造器new对象，每new一次都会产生一个新对象，放在堆内存中。

2.

```java
public class Test2 {

 public static void main(String[] args) 

{ String s2 = new String("abc"); //创建了两个对象

String s1 = "abc";//0个

 System.out.println(s1 == s2); } }//false
```

3.

```java
public class Test3 { 

public static void main(String[] args) {

 String s1 = "abc"; String s2 = "ab"; 

String s3 = s2 + "c"; 

System.out.println(s1 == s3);}}//false
```

4.

```java
public class Test4 { 

public static void main(String[] args) { 

String s1 = "abc"; 

String s2 = "a" + "b" + "c"; 

System.out.println(s1 == s2)}}//true 

//Java存在编译优化机制，程序在编译时： “a” + “b” + “c” 会直接转成 "abc"
```

### 2.6字符串的比较

#### ==号的作用

- 比较基本数据类型：比较的是具体的值
- 比较引用数据类型：比较的是对象地址值

#### equals方法的作用

- 方法介绍

  ```java
  public boolean equals(String s)     比较两个字符串内容是否相同、区分大小写
  ```

- 示例代码

  ```java
  package String;
  
  import org.w3c.dom.ls.LSOutput;
  
  import java.util.Scanner;
  
  public class stringDemo2 {
      public static void main(String[] args) {
          String okName = "南辞";
          String okPassword = "123456";
  
          Scanner sc = new Scanner(System.in);
          System.out.println("登录名称：");
          String name = sc.next();
          System.out.println("登录密码： ");
          String password = sc.next();
  
          if(okName.equals(name) && okPassword.equals(password) ){
              System.out.println("登录成功！");
          }else{
              System.out.println("登录失败！");
          }
          String sysCode = "cjnHG";
          String code1 = "CJNhg";
          System.out.println(sysCode.equals(code1));//false
          System.out.println(sysCode.equalsIgnoreCase(code1));//true
          
      }
  }
  ```

equalsIgnoreCase不区分大小写

1.如果是字符串比较应该使用使用什么方式进行比较，为什么？

 使用String提供的equals方法。  只关心内容一样就返回true。 

2、开发中什么时候使用==比较数据  基本数据类型比较时使用

常用API

```java
package String;

public class stringDemo3 {
    public static void main(String[] args) {

       //1 public int length() 返回此字符串的长度
        String name = "我爱你love";
        System.out.println(name.length());//7
        //2 public char charAt(int index) 获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);//爱
        //遍历字符串每个字符
        for (int i = 0; i <name.length() ; i++) {
            char ch = name.charAt(i);
            System.out.println(ch);

        }
        //3public char[] toCharArray()： 将当前字符串转换成字符数组返回
         char[] chars =   name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            System.out.println(ch);

        }
        //4 public String substring(int beginIndex, int endIndex) 根据开始和结束索引进行截取，得到新的字符串（包前不包后）
          String rs =  name.substring(0,3);
          System.out.println(rs);//我爱你
        //5 public String substring(int beginIndex) 从传入的索引处截取，截取到末尾，得到新的字符串
          String rs1 =  name.substring(3);
          System.out.println(rs1);//love
        //6 public String replace(CharSequence target,  CharSequence replacement)使用新值，将字符串中的旧值替换，得到新的字符串
        String name2 = "张三是最厉害的，张三喜欢代码，张三喜欢玩";
      String rs3 =   name2.replace("张三","李四");
        System.out.println(rs3);//李四是最厉害的，李四喜欢代码，李四喜欢玩
        //7 public String[] split(String regex) 根据传入的规则切割字符串，得到字符串数组返回
        String name3 = "张三，李四，王五";
       String[] names  =  name3.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println("选择了：" + names[i]);//选择了：张三，李四，王五

        }
    }
}
```

**String类开发验证码功能**

```java
package String;

import java.util.Random;

public class stringDemo4 {
    public static void main(String[] args) {
        //1.定义可能出现的字符
        String datas = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM1234567890";

        //2.循环五次每次生成一个随机的索引连接起来
        String code = "";
        Random r = new Random();
        for (int i = 0; i <5 ; i++) {
            int index = r.nextInt(datas.length());
            char c = datas.charAt(index);
            code +=c;
        }
        //3.输出
        System.out.println(code);
    }
}
```

定义一个String类型的变量存储验a-zA-Z0-9之间的全部字符。 

 循环5次，随机一个范围内的索引，获取对应字符连接起来即可

### 2.7 用户登录案例



需求 已知用户名和密码，请用程序实现模拟用户登录。总共给三次机会，登录之后，给出相应的提示

```java
package String;

import java.util.Scanner;

public class stringDemo5 {
    public static void main(String[] args) {
        //1.定义一个用户名密码
        String okName = "8888";
        String okPassword = "6666";
        //2.定义一个循环，三次
        Scanner sc = new Scanner(System.in);//扫描器
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String Name = sc.next();
            System.out.println("请输入密码：");
            String passeord = sc.next();
            //3.判断
            if(okName.equals(Name)){
                if(okPassword.equals(passeord)){
                    System.out.println("登录成功！");
                    break;
                }else{
                    //密码错误
                    System.out.println("密码错误！您还剩余"+ (2 -11 i) + "次机会");
                }
            }else {
                System.out.println("用户名错误！您还剩余"+ (2 - i) + "次机会");

            }
            }
    }
}
```

### 2.8 手机号码屏蔽

键盘录入一个手机号，将中间四位号码屏蔽

```java
package String;

import java.util.Scanner;

public class stringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//扫描器
        System.out.println("请输入您的手机号：");
        String pass =  sc.next();
        String pass1 = pass.substring(0,3);
        String pass2 = pass.substring(7);
        String s =pass1 + "****" +pass2 ;
        System.out.println(s);

    }
}

```

键盘录入一个字符串。 ② 调用字符串对象的截取API，截取字符串前三位、后四位。 ③ 将前三位 连接“****”然后继续连接后四位，输出最终结果即可

### 

## 3.ArrayList 集合

### 3.1ArrayList类概述

- 什么是集合

  ​	提供一种存储空间可变的存储模型，存储的数据容量可以发生改变

- ArrayList集合的特点

  ​	底层是数组实现的，长度可以变化

- 泛型的使用

  ​	用于约束集合中存储元素的数据类型

  1.数组和集合的元素存储的个数问题? 

   数组定义后类型确定，长度固定 

  集合类型可以不固定，大小是可变的。

   2、数组和集合适合的场景 

   数组适合做数据个数和类型确定的场景 

   集合适合做数据个数不确定，且要做增删元素的场景 

### 3.2ArrayList类常用方法

#### 构造方法

| 方法名             | 说明                 |
| ------------------ | -------------------- |
| public ArrayList() | 创建一个空的集合对象 |

#### 常用API

| 方法名                                   | 说明                                   |
| ---------------------------------------- | -------------------------------------- |
| public boolean   remove(Object o)        | 删除指定的元素，返回删除是否成功       |
| public E   remove(int   index)           | 删除指定索引处的元素，返回被删除的元素 |
| public E   set(int index,E   element)    | 修改指定索引处的元素，返回被修改的元素 |
| public E   get(int   index)              | 返回指定索引处的元素                   |
| public int   size()                      | 返回集合中的元素的个数                 |
| public boolean   add(E e)                | 将指定的元素追加到此集合的末尾         |
| public void   add(int index,E   element) | 在此集合中的指定位置插入指定的元素     |

#### 示例代码

```java
package arrlist;

import java.util.ArrayList;

public class ArrlistDemo3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Java");
        list.add("MYSQL");
        list.add("HTML");
        list.add("SJ");
        list.add("MXM");
       //1. public E get(int index) 返回指定索引处的元素
      String e =   list.get(3);//SJ
        System.out.println(e);
        //2.public int size() 返回集合中的元素的个数
        System.out.println(list.size());//5
        //3.完成集合遍历
        for (int i = 0; i < list.size(); i++) {
           String rs =  list.get(i);
            System.out.println(rs);
        }
        //4. public E remove(int index) 删除指定索引处的元素，返回被删除的元素
        System.out.println(list);
        String rs2 =   list.remove(2);
        System.out.println(rs2);//[Java, MYSQL, HTML, SJ, MXM] HTML
        System.out.println(list);//[Java, MYSQL, SJ, MXM]

        // 5. public boolean remove(Object o) 删除指定的元素，返回删除是否成功
        list.remove("SJ");
        System.out.println(list);//[Java, MYSQL,  MXM]
        // 6. public E set(int index,E element) 修改指定索引处的元素，返回被修改的元素
      String rs3 = list.set(1,"Java");
        System.out.println(rs3);//[Java, MYSQL, MXM] MYSQL
        System.out.println(list);//[Java, Java, MXM]

    }
}
```

## 3.3泛型概述 

 ArrayList：其实就是一个泛型类，可以在编译阶段约束集合对象只能操作某种数据类型。 

举例： ArrayList<String> ：此集合只能操作字符串类型的元素。  ArrayList<Integer>：此集合只能操作整数类型的元素。

```java
package arrlist;

import java.util.ArrayList;

public class ArrlistDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("Java");
        list.add("myaql");
        ArrayList<Integer> list2 = new ArrayList();
        list.add("23");
        list.add("100");
    }
}
```

怎么去统一ArrayList集合操作的元素类型？  使用泛型：<数据类型> ArrayList list1 = new ArrayList()



## 3.4遍历并删除元素值 

需求： 某个班级的考试在系统上进行，成绩大致为：98, 77, 66, 89, 79, 50, 100 

现在需要先把成绩低于80分以下的数据去掉

```java
package arrlist;

import java.util.ArrayList;

public class ArrlistDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(98);
        scores.add(43);
        scores.add(90);
        scores.add(54);
        scores.add(78);
        scores.add(67);
        scores.add(100);
        scores.add(59);
        scores.add(93);
        System.out.println(scores);
        //[98, 43, 90, 54, 78, 67, 100, 59, 93]
        //遍历元素
        //从后往前删除没有BUG
        for (int i = scores.size() - 1; i >= 0; i--) {
            int score = scores.get(i);
            //删除元素
            if (score < 80) {
                scores.remove(i);
            }
        }
        System.out.println(scores);
    }
}
```

集合中遍历元素，并筛选出元素删除它，应该怎么解决？ 

 从集合后面遍历然后删除，可以避免漏掉元素

## 3.5影片信息在程序中的表示

 需求  某影院系统需要在后台存储上述三部电影，然后依次展示出来。

```java
package arrlist;

import java.util.ArrayList;

public class ArrlistDemo5 {
    public static void main(String[] args) {
        //1.定义电影类
        //2.定义Arrlist集合
        ArrayList<Movie> movies = new ArrayList<>();
        //3.创建对象封装数据，把对象加入集合
        Movie m1 = new Movie();
        movies.add(new Movie("《肖生克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.5,"张国荣"));
        System.out.println(movies);
        //4.遍历对象展示
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("片名" + movie.getName());
            System.out.println("评分" + movie.getScore());
            System.out.println("主演" + movie.getActor());

        }

    }
}
```

```java
package arrlist;

public class Movie {
    //私有
    private String name;
    private  double score;
    private  String actor;

    public Movie() {
    }

    public Movie(String name, double score, String actor) {
        this.name = name;
        this.score = score;
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
```

集合中存储的元素并不是对象本身，而是对象的地址

## 3.6学生信息系统的数据搜索

 需求  后台程序需要存储如上学生信息并展示，然后要提供按照学号搜索学生信息的功能。

```java
package arrlist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrlistDemo6 {
    public static void main(String[] args) {
        //1.定义一个学生类
        //2.定义集合对象用于集合对象
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1","南辞",18,"计科2003"));
        students.add(new Student("2","张三",15,"计科2003"));
        students.add(new Student("3","李四",15,"计科2003"));
        students.add(new Student("4","王五",15,"计科2003"));
        System.out.println("学号\t\t名字\t\t年龄\t\t班级");
        //3.遍历集合展示
        for (int i = 0; i < students.size(); i++) {
           Student s =  students.get(i);
            System.out.println(s.getStudyId()+"\t\t"+s.getName() +"\t\t"+s.getAge()+"\t\t"+s.getCalssName());
        }
        //4.用户输入学号，搜索学生对象信息
        Scanner sc = new Scanner(System.in);//扫描器
        while (true) {
            System.out.println("请输入查询学号： ");
            String id = sc.next();//接受数据
            Student s = gtStudentByStudyId(students,id);
            //判断学号是否存在
            if (s == null){
                System.out.println("没有该学生");
            }else{
                System.out.println(s.getStudyId()+"\t\t"+s.getName() +"\t\t"+s.getAge()+"\t\t"+s.getCalssName());

            }
        }
    }
    public static  Student gtStudentByStudyId(ArrayList<Student> students,String studyId){
        for (int i = 0; i < students.size(); i++) {
            Student s =  students.get(i);
            if(s.getStudyId() .equals((studyId))){
                return  s;
            }

        }
        return  null;
    }
}
```

```java
package arrlist;

public class Student {
    private String studyId;
    private  String name;
    private  int age;
    private  String calssName;

    public Student() {
    }

    public Student(String studyId, String name, int age, String calssName) {
        this.studyId = studyId;
        this.name = name;
        this.age = age;
        this.calssName = calssName;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCalssName() {
        return calssName;
    }

    public void setCalssName(String calssName) {
        this.calssName = calssName;
    }
}
```

