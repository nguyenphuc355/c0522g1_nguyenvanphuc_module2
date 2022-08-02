package ss12_java_collection_frame_work.overtime_1.model;

public class TaiKhoanTietKiem extends TaiKhoanNganHang{

    private int soTienGuiTietKiem;
    private String ngayGuiTietKiem;
    private int laiSuat;
    private String kiHan;

    public TaiKhoanTietKiem() {
    }

    public TaiKhoanTietKiem(int soTienGuiTietKiem, String ngayGuiTietKiem, int laiSuat, String kiHan) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public TaiKhoanTietKiem(int idTaiKhoan, String maTaiKhoan, String tenChuTaiKhoan, String ngayTaoTaiKhoan,
                            int soTienGuiTietKiem, String ngayGuiTietKiem, int laiSuat, String kiHan) {
        super(idTaiKhoan, maTaiKhoan, tenChuTaiKhoan, ngayTaoTaiKhoan);
        this.soTienGuiTietKiem = soTienGuiTietKiem;
        this.ngayGuiTietKiem = ngayGuiTietKiem;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public int getSoTienGuiTietKiem() {
        return soTienGuiTietKiem;
    }

    public void setSoTienGuiTietKiem(int soTienGuiTietKiem) {
        this.soTienGuiTietKiem = soTienGuiTietKiem;
    }

    public String getNgayGuiTietKiem() {
        return ngayGuiTietKiem;
    }

    public void setNgayGuiTietKiem(String ngayGuiTietKiem) {
        this.ngayGuiTietKiem = ngayGuiTietKiem;
    }

    public int getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(int laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String getInfo() {
        return String.format("%d,%s,%s,%s,%d,%s,%d,%s\n",getIdTaiKhoan(),getMaTaiKhoan(),getTenChuTaiKhoan(),
                getNgayTaoTaiKhoan(),getSoTienGuiTietKiem(),getNgayGuiTietKiem(),getLaiSuat(),getKiHan());
    }

    @Override
    public String toString() {
        return "TAI KHOAN TIET KIEM: "+super.toString()+
                "soTienGuiTietKiem:[" + soTienGuiTietKiem +"]"+
                " ngayGuiTietKiem:[" + ngayGuiTietKiem + "]"+
                " laiSuat:[" + laiSuat +"]"+
                " kiHan:[" + kiHan+ "]";
    }
}
