import java.util.Random;
public class Attacker extends Soldier{
    protected int attackerSpecial;
    protected String specialAttackName;
    private int specialCount;
    Random percentage;
    //60% chance to attack with primary gun
    public static final double PRIMARY_ATTACK_PERCENTAGE = 0.6;
    //If take cover is chosen during attack phase, attacker blocks 50% of the attack
    public static final double COVER_PERCENTAGE = 0.5;
    //attackers have 50% chance to block with armor rather than HP
    public static final double ARMOR_DEFENSE_PERCENTAGE = 0.5;
    //Attackers have 10% chance of using their special attack.
    // The random double from nexDouble() must be >= 0.9
    public static final double SPECIAL = 0.9;

    public void attacked(int damageReceived){
        double attackedOnArmor = percentage.nextDouble();
        if(attackedOnArmor < ARMOR_DEFENSE_PERCENTAGE){
            attackedOnArmor(damageReceived);
        }else {
            attackedOnHP(damageReceived);
        }
    }


    //Subclass constructor
    public Attacker(){
        super();
        name = "Attacker recruit";
        attackerSpecial = 30;
        specialAttackName = "special attack";
        specialCount = 1;
        percentage = new Random();
    }

}
