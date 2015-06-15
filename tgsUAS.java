/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Farzals
 */
import java.util.*;
import java.util.Scanner;

public class tgsUAS {
    
    public static void garis(){
        System.out.println("===============================");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        
        //Deklarasi Tabel Barang
        Vector namaBarang = new Vector();
        Vector idBarang = new Vector();
        Vector hargaBarang = new Vector();
        Vector stokBarang = new Vector ();

        //Deklarasi Tabel Pelanggan
        Vector idCustomer = new Vector();
        Vector namaCustomer = new Vector();
        Vector NoTelp = new Vector();

        //Deklarasi Tabel Faktur
        Vector nomorfaktur = new Vector();
        Vector namafaktur = new Vector();
        Vector totalfaktur = new Vector();
       
    //Deklarasi Tabel Penjualan
        Vector idBarangpenjualan = new Vector();
        Vector namaBarangpenjualan = new Vector();
        Vector hargaBarangpenjualan = new Vector();
        Vector banyakPenjualanBarang = new Vector();
        Vector fakturPenjualanBarang = new Vector();
        Vector totalHargaPenjualan = new Vector();
        
        idCustomer.add("A001");
        namaCustomer.add("Komang");
        NoTelp.add("08813254456");
        idCustomer.add("A002");
        namaCustomer.add("Bagus");
        NoTelp.add("08103403435");
        idCustomer.add("A003");
        namaCustomer.add("Rahman");
        NoTelp.add("08978454321");
        idCustomer.add("A004");
        namaCustomer.add("Fakhrizal");
        NoTelp.add("08985655321");
        idCustomer.add("A005");
        namaCustomer.add("Irfandi");
        NoTelp.add("08987787878");
        
        idBarang.add("B001");
        namaBarang.add("Buku Tulis");
        hargaBarang.add("3000");
        stokBarang.add("100");
        idBarang.add("B002");
        namaBarang.add("Pensil 2B");
        hargaBarang.add("2500");
        stokBarang.add("250");
        idBarang.add("B003");
        namaBarang.add("Bulpen Standart");
        hargaBarang.add("3000");
        stokBarang.add("300");
        idBarang.add("B004");
        namaBarang.add("Penggaris");
        hargaBarang.add("4000");
        stokBarang.add("50");
        idBarang.add("B005");
        namaBarang.add("Buku Gambar");
        hargaBarang.add("2500");
        stokBarang.add("50");
       
        
        int pilih=0;
        int pilih1=0;
        int pilih11=0;
        int pilih12=0;
                
        do {
            garis();
            System.out.println("      TOKO ALAT TULIS    ");
            System.out.println("         SURABAYA        ");
            garis();
            System.out.println("1. Login");
            System.out.println("2. Stok Barang");
            System.out.println("3. Pelanggan");
            System.out.println("4. Exit");
            System.out.print("Masukkan pilihan : ");
            pilih=Integer.parseInt(in.nextLine());
           
            switch (pilih) {
                case 1 :
                    System.out.print("Masukkan ID : ");
                    String id = in.nextLine();
                    System.out.print("Masukkan Password :");
                    String password = in.nextLine();
                    if (id.equalsIgnoreCase("admin") && password.equalsIgnoreCase("1234"))
                    {
                        do {
                    garis();
                    System.out.println("     Maintenance Barang   ");
                    garis();
                    String pili;
                    System.out.println("1. Insert Data");
                    System.out.println("2. Update");
                    System.out.println("3. Delete");
                    System.out.println("4. Transaksi");
                    System.out.println("5. Back to menu");
                    System.out.print("Masukkan pilihan : ");
                    pilih1=Integer.parseInt(in.nextLine());
                    switch (pilih1){
                        case 1 :
                            
                            garis();
                            System.out.println("     Insert Database      ");
                            garis();
                            System.out.println("1. Tabel Barang");
                            System.out.println("2. Tabel Pelanggan");
                            System.out.println("3. Back to Menu");
                            System.out.print("Masukkan pilihan (1-3): ");
                            pilih1=Integer.parseInt(in.nextLine());
                            switch (pilih1){
                                case 1 :
                                    garis();
                                    System.out.println("      Tambah Barang       ");
                                    garis();
                                    do {
                                    System.out.print("Kode Barang : ");
                                    idBarang.add(in.nextLine());
                                    System.out.print("Nama Barang : ");
                                    namaBarang.add(in.nextLine());       
                                    System.out.print("Jumlah Barang : ");
                                    stokBarang.add(in.nextLine());
                                    System.out.print("Harga (Rp.): ");
                                    hargaBarang.add(in.nextLine()); System.out.println();
                                    System.out.print("input lagi ? (Y/T) :");
                                    pili=in.nextLine();
                                    } while (pili.equalsIgnoreCase("y"));
                                    break;
                                case 2:
                                    garis();
                                    System.out.println("   Insert Data Pelanggan  ");
                                    garis();
                                    do {
                                    System.out.print("Kode Pelanggan : ");
                                    idCustomer.add(in.nextLine());
                                    System.out.print("Nama Pelanggan : ");
                                    namaCustomer.add(in.nextLine());       
                                    System.out.print("Nomer Pelanggan : ");
                                    NoTelp.add(in.nextLine()); System.out.println();
                                    System.out.print("Apakah Anda menginputkan lagi ? (Y/T) :");
                                    pili=in.nextLine();
                                    } while (pili.equalsIgnoreCase("y"));
                                    break;
                                    
                            } 
                            break;
                            
                        case 2 :
                            garis();
                            System.out.println("     Update Database      ");
                            garis();
                            System.out.println("1. Tabel Barang");
                            System.out.println("2. Tabel Pelanggan");
                            System.out.println("3. Back to Menu");
                            System.out.print("Masukkan pilihan (1-3): ");
                            pilih1=Integer.parseInt(in.nextLine());
                            switch (pilih1){
                                case 1 :
                                    garis();
                                    System.out.println("     Update Tabel Barang  ");
                                    garis();
                                    String pil32;
                                    do {
                                    System.out.print("Kode Barang : ");
                                    String  tmp = in.nextLine();
                                    System.out.print("Stok Barang Saat ini : ");
                                    stokBarang.removeElementAt(idBarang.indexOf(tmp));
                                    stokBarang.insertElementAt(in.nextLine(), idBarang.indexOf(tmp));
                                    System.out.print("Apakah Anda ingin mengulaingi lagi? (Y/T) : ");
                                    pil32=in.nextLine();
                                    }while(pil32.equalsIgnoreCase("y"));
                                    break;
                                case 2 :
                                    garis();
                                    System.out.println("   Update Tabel Pelanggan ");
                                    garis();
                                    String pil33;
                                    do {
                                    System.out.print("Kode Pelanggan : ");
                                    String  tmp = in.nextLine();
                                    System.out.print("Nomer pelanggan : ");
                                    NoTelp.removeElementAt(idCustomer.indexOf(tmp));
                                    NoTelp.insertElementAt(in.nextLine(), idCustomer.indexOf(tmp));
                                    System.out.print("Ulangi lagi? (Y/T) : ");
                                    pil33=in.nextLine();
                                    }while(pil33.equalsIgnoreCase("y"));
                                    break;
                            }
                            break;
                        case 3 : 
                            garis();
                            System.out.println("     Delete Database      ");
                            garis();
                            System.out.println("1. Tabel Barang");
                            System.out.println("2. Tabel Pelanggan");
                            System.out.println("3. Back to Menu");
                            System.out.print("Masukkan pilihan : ");
                            pilih1=Integer.parseInt(in.nextLine());
                            switch (pilih1){
                                case 1:
                                    garis();
                                    System.out.println("    Hapus Data Barang     ");
                                    garis();
                                    String pilh;
                                    int ada = 1;
                                    do {
                                        System.out.print("Kode Barang yang dihapus : ");
                                        String code =in.nextLine();
                        
                                        for (int x=0;x<idBarang.size();x++) {
                                            if (idBarang.elementAt(x).toString().equalsIgnoreCase(code+"")) {
                                                ada = 1;
                                            break;
                                            } else {
                                            ada = 0;
                                            }
                                                   }
                                        if (ada == 1) {
                                        namaBarang.removeElementAt(idBarang.indexOf(code));
                                        hargaBarang.removeElementAt(idBarang.indexOf(code));
                                        stokBarang.removeElementAt(idBarang.indexOf(code));
                                        idBarang.removeElementAt(idBarang.indexOf(code));
                                        System.out.println("Data Barang berhasil dihapus");
                                        } else { System.out.println("Maaf Kode Barang tidak ditemukan"); }
                                    System.out.print("Ulangi lagi? (Y/T) : ");
                                    pilh=in.nextLine();
                                    }while(pilh.equalsIgnoreCase("y"));
                                    break;
                                case 2 :
                                    garis();
                                    System.out.println("    Hapus Data Pelanggan  ");
                                    garis();
                                    String pilhp;
                                    int adap = 1;
                                    do {
                                        System.out.print("Kode pelanggan yang dihapus : ");
                                        String idp =in.nextLine();
                        
                                        for (int x=0;x<idCustomer.size();x++) {
                                            if (idCustomer.elementAt(x).toString().equalsIgnoreCase(idp+"")) {
                                                adap = 1;
                                            break;
                                            } else {
                                            adap = 0;
                                            }
                                                   }
                                        if (adap == 1) {
                                        namaCustomer.removeElementAt(idCustomer.indexOf(idp));
                                        NoTelp.removeElementAt(idCustomer.indexOf(idp));
                                        idCustomer.removeElementAt(idCustomer.indexOf(idp));
                                        System.out.println("Data Pelanggan berhasil dihapus");
                                        } else { System.out.println("Data pelanggan tidak ditemukan"); }
                                    System.out.print("Ulangi lagi? (Y/T) : ");
                                    pilhp=in.nextLine();
                                    }while(pilhp.equalsIgnoreCase("y"));
                                    break;
                                    
                            }
                            break;
                        case 4 :
                                    do {
                                    garis();
                                    System.out.println("        Transaksi         ");
                                    garis();
                                    System.out.println("1. Kasir");
                                    System.out.println("2. Laporan penjualan");
                                    System.out.println("3. Faktur Penjualan");
                                    System.out.println("4. Back");
                                    System.out.print("Masukkan pilihan (1-4): ");
                                    pilih12=Integer.parseInt(in.nextLine());
                                    switch (pilih12) {
                                        case 1 :
                                            garis();
                                            System.out.println("        Program Kasir     ");
                                            garis();
                                            String pil33;
                                            
                                            int tot=0;
                                            int totharga [] = new int [20];
                                            String codp="";
                                            String cod [] = new String[20];
                                            int jml []= new int [20];
                                            do {
                                                int faktur=nomorfaktur.size()+1;
                                                tot=0;
                                                System.out.println();
                                            System.out.print("Masukkan banyak kategori Barang : ");
                                            int n = Integer.parseInt(in.nextLine());
                                                System.out.print("Masukkan kode Pelangan : ");
                                                codp=in.nextLine();    
                                                
                                                for (int x=0;x<n;x++) {
                                                    
                                                    System.out.print("Masukkan Kode Barang : ");
                                                    cod[x] = in.nextLine();
                                                    System.out.print("Masukkan jumlah Barang : ");
                                                    jml[x] = Integer.parseInt(in.nextLine());
                                                    totharga[x] = jml[x]*Integer.parseInt(hargaBarang.elementAt(idBarang.indexOf(cod[x])).toString());
                                                    tot+=totharga[x];
                                                        //Untuk mengurangi Stok Barang
                                                        int totalskrng = Integer.parseInt(stokBarang.elementAt(idBarang.indexOf(cod[x])).toString())-jml[x];
                                                        stokBarang.removeElementAt(idBarang.indexOf(cod[x]));
                                                        stokBarang.insertElementAt(totalskrng, idBarang.indexOf(cod[x]));
                                                    
                                                        //Untuk Record Tabel penjualan
                                                        idBarangpenjualan.add(cod[x]);
                                                        namaBarangpenjualan.add(namaBarang.elementAt(idBarang.indexOf(cod[x])));
                                                        hargaBarangpenjualan.add(hargaBarang.elementAt(idBarang.indexOf(cod[x])));
                                                        banyakPenjualanBarang.add(jml[x]);
                                                        fakturPenjualanBarang.add(faktur);
                                                        totalHargaPenjualan.add(totharga[x]);
                                                        
                                                    System.out.println();
                                                }
                                                System.out.println("Nama Pelanggan : "+namaCustomer.elementAt(idCustomer.indexOf(codp)));
                                                System.out.println("Nama Barang \t\tBanyak \t\tHarga \t\tTotal");
                                                for (int x=0;x<n;x++) {
                                                System.out.println(namaBarang.elementAt(idBarang.indexOf(cod[x]))+" \t\t"+jml[x]+" \t\t"+hargaBarang.elementAt(idBarang.indexOf(cod[x]))+" \t\t"+totharga[x]);
                                                
                                                }
                                                System.out.println("TOTAL HARGA \t\t\t\t\t\t:"+tot);
                                                    //Merecord Faktur ke Tabel Faktur
                                                    nomorfaktur.add(faktur);
                                                    namafaktur.add(namaCustomer.elementAt(idCustomer.indexOf(codp)));
                                                    totalfaktur.add(tot);
                                            System.out.print("Apakah Anda ingin mengulngi lagi? (Y/T) : ");
                                            pil33=in.nextLine();
                                            }while(pil33.equalsIgnoreCase("y"));
                                            break;
                                        case 2  :
                                            garis();
                                            System.out.println("    Laporoan penjualan");
                                            garis();
                                            System.out.println("Kode Barang \tNama Barang \t\tHarga Jual \tBanyak \t\tNo. Faktur \tJumlah Harga");
                                            for (int x=0;x<idBarangpenjualan.size();x++){
                                                System.out.println(idBarangpenjualan.elementAt(x)+" \t\t"+namaBarangpenjualan.elementAt(x)+" \t\t"+hargaBarangpenjualan.elementAt(x)+" \t\t"+banyakPenjualanBarang.elementAt(x)+" \t\t"+fakturPenjualanBarang.elementAt(x)+" \t\t"+totalHargaPenjualan.elementAt(x));
                                                }
                                            break;
                                        case 3 :
                                            garis();
                                            System.out.println("      Faktur Penjualan");
                                            garis();
                                            System.out.println("No. Faktur \t\tNama Pelanggan \t\tTotal");
                                            for (int x=0;x<nomorfaktur.size();x++) {
                                                System.out.println(nomorfaktur.elementAt(x)+" \t\t\t"+namafaktur.elementAt(x)+" \t\t\t"+totalfaktur.elementAt(x));
                                                }
                                            break;
                                    }
                                    
                                    }while(pilih12<4);
                            break;
                            
                    }
                        }while(pilih1<5);
                            }else{System.out.println("ID atau Password yang Anda masukkan salah");}
                    break;
                case 2 :
                            garis();
                            System.out.println("        Stok Barang ");
                            garis();
                            System.out.println("Kode Barang\tNama Barang\tStokBarang");
                            for (int x=0;x<idBarang.size();x++){
                                
                                System.out.println(idBarang.elementAt(x)+"\t\t"+namaBarang.elementAt(x)+"\t\t"+stokBarang.elementAt(x));
                            }
                    break;
                case 3 :
                            garis();
                            System.out.println("      Data Pelanggan");
                            garis();
                            System.out.println("Nomer \t\tNama \t\tNo. Telepon");
                            for (int x=0;x<idCustomer.size();x++) {
                                System.out.println(idCustomer.elementAt(x)+" \t\t"+namaCustomer.elementAt(x)+" \t\t"+NoTelp.elementAt(x));
                            }
                    break;
                case 4 : System.exit(0);
                    break;
                    
            }    
            
        }while(pilih<4);
    }
    
}