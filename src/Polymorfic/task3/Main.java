package Polymorfic.task3;

public class Main {
    //3. Сделай интерфейс Playable с методом play(). Реализуй Song, Podcast, Radio.
    public static void main(String[] args) {
        Playable[] playable = {
                new Song(),
                new Podcast()
        };
        for(Playable i : playable) {
            i.play();
        }
    }
}
