package phuongtien;

public class Oto extends PhuongTien {
    private int socho;

    public Oto() {

    }

    public Oto(int socho,String ten,String hang,
               String mau, int gia) {
        super(ten,hang,mau,gia);
        this.socho = socho;
    }

    public int getSocho() {
        return socho;
    }

    public void setSocho(int socho) {
        this.socho = socho;
    }

    @Override
    public String toString() {
        return "Oto{ ten" + getTen() +
                ",gia" + getGia() +
                "socho=" + socho +
                '}';
    }
}
