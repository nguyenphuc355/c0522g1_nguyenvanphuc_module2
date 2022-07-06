package ss4_class_and_object.practice;

public class test {

        private String name;
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }

    public static void main(String[] args) {
        test person = new test();
        person.setName("phuc");
        System.out.println("Myname is: " + person.getName());
    }

}
