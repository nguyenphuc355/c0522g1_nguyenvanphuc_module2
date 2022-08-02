package ss12_java_collection_frame_work.overtime_1.model;

public class TaiKhoanThanhToan extends TaiKhoanNganHang {
    private int soThe;
    private int soTienTrongTaikhoan;

    public TaiKhoanThanhToan() {
    }

    public TaiKhoanThanhToan(int soThe, int soTienTrongTaikhoan) {
        this.soThe = soThe;
        this.soTienTrongTaikhoan = soTienTrongTaikhoan;
    }

    public TaiKhoanThanhToan(int idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                             int soThe, int soTienTrongTaikhoan) {
        super(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soThe = soThe;
        this.soTienTrongTaikhoan = soTienTrongTaikhoan;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public int getSoTienTrongTaikhoan() {
        return soTienTrongTaikhoan;
    }

    public void setSoTienTrongTaikhoan(int soTienTrongTaikhoan) {
        this.soTienTrongTaikhoan = soTienTrongTaikhoan;
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s\n", getIdTaiKhoan(), getMaTaiKhoan(), getTenChuTaiKhoan(),
                getNgayTaoTaiKhoan(), getSoThe(), getSoTienTrongTaikhoan());
    }

    @Override
    public String toString() {
        return " TAI KHOAN THANH TOAN: "+ super.toString() +
                " soThe:[" + soThe +"]"+
                " soTienTrongTaikhoan:[" + soTienTrongTaikhoan +"]";
    }
}
