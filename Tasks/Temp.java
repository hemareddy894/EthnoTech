//store temperature of 30 days and print loweset,highest,and avg temp and also no.of hard days
import java.util.Scanner;
class Temp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] temp=new int[30];
		for(int i=0;i<30;i++)
		{
			temp[i]=sc.nextInt();
		}
		int low,hig,sum=0;
		int hotdays=0;
		for(int i=0;i<30;i++)
		{
			if(temp[i]>hig)
				hig=temp[i];
			if(temp[i]<low)
				low=temp[i];
			sum+=temp[i];
			if(temp[i]>35)
				hotdays+=1;
		}
		double avg=sum/30;
		System.out.println(low);
		System.out.println(hig);
		System.out.println(hotdays);
		System.out.println(avg);
	}
}
			

