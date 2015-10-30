import model.Hero;
import model.Monster;

public class App {
    public static void main(String[] args) {
        Hero hero = new Hero(10, 3);
        Monster monster = new Monster(2, 4);

        while(!hero.attack(monster) && !hero.isDead()) {
            System.out.printf("You missed. Monster dealt %s damage%n", monster.getDamageRate());
            System.out.printf("Your current health is %s%n", hero.getHealth());
        }

        System.out.println("=====================");
        if(hero.isDead()) {
            System.out.println("You LOST");
        } else {
            System.out.println("You WON");
        }
        System.out.println("=====================");
    }
}
