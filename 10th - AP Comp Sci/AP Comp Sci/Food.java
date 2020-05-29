public abstract class Food{
		private int vitaminAcontent;
		private int calories;
	public Food(int vitaminAcontent, int calories){
		this.vitaminAcontent = vitaminAcontent;
		this.calories = calories;
	}

	public int getvitaminAContent(){
		return vitaminAcontent;
	}
	public int getCalories(){
		return calories;
	}



}