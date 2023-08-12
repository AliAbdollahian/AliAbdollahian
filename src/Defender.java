import java.util.Random;

public class Defender extends Soldier{
    protected int armor2;
    protected int defenderSpecial;
    protected String specialDefendName;
    private int specialCount;
    Random percentage;

    //If take cover is chosen during attack phase, defender blocks 65% of the attack
    public static final double COVER_PERCENTAGE = 0.65;
    //defenders have 70% chance to block with armors rather than HP
    public static final double ARMOR_DEFENSE_PERCENTAGE = 0.7;
    //Defenders have 20% chance of using their special ability. The random double from nexDouble() must be >= 0.8
    public static final double SPECIAL = 0.8;
    //60% chance to attack with primary gun
    public static final double PRIMARY_ATTACK_PERCENTAGE = 0.4;

    public Defender(){
        super();
        name = "Defender recruit";
        armor2 = 15;
        defenderSpecial = 30;
        specialDefendName = "boost health";
        specialCount = 1;
        percentage = new Random();
    }

    public void attacked(int damageReceived){
        double attackedOnArmor = percentage.nextDouble();
        if (attackedOnArmor < ARMOR_DEFENSE_PERCENTAGE){
            attackedOnArmor(damageReceived);
        } else{
            attackedOnHP(damageReceived);
        }
    }

    @Override
    protected  void attackedOnArmor(int damageReceived){
        if (armor2 > 0){
            System.out.println("Defender " + name + " defends with second armor of " +
                    "withstand ability points of " + armor2);
            armor2 = armor2 - damageReceived;
            int remainingArmor2 = armor2;
            if (remainingArmor2 < 0){
                System.out.println("Defender " + name + " has their second armor completely depleted." +
                        " Damage will be dealt to default armor and health points");
                int damageLeft = remainingArmor2 * - 1;
                super.attackedOnArmor(damageLeft);
            }
        }else {
            super.attackedOnArmor(damageReceived);
        }
    }
}
