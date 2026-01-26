package dasar;

public class ReverseString {

    static String reverseString(String input) {
        char[] arr = input.toCharArray();
        int l = 0;
        int r = input.length() - 1;

        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("abu"));
    }
}
