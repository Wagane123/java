package Gestion_Note;

public class GestionnaireNotes {
	public static void main(String[] args) {
		// Création des étudiants
		Etudiant etudiant1 = new Etudiant("Ibrahima FAYE", 1001);
		Etudiant etudiant2 = new Etudiant("Wagane FAYE", 1002);

		// Création des cours
		Cours cours1 = new Cours("Mathématiques");
		Cours cours2 = new Cours("Physique");

		// Inscription des étudiants aux cours
		cours1.inscrireEtudiant(etudiant1);
		cours1.inscrireEtudiant(etudiant2);
		cours2.inscrireEtudiant(etudiant1);

		// Ajout des notes pour les cours spécifiés
		etudiant1.ajouterNote("Mathématiques", 15.5);
		etudiant1.ajouterNote("Physique", 18.0);
		etudiant2.ajouterNote("Mathématiques", 14.0);

		// Calcul et affichage des moyennes des étudiants
		System.out.println("Moyenne d' " + etudiant1.getNom() + " : " + etudiant1.calculerMoyenne());
		System.out.println("Moyenne de " + etudiant2.getNom() + " : " + etudiant2.calculerMoyenne());
	}
}

