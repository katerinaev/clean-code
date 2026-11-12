package hw_2.builder_2_w;
/*
Implement a builder for creating characters in a game.
Description
In the game, a player creates a character by defining attributes such as health, damage, armor,
and magic. The Builder pattern will help organize the character creation process, allowing
these attributes to be set step-by-step without overloading the character class constructor.
*/
public class Character {
    private int health;
    private int damage;
    private int armor;
    private int magic;

    public Character(int health, int damage, int armor, int magic) {
        this.health = health;
        this.damage = damage;
        this.armor = armor;
        this.magic = magic;
    }

    public Character(CharacterBuilder builder) {
        this.health = builder.health;
        this.damage = builder.damage;
        this.armor = builder.armor;
        this.magic = builder.magic;
    }

    @Override
    public String toString() {
        return "Character with " + health  + " health, " + damage + " damage, " +
                armor + " armor, " + magic + " magic.";
    }

    static class CharacterBuilder {
        private int health;
        private int damage;
        private int armor;
        private int magic;

        public CharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setDamage(int damage) {
            this.damage = damage;
            return this;
        }

        public CharacterBuilder setArmor(int armor) {
            this.armor = armor;
            return this;
        }

        public CharacterBuilder setMagic(int magic) {
            this.magic = magic;
            return this;
        }

        public Character build() {
            return new Character(this);
        }
    }
}
