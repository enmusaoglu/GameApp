package business.concretes;

import business.abstracts.SaleService;
import entities.Sale;

public class SaleManager implements SaleService{

	@Override
	public void ticket(Sale sale) {
		System.out.println("�r�n�n�z�n sat�� numaras� : " + sale.getSaleId());
		
	}

}
