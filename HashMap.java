import java.util.HashMap;
import java.util.Map;
public class Main
{
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer,String>();
        map.put(101,"apple");
        map.put(102,"grapes");
        map.put(103,"banana");
        map.put(104,"strawberry");
        for(Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.println("the key is "+entry.getKey());
            System.out.println("the value is "+entry.getValue());
            System.out.println("===============");
        }
    }
}