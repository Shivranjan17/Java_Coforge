import java.util.Arrays;

public class ResizableArray1 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length + 1];

        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        newArr[newArr.length - 1] = 40;

        arr = newArr;

        System.out.println("Resized Array:");
        System.out.println(Arrays.toString(arr));
    }
}