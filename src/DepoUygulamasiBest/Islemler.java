package DepoUygulamasiBest;

import java.util.*;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/*
public class Islemler {

    static Scanner scan = new Scanner(System.in);
    public static Map<Integer, urunTanimlama> urunListesiMap = new HashMap<Integer, urunTanimlama>();
    public static int urunId = 1000;

    public static void girisPaneli(){
        System.out.println("===================================\n DEPO YONETİM PANELI\n" +
                "=========================================\n"
        + "1- BULUNDURULACAK URUN TANIMLAMA \n2- URUN LİSTELE\n3- DEPOYA URUN GİRİŞİ\n4- URUNU RAFA KOY\n5- DEPODAN URUN ÇIKIŞI\n6- DEPO SİSTEMİNDEN ÇIKIŞ\n");
        System.out.println("lütfen işlem seciniz : ");
        String secim = scan.next().toUpperCase(Locale.ROOT);
        switch (secim) {
            case "1":
            urunTanimla();
            girisPaneli();
            break;
            case "2":
                urunListele();
                girisPaneli();
                break;
            case "3":
                urunListele();
                girisPaneli();
                break;
            case "4":
                urunuRafaKoy();
                girisPaneli();
                break;
            case "5":
                urunCikisi();
                girisPaneli();
                break;
            case "6":
                cikis();
                break;
            default:
                System.out.println("hatalı giriş yaptınız, tekrar deneyiniz");
                girisPaneli();
                break;
        }
    }


    private static void urunTanimla() {
        //urunTanimlama ==> urunun ismi, ureticisi ve birimi girilecek. id alınacak.

        System.out.println(" *********** ürün tanımlama sayfası **********");
        System.out.println("ürün ismi giriniz");
        scan.nextLine(); //dummy
        String urunIsmi = scan.nextLine();

        System.out.println("üreticisini giriniz: ");
        String uretici = scan.nextLine();

        System.out.println("birimi giriniz");
        String birim = scan.next();

        int urunMiktar = 0;
        String raf = " - ";

        urunTanimlama urun = new urunTanimlama(urunIsmi, uretici, birim, urunMiktar, raf); //ürün objesi oluşturuldu
        urunListesiMap.put(urunId, urun);  //map içerisine urunId key, urunobjesi eklendi

        urunId++; //her ürün girişinde id bir artırıldı

    }


    private static void urunListele() {
//urunListele ==> tanimlanan urunler listelenecek. urunun adeti ve raf numarası tanımlama yapılmadıysa default değer görünsün.
        Set<Map.Entry <Integer, urunTanimlama>> urunEntrySeti = urunListesiMap.entrySet();
        System.out.println("--------------------------ÜRÜN LİSTESİ---------------------------");
        System.out.println("id          ismi            ureticisi           birim           miktar          raf"      +
                for (Map.Entry <Integer, urunTanimlama> e : urunEntrySeti ) {
Integer entryKey = e.getKey();
            System.out.println("%-8d %-12s %-15s %-12s %-12d %-9s \n", entryKey, urunListesiMap.get(entryKey).getUrunIsmi(), urunListesiMap.get(entryKey));

        }
    }

private static void urunGirisi() {
        //urunGirisi  ==> giris yapmak istediğimiz urunun id numarası ile gireceğiz.
    System.out.println("   ******** urun giriş sayfası ********");
    System.out.println("güncellemek istediğiniz ürün id'sini giriniz: ");
    int arananId = scan.nextInt();
    if (urunListesiMap.keySet().contains(arananId)) {
        System.out.println("miktar giriniz");
        // integer data türü dışında giriş yapılınca exception yerine döngüye girecek ve geçerli değeri yazdırmasını isteyecek
        int guncelmiktar = 0;
        boolean flag = true;
        do {
            try {
                if (flag == true) {
                    scan.nextLine();
                }
                guncelmiktar = scan.nextInt();
                scan.nextLine(); // dummy
                flag = false;
            } catch (Exception e) {
                System.out.println("lütfen geçerli miktar giris yapınız");
            }
        } while (flag);

        urunListesiMap.get(arananId).setUrunMiktar(guncelmiktar + urunListesiMap.get(arananId).getUrunMiktar());
        // aranan idmize ait ürün map'den getirildi ve eski ürün miktarına eklendi.
        System.out.println("ürün miktarınız güncel hale getirildi \n güncel miktar: " + urunListesiMap.get(arananId).getUrunMiktar());
    } else {
        System.out.println("aradığınız ürün yoktur");
        urunGirisi();
    }

private static void urunuRafaKoy() {
        // urunuRafaKoy ==> listeden urunu seçeceğiz ve id numarasına göre urunu rafa koyacağız.
        System.out.println("   ********** ürünü rafa ekleme sayfası *********** ");
        System.out.println(" Rafa yerlestirmek istediğiniz ürünün ID'sini giriniz : ");
        int arananId = scan.nextInt();
        if (urunListesiMap.keySet().contains(arananId)) {
            System.out.println("hangi rafa kaldıracağınızı yazınız :");
            String guncelraf = scan.next();

            urunListesiMap.get(arananId).setRaf(guncelraf); //eski raf değerini ezip güncel raf değerini girecek


        }






    }


}


}
*/