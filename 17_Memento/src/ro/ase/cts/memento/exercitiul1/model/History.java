package ro.ase.cts.memento.exercitiul1.model;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<Memento> list = new ArrayList<>();

    public void add(Memento m) {
        list.add(m);
    }

    public Memento get(int index) {
        return list.get(index);
    }
}