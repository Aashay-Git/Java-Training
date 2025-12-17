import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {

//        try{
//            File file = new File("myFile.txt");
//            System.out.println("File Created");
//            if(file.createNewFile()){
//                System.out.println("File created at: " + file.getAbsolutePath());
//            }else{
//                System.out.println("File already exists at: " + file.getAbsolutePath());
//            }
//        }catch (IOException e){
//            System.out.println("IOException " + e);
//        }
        WriteFile f1 = new WriteFile();
//        f1.writeFile("newFile1.txt", "This is random data in text file.");

        f1.viewData("newFile1.txt");
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        while(run){
            System.out.println("Choose: ");
            System.out.println("0. Exit");
            System.out.println("1. Create File");
            System.out.println("2. Overwrite File");
            System.out.println("3. Read File");
            System.out.println("4. Append to File");
            System.out.println("5. Buffer Reader");
            System.out.print("Choice: ");


            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Enter File name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Data to write: ");
                    String data = sc.nextLine();
                    f1.writeFile(name, data);
                    break;

                case 2:
                    System.out.println("Enter File name: ");
                    name = sc.nextLine();
                    System.out.println("Enter Data to write: ");
                    data = sc.nextLine();
                    f1.writeFile(name, data);
                    break;

                case 3:
                    System.out.println("Enter File name: ");
                    name = sc.nextLine();
                    f1.viewData(name);
                    break;

                case 4:
                    System.out.println("Enter File name: ");
                    name = sc.nextLine();
                    System.out.println("Enter Data to append: ");
                    data = sc.nextLine();
                    f1.addData(name, data);
                    break;

                case 5:
                    System.out.println("Enter File name: ");
                    name = sc.nextLine();
                    f1.bufferReader(name);
                    break;

                case 0:
                    run = false;
                    break;
            }
        }


    }
}
