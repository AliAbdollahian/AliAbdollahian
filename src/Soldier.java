public class Soldier {

    protected String name;
    protected String department;
    protected int age;
    protected int armor;
    protected int health;
    protected int primaryGun;
    protected int secondaryGun;
    public static final int PRIMARY_GUN_RELOAD_TIME = 10;
    public static final int MAX_PRIMARY_AMMO = 51;
    public static final int MIN_HEALTH = 0;

    public Soldier(){
        this("recruit", "FBI SWAT", 33,
                20, 75, 12,8);
    }
    /**
     Creates a new Soldier object with the specified parameters.
     @param iName the name of the soldier
     @param iDepartment the department or division the soldier belongs to
     @param iAge the age of the soldier
     @param iArmor the armor value of the soldier
     @param iHealth the health value of the soldier
     @param iPrimaryGun the identifier of the soldier's primary gun
     @param iSecondaryGun the identifier of the soldier's secondary gun
     */
    public Soldier(String iName, String iDepartment ,int iAge, int iArmor,
                   int iHealth, int iPrimaryGun, int iSecondaryGun){
        name = iName;
        department = iDepartment;
        age = iAge;
        armor = iArmor;
        health = iHealth;
        primaryGun = iPrimaryGun;
        secondaryGun = iSecondaryGun;
    }

    public void attacked(int damagedReceived){}
    public int attack(){return 0;}
    public double takeCover(){return 0;}


    public void printDescription(){
        if(armor < 0){
            armor = 0;
        }
        if(health < 0){
            health = 0;
        }
        System.out.println("\n{name: " + name +"\narmor: " + armor +
                "\nhealth(HP): " + health + "}");
    }

    protected void attackedOnArmor(int damageReceived){
        System.out.println("Soldier " + name + " receives "
                + damageReceived + " of damage and tries to block with armor.");
        if (armor > 0){
            if(armor < damageReceived){
                armor = armor - damageReceived;
                System.out.println("Soldier " + name + " has their armor depleted completely.");
                health = health - (armor * -1);
                if (health > 0){
                    System.out.println("Soldier " + name + " has their health points depleted to " + health);
                }else {
                    System.out.println("Soldier " + name + " has their health points depleted COMPLETELY.");
                }
            }else{
                armor = armor - damageReceived;
                System.out.println("Soldier " + name + " has their armor depleted to " + armor);
            }
        }else{
            System.out.println("Soldier " + name + " has no armor left; hit points going to HP");
            health = health - damageReceived;
            if (health > 0){
                System.out.println("Soldier " + name + " SURVIVES the attack with " + health + " health remaining!");
            }else{
                System.out.println("Soldier " + name + " DOES NOT survive the attack. All health points depleted");
            }
        }
    }

    protected void attackedOnHP(int damageReceived){
        health = health - damageReceived;
        if (health > 0){
            System.out.println("Soldier " + name + " SURVIVES the attack with "
                    + health + " health remaining!");
        }else{
            System.out.println("Soldier " + name + " DOES NOT survive the attack." +
                    "All health points depleted");
        }
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public int getAge(){
        return age;
    }
    public int getArmor(){
        return armor;
    }
    public int getHealth(){
        return health;
    }
    public int getPrimaryGun(){
        return primaryGun;
    }
    public int getSecondaryGun(){
        return secondaryGun;
    }
    //Setters
    public void setName(String iName){
        name = iName;
    }
    public void setDepartment(String iDepartment){
        department = iDepartment;
    }
    public void setAge(int iAge){
        age = iAge;
    }
    public void setArmor(int iArmor){
        armor = iArmor;
    }
    public void setHealth(int iHealth){
        health = iHealth;
    }
    public void setPrimaryGun(int iPrimaryGun){
        primaryGun = iPrimaryGun;
    }
    public void setSecondaryGun(int iSecondaryGun) {
        secondaryGun = iSecondaryGun;
    }

}
