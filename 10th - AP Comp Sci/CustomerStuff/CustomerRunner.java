public class CustomerRunner
{
	Customer[] list1;
	Customer[] list2;
	Customer[] result;
	public CustomerRunner()
	{
		list1=new Customer[]{new Customer("Arthur",4920),new Customer("Burton",3911),new Customer("Burton",4944),new Customer("Franz",1692),new Customer("Horton",9221),new Customer("Jones",5554),new Customer("Miller",9360),new Customer("Nguyen",4339)};
		list2=new Customer[]{new Customer("Aaron",1729),new Customer("Baker",2921),new Customer("Burton",3911),new Customer("Dillard",6552),new Customer("Jones",5554),new Customer("Miller",9360),new Customer("Noble",3335)};
		result=new Customer[6];
		Customer test = new Customer("Arthur",4920);
		result = prefixMerge(list1,list2,result);

		for(int p = 0;p<result.length;p++)
			System.out.println(result[p] + " ");
		System.out.println();
		
		//declare a new variable of type Customer and instantiate it
		//using the three arrays created above


		//output the result array

	}

	public Customer[] prefixMerge(Customer[] a, Customer[] b, Customer[] c){
		int y = 0;
		int x = 0;
		for(int i = 0;i<c.length;i++){
			if(a[x].compareCustomer(b[y]) < 0){
				c[i] = a[x];
				x++;
			}
			else if(a[x].compareCustomer(b[y]) > 0){
				c[i] = b[y];
				y++;
			}
			else if(a[x].compareCustomer(b[y]) == 0){
				c[i] = a[x];
				x++;
				y++;
			}
		}
			return c;
	}



	public static void main(String[] args)
	{
		CustomerRunner app=new CustomerRunner();
	}


}