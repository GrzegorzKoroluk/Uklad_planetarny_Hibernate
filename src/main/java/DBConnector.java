import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnector {

    public static void main(String[] args) {

        ObliczeniaUkladu slonceObliczone = new ObliczeniaUkladu();
        ObliczeniaUkladu merkuryObliczony = new ObliczeniaUkladu();
        ObliczeniaUkladu wenusObliczona = new ObliczeniaUkladu();
        ObliczeniaUkladu ziemiaObliczona = new ObliczeniaUkladu();
        ObliczeniaUkladu marsObliczony = new ObliczeniaUkladu();
        ObliczeniaUkladu jowiszObliczony = new ObliczeniaUkladu();
        ObliczeniaUkladu saturnObliczony = new ObliczeniaUkladu();
        ObliczeniaUkladu uranObliczony = new ObliczeniaUkladu();
        ObliczeniaUkladu neptunObliczony = new ObliczeniaUkladu();


        DaneOUkladzieSlonecznym slonce = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym merkury = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym wenus = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym ziemia = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym mars = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym jowisz = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym saturn = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym uran = new DaneOUkladzieSlonecznym();
        DaneOUkladzieSlonecznym neptun = new DaneOUkladzieSlonecznym();


        slonce.setA_Id(1);
        slonce.setB_nazwa("Slonce");
        slonce.setC_srednica(1392000);
        slonce.setD_gestosc(1.41);
        slonce.setE_odleglosc(0);
        slonce.setF_masa(slonceObliczone.masaObiektu(slonce.getC_srednica(), slonce.getD_gestosc()));

        merkury.setA_Id(2);
        merkury.setB_nazwa("Merkury");
        merkury.setC_srednica(4878);
        merkury.setD_gestosc(5.43);
        merkury.setE_odleglosc(59.9);
        merkury.setF_masa(merkuryObliczony.masaObiektu(merkury.getC_srednica(), merkury.getD_gestosc()));

        wenus.setA_Id(3);
        wenus.setB_nazwa("Wenus");
        wenus.setC_srednica(12104);
        wenus.setD_gestosc(5.24);
        wenus.setE_odleglosc(108.2);
        wenus.setF_masa(wenusObliczona.masaObiektu(wenus.getC_srednica(), wenus.getD_gestosc()));

        ziemia.setA_Id(4);
        ziemia.setB_nazwa("Ziemia");
        ziemia.setC_srednica(12752);
        ziemia.setD_gestosc(5.52);
        ziemia.setE_odleglosc(149.6);
        ziemia.setF_masa(ziemiaObliczona.masaObiektu(ziemia.getC_srednica(), ziemia.getD_gestosc()));

        mars.setA_Id(5);
        mars.setB_nazwa("Mars");
        mars.setC_srednica(6788);
        mars.setD_gestosc(3.94);
        mars.setE_odleglosc(227.9);
        mars.setF_masa(marsObliczony.masaObiektu(mars.getC_srednica(), mars.getD_gestosc()));

        jowisz.setA_Id(6);
        jowisz.setB_nazwa("Jowisz");
        jowisz.setC_srednica(142800);
        jowisz.setD_gestosc(1.32);
        jowisz.setE_odleglosc(778.3);
        jowisz.setF_masa(jowiszObliczony.masaObiektu(jowisz.getC_srednica(), jowisz.getD_gestosc()));

        saturn.setA_Id(7);
        saturn.setB_nazwa("Saturn");
        saturn.setC_srednica(120660);
        saturn.setD_gestosc(0.7);
        saturn.setE_odleglosc(1427);
        saturn.setF_masa(saturnObliczony.masaObiektu(saturn.getC_srednica(), saturn.getD_gestosc()));

        uran.setA_Id(8);
        uran.setB_nazwa("Uran");
        uran.setC_srednica(51108);
        uran.setD_gestosc(1.27);
        uran.setE_odleglosc(2870);
        uran.setF_masa(uranObliczony.masaObiektu(uran.getC_srednica(), uran.getD_gestosc()));

        neptun.setA_Id(9);
        neptun.setB_nazwa("Neptun");
        neptun.setC_srednica(49530);
        neptun.setD_gestosc(1.77);
        neptun.setE_odleglosc(4497);
        neptun.setF_masa(neptunObliczony.masaObiektu(neptun.getC_srednica(), neptun.getD_gestosc()));

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        session.save(slonce);
        session.save(merkury);
        session.save(wenus);
        session.save(ziemia);
        session.save(mars);
        session.save(jowisz);
        session.save(saturn);
        session.save(uran);
        session.save(neptun);

        session.getTransaction().commit();
        session.close();

        DaneOUkladzieSlonecznym danePobraneZBazy = null;
        session = sessionFactory.openSession();
        session.beginTransaction();
        danePobraneZBazy = session.get(DaneOUkladzieSlonecznym.class, 1);
        double pobierzMaseSlonca = danePobraneZBazy.getF_masa();

        merkury.setG_okresObiegu(merkuryObliczony.obliczenieOkresObiegu(merkury.getE_odleglosc(), pobierzMaseSlonca));
        wenus.setG_okresObiegu(wenusObliczona.obliczenieOkresObiegu(wenus.getE_odleglosc(), pobierzMaseSlonca));
        ziemia.setG_okresObiegu(ziemiaObliczona.obliczenieOkresObiegu(ziemia.getE_odleglosc(), pobierzMaseSlonca));
        mars.setG_okresObiegu(marsObliczony.obliczenieOkresObiegu(mars.getE_odleglosc(), pobierzMaseSlonca));
        jowisz.setG_okresObiegu(jowiszObliczony.obliczenieOkresObiegu(jowisz.getE_odleglosc(), pobierzMaseSlonca));
        saturn.setG_okresObiegu(saturnObliczony.obliczenieOkresObiegu(saturn.getE_odleglosc(), pobierzMaseSlonca));
        uran.setG_okresObiegu(uranObliczony.obliczenieOkresObiegu(uran.getE_odleglosc(), pobierzMaseSlonca));
        neptun.setG_okresObiegu(neptunObliczony.obliczenieOkresObiegu(neptun.getE_odleglosc(), pobierzMaseSlonca));

        session.update(merkury);
        session.update(wenus);
        session.update(ziemia);
        session.update(mars);
        session.update(jowisz);
        session.update(saturn);
        session.update(uran);
        session.update(neptun);

        session.getTransaction().commit();
        session.close();

    }
}