package phuongtien;

public interface QuanLy<T> {
    void them(T t);
    void sua(String name,T t);

    void xoa(String name);
    int timkiem(String name);
    void sapxep();
    void print();


}
