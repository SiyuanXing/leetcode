
public class P01_single_number {
    public static int singleNumber(int[] A) {
        
        int result = 0;
        for (int i = 0;i<A.length;i++){
            result ^= A[i];
        }
        return result;
    }


}
