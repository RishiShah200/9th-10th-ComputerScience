import java.util.Scanner;
	public class ExtraCreditLoops{
		public static void main (String[]args){
Scanner reader = new Scanner (System.in);
int q = 0;
int w = 0;
int e = 0;
int r = 0;
int t = 0;
int y = 0;
System.out.println("Welcome to the naughty or nice list generator ");
System.out.println("How many children would you like to check? ");
	int scores = reader.nextInt();
reader.nextLine();
for(int i = 1;i<=scores;i++){
int random = (int)(Math.random()*3)+1;
int random2 = (int)(Math.random()*9)+1;
System.out.println("Please enter a child's name: ");
String name = reader.nextLine();
if(random==1||random2==1||random2==2||random2==3){
	System.out.println("Does "+name+" make their bed?");
	String choice = reader.nextLine();
	{
	if(choice.equals("Yes"))
	q++;
	else
	w++;
}
	System.out.println("Does "+name+" pick up their toys?");
	String choice2 = reader.nextLine();
	{
	if(choice2.equals("Yes"))
	q++;
	else
	w++;
}
	System.out.println("Does "+name+" listen to their parents?");
	String choice3 = reader.nextLine();
	{
	if(choice3.equals("Yes"))
	q++;
	else
	w++;
}
}
else if(random==2||random2==4||random2==5||random2==6){
	System.out.println("Does "+name+" go to bed when told?");
	String choice4 = reader.nextLine();
	{
	if(choice4.equals("Yes"))
	e++;
	else
	r++;
}
	System.out.println("Does "+name+" finish meals?");
	String choice5 = reader.nextLine();
	{
	if(choice5.equals("Yes"))
	e++;
	else
	r++;
}
	System.out.println("Is "+name+" nice to others?");
	String choice6 = reader.nextLine();
	{
	if(choice6.equals("Yes"))
	e++;
	else
	r++;
}
}
else if(random==3||random2==7||random2==8||random2==9||random2==10){
	System.out.println("Does "+name+" complete homework?");
	String choice5 = reader.nextLine();
	{
	if(choice5.equals("Yes"))
	t++;
	else
	y++;
}
	System.out.println("Is "+name+" nice to siblings?");
	String choice6 = reader.nextLine();
	{
	if(choice6.equals("Yes"))
	t++;
	else
	y++;
}
	System.out.println("Does "+name+" not whine?");
	String choice7 = reader.nextLine();
	{
	if(choice7.equals("Yes"))
	t++;
	else
	y++;
}
	System.out.println("Does "+name+" help parents?");
	String choice8 = reader.nextLine();
	{
	if(choice8.equals("Yes"))
	t++;
	else
	y++;
}
}

if(q>=2||e>=2||t>=2){
System.out.println(name+" is on the Nice List!");
}
else if(w>=2||r>=2||y>=2){
System.out.println(name+ " is on the naughty list!");

}
}


	}
	}