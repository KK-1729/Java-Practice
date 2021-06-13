import java.util.Scanner;

public class digits{
	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		int prime = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number");
        int num = input.nextInt();
        while(num > 0) {
        	int n = num % 10;
        	if(n % 2 == 0) {
        		even++;
        	} 
			else {
        		odd++;
        	}
        	boolean marker = false;
        	for (int i = 2; i <= n / 2; ++i) {
        		if (n % i == 0) {
        			marker = true;
        			break;
        	    }
        	 }
        	if(!marker) {
        		prime++;
        	}
        	num /= 10;
        }
		input.close();
        System.out.println("The number of even digits is " + even);
    	System.out.println("The number of odd digits is " + odd);
    	System.out.println("The number of prime digits is " + prime);
	}

}
