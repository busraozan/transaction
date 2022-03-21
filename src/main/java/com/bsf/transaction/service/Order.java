package com.bsf.transaction.service;

import com.bsf.transaction.exception.CheckedExceptionForTest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Order implements IOrder{

    private final ProductService productService;
    private final CampaignService campaignService;

    public Order(ProductService productService, CampaignService campaignService) {
        this.productService = productService;
        this.campaignService = campaignService;
    }

    @Override
    @Transactional(rollbackFor = CheckedExceptionForTest.class)
    public void add() throws CheckedExceptionForTest {
        System.out.println("Product Create Start");
        productService.createProduct();
        System.out.println("Campaign Create Start");
        campaignService.createCampaign();
        System.out.println("Transaction Test End");
    }
}
