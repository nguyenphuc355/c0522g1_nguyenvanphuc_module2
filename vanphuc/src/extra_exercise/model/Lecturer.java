package extra_exercise.model;

public class Lecturer extends Person{
    private String specialize;

    public Lecturer() {
    }

    public Lecturer(String specialize) {
        this.specialize = specialize;
    }

    public Lecturer(int id, String name, String dateOfBirth, String gender, String specialize) {
        super(id, name, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }
    public String getInfo(){
        return String.format("%s,%s,%s,%s,%s,\n", this.getId(), this.getName()
                , this.getDateOfBirth(), this.getGender(), this.getSpecialize());
    }
    @Override
    public String toString() {
        return super.toString()+" Lecturer{ " +
                " specialize = ' " + specialize + '\'' +
                '}';
    }
}
