import java.util.Scanner;

public class Questions {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Grade using Switch");
            System.out.println("2. Day of Week");
            System.out.println("3. Count Digits");
            System.out.println("4. Reverse Number");
            System.out.println("5. Check Palindrome");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> gradeUsingSwitch(sc);
                case 2 -> dayOfWeek(sc);
                case 3 -> countDigits(sc);
                case 4 -> reverseNumber(sc);
                case 5 -> palindrome(sc);
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }

    // -------------------- Q1: Grade using Switch --------------------
    public static void gradeUsingSwitch(Scanner sc) {
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        int category = marks / 10;  // Convert to range bucket

        switch (category) {

                case 10, 9 -> System.out.println("Grade A");
                case 8, 7 -> System.out.println("Grade B");
                case 6, 5 -> System.out.println("Grade C");
                case 4, 3 -> System.out.println("Grade D");
                default -> System.out.println("Fail");
        }
    }

    // -------------------- Q2: Day of Week --------------------
    public static void dayOfWeek(Scanner sc) {
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid";
        };

        System.out.println(result);
    }

    // -------------------- Q3: Count Digits --------------------
    public static void countDigits(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int count = 0;

        if (temp == 0) count = 1;
        else {
            while (temp > 0) {
                temp /= 10;
                count++;
            }
        }

        System.out.println("Total digits: " + count);
    }

    // -------------------- Q4: Reverse Number --------------------
    public static void reverseNumber(Scanner sc) {
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int temp = Math.abs(num);
        int reverse = 0;

        while (temp > 0) {
            reverse = reverse * 10 + (temp % 10);
            temp /= 10;
        }

        if (num < 0) reverse = -reverse;

        System.out.println("Reversed Number: " + reverse);
    }

    // -------------------- Q5: Palindrome --------------------
//    public static void palindrome(Scanner sc) {
//        System.out.print("Enter number: ");
//        int num = sc.nextInt();
//
//        int original = num;
//        int temp = Math.abs(num);
//        int reverse = 0;
//
//        while (temp > 0) {
//            reverse = reverse * 10 + (temp % 10);
//            temp /= 10;
//        }
//
//        if (num < 0) reverse = -reverse;
//
//        if (original == reverse)
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not Palindrome");
//    }

    public  static void palindrome(Scanner sc){
        sc.nextLine();
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        int i = 0;
        int j = str.length()-1;
        if(str.isEmpty()){
            System.out.println(str + " is not palindrome!");
            return;
        }
        while(i != j){
            if(str.charAt(i) != str.charAt(j)){
                System.out.println(str + " is not palindrome!");
                return;
            }
            i++;
            j--;
        }
            System.out.println(str + " is  palindrome!");
    }
}
