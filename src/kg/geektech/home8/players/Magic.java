package kg.geektech.home8.players;

import kg.geektech.home8.game.RPG_Game;

public class Magic extends Hero{
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if(heroes[i]!= this){
                heroes[i].setDamage(heroes[i].getDamage() + RPG_Game.random.nextInt(5) + 1);
            }
        }
    }
}
