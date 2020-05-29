public class Herbivore extends Dinosaur{
	public Herbivore(int hp, int speed, int age, int life, int starve, int size, String name, String gender){
	super(hp,speed,age,life,starve,size,name,gender);

	}
	public int getDamage(int size, int age, int speed, int starve){
		double maxDamage = 0.0;
		double minDamage = 0.0;
		if(size>speed)
			maxDamage = (size)*(1-starve/100.0);
			minDamage = (speed)*(1-speed/100.0);
		if(speed>size)
			maxDamage = (speed)*(1-starve/100.0);
			minDamage = (size)*(1-starve/100.0);
		int damage = (int)((Math.random()*maxDamage)+minDamage);
		return damage;


		}
	public boolean runAway(int herbspeed,int predSpeed){
		int attSpeed = (int)(Math.random()*herbspeed)+1;
		int defSpeed = (int)(Math.random()*predSpeed)+1;
		if(attSpeed<defSpeed)
			return true;
		else
			return false;
		}
}