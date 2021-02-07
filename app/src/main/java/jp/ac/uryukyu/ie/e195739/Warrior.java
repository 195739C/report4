package jp.ac.uryukyu.ie.e195739;

public class Warrior extends Hero {
    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * 
     * @param name      Warriorの名前
     * @param maximumHP WarriorのHP
     * @param attack    Warriorの攻撃力
     */
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent) {
        if (dead)
            return;

        int damage = (int) (1.5 * attack);
        System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
    }

    @Override
    public void wounded(int damage) {
        hitPoint -= damage;
        if (hitPoint <= 0) {
            dead = true;
            System.out.printf("Warrior%sは倒れた。\n", name);
        }
    }
}
