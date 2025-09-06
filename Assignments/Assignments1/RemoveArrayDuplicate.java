package Assignments.Assignments1;

import java.util.Arrays;

public class RemoveArrayDuplicate {
    public static void main(String[] args) {
        String[] arr = {"horse", "rat", "horse", "dog", "cat", "horse", "dog", "horse", "dog", "camel", "dog"};
        System.out.printf("Original Array\n" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    arr[j] = " ";
                }
            }
        }
        StringBuilder temp = new StringBuilder();
        for (String str : arr) {
            temp.append(str).append(" ");
        }
        String newStr = temp.toString().replace("  ", "");
        arr = newStr.split(" ");
        System.out.printf("%n%nAfter removing duplicate entries\n" + Arrays.toString(arr));

    }
}
/*
Sample Output:
Original Array
[horse, rat, horse, dog, cat, horse, dog, horse, dog, camel, dog]

After removing duplicate entries
[horse, rat, dog, cat, camel]


*/