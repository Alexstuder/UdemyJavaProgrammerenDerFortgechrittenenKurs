public class Student implements Comparable {

    private String name;
    private int age;

    public Student(String name, int age) {

        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Object o) {

        if (o instanceof Student) {
            Student other = (Student) o;

            if (this.age < other.age) {
                return -1;
            }

            if (this.age > other.age) {
                return 1;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "age=" + age +  '\'' +
                ",name='" + name +
                '}';
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
}
