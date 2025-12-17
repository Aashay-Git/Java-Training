import java.io.*;

public class WriteFile {
    String fileName;
    String data;

    public void writeFile(String filename, String data){
        this.fileName = filename;
        this.data = data;

        try{
            FileWriter fw = new FileWriter(fileName);
            fw.write(data);
            fw.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void addData(String filename, String data){
        this.fileName = filename;
        this.data = data;

        try{
            FileWriter fw = new FileWriter(fileName,true);
            fw.append("\n" + data);
            fw.close();

        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void viewData(String fileName){

        try{
            FileReader fr = new FileReader(fileName);
            int i;
            System.out.println();
            System.out.println();
            while((i = fr.read()) != -1){
                System.out.print((char)i);
            }
            System.out.println();
            System.out.println();
            fr.close();
        }catch (Exception e){

            System.out.println(e);
        }
    }

    public void bufferReader(String fileName){
        try{
//            FileReader fr = new FileReader(fileName);
            BufferedReader bfr = new BufferedReader(new FileReader(fileName));
            String s;
            while((s = bfr.readLine()) != null){
                System.out.println(s);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
