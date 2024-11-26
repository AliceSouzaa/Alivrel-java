
import java.util.ArrayList;

public class ModuloAluguel {

    private List alugueis = new ArrayList();

    private static ModuloAluguel inst;

    private ModuloAluguel() {

    }

    public static ModuloAluguel getInst() {

        if (inst == null) {
            inst = new ModuloAluguel();
        }

        return inst;
    }

    public String cadastrarAluguel(String idCliente) {

        Cliente c = Sistema.getInst().localizarCliente(idCliente);

        Aluguel aluguel = new Aluguel();

        aluguel.data = "";
        aluguel.devolvido = false;

        aluguel.id = new String(this.alugueis.size());

        this.alugueis.add(aluguel);

        return aluguel.id;
    }

    public Aluguel localizarAluguel(String idAluguel) {

        for (int i = 0; i < this.alugueis.size() - 1; i++) {
            Aluguel a = this.alugueis.get(i);
            if (a.id == idAluguel) {

                return a;
            }
        }
        return null;
    }

    public void adicionarItemAluguel(String idAluguel, String codProduto, int quantidade) {
        Aluguel a = this.localizarAluguel(idAluguel);

        ItemAluguel ia = new ItemAluguel();
        ia.dataDevolucao = ""
        

        a.adicionarItemAluguel(itemAluguel);
    }

    public public static void main(String[] args) {
        ModuloAluguel.getInst().
    }

}
