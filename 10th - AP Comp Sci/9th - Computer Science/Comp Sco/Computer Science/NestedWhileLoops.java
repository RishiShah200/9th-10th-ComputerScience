public class NestedWhileLoops{
	public static void main (String[]args){
		int x = 0;
		int xx = 0;
		String star = "*";
		while(x<4){
			System.out.println(star);
			star+="*";
			x++;
					}
					System.out.println();
		x=4;
		while(x>0){
			xx=x;
			while(xx>0){
				System.out.print("*");
				xx--;
						}

					System.out.println();
					x--;

					}
		x=0;
		star="";
		while(x<4){
			System.out.println(star);
			star+="***";
			x++;
					}
					System.out.println();

		for(int i = 1;i<5;i++){
			for(int j=i;j>0;j--)
				System.out.println("*");
			System.out.println("X");
								}
					System.out.println();
		int n = 0;
		while(n<3){
		System.out.println("*****");
		n++;
					}
System.out.println();
					//
				int b = 0;
				int bb = 0;
				String star1 = "*";
				while(b<4){
					System.out.println(star1);
					star1+="*";
					b++;
							}
				x=3;
				while(x>0){
					xx=x;
					while(xx>0){
						System.out.print("*");
						xx--;
								}

							System.out.println();
							x--;

					}


	}
	}