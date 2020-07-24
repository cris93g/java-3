package concurrency;

public class Main {

    public static void main(String[] args) {
         //creates a new instance of the Thread Reasoning
        Reasoning newReasoning = new Reasoning();
        newReasoning.start();
        TeamTC1 teamTC1 = new TeamTC1();
        Thread myTeam = new Thread(teamTC1);
        myTeam.setName("team v8");
        myTeam.start();
    }
}