import java.util.Date;
import java.util.Scanner;

public class Mahesh {

	public static void main(String[] args)
	{
		int ch,ch1,ch2,ch3,ch4,ch5;
		int total=0,total1=0,total2=0,total3=0,total4=0,total5=0,total6=0,total7=0,total8=0,total9=0;
		float cgst=0,sgst=0,final_bill=0;
		Date current_date = new Date();
		Scanner sc= new Scanner(System.in);
System.out.println("*******************************************************************");
System.out.println(" \n         welocme to hotel tanuja               ");
System.out.println("\n---------------VEG STATERS----------------------");
System.out.println("1 : Cheese Garlic bread(4pcs)        :99 rs ");
System.out.println("2 : Spicy Sureme Garlic bread(4pcs)  :109 rs");
System.out.println("3 : Exotica Garlic bread(4pcs)       :119 rs");
System.out.println("4 : French Fries                     :69 rs ");
System.out.println("5 : Fries peri peri                  :79 rs ");
System.out.println("6 : Chilli Garlic Potato Pops        :69 rs ");
System.out.println("7 : Garlic Bread Stix                :89 rs ");
System.out.println("8 : Chese Stuffed Garlic Bread       :129 rs");
System.out.println("9 : Paneer Stuff Garlic Bread        :149 rs");
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
System.out.println("___________________________________________");
System.out.println("  \n                VEG BURGER               ");
System.out.println("1 :  Crispy Veg Burger        : 60 rs ");
System.out.println("2 : Popular Veg Burger        : 70 rs");
System.out.println("3 : Super Veggie Burger       :119 rs");
ch1 =sc.nextInt();
				if (ch1==1)
				total1=total1+60;
				else if (ch1==2)
					total1=total1+70;
				else if(ch1==3)
					total1=total1+119;

System.out.println("                    Fizzy Drinks             ");
System.out.println("1 :  Coke(250ml)        : 20 rs ");
System.out.println("2 :  Fanta(250ml)       : 20 rs");
System.out.println("3 :  Sprite(250ml)      : 20 rs");
ch1 =sc.nextInt();
								if (ch1==1)
								total2=total2+60;
								else if (ch1==2)
									total2=total2+70;
								else if(ch1==3)
									total2=total2+119;

System.out.println("---------------NON_VEG STATERS ----------------------");
System.out.println("1 : Chicken Wings (Spicy/BBQ)        :160 rs ");
System.out.println("2 : Chicken Keema Garlic Bread       :129 rs");
System.out.println("3 : Chicken Nuggets                  :149 rs");

							if (ch1==1)
								total3=total3+160;
								else if (ch1==2)
									total3=total3+129;
								else if(ch1==3)
									total3=total3+149;
System.out.println("----------------CLASSIC VEG PIZZA---------------");
System.out.println("1 : Cheese Magherita           :99 rs ");
System.out.println("2 : Corn n Cheese              :129 rs");
System.out.println("3 : Farm House                 :165 rs");
System.out.println("4 : Spicy Veg                  :165 rs ");
System.out.println("5 : Double Chesse Megherita    :185 rs ");
System.out.println("6 : Cheese paneer              :195 rs ");
			ch =sc.nextInt();
			if (ch==1)
			total4=total4+99;
			else if (ch==2)
				total4=total4+129;
			else if(ch==3)
				total4=total4+165;
			else if(ch==4)
				total4=total4+165;
			else if(ch==5)
				total4=total4+185;
			else if(ch==6)
				total4=total4+195;
System.out.println("---------------SIGNATURE VEG PIZZA------------------");
System.out.println("1 : Tandoori Paneer                  : 239 rs ");
System.out.println("2 : Paneer Makhani                   : 239 rs");
System.out.println("3 : Indian Country Feast             : 239 rs");
System.out.println("4 : Worlds of cheesy favourite pizza : 239 rs ");
System.out.println("5 : Paneer Tikka                     : 239 rs ");
System.out.println("6 : Shezwan Paneer pizza             : 239 rs ");
System.out.println("7 : Veggie Delight Pizza             : 239 rs ");
System.out.println("8 : Peppy Paneer Pizza               : 239 rs");
				ch =sc.nextInt();
				if (ch<=8)
				total5=total5+239;

System.out.println("------------------EXOTIC VEG-PIZZA--------------------");
System.out.println("1 : Maxican Veg                : 269 rs ");
System.out.println("2 : Veg supreme                : 269 rs");
System.out.println("3 : Veg Exotica                : 269 rs");
System.out.println("4 : Veggie Over loaded         : 269 rs ");
System.out.println("5 : veggie extra vaganza pizza : 269 rs ");
				ch =sc.nextInt();
				if (ch<=5)
				total6=total6+269;								
System.out.println("-----------------CLASSIC NON_VEG PIZZA-----------------");
System.out.println("1 : Cheese & Chicken               : 169 rs ");
System.out.println("2 : Chicken & Corn                 : 169 rs");
System.out.println("3 : Fiery Chicken                  : 179 rs");
System.out.println("4 : Spicy chicken                  : 199 rs ");
System.out.println("5 : Chicken Hawaiian Pizza         : 199 rs ");
		ch =sc.nextInt();
		if (ch<=2)
			total7=total7+169;								
		if (ch==3)
			total7=total7+179;								
		if (ch>3 && ch<5)
			total7=total7+199;	
System.out.println("---------------SIGNATURE NON_VEG PIZZA------------------");
System.out.println("1 : Kheema Do Pyazaa                : 229 rs ");
System.out.println("2 : Butter Chicken Pizza            : 259 rs ");
System.out.println("3 : Chicken Tikka Pizaa             : 259 rs ");
System.out.println("4 : Tandoori Chiken pizza           : 259 rs ");
System.out.println("5 : Classic Chicken                 : 269 rs ");
System.out.println("6 :Shezwan Chicken pizza            : 259 rs ");
System.out.println("7 : Chicken Delight Pizza           : 259 rs ");
				ch =sc.nextInt();
				 if(ch==1)
					total8=total8+229;
				 if (ch==5)
						total8=total8+269;
				 if (ch==2 || ch==3 || ch==4 || ch==6 || ch==7)
						total8=total8+259; 
System.out.println("---------------------Desert--------------------");
System.out.println("1 : Choco Lava cake                 : 60 rs ");
ch =sc.nextInt();
if(ch==1)
	total9=total9+60;


	final_bill=total+total1+total2+total3+total4+total5+total6+total7+total8+total9;		
	cgst=(float) (final_bill*0.5);
	sgst=(float) (final_bill*0.5);
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^Bill^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	System.out.println("***********Dighi************hotel tanuja**********Pune**********");
	System.out.println(" VEG STATERS             : "+total);
	System.out.println(" VEG BURGER              : "+total1);
	System.out.println(" Fizzy Drinks            : "+total2);
	System.out.println(" NON_VEG STATERS         : "+total3);
	System.out.println(" CLASSIC VEG PIZZA       : "+total4);
	System.out.println(" SIGNATURE VEG PIZZA     : "+total5);
	System.out.println(" EXOTIC VEG PIZZA        : "+total6);
	System.out.println(" CLASSIC NON_VEG PIZZA   : "+total7);
	System.out.println(" SIGNATURE NON_VEG PIZZA : "+total8);
	System.out.println("----------Desert---------: "+total9);
	System.out.println(" include cgst            : "+cgst);
	System.out.println(" include sgst            : "+sgst);
	System.out.println(" final bill              : "+final_bill);
	System.out.println("*****************************************************************");
	System.out.println("__________________"+current_date+"_____________________");
	System.out.println("*****************************************************************");
	
	
}
}