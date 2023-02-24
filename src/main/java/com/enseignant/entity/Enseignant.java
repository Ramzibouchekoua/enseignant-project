package com.enseignant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ENSEIGNANT_TBL")
public class Enseignant {

    @Id
    @GeneratedValue
    private int codeEns;
    private String prenomEns;
    private String nomEns;
    private String gradeEns;
    private String adresseMailEns;
    private String dateEmbauche;

    public void setCodeEns(int codeEns) {
        this.codeEns = codeEns;
    }

    public void setPrenomEns(String prenomEns) {
        this.prenomEns = prenomEns;
    }

    public void setNomEns(String nomEns) {
        this.nomEns = nomEns;
    }

    public void setGradeEns(String gradeEns) {
        this.gradeEns = gradeEns;
    }

    public void setAdresseMailEns(String adresseMailEns) {
        this.adresseMailEns = adresseMailEns;
    }

    public void setDateEmbauche(String dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public int getCodeEns() {
        return codeEns;
    }

    public String getPrenomEns() {
        return prenomEns;
    }

    public String getNomEns() {
        return nomEns;
    }

    public String getGradeEns() {
        return gradeEns;
    }

    public String getAdresseMailEns() {
        return adresseMailEns;
    }

    public String getDateEmbauche() {
        return dateEmbauche;
    }

}
