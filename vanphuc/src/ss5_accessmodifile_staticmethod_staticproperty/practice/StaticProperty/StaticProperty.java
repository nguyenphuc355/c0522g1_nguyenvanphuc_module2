package ss5_accessmodifile_staticmethod_staticproperty.practice.StaticProperty;

public class StaticProperty {
    private String name;
    private String engine;

    public static int numbersOfCars;

    public  StaticProperty(String name, String engine) {
        this.name = name;
        this.engine = engine;
        numbersOfCars++;
    }

   /* private String getName() {
        return name;
    }

    private String getEngine() {
        return engine;
    }

    void setName(String name) {
        this.name = name;
    }

    void setEngine(String engine) {
        this.engine = engine;
    }
    String display(){
        return getName()+getEngine();
    }

*/
}
