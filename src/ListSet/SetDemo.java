import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add(1);
        set.add("河池学院");
        set.add(888.8F);
        set.add(false);
        set.add(1);

        System.out.println("当前集合的元素个数：" + set.size());

        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println("集合内的元素："+iterator.next());
        }
    }
}
