import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;  // Lista para armazenar os livros

    public Biblioteca() {
        livros = new ArrayList<>();
    }
    // Método para adicionar um livro à biblioteca
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }
    // Método para exibir todos os livros na biblioteca
    public void exibirLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);  // Chama o toString() do livro
        }
    }
}
