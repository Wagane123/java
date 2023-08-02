package Gestion_Note;

public class Note {
	// Attributs
	private String matiere;
	private double valeur;

	// Constructeur
	public Note(String matiere, double valeur) {
		this.matiere = matiere;
		this.valeur = valeur;
	}

	// Méthodes d'accès (getters)
	public String getMatiere() {
		return matiere;
	}

	public double getValeur() {
		return valeur;
	}
}

