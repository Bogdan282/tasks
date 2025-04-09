package Polymorfic.task3;

public class Song implements Playable{
    @Override
    public void play(){
        System.out.println("Играет песня!");
    }
}
