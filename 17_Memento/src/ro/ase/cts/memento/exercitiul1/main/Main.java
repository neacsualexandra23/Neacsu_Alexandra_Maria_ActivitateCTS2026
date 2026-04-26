package ro.ase.cts.memento.exercitiul1.main;
import ro.ase.cts.memento.exercitiul1.model.*;
public class Main {
    public static void main(String[] args) {

        IEditor editor = new Editor();
        History history = new History();

        editor.setText("A");
        history.add(editor.save());

        editor.setText("AB");
        history.add(editor.save());

        editor.setText("ABC");

        System.out.println(editor.getText()); // ABC

        editor.restore(history.get(0));

        System.out.println(editor.getText()); // A

        editor.restore(history.get(1));
        System.out.println(editor.getText());  //AB
    }
}