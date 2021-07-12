package edu.lesson8;

/**
 * @author Arthur Shtypuliak
 * @see Exam
 * @since 12.07.2021
 */
public class Student implements Cloneable {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;

        if (obj instanceof Student) {
            Student student = (Student) obj;
            return this.name.equals(student.name)
                    && this.age == student.age
                    && this.group.equals(student.group);
        }
        return false;
    }

    public int hashCode() {
        int hashcode = name == null ? 0 : name.hashCode();
        hashcode += 31 * age;
        hashcode += group == null ? 0 : group.hashCode();
        return hashcode;
    }

    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError("Clone not supported");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }
}
