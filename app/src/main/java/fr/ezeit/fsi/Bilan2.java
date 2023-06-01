package fr.ezeit.fsi;



public class Bilan2 {
    private int id_bil;
    private String dat_bil;
    private String not_bil;
    private String not_oral_bil;
    private String remarque;
    private int id_etu;

    public Bilan2(int id_bil, String dat_bil, String not_bil, String not_oral_bil, String remarque, int id_etu) {
        this.id_bil = id_bil;
        this.dat_bil = dat_bil;
        this.not_bil = not_bil;
        this.not_oral_bil = not_oral_bil;
        this.remarque = remarque;
        this.id_etu = id_etu;
    }

    public Bilan2() {

    }

    public int getId_bil() {
        return id_bil;
    }

    public void setId_bil(int id_bil) {
        this.id_bil = id_bil;
    }

    public String getDat_bil() {
        return dat_bil;
    }

    public void setDat_bil(String dat_bil) {
        this.dat_bil = dat_bil;
    }

    public String getNot_bil() {
        return not_bil;
    }

    public void setNot_bil(String not_bil) {
        this.not_bil = not_bil;
    }

    public String getNot_oral_bil() {
        return not_oral_bil;
    }

    public void setNot_oral_bil(String not_oral_bil) {
        this.not_oral_bil = not_oral_bil;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public int getId_etu() {
        return id_etu;
    }

    public void setId_etu(int id_etu) {
        this.id_etu = id_etu;
    }
}
