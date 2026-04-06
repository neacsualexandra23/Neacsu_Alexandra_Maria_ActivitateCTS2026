package ro.ase.cts.template.exercitiul2.main;
import ro.ase.cts.template.exercitiul2.model.*;

public class Main {
    public static void main(String[] args) {

        AbstractAutoWashOptions basicOptions =
                new AutoWashOptions(true, true, false, true);

        AbstractAutoWashOptions premiumOptions =
                new AutoWashOptions(true, true, true, true);

        AbstractAutoWashOptions fastOptions =
                new AutoWashOptions(false, false, false, true);

        AutoWashTemplate basicProgram =
                new AutoWashProgram("Program Basic", basicOptions);

        AutoWashTemplate premiumProgram =
                new AutoWashProgram("Program Premium", premiumOptions);

        AutoWashTemplate fastProgram =
                new AutoWashProgram("Program Rapid", fastOptions);

        basicProgram.executeWashProgram();
        premiumProgram.executeWashProgram();
        fastProgram.executeWashProgram();
    }
}
/*
Programul de spălare ales este dat de interfața AbstractAutoWashOptions.
Indiferent de opțiunile selectate mașina va intra în tunelul de spălare,
va trece prin zona de prespălare,
apoi prin zona de perii,
apoi prin zona de ceruire și
polish și
la final prin zona de uscare.
Utilizați un design pattern ce va permite modelarea
ordinii fazelor de spălare și va aplica respectiva
fază de spălare dacă utilizatorul a selectat-o in programul
 sau (prin intermediul clasei din familia AbstractAutoWashOptions).
Testați implementarea prin crearea a 3 programe de spălare
diferite ce conțin diverse combinații de opțiuni (faze de spălare).
Demonstrați faptul că de fiecare mașina respectă aceeași ordine
a fazelor de spălare, dar doar opțiunile selectate sunt aplicate.
public interface AbstractAutoWashOptions {
boolean isPrewashSelected();
boolean isBrushWashingSelected();
boolean isWaxAndPolishSelected();
boolean isDryingSelected(); }
 */