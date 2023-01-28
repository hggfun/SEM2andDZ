package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Police {
    List<Politsioner> police = new ArrayList<>();
    final static Random rnd = new Random();
    EventManager eventManager;
    public Police() {
        eventManager = new EventManager();
    }
    public void addPolitsioner(String name) {
        police.add(new Politsioner(name));
    }
    public void addVoditel(String name) {
        eventManager.listeners.put(name, new ArrayList<>());
        for (Politsioner polya : police) {
            eventManager.listeners.get(name).add(polya);
        }
        eventManager.listeners.get(name).add(new Voditel(name));
    }
    public void overSpeedLimit(int amount, String driverName) {
        eventManager.notify(driverName, amount);
    }
}
