package cn.itcast.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.setAge(20);
        stu.setMale(true);
        stu.setName("鹿涵涵");

        System.out.println("姓名：" + stu.getName());
        System.out.println("年龄：" + stu.getAge());
        System.out.println("爷们？" + stu.isMale());
    }
}
