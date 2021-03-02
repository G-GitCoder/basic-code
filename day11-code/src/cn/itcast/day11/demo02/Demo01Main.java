package cn.itcast.day11.demo02;

/*
Java中有四种权限修饰符：
                            public  >   protected   >   (default)   >   private
同一个类是否可以访问（我自己）      Y           Y               Y               Y
同一个包的（我邻居）              Y           Y               Y               N
不同包子类（我儿子）              Y           Y               N               N
不同包且非子类（陌生人）           Y           N               N               N

注意事项：(default)并不是关键字"default"，而是根本不写
* */
public class Demo01Main {
}
