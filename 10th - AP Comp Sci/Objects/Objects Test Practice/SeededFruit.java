public abstract class SeededFruit extends Fruit{
	private int numOfSeeds;
	public SeededFruit(int vitaminAcontent, int calories, boolean edibleSkin, int numOfSeeds){
		super(vitaminAcontent,calories,edibleSkin);
		this.numOfSeeds = numOfSeeds;
	}

	public int getnumOfSeeds(){
		return numOfSeeds;
	}

}