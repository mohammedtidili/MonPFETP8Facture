package cigma.pfe.service;

import cigma.pfe.dao.FactureRepositoryImp;
import cigma.pfe.model.Facture;
import lombok.Data;

@Data
public class FactureServiceImp implements FactureService {

	FactureRepositoryImp factureRepositoryImp;

	@Override
	public void ajouterFacture(Facture f) {
		factureRepositoryImp.ajouterFacture(f);
	}

	@Override
	public Facture trouverFacture(Long id) {
		return factureRepositoryImp.trouverFacture(id);
	}

	@Override
	public Facture modifierFacture(Facture f) {
		return factureRepositoryImp.modifierFacture(f);
	}

	@Override
	public void supprimerFacture(Facture f) {
		factureRepositoryImp.supprimerFacture(f);
	}

	public FactureServiceImp() {

	}

}
