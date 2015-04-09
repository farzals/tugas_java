public class surveiOS2 {

public static void main (String []args)  {
	
		//Inisialisasi Variabel
		String data[][] ={{"Fahrizal","blackberry"},{"Komang","ios"},{"Al Arif","android"},{"Nur Rahman","android"},
							{"Naufal","android"},{"Tedi","android"},{"Diki","android"},{"yanuar","android"},{"iqbal","android"},
							{"Harits","android"},{"Dimas","android"},{"Rinda","android"},{"Ayu","android"},{"Zidan","android"},
							{"Rendy","android"},{"Reza","android"},{"Wildan","android"},{"Elka","android"},{"Fandi","android"},
							{"Fahmi","android"},{"Rendra","android"},{"Selly","android"},{"Ardha","blackberry"},{"Jumardi","android"},
							{"Tolop","android"},{"Kolis","blackberry"},{"Elda","android"},{"Alifan","android"},
							{"Ginseng","android"},{"Joko","android"},{"Fatkur","windows"},{"Firman","ios"},{"Irsa","android"},
							{"Arizky","android"},{"Tian","android"},{"Fajar","blackberry"},{"Yuyun","android"},{"Badruz","android"},
							{"Chakim","android"},{"Lani","android"},{"Bagus","android"},{"Riva","android"},{"Dian","android"},{"Bagas","android"},
							{"Lucky","android"},{"Nabil","android"},{"Subli","android"},{"Devita","android"},{"Sunar","blackberry"},{"Bimo","android"},
							{"Nestya","android"},{"Septian","android"},
							{"Aldino","android"},{"Roup","android"},{"Bayu","android"},{"Putri","android"},{"Siti","android"},{"Ghivari","android"},
							{"Deny","android"},{"Sony","android"},{"Bella","android"}};
		int andro = 0;
		int bb = 0;
		int win = 0;
		int ios = 0;

		System.out.println("====================================");
		System.out.println("          Hasil Data Survei         ");
		System.out.println(" Sistem Operasi yg banyak digunakan ");
		System.out.println("====================================");
		
		//proses pencarian data
		int i;
		for (i=0; i!=data.length;i++){
			System.out.println(i+". Nama : "+data[i][0]);
			System.out.println("    OS : "+data[i][1]);
			System.out.println("=================================");
			if ( data[i][1].equalsIgnoreCase("blackberry"))
			{
				bb += 1; 
			}
			else if (data[i][1].equalsIgnoreCase("android")){
				andro += 1;
			}
			else if (data[i][1].equalsIgnoreCase("windows")){
				win+= 1;
			}
			else if (data[i][1].equalsIgnoreCase("ios")){
				ios+=1;
			}
		}
		//Output
		System.out.println("=================================");
		System.out.println("Yang memakai Android sebanyak : "+andro);
		System.out.println("Yang memakai Blackberry sebanyak : "+bb);
		System.out.println("Yang memakai Windows Phone sebanyak : "+win);
		System.out.println("Yang memakai IOS sebanyak : "+ios);
		
		
		}
}
