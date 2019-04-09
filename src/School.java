public class School {

    private String name;
    private Section[] ss = new Section[100];

    public School(String name, Section[] ss, int sCount) {
        this.name = name;
        this.ss = ss;
        this.sCount = sCount;
    }

    private int sCount = 0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSection(Section s) {
        ss[sCount] = s;
        sCount ++;
    }

    public Section[] getSs() {
        return ss;
    }
}
