import java.util.Stack;  

public class Arbre {
	private int valeur;
	private Arbre gauche, droit;   

	// CONSTRUCTEURS
	public Arbre(int x) {
		valeur = x;
	}

	public Arbre(int x, Arbre g, Arbre d) {
		valeur = x;
		gauche = g;
		droit = d;
	} 

	// ACCESSEURS
	public int getValeur() {
		return(valeur);
	}

	public Arbre getSousArbreGauche() {
		return(gauche);
	}   

	public Arbre getSousArbreDroit() {
		return(droit);
	}

	// AFFICHAGE
	public String toString() {
		return toString("\t");
	}

	public String toString(String s) {
		if (gauche!=null) {
			if (droit!=null) 
				return(s+valeur+"\n"+gauche.toString(s+"\t")+droit.toString(s+"\t"));
			else
				return(s+valeur+"\n"+gauche.toString(s+"\t")+"\n");
		}
		else 
			if (droit!=null) 
				return(s+valeur+"\n\n"+droit.toString(s+"\t"));
			else
				return(s+valeur+"\n");
	}


	/**
	 * Affiche l'arbre selon un parcours en largeur
	 */
	public void ParcoursLargeur() {
		File file = new File();
		file.push(this);

		Arbre a,b;
		while (!file.empty()) {
			a = (Arbre) file.pop();
			System.out.println(a.getValeur());
			b = a.getSousArbreGauche();
			if (b != null)
				file.push(b);
			b = a.getSousArbreDroit();
			if (b != null)  
				file.push(b);
		}

	}

}