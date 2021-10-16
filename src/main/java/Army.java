public enum Army {

    Swordsman (500, 25, 100, 0),
    Archer (350, 15, 100, 0),
    Horseman (700, 40, 100, 0),
    Magician(800, 0, 100, 100);

    public int price, damage, hp, mana;



    Army (int price, int damage, int hp, int mana)  {
        this.price = price;
        this.damage = damage;
        this.hp = hp;
        this.mana = mana;
    }


    int getHP () {
        return hp;
    }

    int getDamage () {
        return damage;
    }

}
