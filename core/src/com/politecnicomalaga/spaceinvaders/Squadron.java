package com.politecnicomalaga.spaceinvaders;

import java.util.ArrayList;

public class Squadron {

    private ArrayList<EnemyShip> mySquadron = new ArrayList<>();

    Squadron(int cols, int rows) {

        float x = 60f;
        float y = 350f;

        for (int i = 0; i < rows;i++) {



            for (int I = 0; I < cols; I++) {

                mySquadron.add(new EnemyShip(x,y));
                x = x + 100f;

            }

            x = 60f;
            y = y - 100f;

        }

    }

    public ArrayList<EnemyShip> getShips(){

    return mySquadron;

    }

}
