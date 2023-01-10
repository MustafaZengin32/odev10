package odev10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        PlakaTescil arac1 = new PlakaTescil();
        arac1.setId(1);
        arac1.setPlaka("06A10");
        arac1.setName("ab");
        arac1.setSoyIsim("cd");
        arac1.setAdres("Ankara");
        arac1.setDurum("Supheli");

        PlakaTescil arac2 = new PlakaTescil();
        arac2.setId(2);
        arac2.setPlaka("07A10");
        arac2.setName("abasd");
        arac2.setSoyIsim("cdsdaf");
        arac2.setAdres("Ankara");
        arac2.setDurum("Saglam");

        PlakaTescil arac3 = new PlakaTescil();
        arac3.setId(3);
        arac3.setPlaka("06Ab10");
        arac3.setName("ajhkb");
        arac3.setSoyIsim("cdghj");
        arac3.setAdres("Ankara");
        arac3.setDurum("Supheli");

        PlakaTescil arac4 = new PlakaTescil();
        arac4.setId(4);
        arac4.setPlaka("34AN65");
        arac4.setName("yui");
        arac4.setSoyIsim("lkjjk");
        arac4.setAdres("Istanbul");
        arac4.setDurum("Saglam");

        PlakaTescil arac5 = new PlakaTescil();
        arac5.setId(1);
        arac5.setPlaka("32A10");
        arac5.setName("anmbv");
        arac5.setSoyIsim("sdfsdg");
        arac5.setAdres("Isparta");
        arac5.setDurum("Supheli");

        List<PlakaTescil> plakaListesi = new ArrayList<>();
       plakaListesi.add(arac1);
       plakaListesi.add(arac2);
       plakaListesi.add(arac3);
       plakaListesi.add(arac4);
       plakaListesi.add(arac5);

       System.out.println("Arac plakasi giriniz : ");
       String sorguArac = scan.nextLine();


        boolean check = false;
        String status = "";
       for (PlakaTescil item: plakaListesi) {
            if (sorguArac.equals(item.getPlaka())){
                check=true;
                status = item.getDurum();
                //break koyulabilir nedenini acikla
            }

        }
       if (check == true){
           System.out.println(status);
       }else{
           System.out.println("Arac sistemde yok");
       }

    }
}


