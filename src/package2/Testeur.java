package package2;

import java.util.Scanner;

class Testeur extends Employe {
	protected int erreurCor;
	
	public Testeur(String nom, int revMens, int erreurCor, double tauxOccup) {
		this.nom=nom;
		this.revMens=revMens;
		this.erreurCor=erreurCor;
		this.tauxOccup=tauxOccup;
	}
	public String getNom() {
		return nom;
	}
	public int getRevMens() {
		return revMens;
	}
	public double getTauxOccup() {
		return tauxOccup;
	}
	public double getRevAnn() {
		return revAnn;
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
	public void setRevAnn(double revAnn) {
		this.revAnn = revAnn;
	}
	public void setPrime(double prime) {
		this.prime = prime;
	}
	protected double RevAnn() {
		revAnn = revMens * 12;
		revAnn *= ( tauxOccup / 100 );
		revAnn += 10 * erreurCor;
		return revAnn;
	}
	
	@Override
	public String toString() {
		String text = super.toString() + "il a reglé" + erreurCor + " erreurs.";
		return text;
	}
	public void demandePrime() {
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
				System.out.println("nous avons un nouvel employe : " + nom + " c'est un : testeur ");
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
				System.out.println("nous avons un nouvel employe : " + nom + " c'est un : testeur ");
				System.out.println("taux d'occupation : " + tauxOccup + ". Salaire annuel : " + revAnn + " francs. prime : 0 francs.");
			}
		}
	}
}
	