public class Swithprograms1{
		public static void main (String[]args){
String letter = "";
int num = (int)(Math.random()*100)+1;
if(num >= 93)
letter = "A";
else if((num >= 92)&&(num<=92))
letter = "A-";
else if((num >= 87)&&(num<=89))
letter = "B+";
else if((num >= 83)&&(num<=86))
letter = "B";
else if((num >= 80)&&(num<=82))
letter = "B-";
else if((num >= 77)&&(num<=79))
letter = "C+";
else if((num >= 73)&&(num<=76))
letter = "C";
else if((num >= 70)&&(num<=72))
letter = "C-";
else if((num >= 65)&&(num<=69))
letter = "D";
else if(num<=64)
letter = "F";
switch(letter){
	case "A":
	System.out.println("Your grade is an "+letter);
	break;
	case "A-":
	System.out.println("Your grade is an "+letter);
	break;
	case "F":
	System.out.println("Your grade is an "+letter);
	break;
	default:
	System.out.println("Your grade is a "+letter+".");
	break;

}
		}
	}