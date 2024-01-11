import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctMain {
    public static void main(String[] args) {
        List<String> vehicle = Arrays.asList("car","bus","bike", "car","bus","bus","car");
        // System.out.println(vehicle.stream().count());

        //It will return stream with unique elements. 
        //output: car, bus, bike
        vehicle.stream().distinct().forEach(uniqueVehicle -> System.out.println(uniqueVehicle));

        //to count distinct vehicles
        //count() reuturn long type value
        Long count = vehicle.stream().distinct().count();
        System.out.println("Total Count of unique elements: "+count);

        // to limit the vehicles
        // limit(): to how many elements we want to get.
        List<String> limitedList = vehicle.stream().distinct().limit(2).collect(Collectors.toList());
        System.out.println("Limited elements: "+limitedList);
    }
}
