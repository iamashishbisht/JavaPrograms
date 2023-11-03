package Streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BasicStreams {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,11,70,50,60,50,20,30,40,90,100);

        //even numbers
        System.out.println("Finding even numbers");
        list.stream().filter(n -> n%2 ==0).forEach(System.out::println);

        //finding all numbers starting with 1
        System.out.println("Finding all numbers starting with 1");
        list.stream().map(n -> n.toString()).filter(n -> n.startsWith("1")).forEach(System.out::println);

        //finding duplicate Integers
        System.out.println("finding duplicate Integers");
        Set<Integer> set = new HashSet<>();
        list.stream().filter(n-> !set.add(n)).forEach(System.out::println);

        //finding any element
        System.out.println("finding any element");
        list.stream().findAny().ifPresent(System.out::println);

        //finding first element
        System.out.println("finding first element");
        list.stream().findFirst().ifPresent(System.out::println);

        //total number of elements present in stream
        System.out.println("Total number of element");
        System.out.println(list.stream().count());

        //finding maximum element present
        System.out.println("finding maximum element present");
        System.out.println(list.stream().max(Integer::compare).get());



    }
}
