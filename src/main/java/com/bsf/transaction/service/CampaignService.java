package com.bsf.transaction.service;

import com.bsf.transaction.exception.CheckedExceptionForTest;
import com.bsf.transaction.model.Campaign;
import com.bsf.transaction.repository.CampaignRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CampaignService {

    private final CampaignRepository campaignRepository;

    public CampaignService(CampaignRepository campaignRepository) {
        this.campaignRepository = campaignRepository;
    }

    @Transactional(rollbackFor = CheckedExceptionForTest.class)
    public void createCampaign() throws CheckedExceptionForTest {
        Campaign campaign = new Campaign();
        campaign.setTitle("Transaction continue..");
        campaignRepository.save(campaign);
        throw new CheckedExceptionForTest("Error While Campaign Insert");
    }
}
