package cigma.pfe.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cigma.pfe.model.Facture;

public class FactureRepositoryImp implements FactureRepository {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("facture_operation");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public void ajouterFacture(Facture f) {
		entityManager.getTransaction().begin();
		entityManager.persist(f);
		entityManager.getTransaction().commit();

	}

	@Override
	public Facture trouverFacture(Long id) {
		Facture factureTrouver = entityManager.find(Facture.class, id);
		System.out.println("*****************************\n" + "facture trouver : \n" + "id facture : "
				+ factureTrouver.getId() + "\n" + "Date facture : " + factureTrouver.getDate() + "\n"
				+ "Amount facture :" + factureTrouver.getAmount()
				+ "\n**********************************************************\n");
		return factureTrouver;
	}

	@Override
	public Facture modifierFacture(Facture factureNouvelle) {
		Facture factureExist = entityManager.find(Facture.class, factureNouvelle.getId());
		System.out.println("*****************************\n" + "Vous avez modifier la facture numero : "
				+ +factureExist.getId() + "\n" + "Date facture exist : " + factureExist.getDate()
				+ "  par la nouvelle date ---> " + factureNouvelle.getDate() + "\n " + "Amount facture exist : "
				+ factureExist.getAmount() + "  par la nouvelle amount---> " + factureNouvelle.getAmount()
				+ "\n**********************************************************\n");

		factureExist.setDate(factureNouvelle.getDate());
		factureExist.setAmount(factureNouvelle.getAmount());

		return factureExist;
	}

	@Override
	public void supprimerFacture(Facture f) {

		Facture factureSupprimer = trouverFacture(f.getId());

		System.out.println("*****************************\n" + "Vous avez supprimer la facture N° : \n"
				+ "id facture : " + f.getId() + "\n" + "Date facture : " + f.getDate() + "\n" + "Amount facture :"
				+ f.getAmount() + "\n**********************************************************\n");

		entityManager.remove(factureSupprimer);

	}

}
