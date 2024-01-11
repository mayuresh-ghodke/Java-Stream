import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedMain {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,5,6,8,9,7,8,4,9);

        List<Integer> result = list.stream().sorted().collect(Collectors.toList());

        System.out.println("Ascending Order: "+result);

        List<Integer> reverse = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Reverse Order: "+reverse);
    }
}
