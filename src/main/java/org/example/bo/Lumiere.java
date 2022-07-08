package org.example.bo;

public class Lumiere extends Appareils{
    @Override
    public void marche() {
        System.out.println("Lumiere en marche");
    }

    @Override
    public void arret() {
        System.out.println("Lumière éteinte");
    }

    public void attenuer(int attenuation) {
        System.out.println("La lumière est attenuée : " + attenuation);
    }
}
