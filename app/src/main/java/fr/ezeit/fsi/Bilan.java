package fr.ezeit.fsi;

public class Bilan {
    private int id_bil;
    private String dat_bil;
    private String not_ent_bil;
    private String not_oral_bil;
    private String remarque;
    private String not_dos_bil;
    private int id_etu;

    public Bilan(int id_bil, String dat_bil, String not_ent_bil, String not_oral_bil, String remarque, String not_dos_bil, int id_etu) {
        this.id_bil = id_bil;
        this.dat_bil = dat_bil;
        this.not_ent_bil = not_ent_bil;
        this.not_oral_bil = not_oral_bil;
        this.remarque = remarque;
        this.not_dos_bil = not_dos_bil;
        this.id_etu = id_etu;
    }

    public Bilan() {

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

    public String getNot_ent_bil() {
        return not_ent_bil;
    }

    public void setNot_ent_bil(String not_ent_bil) {
        this.not_ent_bil = not_ent_bil;
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

    public String getNot_dos_bil() {
        return not_dos_bil;
    }

    public void setNot_dos_bil(String not_dos_bil) {
        this.not_dos_bil = not_dos_bil;
    }

    public int getId_etu() {
        return id_etu;
    }

    public void setId_etu(int id_etu) {
        this.id_etu = id_etu;
    }
}
