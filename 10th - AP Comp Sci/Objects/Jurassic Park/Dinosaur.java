public class Dinosaur{
	private int HP;
	private int speed;
	private int age;
	private int life;
	private int starveVal;
	private int size;
	private String name;
	private String gender;
	public Dinosaur(int HP, int speed, int age, int life, int starveVal, int size, String name, String gender){
		this.HP = HP;
		this.speed = speed;
		this.age = age;
		this.life = life;
		this.starveVal = starveVal;
		this.size = size;
		this.name = name;
		this.gender = gender;
    }
	public int getHp(){

		return HP;
	}
	public int getSpeed(){
		return speed;
	}
	public int getAge(){
		return age;
	}
	public int getLife(){
		return life;
	}
	public int getStarve(){
		return starveVal;
	}
	public int getSize(){
		return size;
	}
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	public void getOlder(){
		if (age==life)
			HP = 0;
		age++;
	}
	public void reducePoints(int damage){
		HP-=damage;
	}
	public boolean isStarving(int starveVal){
		int sNum = (int)(Math.random()*100)+1;
		boolean starving;
		if(sNum < starveVal){
			starving = true;
		}
		else{
			starving = false;
		}
		return starving;
	}
	public void starve(){
		if(isStarving(starveVal))
			HP*=.9;
	}

	public int setStarvation(int starve){

		return starveVal += starve;
    }
}