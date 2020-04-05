package package2;

import java.util.Scanner;

class Programmeur extends Employe {
	protected int projAchev;
	
	public Programmeur(String nom, int revMens, int projAchev, double tauxOccup) {
		this.nom = nom;
		this.revMens = revMens;
		this.projAchev=projAchev;
		this.tauxOccup=tauxOccup;
	}	
	
	public String getNom() {
		
	}
	
	protected double RevAnn() {
		revAnn = revMens * 12; 
		revAnn *= ( tauxOccup / 100 );
		revAnn += 200 * projAchev;
		return revAnn;
	}
	public void Afficher() {
		super.afficher();
		System.out.println("a mené a bien " + projAchev + " projets.");
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
				System.out.println("nous avons un nouvel employe : " + nom + " c'est un : programmeur ");
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
				System.out.println("nous avons un nouvel employe : " + nom + " c'est un : programmeur ");
				System.out.println("taux d'occupation : " + tauxOccup + ". Salaire annuel : " + revAnn + " francs. prime : 0 francs.");
			}
		}
	}
}