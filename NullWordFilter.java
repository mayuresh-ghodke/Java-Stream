import java.util.*;
import java.util.stream.Collectors;

public class NullWordFilter
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("Ram","Lakhan",null, null,"Sham","Sundar");
        
        list.stream().filter(w->w!=null).forEach(System.out::println);

        List<String> result = list.stream().filter(w->w!=null).collect(Collectors.toList());

        System.out.println(result);
    }
}