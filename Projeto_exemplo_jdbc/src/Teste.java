import java.util.HashMap;
import java.util.List;

public class Teste {

    public static void main(String[] args) {
        RegistroDB db = new RegistroDB();

        db.inserir(new Registro(1, "Maria Antonia", "A", 20));
        db.inserir(new Registro(2, "Matheus", "Ranheri", 19));
        db.inserir(new Registro(3, "Jorge", "Pereira", 30));

          db.remover(1);
         

       List<Registro> registros = db.getRegistros();

       for(Registro registro : registros) {
            System.out.println("ID > "+registro.getId()+ " Nome> "+registro.getNome());
        }
    }
}
