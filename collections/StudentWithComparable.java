package collections;

/**
 * Created by SG0221519 on 3/2/2017.
 */
public class StudentWithComparable implements Comparable {

    int age;
    String name;

    public StudentWithComparable(int age,String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Object obj) {
        StudentWithComparable s = (StudentWithComparable) obj;

        if (this.getAge() == s.age)
            return 0;
        else if (this.age > s.age)
            return 1;
        else
            return -1;
    }
}
