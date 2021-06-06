package in.ruchitha.leetcode.easy.linkedlist_arrays;
import java.util.*;
public class DestinationCity {
    private static Object String;

    public static void main(String[] args) {
        DestinationCity obj = new DestinationCity();
        Scanner scanner = new Scanner(System.in);
        List<List<String>> listoflists = new ArrayList<List<String>>();
        System.out.println("Enter no.of sublists");
        int n= scanner.nextInt();
        System.out.println("Enter length of sublist");;
        int size = scanner.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter "+(i+1)+"th sublist elements");
            List<String> list1 = new ArrayList<String>();
            for(int j=0;j<size;j++){
                list1.add(scanner.next());
            }
            listoflists.add(list1);
        }
        System.out.println(obj.destCity(listoflists));
    }

    public String destCity(List<List<String>> paths) {
            HashSet<String> source_cities = new HashSet();
            for (List<String> path : paths)
                source_cities.add(path.get(0));
            for (List<String> path : paths)
                if (!source_cities.contains(path.get(1)))
                    return path.get(1);
            return null;
        }
    }
