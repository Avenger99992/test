public class Fight {

    static Army fight (Army un1, Army un2) {
        un1.hp = un1.hp - un2.damage;
        return un1;
    }
}
