import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();  // Criando uma instância da biblioteca

        // Caminho do arquivo CSV
        String caminhoArquivo = "livros.csv"; 

        try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
            String linha;
            br.readLine();  // Ignora o cabeçalho do CSV

            // Lê cada linha do arquivo CSV e cria um Livro
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(",");  // Divide os dados por vírgula

                // Atribui os valores do CSV aos atributos do Livro
                String titulo = dados[0];
                String autor = dados[1];
                String genero = dados[2];
                int ano = Integer.parseInt(dados[3]);

                // Cria um objeto Livro e adiciona à biblioteca
                Livro livro = new Livro(titulo, autor, genero, ano);
                biblioteca.adicionarLivro(livro);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Exibir todos os livros carregados
        //biblioteca.exibirLivros();
    }
}
