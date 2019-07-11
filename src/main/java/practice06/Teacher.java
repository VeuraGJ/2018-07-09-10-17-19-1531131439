package practice06;

import java.text.MessageFormat;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public Teacher(String name, int age) {
        super(name, age);
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        String teachClass = this.klass > 0 ? "Class " + this.klass : "No Class";
        return super.introduce() + " " + MessageFormat.format("I am a Teacher. I teach {0}.",teachClass);
    }
}
