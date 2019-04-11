public class Student extends Person{

    public Student (String name, int id, int grade ){
    super(name, id);
    this.grade = grade;
}
    private  Section[] section  = new Section[10];
    private int sectionCount = 0;
    private int grade;

    public Section[] getSection() {
        return section;
    }

    public void setSection(Section[] section) {
        this.section = section;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }




}
