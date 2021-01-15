import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {
    public static void main(String[] args) {
        try {
            //0~65535֮�䣺0~1024���ڵ���ñ��ã�������ϵͳ
            ServerSocket ss = new ServerSocket(9999);
            Socket socket=ss.accept();

            OutputStream os=socket.getOutputStream();

            FileInputStream fis=new FileInputStream("F:\\2021-01-14");
            byte buff[]=new byte[1024];
            int a=0;
            while((a=fis.read(buff))!=-1){
                os.write(buff,0,a);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}