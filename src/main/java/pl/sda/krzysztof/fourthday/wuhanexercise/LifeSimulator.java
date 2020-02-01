package pl.sda.krzysztof.fourthday.wuhanexercise;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class LifeSimulator {

    public static void simulate(List<Programmer> list,
                                int numberOfDays) {
        for (int i = 0; i < numberOfDays; i++) {
            for (Programmer singleProg : list) {
                if (singleProg.isAlive()) {
                    work(singleProg);
                }
                if (singleProg.isAlive()) {
                    play(singleProg);
                }
                rest(singleProg);
            }
        }
        Set<Programmer> aliveSet = new HashSet<>();
        Set<Programmer> notAliveSet = new HashSet<>();
        for (Programmer resultProgrammer : list) {
            if (resultProgrammer.isAlive()) {
                aliveSet.add(resultProgrammer);
            } else {
                notAliveSet.add(resultProgrammer);
            }
        }
        System.out.println("Alive programmers: " + aliveSet);
        System.out.println("Not alive programmers: " + notAliveSet);

    }

    private static void work(Programmer worker) {
        System.out.println(worker.getFirstName() + " is working");
        checkPulse(worker, 10);
    }

    private static void play(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is playing");
        checkPulse(programmer, 20);
    }

    private static void rest(Programmer programmer) {
        System.out.println(programmer.getFirstName() + " is resting");
        checkPulse(programmer, 3);
    }

    private static void checkPulse(Programmer programmer,
                                   int chanceToDie) {
        int randomNumber = new Random().nextInt(1000);
        if (randomNumber < chanceToDie) {
            programmer.setAlive(false);
        }
    }
}
