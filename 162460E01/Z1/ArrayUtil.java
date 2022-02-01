import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayUtil {
    public static <T extends  Comparable <? super T>> boolean jestPalindromem(T[] tab){
        ArrayList<T> t1 = new ArrayList<>();
        ArrayList<T> t2;
        for (T t : tab) {
            System.out.println(t);
            t1.add(t);
        }
        t2 = IntStream.iterate(t1.size() - 1, i -> i >= 0, i -> i - 1).mapToObj(t1::get).collect(Collectors.toCollection(ArrayList::new));
        String t1s = t1.toString();
        String t2s = t2.toString();
        return t1s.compareTo(t2s) == 0;
    }

    public static void main(String[] args){
        Integer[] Ints = {1,2,2,1};
        LocalTime[] Times = {LocalTime.parse("10:20"),LocalTime.parse("11:20"),LocalTime.parse("11:20"),LocalTime.parse("10:20")};
        System.out.println("Dla posortowanych elementów tablic: ");
        System.out.println("Dla tablicy Intow: ");
        System.out.println(jestPalindromem(Ints));
        System.out.println("Dla tablicy LocalTIme: ");
        System.out.println(jestPalindromem(Times));
        Integer[] Ints2 = {1,2,2,5};
        LocalTime[] Times2 = {LocalTime.parse("10:20"),LocalTime.parse("13:45"),LocalTime.parse("11:20"),LocalTime.parse("04:20")};
        System.out.println("Dla nieposortowanych elementów tablic: ");
        System.out.println("Dla tablicy Intow: ");
        System.out.println(jestPalindromem(Ints2));
        System.out.println("Dla tablicy LocalTIme: ");
        System.out.println(jestPalindromem(Times2));



    }

}
