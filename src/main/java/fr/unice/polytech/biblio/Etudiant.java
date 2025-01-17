package fr.unice.polytech.biblio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;


public class Etudiant {

	private String nom;
	private int noEtudiant;
	Bibliotheque bibliotheque;
	Collection<Emprunt> emprunt;

	public Etudiant(Bibliotheque biblio) {
		this.bibliotheque = biblio;
		this.emprunt = new ArrayList<>();
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNoEtudiant() {
		return this.noEtudiant;
	}

	public void setNoEtudiant(int noEtudiant) {
		this.noEtudiant = noEtudiant;
	}

	public Collection<Emprunt> getEmprunt() {
		return this.emprunt;
	}

	public int getNombreDEmprunt() {
		return this.emprunt.size();
	}

	public void emprunte(Livre livre) {
		Emprunt e = new Emprunt(LocalDate.now().plusDays(15), this, livre);
		livre.setEmprunte(true);
		this.emprunt.add(e);
	}
}