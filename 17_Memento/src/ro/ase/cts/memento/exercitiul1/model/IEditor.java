package ro.ase.cts.memento.exercitiul1.model;

public interface IEditor {
    void setText(String text);
    String getText();
    Memento save();
    void restore(Memento memento);
}
