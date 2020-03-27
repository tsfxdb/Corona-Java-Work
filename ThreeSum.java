public class ThreeSum {
    public static void printTriples(int[] a){
        int n = a.length;
        for (int i = 0; i < n; i++){
            for (int j = i+1; j < n; j++){
                for ( int k = j+1; k < n; k++){
                    if (a[i] + a[j] + a[k] == 0) {
                        StdOut.println(a[i] + " " + a[j] + " " + a[k]);
                    }
                }
            }
        }
    }
}
