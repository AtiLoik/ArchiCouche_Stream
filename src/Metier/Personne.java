package Metier;

import java.util.ArrayList;

public class Personne {
	private String nom;
	private String prenom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + "]";
	}
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public static ArrayList<Personne> Listepersonne()
	{
		ArrayList <Personne> listP = new ArrayList<Personne>();
		listP.add(new Personne("toto", "tata"));
		listP.add(new Personne("Cedric", "NO"));
		listP.add(new Personne("Loik", "FR"));
		return listP;
		
	}

}
