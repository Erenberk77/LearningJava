import java.util.*;
public class uygulama5 {
   public static void main(String[] args) {
	   int [][] ikiBoyutluDizi = new int[][] {{5,6,3},{2,3,5},{4,6,8},{5,6,7}} ; 
	   for (int row = 0; row < 4; row++) {
		  for(int column = 0; column<3;column++) {
			  System.out.print(ikiBoyutluDizi[row][column]+ "\t");
		  }
		  System.out.println();
	   }
	   System.out.println(ikiBoyutluDizi[1][2]);
	}
   }

