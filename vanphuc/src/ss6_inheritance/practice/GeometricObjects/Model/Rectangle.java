package ss6_inheritance.practice.GeometricObjects.Model;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return getWidth() * getLength();
    }

    public double getPerimeter() {
        return (getWidth() + getLength()) * 2;
    }

    public String toString() {
        return String.format("A Rectangle with width =  " + getWidth() + ", and length = " + getLength()
                + " Area = %1.2f, " + " Perimeter= %1.2f, \n"
                + super.toString(), getArea(), getPerimeter());
    }
}
    /*Có thêm hai thuộc tính là width và length (double).

        Có ba phương thức khởi tạo. Phương thức khởi tạo mà
         không cần đối số đầu vào sẽ đặt giá trị mặc định cho width và length là 1.0.

        Có các getter và setter cho tất cả các thuộc tính.

        Có phương thức getArea và getPerimeter trả về diện tích và chu vi của hình.

        Được cài đè phương thức toString trả về chuỗi ký tự theo mẫu
         "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy"
         .Trong đó yyy là kết quả thực thi từ phương thức toString của lớp Shape.

        Có một lớp con là lớp Square.*/