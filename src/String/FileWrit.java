package String;

import java.io.*;
//1.先用递归显示出某个目录下的指定扩展名(mp3)的所有文件，把这些mp3文件名存入一个文件中
//2.读取该文件，按行读取，每读一行，就算是处理了一个mp3
public class FileWrit {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("F:\\mp3List.txt");
        File file=new File("F:\\");
        File files[]=file.listFiles();
        for(File f:files){
            if(f.getName().endsWith(".mp3")){
                fw.write(f.getName());
                fw.write(13);
                fw.write(10);
            }
        }
        fw.close();
        byte buff[]=new byte[1024];
        FileOutputStream fos=new FileOutputStream("F:\\c.mp3");
        FileReader fr=new FileReader("F:\\mp3List.txt");
        BufferedReader br=new BufferedReader(fr);
        String mp3Name="";
        while ((mp3Name=br.readLine())!=null){
            FileInputStream fis=new FileInputStream("F:\\"+mp3Name);
            int a=0;
            while ((a=fis.read(buff))!=-1){
                fos.write(buff,0,a);
            }
        }
        fos.close();
    }

}
