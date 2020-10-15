package cn.itcast.day07.demo04;

/*
题目：
【对象数组】定义一个数组，用来存储3个Person对象

数组有一个缺点：一旦创建，程序运行期间长度不可以发生变化
* */
public class Demo01Array {

    public static void main(String[] args) {
        //首先创建一个长度为3的数组，里边用来存放Person类型的对象
        Person[] array = new Person[3];
//        System.out.println(array[0]);//null

        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("马尔扎哈", 38);

        //将one的地址值赋值给数组的0号元素
        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0]);//地址值
        System.out.println(array[1]);//地址值
        System.out.println(array[2]);//地址值

        System.out.println(array[1].getName());//古力娜扎
    }
}
