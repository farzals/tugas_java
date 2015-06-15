public class data_barang {
public static void main (String []args) {
		
		//inisialisasi variabel
		int [][] barang = {{3,0,10,3,2},{1,3,7,10,5},{10,12,3,7,6},{3,1,1,3,1}};
		int sen = 0;
		int sel = 0;
		int rab = 0;
		int kam = 0;
		int jum = 0;
		int pensil = 0;
		int bukuT = 0;
		int bukuG = 0;
		int penggaris = 0;
		int i;
		//pencarian data barang per item
		for(i=0;i!=5;i++){
			pensil=pensil+barang[0][i];
			bukuT=bukuT+barang[1][i];
			bukuG=bukuG+barang[2][i];
			penggaris=penggaris+barang[3][i];
			}
		//pencarian data barang per hari
		for(i=0;i!=4;i++){
			sen = sen+barang[i][0] ;
			sel = sel+barang[i][1] ;
			rab = rab+barang[i][2];
			kam = kam+barang[i][3];
			jum = jum+barang[i][4];
			
		}
		//Output
		System.out.println("=====================================================");
		System.out.println("Data Penjualan Pensil per minggu : "+pensil);
		System.out.println("Data Penjualan Buku Tulis per minggu : "+bukuT);
		System.out.println("Data Penjualan Buku Gambar per minggu : "+bukuG);
		System.out.println("Data Penjualan Penggaris per minggu : "+penggaris);
		System.out.println("=====================================================");
		System.out.println("Total penjualan per Hari Senin : "+sen+" item");
		System.out.println("Total penjualan per Hari Selasa : "+sel+" item");
		System.out.println("Total penjualan per Hari Rabu : "+rab+" item");
		System.out.println("Total penjualan per Hari Kamis : "+kam+" item");
		System.out.println("Total penjualan per Hari Jum'at : "+jum+" item");
	}

}