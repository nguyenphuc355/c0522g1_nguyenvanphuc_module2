package ss4_class_and_object.exercise.FanClass;

public class MainFanClass {
    public static void main(String[] args) {
        FanClass fan1 = new FanClass();
        fan1.setSpeed(fan1.getFAST());
        fan1.setColor("yellow");
        fan1.setRadius(10);
        fan1.setOn(true);
        System.out.println("FAN1:\n" + fan1);



        FanClass fan2 = new FanClass();
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setColor("blue");
        fan2.setRadius(5);
        fan2.setOn(false);
        System.out.println("FAN2:\n" + fan2);
    }
}
