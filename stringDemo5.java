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
                    System.out.println("密码错误！您还剩余"+ (2 -i) + "次机会");
                }
            }else {
                System.out.println("用户名错误！您还剩余"+ (2 - i) + "次机会");

            }
            }
    }
}
