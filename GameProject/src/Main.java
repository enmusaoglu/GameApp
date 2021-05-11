

import java.util.GregorianCalendar;

import adapter.MernisAdapter;
import business.concretes.SaleManager;
import business.concretes.GameManager;
import business.concretes.CampaignManager;
import business.concretes.UserManager;
import entities.Campaign;
import entities.Game;
import entities.Sale;
import entities.User;

public class Main {

	public static void main(String[] args) {
		Campaign campaign = new Campaign();
		campaign.setCampaignId(1);
		campaign.setCampaignName("Bahar Kampanyasý!!!");
		campaign.setDiscount(20);
		
		User user = new User();
		user.setFirstName("ENES");
		user.setLastName("MUSAOÐLU");
		user.setNationallyId("24880498474");
		user.setDateOfBirth(new GregorianCalendar(2002, 9 ,30).getTime());
		
		Game game = new Game();
		game.setGameId(1);
		game.setGameName("League of Legends");
		game.setGamePrice(0);
		
		Sale sale = new Sale(1);
		
		CampaignManager campaignManager = new CampaignManager();
		UserManager userManager = new UserManager(new MernisAdapter());
		GameManager gameManager = new GameManager();
		SaleManager saleManager = new SaleManager();
		
		campaignManager.campaignAdd(campaign);
		campaignManager.campaignDelete(campaign);
		campaignManager.campaignUpdate(campaign);
		
		gameManager.gameAdd(game);
		gameManager.gameDelete(game);
		gameManager.gameUpdate(game);
	
		userManager.userAdd(user);
		userManager.userDelete(user);
		userManager.userDelete(user);
		
		
	}
	

}
