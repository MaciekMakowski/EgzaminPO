import java.util.*;

public class Zadanie2 {
    public static <E> void printMarginal(Iterable<E> obj){
        boolean first  = true;
        E last = null;
        for(E x : obj){
            if(first){
                System.out.println(x);
                first = false;
            }
            last = x;
        }
        System.out.println(last);
    }

    public static void main(String[] args){
        LinkedList<Integer> l1 = new LinkedList();
        Stack<Integer> l2 = new Stack();
        ArrayList<String> l3 = new ArrayList();
        PriorityQueue <String> l4= new PriorityQueue();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(50);
        l2.add(60);

        l3.add("a");
        l3.add("b");
        l3.add("c");
        l3.add("d");
        l3.add("e");

        l4.add("aa");
        l4.add("ab");

        System.out.println("Dla listy l1(LinkedList): " + l1);
        printMarginal(l1);
        System.out.println("Dla listy l2(Stack): " + l2);
        printMarginal(l2);
        System.out.println("Dla listy l3(ArrayList): " + l3);
        printMarginal(l3);
        System.out.println("Dla listy l4(PriorityQueue): " + l4);
        printMarginal(l4);



    }
}
