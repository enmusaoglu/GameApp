package business.abstracts;

import java.util.List;

import entities.Campaign;


public interface CampaignService {
	void campaignAdd(Campaign campaign);
	void campaignDelete(Campaign campaign);
	void campaignUpdate(Campaign campaign);
	public List<Campaign> getAll();
}
