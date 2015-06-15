import java.io.*;
public class tambatambahan
{
	public static void main (String[]args) throws IOException
	{
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
	
		int jmlSoal, inputan, i, hasil;
		int skor = 0;
		System.out.print("Masukkan Jumlah Soal : ");
		jmlSoal = Integer.parseInt(in.readLine());
		
		for (i=1; i<=jmlSoal; i++) {
			int bil1 = (int)(Math.random()*10);
			int bil2 = (int)(Math.random()*10);
		
			hasil = bil1+bil2;
			System.out.print(bil1+" + "+bil2+" = ");
			inputan = Integer.parseInt(in.readLine());
			
			if (hasil == inputan){
				skor++;
				
			}
		
		}
		double skorAkhir = skor*100/jmlSoal;
		System.out.print("Skor Anda : "+skorAkhir);
	}
}