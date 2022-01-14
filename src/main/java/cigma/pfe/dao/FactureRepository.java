package cigma.pfe.dao;

import cigma.pfe.model.Facture;

public interface FactureRepository {
	void ajouterFacture(Facture f);
	void supprimerFacture(Facture id);
	Facture trouverFacture(Long id);
	Facture modifierFacture(Facture f);
}
