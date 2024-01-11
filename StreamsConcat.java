import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsConcat {
    public static void main(String[] args) {
        List<String> animal = Arrays.asList("Dog","Cat","Elephant","Tiger");
        List<String> birds = Arrays.asList("Peacock","Parrot","Crow");


        //To concat two Streams
        Stream<String> stream1 = animal.stream();
        Stream <String> stream2 = birds.stream();

        List<String> finalList = Stream.concat(stream1, stream2).collect(Collectors.toList());

        for(String str: finalList)
        {
            System.out.println(str);
        }

    }
}
