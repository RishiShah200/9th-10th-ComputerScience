public class CrosswordRunner
{
	public CrosswordRunner()
	{
		boolean[][] crossWordGrid=new boolean[7][9];
		crossWordGrid[0][0]=true;
		crossWordGrid[0][3]=true;
		crossWordGrid[0][4]=true;
		crossWordGrid[0][5]=true;
		crossWordGrid[1][4]=true;
		crossWordGrid[2][6]=true;
		crossWordGrid[2][7]=true;
		crossWordGrid[2][8]=true;
		crossWordGrid[3][2]=true;
		crossWordGrid[3][6]=true;
		crossWordGrid[4][0]=true;
		crossWordGrid[4][1]=true;
		crossWordGrid[4][2]=true;
		crossWordGrid[5][4]=true;
		crossWordGrid[6][3]=true;
		crossWordGrid[6][4]=true;
		crossWordGrid[6][5]=true;
		crossWordGrid[6][8]=true;
		Crossword xword=new Crossword(crossWordGrid);
		Square[][] puzzle; /*=  call the finished puzzle from the Crossword class*/;


		//nest two loops to walk through the puzzle array
		//if the puzzle num is greater than 0 output the number and a tab
		//if the puzzle is less than 0 output a tab
		//otherwise output a Capital B(to represent black square) and a tab

		//display as a "grid" - in rows and columns

	}


	public static void main(String[] args)
	{
		CrosswordRunner app=new CrosswordRunner();
	}

}