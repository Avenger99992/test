public class Player1 {

    Army[] units = new Army[5] ;

     void createArmy () {

        for (int i=0; i<5; i++)
        {
            units [i] = Menu.menu();
        }


    }
}
