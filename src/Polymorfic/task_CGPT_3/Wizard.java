package Polymorfic.task_CGPT_3;

public class Wizard extends Enemy{
    @Override
    public void attack() {
        castSpell();
    }
    public void castSpell() {
        System.out.println("\uD83E\uDDD9 Чарівник кидає закляття!");
    }
}
