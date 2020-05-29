public class SchoolRunner{

	public SchoolRunner(){

		School s1 = new School (1000,"South Brunswick High School",true,52693.8);

		System.out.println(s1.toString());
		s1.setCost(2.1);
		s1.setName("Princeton High School");
		System.out.println(s1.toString());


	}


	public static void main(String[]args){

	SchoolRunner app = new SchoolRunner();

	}


}