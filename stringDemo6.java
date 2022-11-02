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
