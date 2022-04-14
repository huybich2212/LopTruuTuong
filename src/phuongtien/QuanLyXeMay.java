package phuongtien;

import java.util.Arrays;

public class QuanLyXeMay implements QuanLy<XeMay> {
    private XeMay[] danhSach = new XeMay[4];
    private int size = 0;


    @Override
    public void them(XeMay xeMay) {
        danhSach[size] = xeMay;
        size++;
    }


    @Override
    public void sua(String name, XeMay xeMay) {
        danhSach[timkiem(name)] = xeMay;

    }

    @Override
    public void xoa(String name) {
        danhSach[timkiem(name)] = null;
    }

    @Override
    public int timkiem(String name) {
        for (int i = 0; i < size; i++) {
            if (name == danhSach[1].getTen()) {
                return i;
            }
        }

        return 0;
    }

    @Override
    public void sapxep() {
        Arrays.sort(danhSach);
    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        QuanLyXeMay ql = new QuanLyXeMay();
        XeMay xm1 = new XeMay("yamaha", "R15", "đen", 75, 150);
        XeMay xm2 = new XeMay("yamaha", "R6", "đen", 200, 600);
        XeMay xm3 = new XeMay("yamaha", "R1", "đen", 700, 1000);
        ql.them(xm1);
        ql.them(xm2);
        ql.them(xm3);
        ql.print();
        XeMay xm4 = new XeMay("yamaha", "R3", "đen", 120, 300);
        ql.sua("R15", xm4);
        ql.print();
        ql.xoa("R1");
        ql.print();
    }

}
