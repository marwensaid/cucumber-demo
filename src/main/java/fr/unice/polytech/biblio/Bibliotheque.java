package fr.unice.polytech.biblio;

import java.util.HashMap;

public class Bibliotheque {

	private HashMap<String,Etudiant> etudiants = new HashMap<>();
	private HashMap<String,Livre> livres = new HashMap<>();

	public Etudiant getEtudiantByName(String nom) {
		return this.etudiants.get(nom);
	}

	public void addEtudiant(Etudiant e) {
		this.etudiants.put(e.getNom(),e);
	}

	public Livre getLivreByTitle(String titre) {
		return this.livres.get(titre);
	}

	public void addLivre(Livre l) {
		this.livres.put(l.getTitre(),l);
	}

}