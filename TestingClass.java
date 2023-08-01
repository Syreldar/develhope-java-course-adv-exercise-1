import java.util.*;

public class TestingClass
{
    public static void main(String[] args)
    {
        List<String> days = Arrays.asList(
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        );

        Set<String> daysHashSet = new HashSet<>(days);
        System.out.printf("Days of the week using HashSet: %s\n", daysHashSet);

        Set<String> daysLinkedHashSet = new LinkedHashSet<>(days);
        System.out.printf("Days of the week using LinkedHashSet: %s\n", daysLinkedHashSet);

        boolean areSetsEqual = daysHashSet.equals(daysLinkedHashSet);
        System.out.printf("Is the HashSet equal to the LinkedHashSet? %b\n", areSetsEqual);
    }
}