import java.io.IOException;

import static com.biblioteca.planos.RandomPlanSelector.bibliotecaReaderStringMaker;
import static com.biblioteca.planos.RandomPlanSelector.randomPlanosSelector;

public class Main {
    public static void main(String[] args) {

        try {
            String[] bibliotecaDePlanos = bibliotecaReaderStringMaker
                    ("C:\\Users\\emmad\\OneDrive\\Biblioteca\\La-Biblioteca-De-Planos\\biblioteca-london-planos\\london-planos");

            randomPlanosSelector(bibliotecaDePlanos);

        } catch (IOException e) {
            System.out.println(e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
