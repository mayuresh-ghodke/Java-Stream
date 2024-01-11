import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMain
{
    public static void main(String[] args)
    {
        List<String> vehicle = Arrays.asList("bus","train","bike","car");

        //map() takes Consumer as a parameter

        //to uppercase the each element
        List<String> newVehicle = vehicle.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
        System.out.println("Vehicle list: ");
        System.out.println(newVehicle);

        //to get the each element length
        List<Integer> vehicleLength = vehicle.stream().map(name->name.length()).collect(Collectors.toList());
        System.out.println("Vehicle length: ");
        System.out.println(vehicleLength);


    }    
}
