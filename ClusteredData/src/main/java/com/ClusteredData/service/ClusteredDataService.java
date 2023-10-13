package com.ClusteredData.service;

import com.ClusteredData.Exceptions.ClusterdDataException;
import com.ClusteredData.model.entity.FxDeal;
import com.ClusteredData.model.enums.Currency;
import com.ClusteredData.repository.ClusteredDataRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClusteredDataService {
    private ClusteredDataRepo clusteredDataRepo;

    @Autowired
    public ClusteredDataService(ClusteredDataRepo clusteredDataRepo) {
        this.clusteredDataRepo = clusteredDataRepo;
    }

    public void insertData(FxDeal fxDeal){

        if(checkFromCurrency(fxDeal.getFromCurrency()) && checkToCurrency(fxDeal.getToCurrency())){
            this.clusteredDataRepo.save(fxDeal);
        }
        else {
            throw new ClusterdDataException("Currency not Found");
        }

    }

    public boolean checkFromCurrency(String s){
        for (Currency currency : Currency.values()) {
            if(currency.getCode().equals(s)){
                return true;
            }
        }
        return false;
    }

    public boolean checkToCurrency(String s){
        for (Currency currency : Currency.values()) {
            if(currency.getCode().equals(s)){
                return true;
            }
        }
        return false;
    }
}
