public class Magic extends Hero{
    private int healPoints;
    public Magic(int health, int damage, String superpowerType) {
        super(health, damage, superpowerType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println( "Magic применил суперспособность " + getSuperpowerType());

    }
}


