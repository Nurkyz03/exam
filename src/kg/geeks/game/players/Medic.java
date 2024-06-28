package kg.geeks.game.players;

import static kg.geeks.game.logic.RPG_Game.random;

public class Medic extends Hero  {

    private int healPoints;

    public Medic (int health, int damage, String name) {
        super(health, damage, name, SuperAbility.HEAL);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (Hero hero : heroes) {
            if (this.getHealth() > 0 && hero.getHealth() < 100 && !hero.equals(this)) {
                int healPoints = random.nextInt(30) + 10;
                hero.setHealth(hero.getHealth() + healPoints);
                System.out.println(this.getName() + " heals " + hero.getName()  + " for " + healPoints + " health.");
                break;
            }
        }
    }
}


