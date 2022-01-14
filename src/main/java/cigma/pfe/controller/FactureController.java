package cigma.pfe.controller;

import cigma.pfe.model.Facture;
import cigma.pfe.service.FactureServiceImp;
import lombok.Data;

@Data
public class FactureController {

	FactureServiceImp factureServiceImp;

	public void ajouterFacture(Facture f) {
		factureServiceImp.ajouterFacture(f);
	}

	public Facture trouverFcature(Long id) {

		return factureServiceImp.trouverFacture(id);
	}

	public Facture modifierFacture(Facture f) {
		return factureServiceImp.modifierFacture(f);
	}

	public void supprimerFacture(Facture f) {

		factureServiceImp.supprimerFacture(f);
	}

	public FactureController(FactureServiceImp factureServiceImp) {

		this.factureServiceImp = factureServiceImp;
	}

	public FactureController() {

	}

}
