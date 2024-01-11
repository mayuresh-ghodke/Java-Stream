import java.util.Arrays;
import java.util.List;

class Student
{
    String name;
    int score;

    Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }
}


public class ParallelStreamMain
{
    public static void main(String[] args)
    {
        List<Student> list = Arrays.asList(
            new Student("Gaurav",89),
            new Student("Aniket",71),
            new Student("Mayuresh",69),
            new Student("Adarsh",99),
            new Student("Navnath",79)
        );

        //This is sequential way
        list.stream().filter(stu->stu.score > 80).limit(2).forEach(result->System.out.println(result.score+" "+result.name));

        //This is parallel stream
        list.parallelStream().filter(stu->stu.score > 80).limit(2).forEach(result->System.out.println(result.score+" "+result.name));

        //To convert the sequential stream into parallel stream, there is parallel method.
        list.stream().parallel().filter(stu->stu.score > 80).limit(2).forEach(result->System.out.println(result.score+" "+result.name));

    }
}