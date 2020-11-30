package model;

public class TheMuon {
    private int phieumuon;
    private int ngaymuon;
    private int ngaytra;
    private String sohieusach;
    private SinhVien sinhVien;

    public TheMuon() {}

    public int getPhieumuon() {
        return phieumuon;
    }

    public void setPhieumuon(int phieumuon) {
        this.phieumuon = phieumuon;
    }

    public int getNgaymuon() {
        return ngaymuon;
    }

    public void setNgaymuon(int ngaymuon) {
        this.ngaymuon = ngaymuon;
    }

    public int getNgaytra() {
        return ngaytra;
    }

    public void setNgaytra(int ngaytra) {
        this.ngaytra = ngaytra;
    }

    public String getSohieusach() {
        return sohieusach;
    }

    public void setSohieusach(String sohieusach) {
        this.sohieusach = sohieusach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "phieumuon=" + phieumuon +
                ", ngaymuon='" + ngaymuon + '\'' +
                ", ngaytra='" + ngaytra + '\'' +
                ", sohieusach='" + sohieusach + '\'' +
                ", sinhVien=" + sinhVien +
                '}';
    }

    public TheMuon(int phieumuon, int ngaymuon, int ngaytra, String sohieusach, SinhVien sinhVien) {
        this.phieumuon = phieumuon;
        this.ngaymuon = ngaymuon;
        this.ngaytra = ngaytra;
        this.sohieusach = sohieusach;
        this.sinhVien = sinhVien;
    }
}
