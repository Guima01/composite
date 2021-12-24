import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClasseTest {

    @Test
    void deveRetornarHeroiClasse() {
        Player player1 = new Player(" Mago");

        Player player2 = new Player(" Paladino");
        Status status20 = new Status("Velocidade", "2");
        player2.addFicha(status20);

        Player player3 = new Player(" Arqueiro");
        Status status31 = new Status("Alcance", "3");
        Status status32 = new Status("Flechas", "4");
        player3.addFicha(status31);
        player3.addFicha(status32);

        Player players = new Player("Players");
        players.addFicha(player1);
        players.addFicha(player2);
        players.addFicha(player3);

        Classe classe = new Classe();
        classe.setHeroi(players);

        assertEquals("Player:Players\n" +
                "Player: Mago\n" +
                "Player: Paladino\n" +
                "Status: Velocidade: 2\n" +
                "Player: Arqueiro\n" +
                "Status: Alcance: 3\n" +
                "Status: Flechas: 4\n", classe.getHeroi());

    }

    @Test
    void deveRetornarExecacaoClasseSemHeroi() {
        try {
            Classe disciplina = new Classe();
            disciplina.getHeroi();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Classe sem herói", e.getMessage());
        }
    }
}