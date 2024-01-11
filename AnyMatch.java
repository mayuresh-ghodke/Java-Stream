import java.util.HashSet;
import java.util.Set;

public class AnyMatch {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("One Apple");
        set.add("One Mango");
        set.add("Two Bananas");
        set.add("One Strawberry");

        System.out.println(set);

        //anyMatch() takes Predicate as Parameter and return boolean as value
        System.out.print("anyMatch(): ");
        boolean result = set.stream().anyMatch(value -> { return value.startsWith("One");});

        System.out.println(result);

        // allMatch() : it checks for all value must be matched, if no return false
        System.out.print("allMatch(): ");
        boolean result2 = set.stream().allMatch(value -> { return value.startsWith("One");});

        System.out.println(result2);


        // noneMatch() returns true, if any value in collection not matched.
        System.out.print("noneMatch(): ");
        boolean result3 = set.stream().noneMatch(value -> { return value.startsWith("One");});

        System.out.println(result3);
    }
}
