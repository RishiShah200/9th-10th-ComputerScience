public abstract class Fruit extends Food{
	private boolean edibleSkin;
	public Fruit(int vitaminAContent, int calories, boolean edibleSkin){
		super(vitaminAcontent, calories);
		this.edibleSkin = edibleSkin;
	}
}