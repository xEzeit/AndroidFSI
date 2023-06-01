package fr.ezeit.fsi;

import java.util.ArrayList;

public class Etudiant {
    private int id_etu;
    private String nom_etu;
    private String pre_etu;
    private String tel_etu;
    private String mail_etu;
    private String spe_etu;
    private String classe_etu;
    private String autres_etu;
    private String log_etu;
    private String mdp_etu;

    public int getId_etu() {
        return id_etu;
    }

    public void setId_etu(int id_etu) {
        this.id_etu = id_etu;
    }

    public String getNom_etu() {
        return nom_etu;
    }

    public void setNom_etu(String nom_etu) {
        this.nom_etu = nom_etu;
    }

    public String getPre_etu() {
        return pre_etu;
    }

    public void setPre_etu(String pre_etu) {
        this.pre_etu = pre_etu;
    }

    public String getTel_etu() {
        return tel_etu;
    }

    public void setTel_etu(String tel_etu) {
        this.tel_etu = tel_etu;
    }

    public String getMail_etu() {
        return mail_etu;
    }

    public void setMail_etu(String mail_etu) {
        this.mail_etu = mail_etu;
    }

    public String getSpe_etu() {
        return spe_etu;
    }

    public void setSpe_etu(String spe_etu) {
        this.spe_etu = spe_etu;
    }

    public String getClasse_etu() {
        return classe_etu;
    }

    public void setClasse_etu(String classe_etu) {
        this.classe_etu = classe_etu;
    }

    public String getAutres_etu() {
        return autres_etu;
    }

    public void setAutres_etu(String autres_etu) {
        this.autres_etu = autres_etu;
    }

    public String getLog_etu() {
        return log_etu;
    }

    public void setLog_etu(String log_etu) {
        this.log_etu = log_etu;
    }

    public String getMdp_etu() {
        return mdp_etu;
    }

    public void setMdp_etu(String mdp_etu) {
        this.mdp_etu = mdp_etu;
    }


    public Etudiant(int id_etu, String nom_etu, String pre_etu, String tel_etu, String mail_etu, String spe_etu, String classe_etu, String autres_etu, String log_etu, String mdp_etu, ArrayList<Bilan> bilan_1) {
        this.id_etu = id_etu;
        this.nom_etu = nom_etu;
        this.pre_etu = pre_etu;
        this.tel_etu = tel_etu;
        this.mail_etu = mail_etu;
        this.spe_etu = spe_etu;
        this.classe_etu = classe_etu;
        this.autres_etu = autres_etu;
        this.log_etu = log_etu;
        this.mdp_etu = mdp_etu;
    }
}