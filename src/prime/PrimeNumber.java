import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public  class PrimeNumber {
	public static void primeBetween(int l, int r) {
        List<Integer> result = new ArrayList<>();
        for (int n = l; n <= r; n++) {
            boolean prime = true;
            for (int j = 2; j <= n / 2; j++) {            	
                if (n % j == 0 && n != j) {
                    prime = false;
                }
            }
            if (prime) {
            	result.add(n);
            }            
        }
        List<Integer> resultSize = new ArrayList<>();;
        for(int k= 1; k<result.size(); k++){
        	boolean count= true;
        	int temp = result.get(k)+result.get(k-1)+1;
        	 for(int h= 2; h<r; h++){
        	        if(temp%h==0 && temp!=h){
        	        	count = false; 
        	        	break;
        	        }
        	        }
        	 if((count) && temp<r){ 
            	 resultSize.add(temp);
            	 System.out.println("result:= "+temp);
             }
        }
        System.out.println("size:= "+resultSize.size());
    }
   public static void main(String[] args) throws IOException 
    {
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        String s = br.readLine();
        primeBetween(Integer.parseInt(n),Integer.parseInt(s));
    }
	
}