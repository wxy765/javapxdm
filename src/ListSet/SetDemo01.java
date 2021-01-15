import java.util.HashSet;
import java.util.Set;

public class SetDemo01 {
    public static void main(String[] args) {
        Set<String> set=new HashSet<String>();

       // set.add(1);
        set.add("河池学院");
      //  set.add(false);
        /*
        set的泛型案例（规定类型）
        这个案例规定了String字符串类型
        如set.add(1);中1属于int类型
          set.add(false);中false是布尔类型
        都不属于String类型所以会报错
         */
    }
}
