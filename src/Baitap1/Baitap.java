package Baitap1;

import java.util.Scanner;

public class Baitap {
    private  double a ;
    private double b;
    private  double c;

    public Baitap(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
    public double getDelta(){
        return (Math.pow(b,2)-4*a*c);
    }
    public  double getRoot1(){
        return (-b+Math.sqrt(getDelta())/(2*a));
    }
    public double getRoot2(){
        return (-b-Math.sqrt(getDelta())/(2*a));
    }
    public double motNghiem(){
        return -b/(2*a);
    }

    public static class Main {
        public static void main(String[] args) {
            System.out.println("Giai phuong trinh bậc 2 : ax2 + bx +c =0 ");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập giá trị a:");
            double a = scanner.nextDouble();
            if(a==0){
                System.out.println("Không thể giải phương trình nếu a=0 ");
                return;
            }
            System.out.println("Nhập giá trị b :");
            double b = scanner.nextDouble();
            System.out.println("Nhập giá trị vào c");
            double c = scanner.nextDouble();
            Baitap quadraticEquation = new Baitap(a, b, c);
            System.out.println("delta =" + quadraticEquation.getDelta());
            if (quadraticEquation.getDelta() == 0) {
                System.out.println("Phương trình có 1 nghiệm là " + quadraticEquation.motNghiem());
            } else if (quadraticEquation.getDelta() < 0) {
                System.out.println("Phương trình vô nghiệm ");
            } else if (quadraticEquation.getDelta() > 0) {
                System.out.println("Phương trình có 2 nghiệm là ");
                System.out.println("Nghiệm 1 là " + quadraticEquation.getRoot1() + "\n Nghiệm 2 là :" + quadraticEquation.getRoot2());

            }
        }
    }
}
