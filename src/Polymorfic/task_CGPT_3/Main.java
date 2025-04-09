package Polymorfic.task_CGPT_3;

public class Main {
    public static void main(String[] args) {
        Enemy[] enemys = {
                new Ork(),
                new Wizard(),
                new Zombie()
        };
        for(Enemy s : enemys) {
            s.attack();
        }
    }
}
