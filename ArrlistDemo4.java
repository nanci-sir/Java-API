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