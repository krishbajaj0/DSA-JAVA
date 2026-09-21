public class bookalocate {

    static boolean canWe(int value, int[] arr, int m) {

        int pages = 0;
        int students = 1;

        for (int i = 0; i < arr.length; i++) {

            if (pages + arr[i] <= value) {
                pages += arr[i];
            } 
            else {
                students++;
                pages = arr[i];
            }
        }

        return students <= m;
    }

    static int findPages(int[] arr, int m) {

        if (m > arr.length) {
            return -1;
        }

        int low = 0;
        int high = 0;

        // Find maximum book pages and total pages
        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }

        // Binary Search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canWe(mid, arr, m)) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};
        int m = 2;

        int answer = findPages(arr, m);

        System.out.println("Minimum maximum pages = " + answer);
    }
}