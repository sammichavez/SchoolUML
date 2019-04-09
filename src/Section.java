public class Section {
    public Section(Teacher teacher, Student[] student, String name, int currentSize) {
        this.teacher = teacher;
        this.student = student;
        this.name = name;
        this.currentSize = currentSize;
    }

    private Teacher teacher;
    private Student[] student = new Student[50];

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    private String name;
    private int currentSize;

}