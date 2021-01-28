package cn.itcast.day10.demo04;

/*
代码当中体现多态性，其实就是一句话：【父类引用指向子类对象】【左父右子就是多态】

格式：
父类名称 对象名 = new 子类名称();
or
接口名称 对象名 = new 实现类名称();
* */
public class Demo01Multi {

    public static void main(String[] args) {
        //使用多态的写法
        //左侧父类的引用，指向了右侧子类的对象
        Fu obj = new Zi();

        obj.method();//子类方法
        obj.methodFu();//父类特有方法
    }
}
