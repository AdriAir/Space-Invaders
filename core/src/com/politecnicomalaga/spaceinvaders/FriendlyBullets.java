package com.politecnicomalaga.spaceinvaders;

import java.util.ArrayList;

public class FriendlyBullets {

    //ATRIBUTOS
    private ArrayList<FriendlyShot> myBullets;

    //CONSTRUCTOR
    FriendlyBullets() {
        myBullets = new ArrayList<>();
    }

    //RESTO DE METODOS
    public ArrayList<FriendlyShot> getMyBullets() {
        return myBullets;
    }

    public void newShot(){
        myBullets.add(new FriendlyShot());
    }
}
