import java.util.HashSet;

public class HashSetDemo {

    public static void main(String[] args) {

        HashSet<String> emails = new HashSet<String>();

        emails.add("hednrix@gmail.com");
        emails.add("srv@gmail.com");
        emails.add("Robert.Johnson@gmail.com");
        emails.add("B.B.King@gmail.com");
        emails.add("B.B.King@gmail.com");
        emails.add("Ana@gmail.com");


        System.out.println(" Liste hat keine feste Ordnung, jedes Element nur einmal vorhanden");
        for (String email : emails) {
            System.out.println(email);
        }


        if(emails.contains("Ana@gmail.com")){
            System.out.println("Email existiert : \"Ana@gmail.com\"");
        }

    }

}

