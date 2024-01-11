import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class MinMaxMain
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(10,20,30,40,5,6,8);

        Optional <Integer> min  = list.stream().min((val1, val2)->{
                                return val1.compareTo(val2);
                            }                    
                        );

        System.out.println("Min: "+min);
        System.out.println("Min: "+min.get());
    }
}
