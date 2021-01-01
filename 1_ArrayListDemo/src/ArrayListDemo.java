import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    public static void main(String[] args) {
        String[] employees = new String[4];

        employees[0] = "Hendrik";
        employees[1] = "Janik";
        employees[2] = "Susanne";
        employees[3] = "Kai";

        // Neues Arra kann nicht dynamisch erweitert werden !
        String[] employeesNew = new String[8];

        for (int i = 0; i < employees.length; i++) {
            employeesNew[i] = employees[i];
            System.out.println("Move from Employee to EmpoyeeNew :" + employees[i]);

        }

        // Array List

        ArrayList<String> employeesAL = new ArrayList<String>();

        employeesAL.add("Hendrix");
        employeesAL.add("BB.King");
        employeesAL.add("SRV");
        employeesAL.add("Robert");

        //
        //
        // Für Objekte kann man mit  ArrayListe einfach und unkompliziert dynamisch erweitert werden!
        //
        employeesAL.add("Eric Johnson");


        // get Methode ; greift auf den Indey in der Liste zu

        System.out.println(employeesAL.get(1));

        for (int i = 0; i < employeesAL.size(); i++) {
            System.out.println(employeesAL.get(i));
        }


        // add mit index
        System.out.println("************** add mit index ***********");

        employeesAL.add(2, "Alex");


        for (int i = 0; i < employeesAL.size(); i++) {
            System.out.println(employeesAL.get(i));
        }

        // set : überschreiben des Eintrages
        System.out.println("************** set  ***********");

        employeesAL.set(2, "John Mayer");


        for (int i = 0; i < employeesAL.size(); i++) {
            System.out.println(employeesAL.get(i));
        }

        // remove mit index
        System.out.println("************** remove 2.John Mayer mit index  ***********");

        employeesAL.remove(2);


        for (int i = 0; i < employeesAL.size(); i++) {
            System.out.println(employeesAL.get(i));
        }


        // remove mit Eintrag
        System.out.println("************** remove Eric Johnson mit eintrag  ***********");

        employeesAL.remove("Eric Johnson");


        for (int i = 0; i < employeesAL.size(); i++) {
            System.out.println(employeesAL.get(i));
        }


        // cointains  mit Eintrag
        System.out.println("*************************************");

        employeesAL.remove("Eric Johnson");

        System.out.println("ArrayList contains Hendrix ? :" + employeesAL.contains("Hendrix"));


        // index of
        System.out.println("**************************");

        employeesAL.remove("Eric Johnson");

        System.out.println("Index of  SRV ? :" + employeesAL.indexOf("SRV"));


        System.out.println("************** sort  ***********");

        Collections.sort(employeesAL);
        for (String e : employeesAL) {
            System.out.println(e);
        }


        // remove mit Eintrag
        System.out.println("************** clear complete List  ***********");

        employeesAL.clear();


        for (int i = 0; i < employeesAL.size(); i++) {
            System.out.println(employeesAL.get(i));
        }
        System.out.println("************** the end   ***********");

    }
}
