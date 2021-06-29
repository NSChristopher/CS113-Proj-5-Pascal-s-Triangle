public class Pascal {
    public static int[] triangle(int n) {

        var array = new int[n];

        array[0] = 1;
        if (n > 1) {
            array[n - 1] = 1;
            if (n > 2) {
                for (int i = 1; i < n - 1; ++i) {
                    array[i] = triangle(n-1)[i - 1] + triangle(n - 1)[i];
                }
            }
        }
        return array;
        
    }
}