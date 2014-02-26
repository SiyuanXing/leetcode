
public class P4_reverse_integer {
    public int reverse(int x) {
    	
        if (x==0)
            return 0;
        if (x%10==0)
            return reverse(x/10);
        int result=0;
        while (x/10 != 0){
            result = x%10+result*10;
            x/=10;
        }
        result = x%10+result*10;
        return result;
    }
}
