import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FilterMain
{
    public static void main(String[] args)
    {
      List<Integer> al = Arrays.asList(10,8,9,5,63,78,90,15);

      //To filter only even numbers
      
      //Without using Streams
    //   for(int i:al)
    //   {
    //     if(i%2==0){
    //         even.add(i);
    //     }
    //   }
    //   System.out.println(even);

      //With using Streams
      
      List<Integer> list = al.stream().filter(n->n%2==0).collect(Collectors.toList());
      System.out.println("Filtered data using Streams stored in List: ");
      System.out.println(list);

      //If we dont want to store the filtered data to any collection, i.e. directly prints the data
      //we use forEach()
      System.out.println("Filtered data using Streams without storing in any collection: ");
      al.stream().filter(n->n%2==0).forEach(n->System.out.print(n+"\t"));
      



      
    }
}