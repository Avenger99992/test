public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1();
        Player2 player2 = new Player2();



        player1.createArmy();
        player2.createArmy();
        Battle.startBattle (player1.units , player2.enemyunits );

    }
}
