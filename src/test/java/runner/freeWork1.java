package runner;

import java.util.Scanner;

public class freeWork1 {
    public static void main(String[] args) {
        String telefon, ulkeKodu, formatliTelefon="", telYedek="";
        int a=1;

        Scanner scan=new Scanner(System.in);
        //System.out.println("Lutfen ulke kodunu giriniz:");
        //ulkeKodu=scan.next();


        //System.out.println("Lutfen telefon nosu giriniz:");
        telefon="0458459355";
        StringBuffer sb=new StringBuffer(telefon);
        if (telefon.length()%3==0){
            for (int i = 0; i < telefon.length()-2; i++) {
                formatliTelefon=formatliTelefon+telefon.substring(i,i+3)+".";
                i=i+2;

            }
        } else if (telefon.length()%2==0) {
            for (int i = 0; i < telefon.length()-1; i++) {
                formatliTelefon=formatliTelefon+telefon.substring(i,i+2)+".";
                i=i+1;

            }

            a=2;
        } else if (telefon.length()%7==0) {
            a=7;
        }


        System.out.println(formatliTelefon);





    }
}
