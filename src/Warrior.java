public class Warrior extends Hero{
    public Warrior (int health, int damage, String superpowerType){
        super(health,damage,superpowerType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println( "Warrior применил суперспособность " + getSuperpowerType());
    }
}
