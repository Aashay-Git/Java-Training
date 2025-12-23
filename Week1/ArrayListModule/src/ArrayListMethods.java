import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println(list);

        list.add(3,90);
        System.out.println(list);

        System.out.println("Size: " + list.size());

        System.out.println("1st element: " + list.get(0));
        System.out.println("last element: " + list.get(list.size() - 1));

        list.remove(3);
        System.out.println("With removed element :" + list);

        System.out.println("25 exists?: " + list.contains(25));

//        list.clear();

        ArrayList<Integer> newList = (ArrayList<Integer>) list.clone();
        System.out.println("newList: "+ newList);

        list.remove(3);
        System.out.println("newList: "+ newList);

//        Object[] ob = new Object[]

        Integer[] s1 = list.toArray(new Integer[1]);

        for(int s : s1){
            System.out.print(s + " ");
        }

        System.out.println("\nArrayList");
        for(Integer i : list){
            System.out.print(i + " ");
        }

        System.out.println("\nArrayList2");
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nArrayList3");
        for(int i = list.size() - 1; i >= 0; i--){
            System.out.print(list.get(i) + " ");
        }

        System.out.println("\nArrayList4");
        System.out.println(list.reversed());

        System.out.println("\nEvenCount");
        int ec = 0, oc = 0;
        for(Integer i : list){
//            System.out.print(i + " ");
            if(i%2 == 0){
                ec++;
            }else {
                oc++;
            }
        }
        System.out.println("Even = " + ec);
        System.out.println("Odd = " + oc);


        System.out.println("Average");
        int sum = 0;
        for(Integer i : list){
            sum += i;
        }
        System.out.println("avg = " + sum/(list.size()));


        System.out.println("Largest and smallest");
//        int l = 0, s = list.get(0);
//        for(Integer i : list){
//            sum += i;
//        }
//        System.out.println("avg = " + sum/(list.size()));
        Collections.sort(list);
        System.out.println("smallest = " + list.get(0));
        System.out.println("largest = " + list.get(list.size()-1));
        System.out.println();

        System.out.println("Frequency of elements");
//        System.out.println(list);
        list.add(5);
        list.add(5);
        list.add(10);
        list.add(5);
        list.add(25);
//        Collections.sort(list);
        int[] count = new int[26];
//        Integer temp = 0;
        for(Integer temp : list){
            count[temp]++;
        }

        for(int i = 0; i < 26; i++){
            if(count[i] > 0){
                System.out.println("number: " + i + " frequency: " + count[i]);
            }
        }
//        list.con
        HashMap<Integer,Integer> hm = new HashMap<>();


    }
}
