public abstract class Fruit extends Food{
	private boolean edibleSkin;
	public Fruit(int vitaminAcontent, int calories, boolean edibleSkin){
		super(vitaminAcontent,calories);
		this.edibleSkin = edibleSkin;
	}

	public boolean getEdibleSkin(){
		return edibleSkin;
	}

}