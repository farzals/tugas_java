/*
Author Fahrizal
*/
import java.io.*;
public class seatingPlan {
public static void main (String[]args) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	//deklarasi data awal
	int i,j;
	String pilih="";
	int [][] data = {
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0}};
	do {
	//Proses pencarian data kursi
		System.out.println("================================");
		System.out.println("1. First Class");
		System.out.println("2. Bussines Class");
		System.out.println("3. Economy Class");
		System.out.println("================================");
		System.out.print("Pilih Kelas Ticket : ");	
		int menu = Integer.parseInt(in.readLine());
		int baris;
		switch (menu)
		{
				case 1 :System.out.print("Pilih Baris 1-2 : ");	
						baris = Integer.parseInt(in.readLine()); 
						for(j=1;j<=2;j++){
							if(baris==j){
								System.out.print("Pilih Kursi 1-6 : ");	
								menu = Integer.parseInt(in.readLine());
								for(i=1;i<=6;i++){
									if(menu==i){
										if(data[j][i]==0){data[j][i]=1;i=i+6;j=j+2;}
										else {System.out.println("Maaf Kursi Sudah Terisi !");}
										}
								}
							}
								
							}
						break;
				case 2 :  System.out.print("Pilih Baris 3-7 : ");	
						baris = Integer.parseInt(in.readLine()); 
						for(j=3;j<=7;j++){
							if(baris==j){
								System.out.print("Pilih Kursi 1-6 : ");	
								menu = Integer.parseInt(in.readLine());
								for(i=1;i<=6;i++){
									if(menu==i){
										if(data[j][i]==0){data[j][i]=1;i=i+6;j=j+7;}
										else {System.out.println("Maaf Kursi Sudah Terisi !");}
										}
								}
							}
								
							}
						break;
				case 3 :  System.out.print("Pilih Baris 8-13 : ");	
						baris = Integer.parseInt(in.readLine()); 
						for(j=8;j<=13;j++){
							if(baris==j){
								System.out.print("Pilih Kursi 1-6 : ");	
								menu = Integer.parseInt(in.readLine());
								for(i=1;i<=6;i++){
									if(menu==i){
										if(data[j][i]==0){data[j][i]=1;i=i+6;j=j+13;}
										else {System.out.println("Maaf Kursi Sudah Terisi !");}
										}
								}
							}
								
							}
						break;
		}
		//Proses Output Data
		System.out.println("================================");
		for (i=1; i<data.length;i++){
			System.out.print("Rows "+i);
			System.out.print("  ");

			for(j=1;j<data[i].length;j++){
				System.out.print((data[i][j]==1)?" X ":" * ");	
			}
			System.out.println();
			}
	
		System.out.println("Pesan ticket Lagi ?");
		System.out.println("Tekan 'Y'/'N'");
		pilih = in.readLine();
	}
	while (pilih.equals("y"));
}
}