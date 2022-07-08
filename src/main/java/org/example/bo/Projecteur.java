package org.example.bo;

public class Projecteur extends Appareils{

    private String entree;
    private LecteurDVD lecteurDVD;

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    @Override
    public void marche() {
        System.out.println("Projecteur en marche");
    }

    @Override
    public void arret() {
        System.out.println("Projecteur arrêté");
    }

    public void modeTV() {
        System.out.println("Projecteur en mode TV");
    }

    public void modeGrandEcran() {
        System.out.println("Projecteur en mode grand écran");
    }
}
