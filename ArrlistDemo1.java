package arrlist;

import java.util.ArrayList;

public class ArrlistDemo1 {
    public static void main(String[] args) {
        //1.创建对象 ArrayList
        ArrayList list = new ArrayList();
        //2、添加
        list.add("Java");
        list.add("2");
        list.add("中");
        list.add("12.2");
        //输出
        System.out.println(list);//[Java, 2, 中, 12.2]
        //指定索引插入元素
        list.add(1, "张三");
        System.out.println(list);//[Java, 张三, 2, 中, 12.2]
    }

}