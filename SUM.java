//Q2.write a program to find sum and average of 5 different number with static value .

class SUM {
	public static void main(String args[])
	{
	 	int a=1,b=2,c=3,d=4,e=6;
		int Sum=a+b+c+d+e;
		float Avg=Sum/5;
		
		System.out.print("\nThe value of a="+a+",b="+b+",c="+c+",d="+d+",e="+e+" & SUM is "+Sum+"\n");
		System.out.print("\nThe Average Of " +Sum+ "/5 is : "+Avg+"\n");
	}
}