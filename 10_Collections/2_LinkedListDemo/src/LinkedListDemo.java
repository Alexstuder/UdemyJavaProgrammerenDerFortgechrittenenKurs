import java.util.LinkedList;

public class LinkedListDemo {

    static LinkedList<String> employees ;

    public static void main(String[] args) {

        employees = new LinkedList<String>();

        employees.add("Robert Johnson");
        employees.add("Hendrix");
        employees.add("Srv");
        employees.add("B.B. King");

        // ToString  auch bei ArrayList
        System.out.println(employees.toString());

        employees.addFirst("Ich bin erster");
        printLinkedList();

        employees.addLast("Ich bin letzter");
        printLinkedList();

        employees.remove(2);
        printLinkedList();

        employees.removeFirst();
        printLinkedList();

        employees.remove("Srv");
        printLinkedList();


    }

    static void printLinkedList() {

        System.out.println();
        for (String emloyee : employees) {
            System.out.println(emloyee);
        }


    }
}
