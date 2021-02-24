package cn.itcast.day10.demo06;

/*
如何才能知道一个父类引用的对象，本来是什么子类？
格式：
对象 instranceof 类名称
这将会得到一个boolean值结果，也就是判断前面的对象能不能当做后面类的实例
* */
public class Demo02Instanceof {

    public static void main(String[] args) {
        Animal animal = new Dog();//本来是一只狗
        animal.eat();//狗吃SHIT

        //如果希望调用子类特有方法，需要向下转型
        //判断一下父类引用animal本来是不是Dog
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        //判断一下animal本来是不是Cat
        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

        giveMeAPet(new Cat());
    }

    public static void giveMeAPet(Animal animal) {
        if(animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if(animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
