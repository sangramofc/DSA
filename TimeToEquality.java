package intermediate.prefix;
public class TimeToEquality{

public static void main(String[] args) {
  int[] a = {2,4,1,2,3};

  int ans = 0;
  int max = Integer.MIN_VALUE;
  for(int i =0;i<a.length;i++){
    max = Math.max(max , a[i]);  
  }
  
  for (int i = 0; i<a.length;i++) {
    ans += max - a[i];
  }

  System.out.println(ans);

}

}
