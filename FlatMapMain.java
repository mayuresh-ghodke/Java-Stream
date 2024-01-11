import java.util.*;
import java.util.stream.Collectors;

public class FlatMapMain
{
    public static void main(String[] args)
    {
        // List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);

        // List<Integer> list2 = list1.stream().map(n->n+10).collect(Collectors.toList());

        // System.out.println(list2);

        // System.out.println("FlatMap: ");

        //flatMap()
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        List<List<Integer>> finalList = Arrays.asList(lst1,lst2,lst3);
        //// Using flatMap and collecting the result to a list
        //we passing stream into stream
        //x.stream() returns stream of elements
        //x is sub collection of finallist collection
        List<Integer> result = 
                            finalList.stream()
                                        .flatMap(x->x.stream()
                                                    .map(n->n+10))
                                                        .collect(Collectors.toList());

        System.out.println(result);

         
    }
}
