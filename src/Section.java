public class Section {
    public Section(Teacher teacher,  String name) {
        this.teacher = teacher;

        this.name = name;

    }

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

    public void setName(String name) {
        this.name = name;
    }

}