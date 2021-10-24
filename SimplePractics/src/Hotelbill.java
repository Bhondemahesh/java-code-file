import java.util.Scanner;

public class Hotelbill {

	public static void main(String[] args)
	{
		int ch,total=0,total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total7=0,total8=0,total9=0;
		float cgst=0,sgst=0,final_bill=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("*******************************************************************");
		System.out.println("                   welocme to hotel tanuja                         ");
		System.out.println("---------------------------veg staters-----------------------------");
		System.out.println("\n 1 : Cheese Garlic bread(4pcs)        :99 rs ");
		System.out.println("\n 2 : Spicy Sureme Garlic bread(4pcs)  :109 rs");
		System.out.println("\n 3 : Exotica Garlic bread(4pcs)       :119 rs");
		System.out.println("\n 4 : French Fries                     :69 rs ");
		System.out.println("\n 5 : Fries peri peri                  :79 rs ");
		System.out.println("\n 6 : Chilli Garlic Potato Pops        :69 rs ");
		System.out.println("\n 7 : Garlic Bread Stix                :89 rs ");
		System.out.println("\n 8 : Chese Stuffed Garlic Bread       :129 rs");
		System.out.println("\n 9 : Paneer Stuff Garlic Bread        :149 rs");
		ch =sc.nextInt();
		if (ch==1)
		total=total+99;
		else if (ch==2)
			total=total+109;
		else if(ch==3)
			total=total+119;
		else if(ch==4)
			total=total+69;
		else if(ch==5)
			total=total+79;
		else if(ch==6)
			total=total+69;
		else if(ch==7)
			total=total+89;
		else if(ch==8)
			total=total+129;	
		else if(ch==9)
				total=total+149;
		
		do
		{
		System.out.println(" veg                   : 1");
		System.out.println(" non veg               : 2");
		System.out.println(" any other roit etc    : 3");
		System.out.println(" any cold drinks       : 4");
		System.out.println(" enter your choice     :  ");
		ch =sc.nextInt();
		if(ch==1)
		{
			System.out.println(" s1 panir tika 120/rs   : 1");
			System.out.println(" s2 panir bhaji 150/rs  : 2");
			System.out.println(" s3 panir masala 200/rs : 3");
			System.out.println(" enter your choice:  ");
			ch =sc.nextInt();
			if (ch==1)
				total1=total1+120;
				else if (ch==2)
					total1=total1+150;
				else if(ch==3)
					total1=total1+200;
		}
		else if(ch==2)
		{
			System.out.println(" s1 chickan lolipop       120/rs   : 1");
			System.out.println(" s2 chicken full handi    250/rs   : 2");
			System.out.println(" s3 Chicken half handi    200/rs   : 3");
			System.out.println(" enter your choice                 :  ");
			ch =sc.nextInt();
			if (ch==1)
				total1=total1+120;
				else if (ch==2)
					total1=total1+250;
				else if(ch==3)
					total1=total1+200;
		}
		else if(ch==3)
		{
			System.out.println(" Roti                      10/rs   : 1");
			System.out.println(" Chapati                   15/rs   : 2");
			System.out.println(" Jira Rice Full            80/rs   : 3");
			System.out.println(" Jira Rice Haif            40/rs   : 3");
			System.out.println(" enter your choice                 :  ");
			ch =sc.nextInt();
			if (ch==1)
				total2=total2+10;
				else if (ch==2)
					total2=total2+15;
				else if(ch==3)
					total2=total2+80;
				else if(ch==4)
						total2=total2+40;
		}
		else if(ch==4)
		{
			System.out.println("\n cold drinks                     :");
			System.out.println(" 7 up                      40/rs   : 1");
			System.out.println(" sprite                    40/rs   : 2");
			System.out.println(" enter your choice                 :  ");
			ch =sc.nextInt();
			if (ch==1)
				total2=total2+40;
				else if (ch==2)
					total2=total2+40;
		}
		
		System.out.println("***********do you want to any order*****************************");
		ch=sc.nextInt();
		}	while(ch==1);
		cgst=(float) (total1+total1+total2*0.5);
		sgst=(float) (total1+total1+total2*0.5);
		final_bill=total1+total+total2;
		System.out.println("-------------------------------Bill-----------------------------");
		System.out.println("***********Dighi************hotel tanuja**********Pune**********");
		System.out.println(" staters             : "+total);
		System.out.println(" veg & non_veg       : "+total1);
		System.out.println(" Roti and any other  : "+total2);
		System.out.println(" include cgst        : "+cgst);
		System.out.println(" include sgst        : "+sgst);
		System.out.println(" final bill          : "+final_bill);
		System.out.println("*****************************************************************");
		
		
		
	}

}
