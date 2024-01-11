import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FactorialFilterMap
{
    // public static int calculateFact(int n)
    // {
    //     int fact =1;
    //     if(n==0 || n==1)
    //     {
    //         return 1;
    //     }

    //     for(int i=n; i>0; i--){
    //         fact = fact*i;
    //     }
    //     return fact;
    // }

    public static int calculateFact(int n){
        if(n==0 || n==1)
        {
            return 1;
        }
        
        return n * calculateFact(n-1);
    }
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(5,6,7,8,9,10);

        System.out.println(list);

        // We can use filter() and map() together.
        // example => To calculate factorial of even numbers only.
        List<Integer> factList = list.stream().filter(n->n%2==0).map(n->calculateFact(n)).collect(Collectors.toList());

        System.out.println(factList);

        // original data in list is not changed, it remains same. 
        //Calculations performed only on data stream.
        System.out.println(list);
    }   
}
