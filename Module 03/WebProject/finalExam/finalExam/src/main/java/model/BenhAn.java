package model;

public class BenhAn {
    private String id;
    private BenhNhan benhNhan;
    private String ngayNhapVien;
    private String ngayXuatVien;
    private String lydo;

    public BenhAn() {
    }

    public BenhAn(String id, BenhNhan benhNhan, String ngayNhapVien, String ngayXuatVien, String lydo) {
        this.id = id;
        this.benhNhan = benhNhan;
        this.ngayNhapVien = ngayNhapVien;
        this.ngayXuatVien = ngayXuatVien;
        this.lydo = lydo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BenhNhan getBenhNhan() {
        return benhNhan;
    }

    public void setBenhNhan(BenhNhan benhNhan) {
        this.benhNhan = benhNhan;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayXuatVien() {
        return ngayXuatVien;
    }

    public void setNgayXuatVien(String ngayXuatVien) {
        this.ngayXuatVien = ngayXuatVien;
    }

    public String getLydo() {
        return lydo;
    }

    public void setLydo(String lydo) {
        this.lydo = lydo;
    }
}
