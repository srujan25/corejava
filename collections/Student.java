package collections;

/**
 * Created by SG0221519 on 3/2/2017.
 */
public class Student {

    Integer rollNum;
    String name;

    public Student(Integer rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    public String toString()
    {
        return this.rollNum + " " + this.name;
    }
    public int hashCode() {
        return this.rollNum;
    }

    public boolean equals(Object obj) {
        boolean flag = false;
        Student s = (Student) obj;
        if (s.rollNum == rollNum) {
            return true;
        }
        return flag;
    }
}
