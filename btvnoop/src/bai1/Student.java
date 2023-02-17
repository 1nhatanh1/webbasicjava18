package bai1;

public class Student {
    int ID;
    String name;
    String classroom;
    String course;


    @Override
    public String toString() {
        return "Student{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", classroom='" + classroom + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
