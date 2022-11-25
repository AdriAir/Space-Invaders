    package com.politecnicomalaga.spaceinvaders;

    import com.badlogic.gdx.Gdx;
    import com.badlogic.gdx.Input;
    import com.badlogic.gdx.graphics.Texture;
    import com.badlogic.gdx.graphics.g2d.SpriteBatch;

        //ATRIBUTOS
    public class FriendlyShip {

        //ESTADO
        private float x;
        private float y;
        private Texture img;

        private float speedX;
        private float speedY;

        private float direccion;
        //Constructor
        public FriendlyShip(){
            img = new Texture("nave.png");
            x = 0.9f + (Gdx.graphics.getWidth() / 2) - (img.getWidth() / 2);
            y = 0f;
            speedX = 2.0f;
            speedY = 0.5f;
            direccion = speedX;
        }

        //RESTO DE MÉTODO
        //Movimientos
        public void moverse() {

            if (Gdx.input.justTouched()) {
                //OBTENER X donde se toca
                float posPulsadaX = Gdx.input.getX();

                if (posPulsadaX <= Gdx.graphics.getWidth() / 2) {//Si la posicion cuando pulsen es <= a la mitad del ancho de gráfico....
                    direccion = speedX; //para un lado
                } else if (posPulsadaX >= Gdx.graphics.getWidth() / 2) {
                    direccion = -speedX; //para otro
                }
            }
            if(Gdx.input.isKeyPressed(Input.Keys.LEFT) ){
                direccion = -speedX; //para un lado
            }
            if(Gdx.input.isKeyPressed(Input.Keys.RIGHT) ){
                direccion = speedX; //para un lado
            }

            if (x >= Gdx.graphics.getWidth() - 100) {
                direccion = -speedX;
            } else if (x <= 0) {
                direccion = speedX;
            }

            x = x + direccion;


        }
        //dibujarse
        public void draw(SpriteBatch batch){
            batch.draw(img, x, y, 100, 100);
        }

        //disposar
        public void dispose() {
            if (img != null) {
                img.dispose();
            }
        }

    }