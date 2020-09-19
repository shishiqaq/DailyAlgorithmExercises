package leetcode;

public class Leetcode204 {
	public int countPrimes(int n) {
        boolean[] visit = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(visit[i] == false)
                count++;
            for(int j = 2; j * i < n; j++){
                visit[j * i] = true;
            }
        }
        return count;
    }
}
