import java.util.HashMap;

public class HashMapLanguageDemo {

    static HashMap<String, String> language;

    public static void main(String[] args) {


        HashMap<String, String> german = new HashMap<String, String>();

        german.put("mstart", "Starten");
        german.put("mLanguage", "Sprache wählen");
        german.put("mexit", "Beenden");

        HashMap<String, String> english = new HashMap<String, String>();

        english.put("mstart", "Start");
        english.put("mLanguage", "choose language");
        english.put("mexit", "exit");


        language = german ;

        System.out.println(language.get("mstart"));
        System.out.println(language.get("mLanguage"));
        System.out.println(language.get("mexit"));


        System.out.println();
        System.out.println("Change Language to english :");

        language = english ;

        System.out.println(language.get("mstart"));
        System.out.println(language.get("mLanguage"));
        System.out.println(language.get("mexit"));

    }

}
