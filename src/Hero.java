public abstract class Hero implements HavingSuperAbility {
 private int health;
 private int damage;
 private String superpowerType;

    public Hero(int health, int damage, String superpowerType){
        this.health = health;
        this.damage= damage;
        this.superpowerType = superpowerType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperpowerType() {
        return superpowerType;
    }

    public void setSuperpowerType(String superpowerType) {
        this.superpowerType = superpowerType;
    }
}
