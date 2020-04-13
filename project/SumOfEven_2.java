public class SumOfEven_2 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1; i <=1000; i++){
            if(0 == i % 2)
                sum += i;
        }
        System.out.println("用for循环,1到1000中,所有偶数的和为:"+sum);
    }
}
