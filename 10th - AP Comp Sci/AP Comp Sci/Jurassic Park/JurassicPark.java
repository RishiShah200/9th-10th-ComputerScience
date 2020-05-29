import java.util.ArrayList;
public class JurassicPark{
	ArrayList<Dinosaur> dino;
		public JurassicPark(){
			dino = new ArrayList<Dinosaur>();
			int whatnameH = 0;
		//String [] herb = {"Brachiosaurus","Diplodocus","Stegosaurus","Triceratops","Protoceratop"};
		//	String [] pred=  {"Spinosaurus ","Velociraptor  ","Tyrannosaurus  ","Mapusaurus  ","Ankylosaurus"};
		String Herbname="";
		String gender="";
		String Predname="";
		int Herbage = 0;
		int Herbhp = 0;
		int playerOne = (int)(Math.random()*50)+1;
		int playerTwo = (int)(Math.random()*50)+1;
		int predsVal = 0;
		int Herbspeed = 0;
		int Herbstarve = 0;
		int herbCnt = 0;
		int Herbsize = 0;
		int Herblife = 0;


		int Predspeed = 0;
		int Predstarve = 0;
		int Predsize = 0;
		int Predlife = 0;
		int predCnt = 0;
		int Predage = 0;
		int Predhp = 0;

			for(int x = 1;x<=50;x++){
				int rand = (int)(Math.random()*2);
				int H_P = (int)(Math.random()*2);
				if(H_P==1){
					//whatnameH = (int)(Math.random()*5);
					 Herbname = "Triceratops[H]" + x;
					 Herbage = 1;
					 herbCnt++;
					 Herbhp = (int)(Math.random()*201)+50;
					 Herbspeed = (int)(Math.random()*40)+10;
					 Herbstarve = (int)(Math.random()*16)+15;
					 Herbsize = (int)(Math.random()*371)+30;
					 Herblife = (int)(Math.random()*41)+20;
					if(rand==1)
						gender="Male";
					else if(rand!=1)
						gender="Female";
				}

					else{
					 Predname = "Spinosaurus[P]" + x;
					 predCnt++;
					 Predage = 1;
					 Predhp = (int)(Math.random()*146)+45;
					 Predspeed = (int)(Math.random()*36)+45;
					 Predstarve = (int)(Math.random()*26)+20;
					 Predsize = (int)(Math.random()*201)+10;
					 Predlife = (int)(Math.random()*41)+15;
					if(rand==1)
						gender="Male";
					else if(rand!=1)
						gender="Female";
				 	}

					dino.add(new Herbivore(Herbhp,Herbspeed,Herbage,Herblife,Herbstarve,Herbsize,Herbname,gender));
			}
			int origPredStarve = Predstarve;
			int origHerbStarve = Herbstarve;
			System.out.println(dino+"\n");
			System.out.println("\n\nThis is the beginning of the actual stuff");
			System.out.print("Predators: "+predCnt+" Herbivores: "+herbCnt);
			while(predCnt>0){
				for(int x = 0;x<50;x++){
					dino.get(x).getOlder();
				//	System.out.println(origStarve+" ");
					if(dino.get(x) instanceof Predators){
						System.out.println("hi");
						dino.get(x).setStarvation(Predstarve*1.03);
						if(origPredStarve*.8>=Predstarve)
							System.out.print("hi");
					}
					else if(dino.get(x) instanceof Herbivore){
						dino.get(x).setStarvation(Herbstarve*0.97);
					}
					dino.get(x).starve();
				}
			}
}
			public void MiniGame(Dinosaur playerOne, Dinosaur playerTwo,int Herbhp,int Herbspeed,int Herbage,int Herblife,int Herbstarve,int Herbsize,String Herbname,String gender){
				if(playerOne instanceof Herbivore && playerTwo instanceof Herbivore){
					if(playerOne.getGender()!=playerTwo.getGender()){
						int gChoice = (int)(Math.random()*2)+1;
						if(gChoice==1){
							gender = "Male";
						}
						else{
							gender="Female";
						}
						int newHerbNum = 1;
						String nHerbName="";
						nHerbName = "VEGGIES" + newHerbNum;
						dino.add(new Herbivore(Herbhp,Herbspeed,Herbage,Herblife,Herbstarve,Herbsize,Herbname,gender));
					}
				}
			}



		public static void main(String[]args){

			JurassicPark app = new JurassicPark();

		}


}