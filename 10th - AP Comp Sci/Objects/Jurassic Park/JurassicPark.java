import java.util.ArrayList;
public class JurassicPark{
	ArrayList<Dinosaur> dino;
	int HerbHP;
	int PredHP;
	int HerbSpeed;
	int PredSpeed;

	int age;
	int Herbstarve;
	int Predstarve;
	int HerbSize;
	int PredSize;
	int HerbLife;
	int PredLife;

	int Food;
	String Gender;
	int gChoice;
	double temp;
	int attacker;
	boolean attacking;
	int Herbcnt = 1;
	int Predcnt = 1;

	public JurassicPark(){

		dino = new ArrayList<Dinosaur>();


		for(int i = 0; i < 50; i++){
			int HerbHP = (int)(Math.random()*201)+50;
			int PredHP = (int)(Math.random()*141)+45;
			int HerbSpeed = (int)(Math.random()*41)+10;
			int PredSpeed = (int)(Math.random()*46)+35;
			age = 1;
			int Herbstarve = (int)(Math.random()*16)+15;
			int Predstarve = (int)(Math.random()*26)+20;
			temp = Predstarve;
			int HerbSize = (int)(Math.random()*371)+30;
			int PredSize = (int)(Math.random()*201)+10;
			int HerbLife = (int)(Math.random()*41)+20;
			int PredLife = (int)(Math.random()*41)+15;
			int Food = (int)(Math.random()*2)+1;
			Gender = "";
			gChoice = (int)(Math.random()*2)+1;
			if(gChoice == 1)
				Gender = "Male";
			else
				Gender = "Female";
			if(Food == 1){
				String herbName = "Triceratops[" + Herbcnt+ "]: ";
				Herbcnt++;
				Dinosaur herb =  (new Herbivore( HerbHP, HerbSpeed, age, HerbLife, Herbstarve, HerbSize, herbName, Gender));
				dino.add(herb);
			}
			else{
				String predName = "Spinosaurus[" + Predcnt + "]: ";
				Predcnt++;
				Dinosaur pred = (new Predators(PredHP, PredSpeed, age, PredLife, Predstarve, HerbSize, predName, Gender));
				dino.add(pred);
			}
		}
		for(int i = 0; i < dino.size(); i++){
			System.out.println(dino.get(i).getName() + "\t\tHealth: " + dino.get(i).getHp() + "\tSpeed: " + dino.get(i).getSpeed() + "\tAge: " + dino.get(i).getAge() + "\tLife Span: " + dino.get(i).getLife() + "\tStarvation: " + dino.get(i).getStarve() + "\tSize: " + dino.get(i).getSize() + "\tGender: " + dino.get(i).getGender());
		}
		System.out.println("\n\n\n");
		LiveFreeOrDie();
	}


