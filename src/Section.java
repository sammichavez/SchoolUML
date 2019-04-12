public class Section {
    public Section(Teacher teacher,  String name) {
        this.teacher = teacher;

        this.name = name;

    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    private int currentSize;
    public Student[] getStudents() {
        return students;
    }


    public void setStudents(Student[] students) {
        this.students = students;
    }

    private Student[] students = new  Student[50];

    private Teacher teacher;
    private String name;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public String getName() {
        return name;
    }
    public void addStudent(Student s){
             students[currentSize] = s;
             currentSize++;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        String n = "";
        for(int i = 0; i<students.length;i++){
            if(students[i]!=null) {
                n = n + " " + students[i].getName();
            }
        }
        String x = "This " + name + " class is taught by " + teacher.getName() + " and has " + currentSize
                + " students:" + n;
        return x;
    }
}
