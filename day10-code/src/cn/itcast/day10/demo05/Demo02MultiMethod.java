package cn.itcast.day10.demo05;

/*
在多态的代码当中，成员方法的访问规则是：
    看new的是谁，就优先用谁，没有则向上找

口诀：
成员变量：编译看左边，运行还看左边
成员方法：编译看左边，运行看右边

obj是父类的东西，子类new出来的，父类存在的子类重写了才能找到，父类不存在的子类存在的方法，obj找不到
同理，父类和子类的成员变量是两个东西只不过是名称恰巧一致，所以输出的还是父类的
* */
public class Demo02MultiMethod {

    public static void main(String[] args) {
        Fu obj = new Zi();//多态

        obj.method();//父子都有，优先用子
        obj.methodFu();//子类没有，父类有，向上找到父类

        //编译看左边，左边是Fu，Fu当中没有methodZi方法，所以编译报错
//        obj.methodZi();//错误写法
    }
}
