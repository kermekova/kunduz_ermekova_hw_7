public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(200, 50, "DRAGON FLAME"),
                new Medic(240, 40, "HEAL", 50),
                new Warrior(290, 60, "CRITICAL DAMAGE")

        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
                System.out.println("Медик увеличил опыт лечения на 10%");
            }
        }
    }
}