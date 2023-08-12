public class Main {
    public static void main(String[] args) {
        Soldier player1 ;
        Soldier player2 ;

        //Creating the attackers
        Sledge sledge = new Sledge();
        Thermite thermite = new Thermite();
        Ash ash = new Ash();
        Ace ace = new Ace();

        //putting the attackers in an array list
        Attacker attackers[] = new Attacker[4];
        attackers[0] = sledge;
        attackers[1] = thermite;
        attackers[2] = ash;
        attackers[3] = ace;

        //creating the defenders
        Kapkan kapkan = new Kapkan();
        Smoke smoke = new Smoke();
        Doc doc = new Doc();
        Caveira caveira = new Caveira();

        //putting the defenders in an array list
        Defender defenders[] = new Defender[4];
        defenders[0] = kapkan;
        defenders[1] = smoke;
        defenders[2] = doc;
        defenders[3] = caveira;

    }
}