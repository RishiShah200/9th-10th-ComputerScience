public class DArrays{
	public static void main (String[]args){
int count = 0;
int max = -10000;
int maximum = 0;
int[] a  =  new int [100];
for(int j = 1;j<100;j++){
	for(int i = 1;i<=j;i++){
		if(j%i==0)
			count++;
}
a[j] = count;
count = 0;
if(a[j]>max){
max = a[j];
}
}
maximum = max;
for(int j = 1;j<100;j++){
	for(int i = 1;i<=j;i++){
		if(j%i==0)
			count++;
}
a[j] = count;
count = 0;

if(a[j]==maximum){
System.out.println(j);
break;
}
}


	}
	}