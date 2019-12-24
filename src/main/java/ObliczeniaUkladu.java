import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.persistence.Entity;
import java.lang.reflect.Array;
import java.util.Scanner;

public class ObliczeniaUkladu {

    public static double masaObiektu(int srednica, double gestosc) {
        double masa = ((Math.PI * ((Math.pow(srednica, 3) * gestosc))) / 6) / 100000 / 10000000;
        return masa;
    }

    public static double obliczenieOkresObiegu (double odleglosc, double masaObiektuMacierzystego) {
        double polosDoTrzeciejPotegi = Math.pow((odleglosc * 1_000_000 * 1_000), 3);

        double okresObiegu = (2 * Math.PI * (Math.sqrt(
                (polosDoTrzeciejPotegi) / (DaneOUkladzieSlonecznym.getStalaGrawitacji() * (masaObiektuMacierzystego * Math.pow(10, 24)))
        )
        ) / (60*60*24));
        return okresObiegu;
    }


//
//    public static void wyswietlenieOkresuObiegu(int wiersz, int kolumna) {
//        System.out.println("Okres obiegu wokół Słońca wynosi: " + obliczenieOkresObiegu(wiersz, kolumna));
//    }
//
//
//    public static void obliczenieWspolrzednychNaOkregu(int wiersz, int kolumna) {
//
//        // =((((G3*1000)-L2)*COS(RADIANS((360/J3)*K3)))-((0-M2)*SIN(RADIANS((360/J3)*K3)))+L2)
//        // =((((G3*1000)-L2)*SIN(RADIANS((360/J3)*K3)))-((0-M2)*SIN(RADIANS((360/J3)*K3)))+L2)
//
//        double dziennyKatAlpha = Math.toRadians(360 / obliczenieOkresObiegu(wiersz, kolumna));
////        double wspX = (obliczenieOkresObiegu(wiersz, kolumna) * 1000) * Math.cos((dziennyKatAlpha * epoka))
//
//    }
//
//
//    // poprawic obliczenie masy tak zeby obliczalo mase w kilogramach, po co są te dzielenia / 100000 / 10000000 ??
//    // metoda obliczająca wspolrzedne obiektu w trakcie obiegu
//    // https://matematyka.pl/viewtopic.php?t=73118
//
//
//
//
//    public static void main(String[] args) {
//
////        System.out.println("Masa gwiazdy: ");
////        masaObiektu(0, 0);
//
//        wyswietlenieMasyObiektu(3,0);
//    }
}