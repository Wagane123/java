package Gestion_Note;

import java.util.ArrayList;
import java.util.List;

public class Cours {
    // Attributs
    private String nom;
    private List<Etudiant> listeEtudiantsInscrits;

    // Constructeur
    public Cours(String nom) {
        this.nom = nom;
        this.listeEtudiantsInscrits = new ArrayList<>();
    }

    // Méthode pour inscrire un étudiant au cours
    public void inscrireEtudiant(Etudiant etudiant) {
        listeEtudiantsInscrits.add(etudiant);
    }

    // Méthodes d'accès (getters)
    public String getNom() {
        return nom;
    }

    public List<Etudiant> getListeEtudiantsInscrits() {
        return listeEtudiantsInscrits;
    }
}

