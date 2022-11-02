package arrlist;

public class Student {
    private String studyId;
    private  String name;
    private  int age;
    private  String calssName;

    public Student() {
    }

    public Student(String studyId, String name, int age, String calssName) {
        this.studyId = studyId;
        this.name = name;
        this.age = age;
        this.calssName = calssName;
    }

    public String getStudyId() {
        return studyId;
    }

    public void setStudyId(String studyId) {
        this.studyId = studyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCalssName() {
        return calssName;
    }

    public void setCalssName(String calssName) {
        this.calssName = calssName;
    }
}
