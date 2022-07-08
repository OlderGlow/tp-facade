package org.example.bo;

public class MachineAPopcorn extends Appareils{
    @Override
    public void marche() {
        System.out.println("Machine à popcorn en marche");
    }

    @Override
    public void arret() {
        System.out.println("Machine à popcorn arrêté");
    }

    public void eclater() {
        System.out.println("Popcorn éclaté");
    }
}
