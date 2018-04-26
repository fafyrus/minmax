import java.util

public class Max2 {

    public static int max2(int x, int y) {
    	int max;
    	if (x > y){
   		 max = x;
    	} else {
   		 max = y;
    	}
    	return max;
	}
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez deux entiers : ");
    System.out.print("x = ");
    int x = sc.nextInt();
    System.out.print("y = ");
    int y = sc.nextInt();
    System.out.print("Le maximum de x et y vaut : " + max2(x,y));
	}
}

	 public static int max3(int unargument1, int unargument2, int unargument3) {
		 int max1 = max2(unargument1, unargument2);
		 int maxF = max2(max1, unargument3);
		 
		 return maxF; 	
	 }

		System.out.print ("z=");
		int z = sc.nextInt();
		System.out.println("Le maximum de x, y et z: " + max3(x, y , z));