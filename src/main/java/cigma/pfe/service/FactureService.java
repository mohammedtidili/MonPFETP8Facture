package cigma.pfe.service;

import cigma.pfe.model.Facture;

public interface FactureService {
	void ajouterFacture(Facture f);
	void supprimerFacture(Facture id);
	Facture trouverFacture(Long id);
	Facture modifierFacture(Facture f);
	

}
