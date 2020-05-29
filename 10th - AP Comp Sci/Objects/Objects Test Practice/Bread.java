public abstract class Bread extends Food{
	private int numOfGrains;
	public Bread(int vitaminAcontent, int calories, int numOfGrains){
		super(vitaminAcontent,calories);
		this.numOfGrains = numOfGrains;
	}

	public int getnumOfGrains(){
		return numOfGrains;
	}

}