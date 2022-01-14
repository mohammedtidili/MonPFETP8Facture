package cigma.pfe.application;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controller.FactureController;
import cigma.pfe.model.Facture;

public class FactureApplication {

	@SuppressWarnings({ "resource", "deprecation" })
	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("facture.xml");
		FactureController factureController = (FactureController) applicationContext.getBean("controller");
		Facture facture = (Facture) applicationContext.getBean("facture");
		factureController.ajouterFacture(facture);
		System.out.println(facture.getId());
		factureController.trouverFcature(facture.getId());
		factureController.modifierFacture(new Facture(1L, new Date("2022/01/15"), 20.55));
		factureController.supprimerFacture(facture);

	}

}
