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
 * Troisième étape : j'écris une todolist pour résoudre mon problème, sous
 * forme d'exemples concrets.
 * Pro tip : quand on n'a plus d'idées pendant 5 secondes, on a terminé notre
 * première todolist.
 *
 * Quatrième étape = boucle infinie :
 * - Je réfléchis à ce que je veux faire
 * - J'écris un micro test
 * - Je le vois échouer (les tests sont rouges)
 * - J'écris l'implémentation la plus simple possible pour le faire passer
 * - Une fois que les tests sont verts, j'améliore ce que je peux dans mon code
 * - goto début...
 *
 * - Red
 * - Green
 * - Refactor
 *
 * ## Commentaires
 *
 * JUnit peut trouver le test car j'ai mis l'annotation @Test.
 *
 * Question d'équipe : on code en anglais ou en français ?
 * Dans quelle langue se passent nos conversations métier ?
 * Si les conversations métier sont en fr, nommer les objets métier en fr est
 * intéressant. Par contre, les notions tech sont plutôt en anglais
 * (repository, query response HTTP).
 *
 * Raisonnement pour ajouter le bon nombre de I :
 * si i = 1, le bon nombre de bâtons c'est 1
 *        2                                2
 *        3                                3
 *        4                                x
 *        5                                0 = 5 - 5
 *        6                                1 = 6 - 5
 *        7                                2 = 7 - 5
 *
 * Refactoring : on améliore l'implémentation *sans changer le comportement*.
 * Si nos tests sont bien écrits, les test ne changent.
 *
 * ## Test unitaire
 *
 * Michael Feathers, test is not a unit test if:
 * - It talks to the database
 * - It communicates across the network
 * - It touches the file system
 * - It can’t run at the same time as any of your other unit tests
 * - You have to do special things to your enviroment (such as editing config
 *   files) to run it”
 *
 * Les tests d'intégration sont plus compliqués à écrire, plus long à lancer,
 * on en a besoin mais on en écrit moins. On a besoin de connaître certains
 * patterns qui nous permettent d'en écrire moins tout en gardant confiance
 * (Inversion de dépandances sur les sources de données).
 *
 * Tests d'acceptances : si on veut, on peut avoir un faux navigateur piloté
 * par les tests, une plateforme complète avec serveur Web, les sources de
 * données lancée, et mes tests vont s'exécuter sur ma plateforme à travers mon
 * navigateur headless piloté par mon framework de test. Selenium, Cypress, ...
 * On en a besoin, mais ils sont coûteux. Comment est-ce qu'on peut éviter d'en
 * avoir trop à écrire.
 *
 * - <https://blog.octo.com/la-pyramide-des-tests-par-la-pratique-1-5/>
 *
 * ## Problème
 *
 * Je veux écire un programme qui prend en argument un entier, et qui renvoit
 * en sortie ce nombre en chiffre romains.
 *
 * On aimerait que notre code fonctionne au moins jusqu'à 2022.
 *
 * 1 -> I
 * 2 -> II
 * 3 -> III
 * 4 -> IV
 * 5 -> V
 *
 * 9 -> IX
 *
 * 14 -> XIV
 *
 * 19 -> XIX
 *
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

    @Test
    public void testVérifiePour7() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(7);
        // Then
        assertEquals("VII", résultat);
    }

    @Test
    public void testVérifiePour8() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(8);
        // Then
        assertEquals("VIII", résultat);
    }

    @Test
    public void testVérifiePour9() {
        // Given
        ConvertisseurDeChiffresRomains convertisseur = new ConvertisseurDeChiffresRomains();
        // When
        String résultat = convertisseur.convertirEnChiffresRomains(9);
        // Then
        assertEquals("IX", résultat);
    }
}
