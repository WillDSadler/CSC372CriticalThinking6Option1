package studentdata;

import java.util.ArrayList;
import java.util.Comparator;

public class SelectionSorter {
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();

        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(min_idx)) < 0) {
                    min_idx = j;
                }
            }

            Student temp = list.get(min_idx);
            list.set(min_idx, list.get(i));
            list.set(i, temp);
        }
    }
}
