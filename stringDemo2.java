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