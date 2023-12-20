package Streams;

import org.junit.Test;
import static org.junit.Assert.assertTrue; // Importe a classe Assert do JUnit 4

import java.util.List;

public class TestMain {

    @Test
    public void testListaApenasMulheres() {
        List<Pessoa> listaPessoas = Main.lerPessoasDoConsole();
        List<Pessoa> mulheres = Main.filtrarMulheres(listaPessoas);

        // Verificar se todas as pessoas na lista de mulheres têm sexo "Feminino"
        assertTrue("A lista deve conter apenas mulheres", mulheres.stream().allMatch(pessoa -> "Feminino".equalsIgnoreCase(pessoa.sexo)));
    }
}
