import java.util.HashMap;
import java.util.Objects;

public class HashMapMethods {
    public void repeatWords(){
        String s = "java is easy and java is powerful java";

        String[] sl = s.split(" ");

//        for(String i : sl){
//            System.out.println(i);
//        }

        HashMap<String, Integer> hm = new HashMap<>();

        for(String i : sl){
//            System.out.println(i);
            if(!hm.containsKey(i)){
                hm.put(i, 1);
            }else {
//                System.out.println(i + " is repeated.");
                hm.put(i, hm.get(i) + 1);
            }
        }

        for(String sk : hm.keySet()){
            if(hm.get(sk) > 1){
                System.out.println(sk + " is repeated " + hm.get(sk) + " times.");
            }
        }

    }


    public void vowelCount(){
        String s = "Java is easy and java is powerful java";
        s = s.toLowerCase();

        String[] sl = s.split("");

        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("a", 0);
        hm.put("e", 0);
        hm.put("i", 0);
        hm.put("o", 0);
        hm.put("u", 0);


        for(String w : sl){
            if(hm.containsKey(w)){
                hm.put(w, hm.get(w) + 1);
            }
        }
//        hm.getOrDefault()


        for(String sk : hm.keySet()){
            System.out.println(sk + " count = " + hm.get(sk) + " times.");
        }
    }


    public static void main(String[] args) {
        HashMapMethods h = new HashMapMethods();

//        h.repeatWords();
        h.vowelCount();
    }

}
