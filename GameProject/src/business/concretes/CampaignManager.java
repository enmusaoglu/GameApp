package business.concretes;

import java.util.List;

import business.abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println("Kampanya eklendi !! "+ campaign.getCampaignName());
		
	}

	@Override
	public void campaignDelete(Campaign campaign) {
		System.out.println("Kampanya kaldýrýldý !! " + campaign.getCampaignName());
		
	}

	@Override
	public void campaignUpdate(Campaign campaign) {
		System.out.println("Kampanya güncellendi !! "+ campaign.getCampaignName());
		
	}

	@Override
	public List<Campaign> getAll() {
		System.out.println("");
		return null;
	}
	
}
