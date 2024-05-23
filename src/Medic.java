public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superpowerType, int healPoints) {
        super(health, damage, superpowerType);
        this.healPoints = healPoints;

    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность "+ getSuperpowerType());
    }

    public void increaseExperience() {
        this.healPoints += (int) (this.healPoints * 0.1);
    }
}