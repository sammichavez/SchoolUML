public class Runner {
    public static void main(String[] args) {
        Teacher a = new Teacher("mueller" , "Bio" , 1);
        Teacher b = new Teacher("Palen" , "math", 2);
        Teacher c = new Teacher("Albinson" , "Computer Science" , 3);
        School BHS = new School("BHS");
        Section Bio = new Section(a, "Bio");
        Section Math = new Section(b , "math");
        Section Computer_Science = new Section(c , "Computer Science");
        Student Me = new Student("Sammi" , 1 , 11);
        Student F1 = new Student("Talia" , 2 , 11);
        Student F2 = new Student("Manny" , 3 , 11);
        Student F3 = new Student("Mario" , 4 , 11);
        Student F4 = new Student("Solia" , 5 , 11);
        Student F5 = new Student("Rachel" , 6 , 11);
        Bio.addStudent(Me);
        Bio.addStudent(F1);
        Math.addStudent(F2);
        Math.addStudent(F3);
        Math.addStudent(F4);
        Computer_Science.addStudent(F5);
        System.out.println(Bio.toString());
        System.out.println(Math.toString());
        System.out.println(Computer_Science.toString());
    }


}
