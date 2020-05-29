public class Crossword
{
	private Square[][] puzzle;
	public Crossword(boolean[][] blackSquares)
	{
		puzzle = new Square[blackSquares.length][blackSquares[0].length];
		int cnt = 1;

		for(int x = 0;x<puzzle.length;x++){
			for(int y = 0;x<puzzle[0].length;y++){
				if(toBeLabeled(x,y,blackSquares)){
					puzzle[x][y] = new Square (false,cnt);
					cnt++;
				}
				else{
					puzzle[x][y] = new Square (blackSquares[x][y], 0);
				}
			}

		}

	}
	public boolean toBeLabeled(int r, int c, boolean[][] blackSquares)
	{
		if(blackSquares[r][c])
			return false;
		if(r == 0 || blackSquares[r-1][c])
			return true;
		if(c == 0 || blackSquares[r][c-1])
			return true;

		return false;

	}
	//create a method to return the two-dimensional puzzle array

}