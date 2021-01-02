import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        System.out.println("TreeSetDemo ist im Gegensatz zu HashSet geordnet und sortiert ;");

        TreeSet<String> treeSet = new TreeSet();
        treeSet.add("Hendrix");
        treeSet.add("Kai");
        treeSet.add("Claus");
        treeSet.add("Bert");
        treeSet.add("Ana");

        for (String e : treeSet) {
            System.out.println(e);
        }


        TreeSet<Student> student = new java.util.TreeSet<Student>();

        student.add(new Student("Hendrix", 20));
        student.add(new Student("Kai", 19));
        student.add(new Student("Susi", 37));
        student.add(new Student("Gustav", 25));
        student.add(new Student("Klara", 77));
        student.add(new Student("Bert", 60));

        System.out.println("Sorted by Age :");
        System.out.println(student.toString());


        System.out.println("**************************************************");
        System.out.println("Working with Iterator : ");
        Iterator<Student> itr = student.iterator();
        while (itr.hasNext()) {
            Student s = itr.next();
            System.out.println(s);
            if (s.getAge() < 30) {
                itr.remove();
            }

        }

        System.out.println("Removed all < 30 with Iterator ");
        System.out.println(student.toString());


    }
}



