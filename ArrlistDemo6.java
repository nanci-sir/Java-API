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
