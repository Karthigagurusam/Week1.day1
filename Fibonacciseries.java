package day1;

public class Fibonacciseries {

	public static void main(String[] args) {
		int firstnumber=0;
		int secondnumber=1;
		int sum=0;
		int n=10;
		System.out.println("Firstnumber");
		System.out.println("secondnumber");
		for(int i=0;i<=11;i++)
		{
			sum=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=sum;
			System.out.println(sum);
		}
	}
}