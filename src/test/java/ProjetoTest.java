import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProjetoTest {

    @Test
    void deveRetornarEmentaDisciplina() {
        Pacote pacote1 = new Pacote("Composite");
        Classe classe11 = new Classe("Conteudo", "Abstract");
        Classe classe12 = new Classe("Disciplina", "Normal");
        Classe classe13 = new Classe("Topico", "Normal");
        Classe classe14 = new Classe("Unidade", "Normal");
        pacote1.addItem(classe11);
        pacote1.addItem(classe12);
        pacote1.addItem(classe13);
        pacote1.addItem(classe14);

        Pacote pacote2 = new Pacote("Builder");
        Classe classe21 = new Classe("Aluno", "Normal");
        Classe classe22 = new Classe("AlunoBuilder", "Normal");
        pacote2.addItem(classe21);
        pacote2.addItem(classe22);

        Pacote pacote3 = new Pacote("Singleton");
        Classe classe31 = new Classe("Parametros", "Normal");
        pacote3.addItem(classe31);

        Pacote java = new Pacote("Padrões de Projeto");
        java.addItem(pacote1);
        java.addItem(pacote2);
        java.addItem(pacote3);

        Projeto disciplina = new Projeto();
        disciplina.setItem(java);

        assertEquals("Pacote: Padrões de Projeto\n" +
                "Pacote: Composite\n" +
                "Classe: Conteudo - Tipo: Abstract\n" +
                "Classe: Disciplina - Tipo: Normal\n" +
                "Classe: Topico - Tipo: Normal\n" +
                "Classe: Unidade - Tipo: Normal\n" +
                "Pacote: Builder\n" +
                "Classe: Aluno - Tipo: Normal\n" +
                "Classe: AlunoBuilder - Tipo: Normal\n" +
                "Pacote: Singleton\n" +
                "Classe: Parametros - Tipo: Normal\n", disciplina.getItem());
    }

    @Test
    void deveRetornarExcecaoProjetoSemItem() {
        try {
            Projeto disciplina = new Projeto();
            disciplina.getItem();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Projeto sem item", e.getMessage());
        }
    }
}