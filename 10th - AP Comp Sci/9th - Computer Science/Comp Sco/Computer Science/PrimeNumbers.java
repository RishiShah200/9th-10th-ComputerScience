public class PrimeNumbers{
	public static void main (String[]args){
	int i = 0;
	int ok = 0;
	String prime = "";
	for(i = 1;i<=1000;i++){
		int counter = 0;
			for(ok = i;ok>=1;ok--){
				if(i%ok==0){
					counter++;

				}
		}
			if(counter == 2){
				prime = prime + i + " ";
							}
			}
			System.out.println(prime);








	}
	}