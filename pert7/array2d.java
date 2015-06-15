public class array2d {
public static void main (String[]args) {
	int [][] data = {
		{1,0,0,0,0,0},
		{0,1,0,0,0,0},
		{0,0,1,0,0,0},
		{0,0,0,1,0,0},
		{0,0,0,0,1,1},
		{0,0,0,0,1,1}};
		
	for (int i=5; i>0;i--){
		for(int j=5;j>0;j--){
			System.out.print((data[i][j]==1)?" # ":" . ");	
		}
		System.out.println();
	}
}
}