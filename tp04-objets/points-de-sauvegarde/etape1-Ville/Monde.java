/**
 * Étape 1 — Créer des objets et comprendre les références.
 */
public class Monde {
    public static void main(String[] args) {
        Ville tunis = new Ville("Tunis", 1000000);
        Ville sfax = new Ville("Sfax", 300000);

        tunis.decrisToi();
        sfax.decrisToi();

        // Deux étiquettes, un seul dossier : autreReference désigne le MÊME objet que tunis.
        Ville autreReference = tunis;
        System.out.println(tunis == autreReference);   // true  : même objet
        System.out.println(tunis == sfax);             // false : deux objets différents
    }
}