	//New Method
	public void LiveFreeOrDie(){
		while(Herbcnt > 0 && Predcnt > 0){
			for(int i = dino.size() - 1; i >= 0; i--){
				dino.get(i).getOlder();
				int newStarve = dino.get(i).getStarve();
				if(dino.get(i) instanceof Herbivore){
					dino.get(i).setStarvation((int)(dino.get(i).getStarve()*.03));
				}
				else{
					dino.get(i).setStarvation((-(int)(dino.get(i).getStarve()*.03)));
				}
				dino.get(i).starve();
				if(dino.get(i).getHp() == 0){
					if(dino.get(i) instanceof Herbivore){
						Herbcnt--;
					}
					else{
						Predcnt--;
					}
					dino.remove(i);
				}
			}

			int Player1 = (int)(Math.random()*dino.size());
			int Player2 = (int)(Math.random()*dino.size());
			MiniGame(dino.get(Player1), dino.get(Player2));
			System.out.println("Dinos Left:");
			for(int i = 0; i < dino.size(); i++){
				System.out.println(dino.get(i).getName() + "\tHealth:" + dino.get(i).getHp() + "\tSpeed: " + dino.get(i).getSpeed() + "\tAge: " + dino.get(i).getAge() + "\tLife Span: " + dino.get(i).getLife() + "\tStarvation: " + dino.get(i).getStarve() + "\tSize" + dino.get(i).getSize() + "\tGender: " + dino.get(i).getGender());
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------------------");
		}
	}


	//New Method
	public void MiniGame(Dinosaur playerOne, Dinosaur playerTwo){

		System.out.println("Mini Game: ");
		System.out.println(playerOne.getName() + "\tHealth:" + playerOne.getHp() + "\tSpeed: " + playerOne.getSpeed() + "\tAge: " + playerOne.getAge() + "\tLife Span: " + playerOne.getLife() + "\tStarvation: " + playerOne.getStarve() + "\tSize" + playerOne.getSize() + "\tGender: " + playerOne.getGender());
		System.out.println(playerTwo.getName() + "\tHealth:" + playerTwo.getHp() + "\tSpeed: " + playerTwo.getSpeed() + "\tAge: " + playerTwo.getAge() + "\tLife Span: " + playerTwo.getLife() + "\tStarvation: " + playerTwo.getStarve() + "\tSize" + playerTwo.getSize() + "\tGender: " + playerTwo.getGender());
		//Herbivore
		if(playerOne instanceof Herbivore && playerTwo instanceof Herbivore){
			if(playerOne.getGender() != playerTwo.getGender()){
				System.out.println("Mating");
				int gChoice = (int)(Math.random()*2)+1;
				if(gChoice == 1){
					Gender = "Male";
				}
				else{
					Gender = "Female";

				}
				String nHerbName = "";
				nHerbName = "Triceratops" + Herbcnt;
				dino.add(new Herbivore(HerbHP, HerbSpeed, age, HerbLife, Herbstarve, HerbSize, nHerbName, Gender));
			}
			playerOne.setStarvation(-(int)(playerOne.getStarve()*.6));
			playerTwo.setStarvation(-(int)(playerOne.getStarve()*.6));
		}
		//Predators
		if(playerOne instanceof Predators && playerTwo instanceof Predators) {
			if(((double)((playerOne.getStarve()/1.03)/playerOne.getStarve())>=.8)||((double)(playerTwo.getStarve()/1.03)/playerOne.getStarve()>=.8)) {
				attacking = true;
			}
			if(playerOne.getGender()!=playerTwo.getGender()&&!attacking) {
				System.out.println("Mating");
				if(gChoice == 1) {
					Gender = "Male";
				} else{
					Gender = "Female";
				}
				String nPredName = "";
				nPredName = "Spinosaurus" + Predcnt;
				dino.add(new Predators(PredHP, PredSpeed, age, PredLife, Predstarve, HerbSize, nPredName, Gender));
			}
			else if(attacking || playerOne.isStarving(Predstarve) || playerTwo.isStarving(Predstarve)) {
				if(playerOne.getStarve() > playerTwo.getStarve()) {
					System.out.println("Player One Attacks Player Two!");
					playerTwo.reducePoints(((Predators) playerOne).getDamagePred(PredSize, age, PredSpeed, Predstarve));
					playerOne.reducePoints(((Predators) playerTwo).getDamagePred(PredSize, age, PredSpeed, Predstarve));
				}else{
					System.out.println("Player Two Attacks Player One");
					playerOne.reducePoints(((Predators) playerTwo).getDamagePred(PredSize, age, PredSpeed, Predstarve));
					playerTwo.reducePoints(((Predators) playerOne).getDamagePred(PredSize, age, PredSpeed, Predstarve));
				}
				if (playerOne.getHp() != 0) {
					System.out.println("Player One Survives with " + playerOne.getHp() + " health left");
					playerOne.setStarvation((int) (playerOne.getStarve() * .1));
				}
				if (playerTwo.getHp() != 0) {
					System.out.println("Player Two Survives with " + playerTwo.getHp() + " health left");
					playerTwo.setStarvation((int) (playerTwo.getStarve() * .1));
				}
			}
		}
		else{
			if(playerOne instanceof Herbivore && playerTwo instanceof Predators){
				System.out.println("Player Two attacks Player One!");
					playerOne.reducePoints(((Predators)playerTwo).getDamagePred(PredSize, age, PredSpeed, Predstarve));
				if(!((Herbivore)playerOne).runAway(HerbSpeed, playerTwo.getSpeed())){
					System.out.println("Player One attacks back!");
					playerTwo.reducePoints(((Herbivore)playerOne).getDamageHerb(HerbSize, age, HerbSpeed, Herbstarve));
				}
				else System.out.println("Player One runs away!");
				if(playerOne.getHp() > 0){
					System.out.println("Player One survives with " + playerOne.getHp() + " health!");
					playerOne.setStarvation(-(int)(playerOne.getStarve()*.6));
				}
				if(playerOne.getHp() > 0){
					System.out.println("Player Two survives with " + playerTwo.getHp() + " health!");
					playerTwo.setStarvation((int)(playerTwo.getStarve()*.1));
				}
			}
			else if(playerOne instanceof Predators && playerTwo instanceof Herbivore){
				System.out.println("Player One attacks Player Two!");
					playerTwo.reducePoints(((Predators)playerOne).getDamagePred(PredSize, age, PredSpeed, Predstarve));
				if(!((Herbivore)playerTwo).runAway(HerbSpeed, playerOne.getSpeed())){
					System.out.println("Player Two attacks back!");
					playerOne.reducePoints(((Herbivore)playerTwo).getDamageHerb(HerbSize, age, HerbSpeed, Herbstarve));
				}
				else System.out.println("Player One runs away");
				if(playerTwo.getHp() > 0){
					System.out.println("Player Two survives with " + playerTwo.getHp() + " health");
					playerTwo.setStarvation(-(int)(playerTwo.getStarve()*.6));
				}
				if(playerOne.getHp() > 0){
					System.out.println("Player One survives with " + playerOne.getHp() + " health");
					playerOne.setStarvation((int)(playerOne.getStarve()*.1));
				}
			}
		}
	}
	public static void main(String[] args){
		JurassicPark app = new JurassicPark();
	}
	}