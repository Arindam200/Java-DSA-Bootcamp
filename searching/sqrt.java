class Solution {
    public int mySqrt(int x) {
      
        
        int a=0;
        int b=x;
        long mid=a+(b-a)/2;
        
        while(a<=b){
          mid = a+(b-a)/2;
              
            if(mid*mid==x){
                return (int) mid;
            }
              
          else if(mid * mid > x){
            b = (int) mid-1;  
          }
          else {
            a = (int) mid+1;
          }
              
              
        }
        return b;
    }
}
