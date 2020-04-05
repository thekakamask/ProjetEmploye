package package2;

import java.util.Scanner;

class Employe {
	protected String nom;
	protected int revMens;
	protected double tauxOccup;
	protected double prime;
	
	public String getNom() {
		return nom;
	}
	public int getRevMens() {
		return revMens;
	}
	public double getTauxOccup() {
		return tauxOccup;
	}
	public double getPrime() {
		return prime;
	}
	public void setNom(String nom) {
		this.nom=nom;
	}
	public void setRevMens(int revMens) {
		this.revMens = revMens;
	}
	public void setTauxOccup(double tauxOccup) {
		this.tauxOccup = tauxOccup;
	}
	public void setPrime(double prime) {
		this.prime = prime;
	}
	protected double revenuAnnuel() {
		int revAnn = revMens * 12;
		revAnn *= ( tauxOccup / 100 );
		return revAnn;
	}
	public String toString() {
		String revAnnFormat = String.format("%.2f", revenuAnnuel());
		String text1 = "nous avons un nouvel employe : " + nom + " c'est un : employe.\n taux d'occupation : " + tauxOccup + ". Salaire annuel : " + revAnnFormat + " francs.";
	    return text1;
	}
	
	protected void demandePrime() {
		int a = 0;
		System.out.println("montant de la prime souhaitée");
		Scanner sc = new Scanner(System.in);
		while (true) {
			double str = sc.nextInt();
			a = 5;
			if (str < 2/100 * revAnn) {
				revAnn += str;
				String.format("%.2f", revAnn);
				System.out.println(nom + " : ");
				System.out.println("nous avons un nouvel employe : " + nom + " c'est un : employe ");
				System.out.println("taux d'occupation : " + tauxOccup + ". Salaire annuel : " + revAnn + " francs. prime : " + str + "francs");
			}
			if (str > 2/100*revAnn) {
				System.out.println("trop cher");
				a+=1;
			}
			else {
				System.out.println("saissisez des chiffres");
				a+=1;
			}
		if (a == 5) {
			String.format("%.2f", revAnn);
			System.out.println("affichage apres demande de prime : ");
			System.out.println(nom + " : ");
			System.out.println("nous avons un nouvel employe : " + nom + " c'est un : employe ");
			System.out.println("taux d'occupation : " + tauxOccup + ". Salaire annuel : " + revAnn + " francs. prime : 0 francs.");
		}
		}
	}
}
