package hw_2.builder_2_w;

public class Game {
    public static void main(String[] args) {
        Character warrior = new Character.CharacterBuilder()
                .setHealth(100)
                .setArmor(50)
                .setMagic(20)
                .build();

        System.out.println(warrior);
    }
}
