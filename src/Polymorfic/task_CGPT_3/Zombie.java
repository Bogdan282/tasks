package Polymorfic.task_CGPT_3;

public class Zombie extends Enemy{
    public void infect() {
        System.out.println("\uD83E\uDDDF Зомбі заражає!");
    }
    @Override
    public void attack() {
        infect();
    }
}
