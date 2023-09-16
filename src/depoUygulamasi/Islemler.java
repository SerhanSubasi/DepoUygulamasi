package depoUygulamasi;

import java.util.HashMap;
import java.util.Scanner;

public class Islemler {


    Scanner scan=new Scanner(System.in);

    UrunTanimlama urunTanimlama=new UrunTanimlama();

    HashMap<Integer, UrunTanimlama> urunListesi =new HashMap<>();

    public  void start() {


        int select;
        do {
            System.out.println("----DEPO UYGULAMASI----");
            System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1 Ürün tanimlama");
            System.out.println("2 Ürünü Listele");
            System.out.println("3 Ürün Girişi");
            System.out.println("4 Ürünü rafa koy");
            System.out.println("5 Ürün çıkışı");
            System.out.println("0 Çıkış");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    urunTanimlama(urunTanimlama.getUrunIsmi(), urunTanimlama.getUretici(), urunTanimlama.getBirim());
                    break;
                case 2:
                    //Ürünü Listele
                    break;
                case 3:
                    //Ürün girişi
                    break;
                case 4:
                    //Ürünü rafa koy
                    break;
                case 5:
                    //ürün Çıkışı
                    break;
                case 6:
                    //Çıkış
                    break;

                default:
                    System.out.println("Yanlış seçim yaptınız");
                    break;

            }


        } while (select != 0);
        System.out.println("Uygulamadan çıktın");


    }

    int urunIdBaslangıc=1000;

    // urunTanimlama   ==>  urunun ismi, ureticisi ve birimi girilecek. id  alınacak.
    public void urunTanimlama(String urunIsmi, String uretici,String birim) {


        int urunId = urunIdBaslangıc++;
        System.out.println("Ürün adini giriniz");
        urunIsmi = scan.next();
        System.out.println("Üretici girişi yapınız");
        uretici = scan.next();
        System.out.println("Ürünün birimini giriniz");
        birim = scan.next();
        UrunTanimlama yeniUrun = new UrunTanimlama(urunIsmi, uretici, 0, birim, null);
        urunListesi.put(urunId, yeniUrun);
        urunListele();
    }

public void urunListele() {
            System.out.println("Ürün ID \t Ürün İsmi \tÜretici\tÜrün Miktarı\tBirimi\tRaf");
    System.out.println("----------------------------------------------------------------------");

    for (Integer urunId: urunListesi.keySet()) {
        UrunTanimlama urunTanimlama = urunListesi.get(urunId);
        System.out.println(urunId +"\t"+ urunTanimlama.getUrunIsmi()+"\t"+urunTanimlama.getUretici()+"\t"+urunTanimlama.getMiktar()
                +"\t"+urunTanimlama.getRaf());

    }

        }


    }

