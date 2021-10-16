import java.util.Random;

public class Player2 {

    Army[] enemyunits = new Army[5] ;


    void createArmy () {
        Random rand = new Random ( ) ;


        for (int i=0; i<5; i++)
        {
            int r = (int) (5 * rand.nextDouble());
            enemyunits [i] = Menu.menu(r);
        }



    }
}
