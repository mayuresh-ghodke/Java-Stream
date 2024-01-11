import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindAny {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("One Apple");
        set.add("One Mango");
        set.add("Two Bananas");
        set.add("One Strawberry");

        System.out.println(set);

        //findAny(): return any element from the collection
        //return type is Optional 
        System.out.print("findAny(): ");
        Optional<String> result = set.stream().findAny();

        System.out.println(result.get());

        //findFirst(): return first element from the collection
        //return type is Optional
        System.out.print("findFirst(): ");
        Optional<String> result1 = set.stream().findFirst();

        System.out.println(result1.get());
    }
}
