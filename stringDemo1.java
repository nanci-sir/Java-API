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
