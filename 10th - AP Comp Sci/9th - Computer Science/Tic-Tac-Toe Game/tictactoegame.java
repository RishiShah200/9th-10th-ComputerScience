import java.util.Scanner;

public class tictactoegame{
	public static void main (String[]args){
		Scanner reader  = new Scanner (System.in);
		TicTacToeBoard board = new TicTacToeBoard(620,720);
		char [][]arr = new char[3][3];
		board.setFiles("Hoop.jpg","basketball.jpg");
		int[][]boardLine = {{0,200,600,200},
		 					{0,400,600,400},
							{200,0,200,600},
							{400,0,400,600}};

		board.defineBoard(boardLine);
		board.setBoard(arr);
		boolean p1 = true;
		boolean redo = false;
		boolean p2 = false;
		int row = 0;
		int col = 0;
		int cnt = 0;
		int crow = 0;
		int ccol = 0;
		int selection = 0;
		boolean z = false;
		int finalresult = 5;
		System.out.println("Welcome to the Tic-Tac-Game");
		board.delay(500);
		System.out.println("This game consists of two player modes:  One player mode and two player mode");
		board.delay(500);
		System.out.println("The way you enter positions on the board is as follows: You will be asked to enter a row and a column\nThe rows going down are numbered 0,1,2 and the columns going across are numbered 0,1,2");
		board.delay(500);
		System.out.println("For example: The center spot on the board would be row 1, column 1 (1,1)");
		board.delay(500);
			while(z==false){
			System.out.println("\nPlease select one of the options: One(1) player mode or two(2) player mode");
			selection  = reader.nextInt();
				if(selection==1||selection==2)
					z=true;
				else
					z=false;

			}

			for (row=0;row<3;row++){
				for (col=0;col<3;col++){
					arr[row][col] = '-';
				}
			}

			while(selection==1){

				if(p1==true){
					if(redo==false){
						System.out.println("Your turn");
						System.out.print("Enter a row:\n");
						row = reader.nextInt();
						System.out.print("Enter a column:\n");
						col = reader.nextInt();
					}
				while(row>2||row<0){
					System.out.println("You entered a value that is not in the board. Enter a different value:");
					System.out.print("Enter a row:\n");
					row = reader.nextInt();
					System.out.print("Enter a column:\n");
					col = reader.nextInt();
				}
				while(col>2||col<0){
					System.out.println("You entered a value that is not in the board. Enter a different value:");
					System.out.print("Enter a row:\n");
					row = reader.nextInt();
					System.out.print("Enter a column:\n");
					col = reader.nextInt();
				}
				while(arr[row][col]!='-'){
					System.out.println("This spot has already been chosen. Reselect your choices");
					System.out.print("Enter a row:\n");
					row = reader.nextInt();
					System.out.print("Enter a column:\n");
					col = reader.nextInt();
				}
				if(arr[row][col]=='-'){
					arr[row][col] = 'o';
					p1=false;
					redo = false;
				}
				else{
					p1=true;
					redo=true;
				}
			}
			else if(arr[0][0]!='-'&&arr[0][1]!='-'&&arr[0][2]!='-'&&arr[1][0]!='-'&&arr[1][1]!='-'&&arr[1][2]!='-'&&arr[2][0]!='-'&&arr[2][1]!='-'&&arr[2][2]!='-'){
				selection+=2;
				finalresult++;
			}
			else if(p1==false){
				System.out.println("Computer's turn");
				row = (int)(Math.random()*3)+0;
				col = (int)(Math.random()*3)+0;
				System.out.println(row+","+col);
				if(arr[row][col]=='-'){
					arr[row][col] = 'x';
					p1=true;
					//redo = false;
				}
				else{
					//redo=true;
					p1=false;
				}
			}
			if(arr[0][0]=='o'&&arr[0][1]=='o'&&arr[0][2]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[1][0]=='o'&&arr[1][1]=='o'&&arr[1][2]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[2][0]=='o'&&arr[2][1]=='o'&&arr[2][2]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][0]=='o'&&arr[1][0]=='o'&&arr[2][0]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][1]=='o'&&arr[1][1]=='o'&&arr[2][1]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][2]=='o'&&arr[1][2]=='o'&&arr[2][2]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][0]=='o'&&arr[1][1]=='o'&&arr[2][2]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[2][0]=='o'&&arr[1][1]=='o'&&arr[0][2]=='o'){
				board.setWinner("You have won(o)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(finalresult==6){
				board.setWinner("Tie!",0,670,60);
				board.showText(true);
			}
		//////////////////////////////////////////////////////////
			if(arr[0][0]=='x'&&arr[0][1]=='x'&&arr[0][2]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[1][0]=='x'&&arr[1][1]=='x'&&arr[1][2]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[2][0]=='x'&&arr[2][1]=='x'&&arr[2][2]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][0]=='x'&&arr[1][0]=='x'&&arr[2][0]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][1]=='x'&&arr[1][1]=='x'&&arr[2][1]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][2]=='x'&&arr[1][2]=='x'&&arr[2][2]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[0][0]=='x'&&arr[1][1]=='x'&&arr[2][2]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			else if(arr[2][0]=='x'&&arr[1][1]=='x'&&arr[0][2]=='x'){
				board.setWinner("Computer has won(x)!", 0,670,50);
				board.showText(true);
				selection+=2;
			}
			board.repaint();
		}

		p1=true;
		while(selection==2){
			if(p1==true){
				System.out.println("Player 1's turn:");
					System.out.print("Enter a row:\n");
					row = reader.nextInt();
					System.out.print("Enter a column:\n");
					col = reader.nextInt();
				while(col>2||col<0){
									System.out.println("You entered a value that is not in the board. Enter a different value:");
									System.out.print("Enter a row:\n");
									row = reader.nextInt();
									System.out.print("Enter a column:\n");
									col = reader.nextInt();
								}
								while(arr[row][col]!='-'){
									System.out.println("This spot has already been chosen. Reselect your choices");
									System.out.print("Enter a row:\n");
									row = reader.nextInt();
									System.out.print("Enter a column:\n");
									col = reader.nextInt();
				}

				while(arr[row][col]!='-'){
					System.out.println("This spot has already been chosen. Reselect your choices");
					System.out.print("Enter a row:\n");
					row = reader.nextInt();
					System.out.print("Enter a column:\n");
					col = reader.nextInt();
				}
				if(arr[row][col]=='-'){
					arr[row][col] = 'o';
					p1=false;
				}
			board.repaint();
			if(arr[0][0]!='-'&&arr[0][1]!='-'&&arr[0][2]!='-'&&arr[1][0]!='-'&&arr[1][1]!='-'&&arr[1][2]!='-'&&arr[2][0]!='-'&&arr[2][1]!='-'&&arr[2][2]!='-'){
							selection+=2;
							board.setWinner("Tie!",0,670,50);
							board.showText(true);
			}
			}
					if(arr[0][0]=='o'&&arr[0][1]=='o'&&arr[0][2]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[1][0]=='o'&&arr[1][1]=='o'&&arr[1][2]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[2][0]=='o'&&arr[2][1]=='o'&&arr[2][2]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][0]=='o'&&arr[1][0]=='o'&&arr[2][0]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][1]=='o'&&arr[1][1]=='o'&&arr[2][1]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][2]=='o'&&arr[1][2]=='o'&&arr[2][2]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][0]=='o'&&arr[1][1]=='o'&&arr[2][2]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[2][0]=='o'&&arr[1][1]=='o'&&arr[0][2]=='o'){
						board.setWinner("You have won(o)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(finalresult==6){
						board.setWinner("Tie!",0,670,60);
						board.showText(true);
						break;
					}
				//////////////////////////////////////////////////////////
					if(arr[0][0]=='x'&&arr[0][1]=='x'&&arr[0][2]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[1][0]=='x'&&arr[1][1]=='x'&&arr[1][2]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[2][0]=='x'&&arr[2][1]=='x'&&arr[2][2]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][0]=='x'&&arr[1][0]=='x'&&arr[2][0]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][1]=='x'&&arr[1][1]=='x'&&arr[2][1]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][2]=='x'&&arr[1][2]=='x'&&arr[2][2]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[0][0]=='x'&&arr[1][1]=='x'&&arr[2][2]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
						selection+=2;
						break;
					}
					else if(arr[2][0]=='x'&&arr[1][1]=='x'&&arr[0][2]=='x'){
						board.setWinner("P2 has won(x)!", 0,670,50);
						board.showText(true);
					selection+=2;
					break;
			}
				if(p1==false){
							System.out.println("Player 2's Turn");
							System.out.print("Enter a row:\n");
							row = reader.nextInt();
							System.out.print("Enter a column:\n");
							col = reader.nextInt();

					while(arr[row][col]!='-'){
						System.out.println("This spot has already been chosen. Reselect your choices");
						System.out.print("Enter a row:\n");
						row = reader.nextInt();
						System.out.print("Enter a column:\n");
						col = reader.nextInt();
				}
					if(arr[row][col]=='-'){
						arr[row][col] = 'x';
						p1=true;
					}
			}
					if(arr[0][0]=='o'&&arr[0][1]=='o'&&arr[0][2]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[1][0]=='o'&&arr[1][1]=='o'&&arr[1][2]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[2][0]=='o'&&arr[2][1]=='o'&&arr[2][2]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][0]=='o'&&arr[1][0]=='o'&&arr[2][0]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][1]=='o'&&arr[1][1]=='o'&&arr[2][1]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][2]=='o'&&arr[1][2]=='o'&&arr[2][2]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][0]=='o'&&arr[1][1]=='o'&&arr[2][2]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[2][0]=='o'&&arr[1][1]=='o'&&arr[0][2]=='o'){
								board.setWinner("You have won(o)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(finalresult==6){
								board.setWinner("Tie!",0,670,60);
								board.showText(true);
							}
						//////////////////////////////////////////////////////////
							if(arr[0][0]=='x'&&arr[0][1]=='x'&&arr[0][2]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[1][0]=='x'&&arr[1][1]=='x'&&arr[1][2]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[2][0]=='x'&&arr[2][1]=='x'&&arr[2][2]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][0]=='x'&&arr[1][0]=='x'&&arr[2][0]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][1]=='x'&&arr[1][1]=='x'&&arr[2][1]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][2]=='x'&&arr[1][2]=='x'&&arr[2][2]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[0][0]=='x'&&arr[1][1]=='x'&&arr[2][2]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
								selection+=2;
							}
							else if(arr[2][0]=='x'&&arr[1][1]=='x'&&arr[0][2]=='x'){
								board.setWinner("P2 has won(x)!", 0,670,50);
								board.showText(true);
							selection+=2;
}

				board.repaint();

		}
		board.repaint();
	}
}

