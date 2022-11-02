package arrlist;

import java.util.ArrayList;

public class ArrlistDemo5 {
    public static void main(String[] args) {
        //1.定义电影类
        //2.定义Arrlist集合
        ArrayList<Movie> movies = new ArrayList<>();
        //3.创建对象封装数据，把对象加入集合
        Movie m1 = new Movie();
        movies.add(new Movie("《肖生克的救赎》",9.7,"罗宾斯"));
        movies.add(new Movie("《霸王别姬》",9.5,"张国荣"));
        System.out.println(movies);
        //4.遍历对象展示
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            System.out.println("片名" + movie.getName());
            System.out.println("评分" + movie.getScore());
            System.out.println("主演" + movie.getActor());

        }

    }
}
