package model;

public class SinhVien {
    private String name;
    private int mvs;
    private String ngaysinh;
    private String lop;

    public SinhVien() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMvs() {
        return mvs;
    }

    public void setMvs(int mvs) {
        this.mvs = mvs;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public SinhVien(String name, int mvs, String ngaysinh, String lop) {
        this.name = name;
        this.mvs = mvs;
        this.ngaysinh = ngaysinh;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", mvs=" + mvs +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
