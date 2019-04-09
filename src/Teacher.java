public class Teacher {
    public Teacher(Section[] ss, String subject, int sectionCount) {
        this.ss = ss;
        this.subject = subject;
        this.sectionCount = sectionCount;
    }

    private Section[] ss = new Section[10];
    private String subject;
    private int sectionCount;

    public Section[] getSs() {
        return ss;
    }

    public void setSs(Section[] ss) {
        this.ss = ss;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getSectionCount() {
        return sectionCount;
    }

    public void setSectionCount(int sectionCount) {
        this.sectionCount = sectionCount;
    }
}
