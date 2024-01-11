
import java.util.*;

public class ToArrayMain
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>();

        list.add("Ram");
        list.add("Sham");
        list.add("Sarju");

        Object[] arr = list.stream().toArray();

        for(Object str: arr)
        {
            System.out.println(str);
        }   
        System.out.println("Array length is: "+arr.length);
    }
}
