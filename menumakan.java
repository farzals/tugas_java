
/*@author Fahrizal
*/
import java.io.*;

public class menumakan{

    public static void main(String[] args) throws IOException {
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try{

           String pilih = " ";

           do{
		   System.out.println("=========================");
           System.out.println("======Menu Makanan=======");
           System.out.println("=========================");
           System.out.println("1. Mie Ayam = 5000");
           System.out.println("2. Bakso Kepala Ayam = 7000");
           System.out.println("3. Bubur Ayam = 4000");
           System.out.println("4. Sate Kambing = 10000");
		   System.out.println("=========================");

           System.out.print("Pilih Menu :");

           int menu = Integer.parseInt(in.readLine());
           switch (menu){
            case 1 : System.out.println("Anda Memilih Mie Ayam");
                     System.out.println("Berapa Porsi ? ");
                     int jmlh1 = Integer.parseInt(in.readLine());
                     int total = jmlh1 * 5000;
                     System.out.println("Total Harga Rp." + total);
                     break;
            case 2 : System.out.println("Anda Memilih Bakso Kepala Ayam");
                     System.out.println("Berapa Porsi ? ");
                     jmlh1 = Integer.parseInt(in.readLine());
                     total = jmlh1 * 7000;
                     System.out.println("Total Harga Rp." + total);
                     break;
            case 3 : System.out.println("Anda Memilih Bubur Ayam");
                     System.out.println("Berapa Porsi ?");
                     jmlh1 = Integer.parseInt(in.readLine());
                     total = jmlh1 * 4000;
                     System.out.println("Total Harga Rp." + total);
                     break;
			case 4 : System.out.println("Anda Memilih Sate kambing");
                     System.out.println("Berapa Porsi ?");
                     jmlh1 = Integer.parseInt(in.readLine());
                     total = jmlh1 * 10000;
                     System.out.println("Total Harga Rp." +total);
                     break;
            default : System.out.println("Maaf Menu Tidak Terdaftar pada Pilihan !");
        }

            System.out.println("Pesan Lagi ?");
            System.out.println("Tekan 'Y' untuk Ya dan 'N' untuk Tidak");


            pilih = in.readLine();

                }
           while (pilih.equals("y") || pilih.equals("Y"));
            }

        catch (Exception e){
            System.out.println("Maaf inputan anda salah");
        }
    }
}
