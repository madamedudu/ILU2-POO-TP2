package frontiere;

import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
	private ControlPrendreEtal controlPrendreEtal;

	public BoundaryPrendreEtal(ControlPrendreEtal controlChercherEtal) {
		this.controlPrendreEtal = controlChercherEtal;
	}

	public void prendreEtal(String nomVendeur) {
		boolean vendeurValide = controlPrendreEtal.verifierIdentite(nomVendeur);
		if (!vendeurValide) {
			System.out.println("Je suis désolé"+nomVendeur+", mais il faut être un habitant de notre village pour commercer ici");
		}else {
			System.out.println("Bonjour"+nomVendeur+", je vais regarder si jeu peux vous trouver un étal.");
			boolean etalDisponible = controlPrendreEtal.resteEtals();
			if (!etalDisponible) {
				System.out.println("Désolé"+nomVendeur+", je n'ai plus d'étale qui ne soit pas déjà occupé en ce moment.");
				
			
				}else {
					System.out.println("C'est parfait, il me reste un étal pour vous");
					System.out.println("Il me faut quelques informations.");
					StringBuilder question = new StringBuilder();
					question.append("Quel produit souhaitez-vous vendre ?\n");
					String produit = Clavier.entrerChaine(question.toString());
					question.append("Combien souhaitez-vous en vendre ?\n");
					int nbProduit = Clavier.entrerEntier(question.toString());
					
					int numeroEtal = controlPrendreEtal.prendreEtal(nomVendeur, produit, nbProduit);
					if (numeroEtal != -1) {
						System.out.println("Le vendeur"+nomVendeur+"s'est installé à l'étal n° "+numeroEtal+".");
						}
				}
			
			}
			
				
	}

	private void installerVendeur(String nomVendeur) {
		//TODO a completer
	}
}
