package String;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try {
            FileReader fileReader=new FileReader("F:\\plane.txt");
            int a=0;
            int b=0;
            while ((a=fileReader.read())!=-1){
                b++;
                System.out.print((char) a);
            }
            System.out.println(b);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
