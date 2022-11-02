package String;

public class stringDemo3 {
    public static void main(String[] args) {

       //1 public int length​() 返回此字符串的长度
        String name = "我爱你love";
        System.out.println(name.length());//7
        //2 public char charAt​(int index) 获取某个索引位置处的字符
        char c = name.charAt(1);
        System.out.println(c);//爱
        //遍历字符串每个字符
        for (int i = 0; i <name.length() ; i++) {
            char ch = name.charAt(i);
            System.out.println(ch);

        }
        //3public char[] toCharArray​()： 将当前字符串转换成字符数组返回
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
