package FwqKhd;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client18 {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("192.168.1.18",8888);
            InputStream is=socket
                    .getInputStream();
            InputStreamReader isr=new InputStreamReader(is);
            BufferedReader in=new BufferedReader(isr);
            String serverMessage=in.readLine();
            System.out.println("服务端说："+serverMessage);
            Scanner sc = new Scanner(System.in);
            while(true) {

                System.out.println("请输入你要发送的信息：");
                String message = sc.next();
                OutputStream os = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(os);
                PrintWriter out = new PrintWriter(osw);
                out.println(message);
                out.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
