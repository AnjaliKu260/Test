package Test;

public class AgeDemo {

	public static void main(String[] args)
	{
		int countc=0,countA=0,countSC=0;
		int a[]= {34,78,56,7,12,67,20,50};
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]<18)
			{
				countc++;
			}
			else if(a[i]>=18&&a[i]<55)
			{
				countA++;
			}
			else
				countSC++;
		}
		System.out.println("Children "+countc);
		System.out.println("Aduit "+countA);
		System.out.println("Senior Citizen "+countSC);
	}
}


