package minitest;

public class Student extends LopNguoi {
    private int diem;

    public Student() {

    }
    public Student(int diem,int ma,String ten,int tuoi){
        super(ma, ten, tuoi);
        this.diem = diem;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "Student{" +
                "diem=" + diem +
                '}';
    }
}
