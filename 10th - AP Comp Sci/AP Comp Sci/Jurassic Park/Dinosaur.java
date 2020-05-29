public class Dinosaur{

	private int hp;
	private int speed;
	private int age;
	private int life;
	private int starve;
	private int size;
	private int origStarve;
	private String name;
	private String gender;
	public Dinosaur(int hp, int speed, int age, int life, int starve, int size, String name, String gender){
		this.hp = hp;
		this.speed = speed;
		this.age = age;
		this.life = life;
		this.starve = starve;
		this.size = size;
		this.origStarve = origStarve;
		this.name = name;
		this.gender = gender;
	}
	public int getHP(){
		return hp;
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

	public int getSize(){
		return size;
	}
	public String getName(){
		return name;
	}
	public String getGender(){
		return gender;
	}
	public void reducePoints(int damage){
			hp =- damage;
	}
	public void getOlder(){
			if(age==life)
				hp=0;
			age++;
	}
	public int origStarve(int origStarve){
		origStarve = starve;
		return origStarve;
	}
	public boolean isStarving(){
	int rand = (int)(Math.random()*100)+1;
		if(rand<starve)
			return true;
		else
			return false;
	}
	public void starve(){
		if(isStarving())
			hp = (int)(hp*0.1+hp);
	}
	public void setStarvation(double starveChange){
		starve +=starveChange;
		if(starve<0)
			starve = 0;
			if(starve>100)
				starve = 100;
	}
	public int getStarve(){
			return starve;
	}

	public String toString(){
		return (name + "\t\tHP: " +getHP() + "\tSpeed: " +getSpeed() + "\tAge: " + getAge() + "\tLife: " + getLife() + "\tStarve: " + getStarve() + "\tSize: " + getSize() + "\tGender: " + getGender()+"\n");
	}
}