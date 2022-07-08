package ss6_inheritance.practice.GeometricObjects.Model;

import ss6_inheritance.practice.GeometricObjects.Model.Rectangle;

public class Square extends Rectangle {
    public Square() {
    }
    public Square(double side){
        super(side,side);
    }
    public Square(double side,String color,boolean filled){
        super(side,side,color,filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    public void setWidth(double  width){
        setSide(width);
    }
    public void setLength(double length){
        setSide(length);
    }
    public String toString(){
        return String.format("A Square with side = " + getSide()+",which a subclass of "+super.toString());

    }
}
    /*Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu "A Square with
        side=xxx, which is a subclass of yyy".Trong đó yyy là kết quả thực thi từ
        phương thức toString của lớp Rectangle.*/

   /* Chú ý: trong thực tế, một “square” không phải là một “rectangle”,
   do đó quan hệ “lớp square là lớp con của lớp rectangle” là không hợp lý.
   Tình huống ở đây được đưa ra chỉ với mục đích luyện tập hiện thực hóa mô tả
   thành giản đồ UML và triển khai mã theo bản vẽ.

   Lớp Square:

   Không có thêm thuộc tính nào so với lớp cha.

   Không có phương thức khởi tạo nào sử dụng đối số dầu vào width và length,
   thay vào đó là đối số side.

   Phương thức khởi tạo mà không cần đối số đầu vào sẽ đặt giá trị mặc
    định cho width và height (side) là 1.0.

   Có getter và setter cho side.

   Cài đè phương thức setWidth và getWidth để chúng thay đổi giá trị
    của cả width và height, để bảo toàn tính “vuông”.


   Có cần phải cài đè phương thức getArea và getPerimeter không?*/