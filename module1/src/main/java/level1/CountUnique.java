package level1;

import java.util.HashSet;

public class CountUnique {
    int count(int[] array){
        if (array.length == 0){
            return 0;
        }
        if (array.length == 1){
            return 1;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        return set.size();
    }
}
