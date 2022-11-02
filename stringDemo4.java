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
