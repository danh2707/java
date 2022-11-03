package UseClass;

import BuildClass.Complex;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //khai báo đối tượng
        Complex sp1 = new Complex();
        Complex sp2 = new Complex();
        Complex spThuong = new Complex();

        //nhập
        System.out.println("Nhap vao so phuc 1:");
        sp1.nhap(sc);
        System.out.println("Nhap vao so phuc 2:");
        sp2.nhap(sc);

        //hiển thị
        System.out.println("số phức 1:");sp1.hienthi();
        System.out.println("số phức 2:");sp2.hienthi();

        //chía sp1 cho sp2
        spThuong = sp1.chiaSP(sp2);

        //hiển thị
        System.out.println("kết quả của phép chia là:");
        spThuong.hienthi();

        sc.close();
    }

}
