import br.com.alura.screenmatch.calculadora.CalcularodaDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {
       Filme meuFilme = new Filme();
       meuFilme.setNome("O poderoso chefão");
       meuFilme.setAnoLancamento(1970);
       meuFilme.setDuracaoEmMinutos(180);
       System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

       meuFilme.exibeFichaTecnica();
       meuFilme.avalia(8);
       meuFilme.avalia(5);
       meuFilme.avalia(10);
       System.out.println("Total de avaliações: " + meuFilme.getTotalAvaliacoes());
       System.out.println(meuFilme.pegaMedia());

       Serie lost = new Serie();
       lost.setNome("Lost");
       lost.setDuracaoEmMinutos(120);
       lost.setAnoLancamento(2002);
       lost.exibeFichaTecnica();
       lost.setTemporadas(10);
       lost.setEpisodiosPorTemporada(10);
       lost.setMinutosPorEpisodio(50);
       System.out.println("Duração para maratonar lost: " + lost.getDuracaoEmMinutos());

       Filme outroFilme = new Filme();
       outroFilme.setNome("Avatar");
       outroFilme.setAnoLancamento(2023);
       outroFilme.setDuracaoEmMinutos(200);

       CalcularodaDeTempo calculadora = new CalcularodaDeTempo();
       calculadora.inclui(meuFilme);
       calculadora.inclui(outroFilme);
       calculadora.inclui(lost);
       System.out.println(calculadora.getTempoTotal());

    }
}