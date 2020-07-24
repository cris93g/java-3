package concurrency;

import java.util.ArrayList;
import java.util.List;

class TeamTC1 implements Runnable {
    List<String> team = new ArrayList<>();
    String[] tas = new String[]{"Emilio", "Christian", "Julian", "Jose", "Marcelo", "Abigail", "Devon", "Adam", "Julian", "Gabe",
            "Monica", "Phoenix", "Michael"};
    String[] colors= new String[]{ "\033[39m","\033[30m","\033[31m","\033[32m","\033[33m","\033[34m","\033[35m","\033[36m","\033[37m","\033[90m","\033[91m","\033[92m","\033[93m"};
    @Override
    public void run() {
        for(String item : tas){
            System.out.printf("name: %s%n",item);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            team.add(item);
        }
        int i=0;
        while(i<team.size()) {
            System.out.printf(colors[i]+"%d:%s ",i+1,tas[i]);
            i++;
        }

    }
}