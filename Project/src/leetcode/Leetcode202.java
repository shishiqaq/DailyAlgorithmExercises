package leetcode;

public class Leetcode202 {
	public static boolean isHappy(int n) {
        int result = 0, count = 100;
        while(count > 0){
            while(n != 0){
            	System.out.println("result before:" + result);
            	System.out.println("digit:" + n % 10);
                result += (n % 10) * (n % 10);
                n /= 10; 
                System.out.println("result after:" + result);
                System.out.println("n:" + n);
            }
           
            if(result == 1)
                return true;
            n = result;
            result = 0;
            count --;
        }
        return false;
    }
	
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
