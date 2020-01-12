
public class Main {

	public static void main(String[] args) {
		getLargestPrime(20);

	}
	
	
	public static int getLargestPrime(int number) {
		if(number<2) {
			return -1;
		}
		
		int prime=2;
		int largestPrime=1;
		while(prime<=number) {
			if(number%prime!=0) {
				prime++;
			}else {
				number/=2;
				largestPrime=prime;
			}
		}
		
		System.out.println("The largest number is " + largestPrime);
		return largestPrime;
	}

}
