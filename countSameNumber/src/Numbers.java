import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        ArrayList<Integer> arList = new ArrayList<Integer>(Arrays.asList(4, 5, -6, 4, 5, 3, 4, 2, 4, 5, 7));
        System.out.println(numbers.count(arList));
    }
    public Map<Integer, Integer> count(ArrayList<Integer> num) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : num) {
            map.put(number, map.containsKey(number) ? map.get(number) + 1 : 1);
        }

        return map;
    }
}
