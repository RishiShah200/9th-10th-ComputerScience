import java.util.ArrayList;
public class TestRunner
{
	public TestRunner()
	{
		ArrayList<StudentAnswerSheet> tests=new ArrayList<StudentAnswerSheet>();
		ArrayList<String> sheet1=new ArrayList<String>();
		ArrayList<String> sheet2=new ArrayList<String>();
		ArrayList<String> sheet3=new ArrayList<String>();
		ArrayList<String> key=new ArrayList<String>();
		key.add("A");
		key.add("C");
		key.add("D");
		key.add("E");
		key.add("B");
		key.add("C");
		key.add("E");
		key.add("B");
		key.add("B");
		key.add("C");


		sheet1.add("A");
		sheet1.add("B");
		sheet1.add("D");
		sheet1.add("E");
		sheet1.add("A");
		sheet1.add("C");
		sheet1.add("?");
		sheet1.add("B");
		sheet1.add("D");
		sheet1.add("C");
		StudentAnswerSheet student1=new StudentAnswerSheet(sheet1, "Bill");
		sheet2.add("C");
		sheet2.add("B");
		sheet2.add("D");
		sheet2.add("A");
		sheet2.add("A");
		sheet2.add("C");
		sheet2.add("?");
		sheet2.add("B");
		sheet2.add("D");
		sheet2.add("C");

		sheet3.add("B");
		sheet3.add("B");
		sheet3.add("A");
		sheet3.add("E");
		sheet3.add("A");
		sheet3.add("?");
		sheet3.add("?");
		sheet3.add("B");
		sheet3.add("D");
		sheet3.add("C");
		tests.add(student1);
		//add in other students like we did for student 1


		TestResults testResults=new TestResults(tests);
		System.out.println(testResults.highestScoringStudent(key));

	}


	public static void main(String[] args)
	{
		TestRunner app=new TestRunner();
	}

}