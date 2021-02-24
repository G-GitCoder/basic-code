package cn.itcast.day10.demo07;

public class Computer {

    public void powerOn() {
        System.out.println("笔记本开机");
    }

    public void powerOff() {
        System.out.println("笔记本关机");
    }

    //使用USB设备的方法，使用接口作为方法的参数
    public void useDevice(USB usb) {
        usb.open();//打开设备

        usb.close();//关闭设备
    }
}
