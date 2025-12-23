import java.awt.desktop.SystemEventListener;
import java.util.*;

public class questions {

    void marks(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks: ");
        try {
            int marks = sc.nextInt();
            if (marks > 100 || marks < 0){
                System.out.println("Invalid number");
                return;
            }
            if(marks >= 90){
                System.out.println("Grade A");
            } else if (marks >= 70 ) {
                System.out.println("Grade B");
            } else if (marks >= 50 ) {
                System.out.println("Grade C");
            } else if (marks >= 35 ) {
                System.out.println("Grade D");
            }else {
                System.out.println("Fail");
            }

        }catch (Exception e){
            System.out.println("Error: " + e);
        }
    }

    //day
    void day(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day number: ");
        int n = sc.nextInt();
//        int n = daynum;

        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
        }

    }


    void numLen(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = sc.nextInt();

        System.out.println((""+n).length());
    }


    void reverseNum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int[] n = new int[10];
        int i = 0;
        while (num != 0){
            n[i] = num%10;
//            System.out.println(n[i]);
            num -= n[i];
            num/=10;
            i++;
//            System.out.println("num:"+num);
        }
        int revnum = 0;
        int k = 1;
        for (int j = i-1; j >= 0; j--){
            revnum += n[j] * k;
            k *= 10;
        }
        System.out.println("Reverse: " + revnum);

    }

    void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Palindrome Word: ");
        String word = sc.nextLine();
//        String rev = "";
        int i, j = word.length()-1, flag = 0;

        for(i = 0; i < word.length(); i++, j--){
//            rev = word.charAt(i) + rev;
            if (word.charAt(i) == word.charAt(j)){
//                System.out.println("i: " + word.charAt(i) + " j: " + word.charAt(j));
            }else{
                flag = 1;
                break;
            }
        }

        if (flag == 0){
            System.out.println("Is Palindrome");
        }else {
            System.out.println("Is Not Palindrome");
        }
    }


    void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number (Prime): ");
        int num = sc.nextInt(), i = 2;
//        int flag = 0;
        if(num == 2){
            System.out.println("It is Prime");
            return;
        }
        if((num % 2) == 0 || num == 1){
            System.out.println("It is not Prime");
            return;
        }
        for(i = 3; i <= (num/2)+1; i+=2){
            if((num % i) == 0){
                System.out.println("It is not Prime");
                return;
            }
        }
        System.out.println("It is Prime");

    }


    int[] revArr(){
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        int i = 0, j = arr.length - 1, temp;

//        Arrays.sort(arr);

        for(;i < j; i++, j--){
            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        for (i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    void removeLeadingZero(Scanner sc){
        System.out.print("Enter a number: ");
        String n = sc.nextLine();
        int index = 0;

        for (int i = 0; i < n.length(); i++){
            if (n.charAt(i) != '0'){
                index = i;
                break;
            }
        }

        n = n.substring(index);

        System.out.println(n);

    }

    public void dayHashMap(Scanner sc){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Monday");
        hm.put(2, "Tuesday");
        hm.put(3, "Wednesday");
        hm.put(4, "Thursday");
        hm.put(5, "Friday");
        hm.put(6, "Saturday");
        hm.put(7, "Sunday");

        System.out.print("Enter day number: ");
        int n = sc.nextInt();
        System.out.println(hm.get(n));

        hm.put(7, "Ravivar");

        System.out.println(hm.get(7));
        System.out.println("Size: " + hm.size());
    }

    public void zeroToEnd(Scanner sc){

        System.out.println("Enter ArrayList size: ");
        int size = sc.nextInt();
        sc.nextLine();
        int i, j;
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0,0,43,4,-1,4,5,67,0,5,0,6,0));
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("Enter elements: ");
        for(i = 0; i < size; i++){
            j = sc.nextInt();
            list.add(j);
        }

        System.out.println("Original List: " + list);


        for(j = list.size() - 1, i = 0; j >= 0 && i < j; j--, i++){
            while(j > 0 && list.get(j) == 0){
                j--;
//                System.out.println("j: " + j);
            }
//            System.out.println("i: " + i);
            if(list.get(i) == 0){
                    list.set(i,list.get(j));
                    list.set(j, 0);

            }
        }
        System.out.println("New List: " + list);

    }



    public static void main(String[] args){
        questions q = new questions();
        Scanner sc = new Scanner(System.in);


//        q.marks();
//        q.day();
//        q.numLen();
//        q.reverseNum();
//        q.palindrome();
//        q.prime();
//        int[] arr = q.revArr();
//        q.removeLeadingZero(sc);
//        q.dayHashMap(sc);
//        q.zeroToEnd(sc);


    }
}
