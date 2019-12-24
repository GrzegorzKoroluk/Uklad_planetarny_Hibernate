import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DaneOUkladzieSlonecznym {
    @Id
    @Column(name="ID")
    private int A_Id;
    @Column(name="Nazwa")
    private String B_nazwa;
    @Column(name="Srednica")
    private int C_srednica;
    @Column(name="Gestosc")
    private double D_gestosc;
    @Column(name="Odleglosc")
    private double E_odleglosc;
    @Column(name="Masa")
    private double F_masa;
    @Column(name="Okres_Obiegu")
    private double G_okresObiegu;

    private static final double stalaGrawitacji = (6.674 * Math.pow(10, -11));

    public static double getStalaGrawitacji() { return stalaGrawitacji; }

    public int getA_Id() {
        return A_Id;
    }

    public void setA_Id(int a_Id) {
        A_Id = a_Id;
    }

    public String getB_nazwa() {
        return B_nazwa;
    }

    public void setB_nazwa(String b_nazwa) {
        B_nazwa = b_nazwa;
    }

    public int getC_srednica() { return C_srednica; }

    public void setC_srednica(int c_srednica) {
        C_srednica = c_srednica;
    }

    public double getD_gestosc() {
        return D_gestosc;
    }

    public void setD_gestosc(double d_gestosc) {
        D_gestosc = d_gestosc;
    }

    public double getE_odleglosc() {
        return E_odleglosc;
    }

    public void setE_odleglosc(double e_odleglosc) {
        E_odleglosc = e_odleglosc;
    }

    public double getF_masa() { return F_masa; }

    public void setF_masa(double f_masa) { F_masa = f_masa; }

    public double getG_okresObiegu() { return G_okresObiegu; }

    public double setG_okresObiegu(double g_okresObiegu) {
        G_okresObiegu = g_okresObiegu;
        return g_okresObiegu;
    }
}