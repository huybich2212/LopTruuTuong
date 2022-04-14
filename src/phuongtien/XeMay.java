package phuongtien;

public class XeMay extends PhuongTien {
    private int dungtich;

    public XeMay() {

    }

    public XeMay(String hang, String ten, String mau, int gia, int dungtich) {
        super(hang, ten, mau, gia);
        this.dungtich = dungtich;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    @Override
    public String toString() {
        return "XeMay{ ten " + getTen() +
                ",gia = " + getGia() +
                ",mau:" + getMau() +
                "dungtich=" + dungtich +
                '}';
    }




    }
