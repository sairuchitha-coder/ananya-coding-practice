package in.ruchitha.leetcode.easy.linkedlist_arrays;
import java.util.ArrayList;
import java.util.List;

public class OrderStream {
    public static void main(String[] args) {
        OrderStream os = new OrderStream(5);
        System.out.println(os.insert(3,"cccc"));
        System.out.println(os.insert(1,"aaaa"));
        System.out.println(os.insert(2,"bbbb"));
        System.out.println(os.insert(5,"eeee"));
        System.out.println(os.insert(4,"dddd"));

    }
    private String[]  values;
    private int ptr = 0;
    public OrderStream(int n) {
        values = new String[n];
    }
    public List<String> insert(int id, String value) {
        values[id - 1] = value;

        List<String> result = new ArrayList();
        while (ptr < values.length && values[ptr] != null) {
            result.add(values[ptr++]);
        }

        return result;
    }
}

