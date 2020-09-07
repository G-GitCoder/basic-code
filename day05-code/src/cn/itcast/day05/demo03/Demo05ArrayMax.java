package cn.itcast.day05.demo03;

public class Demo05ArrayMax {
    public static void main(String[] args) {
        int[] array = {5, 15, 20, 30, 10, 1000};

        int max = array[0];//比武擂台
        for (int i = 1; i < array.length; i++) {
            //如果当前元素比max更大，则换人
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}
