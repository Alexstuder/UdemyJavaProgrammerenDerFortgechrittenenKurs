import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args){

        HashMap<Integer, Student>  hm = new HashMap<Integer, Student>();

        Student s1 = new Student("Jimi","Hendrix",1234);
        Student s2 = new Student("Steve","Ray Vaughan",4711);
        Student s3 = new Student("B.B.","King",7777);
        Student doppelt = new Student("Doppelter","Jimi wird überschrieben",1234);


        hm.put(s1.getMatrikelNr(),s1);
        hm.put(s2.getMatrikelNr(),s2);
        hm.put(s3.getMatrikelNr(),s3);

        System.out.println(hm.toString());

        hm.put(doppelt.getMatrikelNr(),doppelt);
        System.out.println(hm.toString());
    }
}
