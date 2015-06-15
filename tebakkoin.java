public class tebakkoin {
	public static void main ( String[]args) {
	 int n =10;
	 int i = 1;
	 int jmlGambar =0;
	 int jmlAngka =0;
	 
	
	for (i=1; i<=n; i++) 
	{
		int bilrandom = (int) (Math.random()+0.5);
		
		if ( bilrandom==1) {
			jmlGambar += 1;
			System.out.print(i);
			System.out.print(" | ");
			System.out.print("GAMBAR");
		}
		else if	(bilrandom==0){
			jmlAngka += 1;
			System.out.print(i);
			System.out.print(" | ");
			System.out.print("ANGKA");
		}
		System.out.println();
	}
		System.out.println("================================");
		System.out.println(" Jumlah Gambar : "+jmlGambar);
		System.out.println(" Jumlah Angka : "+jmlAngka);
		if (jmlGambar<jmlAngka) {
			System.out.println(" Yang Menang adalah : Angka");
		}
		else if (jmlGambar>jmlAngka) {
			System.out.println(" Yang Menang adalah : Gambar");
		}
		else if(jmlGambar==jmlAngka) {
			System.out.println(" Hasilnya Seri");
		}
	}
}