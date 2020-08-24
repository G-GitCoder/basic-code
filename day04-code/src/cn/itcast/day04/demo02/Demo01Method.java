package cn.itcast.day04.demo02;
/*
方法定义格式：
public static void 方法名(){
    方法体
}

方法调用格式：
方法名();

注意事项：
1.方法定义的先后顺序无所谓；
2.方法定义必须是挨着的，不能在一个方法的内部定义另一个方法；
3.方法定义之后，如果要执行，一定要进行方法的调用
 */
public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod(){
        for (int i = 0; i < 5; i++) {//for循环快捷键：循环次数.fori;  循环次数.forr
            for (int j = 0; j < 20; j++) {
                System.out.print("*");//print只输出，没有换行处理
            }
            System.out.println();
        }
    }
}
