package beersong;

import java.util.Scanner;
public class Beersong{
	public static void main(String[] args) {
		int beerNum; 
		System.out.println("Enter the number of bottles of beer you want to be served?");
		Scanner Num= new Scanner(System.in);
		beerNum=Num.nextInt();
		String word= "Bottles";
while (beerNum>0){
		if (beerNum==1){	word="Bottle";}
System.out.println(beerNum +" " + word+" of beer on the wall");  
System.out.println(beerNum +" "+word+" of beer");
System.out.println("  take one down \n  pass it around\n");
       beerNum--;
			
			if (beerNum<1){
System.out.println("No more bottles of beer on the wall");}
}
        }
}
