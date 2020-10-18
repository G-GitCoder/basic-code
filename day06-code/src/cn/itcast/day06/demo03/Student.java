package cn.itcast.day06.demo03;

/*
对于基本数据类型中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx保持不变
* */
public class Student {

    private String name;//姓名
    private int age;//年龄
    private boolean male;//性别，爷们？

    public void setMale(boolean b) {
        male = b;
    }

    public boolean isMale() {
        return male;
    }

    public void setName(String str) {
        name = str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}

