package Gestion_Note;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	// Attributs
	private String nom;
	private int identifiant;
	private List<Note> listeNotes;

	// Constructeur
	public Etudiant(String nom, int identifiant) {
		this.nom = nom;
		this.identifiant = identifiant;
		this.listeNotes = new ArrayList<>();
	}

	// Méthode pour ajouter une note
	public void ajouterNote(String matiere, double valeur) {
		Note note = new Note(matiere, valeur);
		listeNotes.add(note);
	}

	// Méthode pour calculer la moyenne
	public double calculerMoyenne() {
		if (listeNotes.isEmpty()) {
			return 0.0;
		}

		double somme = 0;
		for (Note note : listeNotes) {
			somme += note.getValeur();
		}

		return somme / listeNotes.size();
	}

	// Méthodes d'accès (getters)
	public String getNom() {
		return nom;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public List<Note> getListeNotes() {
		return listeNotes;
	}
}

