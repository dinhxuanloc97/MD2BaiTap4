package Baitap3;
import Baitap3.Fan;

public class Main {
    public static void main(String[] args) {
        //B1. Khoi tao 2 doi tuong Fan
        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn(false);
        //B2. Goi toString de in thong tin quat
        System.out.println("THONG TIN DOI TUONG FAN 1: ");
        System.out.println(fan1.toString());
        System.out.println("THONG TIN DOI TUONG FAN 2:");
        System.out.println(fan2.toString());
    }
}