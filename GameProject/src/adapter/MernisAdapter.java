package adapter;

import java.time.ZoneId;

import business.abstracts.UserCheckService;
import entities.User;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisAdapter implements UserCheckService{

	@Override
	public boolean checkIfRealPerson(User user) {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = kpsPublicSoapProxy.TCKimlikNoDogrula(
					Long.parseLong(user.getNationallyId()),
					user.getFirstName(),
					user.getLastName(),
					user.getDateOfBirth().toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getYear());
		}catch(Exception e){
			System.out.println("Not a valid person");
		}
		return result;
	}
	

}
