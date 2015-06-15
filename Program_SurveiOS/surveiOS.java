//import java.io.*;

public class surveiOS {

public static void main (String []args)  {
		//BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		//Inisialisasi Variabel
		int jml = 61;
		String nama[] = new String[jml];
		String os[] = new String[jml];
		int andro = 0;
		int bb = 0;
		int win = 0;
		int ios = 0;

		System.out.println("====================================");
		System.out.println("          Hasil Data Survei         ");
		System.out.println(" Sistem Operasi yg banyak digunakan ");
		System.out.println("====================================");
		
		//input data nama
			nama[0] = "Fahrizal";nama[1] = "Komang";nama[2] = "Al Arif";nama[3] = "Nur Rahman";nama[4] = "Naufal";
			nama[5] = "Tedi";nama[6] = "Diki";nama[7] = "yanuar";nama[8] = "iqbal";nama[9] = "Harits";nama[10] = "Dimas";
			nama[11] = "Rinda";nama[12] = "Ayu";nama[13] = "Zidan";nama[14] = "Rendi";nama[15] = "Reza";nama[16] = "Wildan";
			nama[17] = "Elka";nama[18] = "Fandi";nama[19] = "Fahmi";nama[20] = "Rendra";nama[21] = "Selly";nama[22] = "Ardha";
			nama[23] = "Jumardi";nama[24] = "Tolop";nama[25] = "Kolis";nama[26] = "androids";nama[27] = "Elda";nama[28] = "Alifan";
			nama[29] = "Ginseng";nama[30] = "Joko";nama[31] = "Fatkur";nama[32] = "Firman";nama[33] = "Irsa";nama[34] = "Arizky";
			nama[35] = "Tian";nama[36] = "Fajar";nama[37] = "Yuyun";nama[38] = "Badruz";nama[39] = "Chakim";nama[40] = "Lani";
			nama[41] = "Bagus";nama[42] = "Riva";nama[43] = "Dian";nama[44] = "Bagas";nama[45] = "Lucky";nama[46] = "Nabil";
			nama[47] = "Subli";nama[48] = "Devita";nama[49] = "Sunar";nama[50] = "Bimo";nama[51] = "Nestya";nama[52] = "Septian";
			nama[53] = "Aldino";nama[54] = "Roup";nama[55] = "Bayu";nama[56] = "Putri";nama[57] = "Siti";nama[58] = "Ghivari";
			nama[59] = "Sebastian";nama[60] = "Sony";
		//input data os
			os[0] = "blackberry";os[1] = "ios";os[2] = "android";os[3] = "android";os[4] = "android";
			os[5] = "android";os[6] = "android";os[7] = "android";os[8] = "android";os[9] = "android";os[10] = "android";
			os[11] = "blacbkerry";os[12] = "android";os[13] = "android";os[14] = "windows";os[15] = "android";os[16] = "android";
			os[17] = "android";os[18] = "android";os[19] = "android";os[20] = "android";os[21] = "android";os[22] = "android";
			os[23] = "blackberry";os[24] = "android";os[25] = "android";os[26] = "android";os[27] = "android";os[28] = "android";
			os[29] = "android";os[30] = "android";os[31] = "windows";os[32] = "android";os[33] = "android";os[34] = "android";
			os[35] = "android";os[36] = "android";os[37] = "blackberry";os[38] = "android";os[39] = "android";os[40] = "android";
			os[41] = "android";os[42] = "android";os[43] = "android";os[44] = "android";os[45] = "android";os[46] = "android";
			os[47] = "android";os[48] = "android";os[49] = "android";os[50] = "android";os[51] = "android";os[52] = "android";
			os[53] = "android";os[54] = "blackberry";os[55] = "android";os[56] = "android";os[57] = "android";os[58] = "android";
			os[59] = "blackberry";os[60] = "android";

		//proses pencarian data
		int i;
		for (i=0; i!=jml;i++){
			System.out.println(i+". Nama : "+nama[i]);
			System.out.println("    OS : "+os[i]);
			System.out.println("=================================");
			if ( os[i].equalsIgnoreCase("blackberry"))
			{
				bb += 1; 
			}
			else if (os[i].equalsIgnoreCase("android")){
				andro += 1;
			}
			else if (os[i].equalsIgnoreCase("windows")){
				win+= 1;
			}
			else if (os[i].equalsIgnoreCase("ios")){
				ios+=1;
			}
		}
		System.out.println("=================================");
		System.out.println("Yang memakai Android sebanyak : "+andro);
		System.out.println("Yang memakai Blackberry sebanyak : "+bb);
		System.out.println("Yang memakai Windows Phone sebanyak : "+win);
		System.out.println("Yang memakai IOS sebanyak : "+ios);
		
		
		}
}
