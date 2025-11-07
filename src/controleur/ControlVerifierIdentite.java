package controleur;

import villagegaulois.Village;

public class ControlVerifierIdentite {
	private Village village;

	public ControlVerifierIdentite(Village village) {
		this.village = village;
	}

	public boolean verifierIdentite(String nomVendeur) {
		String nomgaulois= village.trouverHabitant(nomVendeur).getNom();
		if (nomgaulois != null) {
			return true;
		}
		return false;
	}
}
