package Streams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        list.add(16);
        list.add(17);
        list.add(11);
        list.add(15);
        Iterator<Integer> iterator = list.iterator();
        List<Integer> evenNumbers = list.stream().
                filter(number -> number % 2 == 0).collect(Collectors.toList());
        // Collect remaining even numbers into a new list
        System.out.println(evenNumbers);

        // Using Streams API to remove duplicates
        List<Integer> distinctNumbers = list.stream().distinct() // Remove duplicates
                .collect(Collectors.toList());     // Collect distinct numbers into a new list

        System.out.println(distinctNumbers);

    }




}
