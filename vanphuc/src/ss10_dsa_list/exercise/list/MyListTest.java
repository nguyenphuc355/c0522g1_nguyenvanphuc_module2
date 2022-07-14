package ss10_dsa_list.exercise.list;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Phuc");
        Student b = new Student(2, "Huy");
        Student c = new Student(3, "Nam");
        Student d = new Student(4, "ty");
        Student e = new Student(5, "Thuyen");
        Student f = new Student(5, "My");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newMyList = new MyList<>();
        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);
//        studentMyList.add(f, 3);
        studentMyList.size();
////        studentMyList.clear();
        System.out.println(studentMyList.size());
//
       for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.print(student.getId());
            System.out.println("\t" + student.getName());
        }
//
//        System.out.println(studentMyList.get(2).getName());
//
//        System.out.println(studentMyList.contains(f));
//
//        studentMyList = studentMyList.clone();

//       Student student = newMyList.remove(1);

//        System.out.println(student.getName());

//        for (int i = 0; i < newMyList.size(); i++) {
//            System.out.println(newMyList.get(i).getName());
//        }
    }
}
