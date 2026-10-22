import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

class DnDCharacter {

    private static final int NUMBER_OF_ROLLS = 4;
    private static final int DICE_SIDES_NUM = 6;
    private static final int AVERAGE_ABILITY_SCORE = 10;
    private static final int MODIFIER_DIVISOR = 2;
    private static final int HITPOINTS_BASE = 10;

    private final int strength;
    private final int dexterity;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;

    DnDCharacter() {
        this.strength = determineAbility();
        this.dexterity = determineAbility();
        this.constitution = determineAbility();
        this.intelligence = determineAbility();
        this.wisdom = determineAbility();
        this.charisma = determineAbility();
    }

    private int determineAbility() {
        return ability(rollDice());
    }

    int ability(List<Integer> scores) {
        return scores.stream().reduce(0, Integer::sum) - Collections.min(scores);
    }

    List<Integer> rollDice() {
        List<Integer> diceScores = new ArrayList<>();
        for(int i = 0; i < NUMBER_OF_ROLLS; i++) {
            diceScores.add((int) (Math.random() * DICE_SIDES_NUM + 1));
        }
        return diceScores;
    }

    int modifier(int input) {
        return (int) Math.floor((double) (input - AVERAGE_ABILITY_SCORE) / MODIFIER_DIVISOR);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
       return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return HITPOINTS_BASE + modifier(getConstitution());
    }
}
