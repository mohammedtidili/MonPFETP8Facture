package cigma.pfe.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private Double amount;

	public Facture(Long id, Date date, Double amount) {
		this.id = id;
		this.date = date;
		this.amount = amount;
	}

	public Facture() {

	}
}
