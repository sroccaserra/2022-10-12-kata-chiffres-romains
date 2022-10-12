import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/* # TDD
 *
 * ## Démarche
 *
 * Première étape : vérifier qu'on peut lancer un test
 * Deuxième étape : voir un message d'erreur
 * Je peux commencer à réfléchir au problème
 *
 * Troisième étape : j'écris une todolist pour résoudre mon problème, sous forme d'exemples concrets.
 * Pro tip : quand on n'a plus d'idées pendant 5 secondes, on a terminé notre
 * première todolist.
 *
 * Quatrième étape : Boucle infinie :
 * - J'écris un micro test
 * - Je le vois échouer (les tests sont rouges)
 * - J'écris l'implémentation pour le faire passer
 * - Une fois que les tests sont verts, j'améliore ce que je peux dans mon code
 * - goto début...
 *
 * - Red
 * - Green
 * - Refactor
 *
 * ## Commentaires
 *
 * JUnit peut trouver le test car j'ai mis l'annotation @Test
 * Question d'équipe : on code en anglais ou en français ?
 * Dans quelle langue se passent nos conversations métier ?
 * Si les conversations métier sont en fr, nommer les objets métier en fr est intéressant.
 * Par contre, les notions tech sont plutôt en anglais (repository, query response HTTP).
 *
 * ## Problème
 *
 * Je veux écire un programme qui prend en argument un entier,
 * et qui renvoit en sortie ce nombre en chiffre romains.
 *
 * On aimerait que notre code fonctionne au moins jusqu'à 2022.
 *
 * 1 -> I
 * 2 -> II
 * 3 -> III
 * 4 -> IV
 * 5 -> V
 * ...
 * 2022 -> MMXXII
 *
 */

public class TestChiffresRomains {
    @Test
    public void testVérifiePour1() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(1);
        // Then
        assertEquals("I", résultat);
    }

    @Test
    public void testVérifiePour2() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(2);
        // Then
        assertEquals("II", résultat);
    }

    @Test
    public void testVérifiePour3() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(3);
        // Then
        assertEquals("III", résultat);
    }

    @Test
    public void testVérifiePour4() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(4);
        // Then
        assertEquals("IV", résultat);
    }

    @Test
    public void testVérifiePour5() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(5);
        // Then
        assertEquals("V", résultat);
    }

    @Test
    public void testVérifiePour6() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(6);
        // Then
        assertEquals("VI", résultat);
    }
}