package stream;

import org.jetbrains.annotations.Contract;

import java.util.*;
import java.util.stream.Collectors;

public class Exec71 {
    @Contract(pure = true)
    public static void main(String[] args) {

//        List<String> list = new ArrayList<>();
//
//        list.add("opyeretevcgdre");
//        list.add("zxcerftyuqasdc");
//        list.add("aazewqfsfrfsrv");
//        list.add("ssfsdsfwerwtbv");
//        list.add("utyrhftryfbvcg");
//        list.add("qvznxcdgtcyrgt");
//        list.add("smgjgdmmvbvpty");
//
//        list.forEach(System.out::println);
//        System.out.println("----------------------------------------------------------------");
//
//        List<Integer> length = list.stream().map(s -> s.length()).toList();
//
////        length.forEach(System.out::println);
//        System.out.println(length);
//        System.out.println("----------------------------------------------------------------");
//
//        int[] ints = new int[20];
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = new Random().nextInt(100);
//        }
//
//        System.out.println(Arrays.toString(ints));
//        System.out.println("----------------------------------------------------------------");
//
//        int[] ints1 = Arrays.stream(ints).map(x -> {
//            if (x % 2 == 0) {
//                x = x / 2;
//            }
//            return x;
//        }).toArray();
//
//        System.out.println(Arrays.toString(ints1));
//        System.out.println("----------------------------------------------------------------");

        Set<String> set = new TreeSet<>();

        set.add("opyeretevcgdre");
        set.add("zxcerftyuqasdc");
        set.add("aazewqfsfrfsrv");
        set.add("ssfsdsfwerwtbv");
        set.add("utyrhftryfbvcg");
        set.add("qvznxcdgtcyrgt");
        set.add("smgjgdmmvbvpty");

        System.out.println(set);
        System.out.println("----------------------------------------------------------------");

        set = set.stream().map(s -> s.toUpperCase()).collect(Collectors.toSet());

        System.out.println(set);
        System.out.println("----------------------------------------------------------------");

    }
}
