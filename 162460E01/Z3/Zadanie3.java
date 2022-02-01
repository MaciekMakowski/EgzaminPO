import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie3 {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Wpisz sciezke: ");
        String Path = scan.next();
        File pliki = new File(Path);
        File[] lista = pliki.listFiles((dir)-> true);
        Arrays.sort(lista, (a,b) -> {
            if(a.isDirectory() && b.isDirectory()){
                return 1;
            }else if(!a.isDirectory() && b.isDirectory()) {
                return -1;
            }else
                return a.getName().compareTo(b.getName());
                });
        System.out.println("Lista posortowanych plików: ");
        for(File f: lista){
            System.out.println(f.getName());
        }
    }

}
