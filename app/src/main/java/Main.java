import jp.ac.uryukyu.ie.e195739.*;

public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("勇者", 10, 5);
        Enemy enemy = new Enemy("スライム", 6, 3);

        System.out.printf("%s vs. %s\n", Warrior.getName(), enemy.getName());

        int turn = 0;
        while (Warrior.isDead() == false && enemy.isDead() == false) {
            turn++;
            System.out.printf("%dターン目開始！\n", turn);
            warrior.attackWithWeponSkill(enemy);
            enemy.attack(Warrior);
        }
        System.out.println("戦闘終了");
    }
}