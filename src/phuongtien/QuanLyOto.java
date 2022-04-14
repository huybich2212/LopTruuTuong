package phuongtien;

public class QuanLyOto implements QuanLy<Oto> {
    private Oto[] danhSach = new Oto[6];
    private int size = 0;


    @Override
    public void them(Oto oto) {
        danhSach[size] = oto;
        size++;

    }

    @Override
    public void sua(String name, Oto oto) {

    }

    @Override
    public void xoa(String name) {

    }

    @Override
    public int timkiem(String name) {
        return 0;
    }

    @Override
    public void sapxep() {

    }

    @Override
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(danhSach[i]);
        }
        System.out.println("--------------------");
    }

    public static void main(String[] args) {
        QuanLyOto qloto = new QuanLyOto();
        Oto oto1 = new Oto(6,"sad","sada","ádas",2);
        Oto oto2 = new Oto(8,"hi","sada","ádas",7);
        Oto oto3 = new Oto(6,"ha","sada","ádas",4);
        qloto.them(oto1);
        qloto.them(oto2);
        qloto.them(oto3);
        Oto oto4 = new Oto(4,"he","sad","ádas",5);
        qloto.sua("hi",oto4);
        qloto.print();
    }

}

