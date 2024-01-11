import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceMain {
    public static void main(String[] args) {
        //List<Integer> list = Arrays.asList(10,20,30,40,50);

        List<String> list = Arrays.asList("Virat Kohli","Rohit Sharma", "Chris Gayle","45","45","45");

        Optional<String> reduced = list.stream().reduce((value, combinedValue)->
        {
            return combinedValue+value;
        });

        System.out.println(reduced.get());

        
    }
}
