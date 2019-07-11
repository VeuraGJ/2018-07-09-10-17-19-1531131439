package practice08;

public class Student extends Person{
    private Klass klass;
    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String isLeader = "Leader of";
        if(klass.getLeader() == null){
            isLeader = "at";
        }else{
            if(klass.getLeader().getName() != this.getName()){
                isLeader = "at";
            }
        }
        return String.format("%s I am a Student. I am %s %s.",super.introduce(), isLeader, klass.getDisplayName());
    }
}
