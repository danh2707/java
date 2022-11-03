package BuildClass;
import java.util.Scanner;

public class Complex {
    //THuộc tính
    private double a;
    private double b;

    //phương thúc
    public Complex(){
        a=0;
        b=0;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Complex(double a, double b){
        this.a = a;
        this.b = b;
    }
    //hàm nhập số phức
    public void nhap(Scanner sc){
        System.out.print("\tnhap vao phan thưc:");a = sc.nextDouble();
        System.out.print("\tnhap vao phan thưc:");b = sc.nextDouble();
    }
    //Hàm hiển số phức
    public void hienthi(){
        if(b<0){
            System.out.println(a+"-" + Math.abs(b) + "*i");
        }else{
            System.out.println(a+"+" + b + "*i");
        }
    }
    //hàm cộng hai số phức
    public Complex congSP(Complex sp2){
        double thuc = a+sp2.a;
        double ao= b+ sp2.b;
        return new Complex(thuc,ao);
    }
    //hàm trừ hai số phức
    public Complex truSP(Complex sp2){
        double thuc = a - sp2.a;
        double ao= b - sp2.b;
        return new Complex(thuc,ao);
    }
    //hàm nhân 2 số phức
    public Complex nhanSP(Complex sp2){
        double thuc= a * sp2.a - b * sp2.b;
        double ao= a * sp2.b + b * sp2.a;
        return new Complex(thuc,ao);
    }
    //hàm chia 2 số phức
    public Complex chiaSP(Complex sp2){
        double thuc = (a* sp2.a + b* sp2.b)/(sp2.a * sp2.a + sp2.b * sp2.b);
        double ao = (sp2.a * b - a * sp2.b)/(sp2.a * sp2.a + sp2.b* sp2.b);
        return new Complex(thuc,ao);
    }

    @Override
    public String toString() {
        return "Complex{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}