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