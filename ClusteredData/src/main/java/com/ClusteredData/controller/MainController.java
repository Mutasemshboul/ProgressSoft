package com.ClusteredData.controller;

import com.ClusteredData.model.entity.FxDeal;
import com.ClusteredData.service.ClusteredDataService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MainController {
    private ClusteredDataService clusteredDataService;

    @Autowired
    public MainController(ClusteredDataService clusteredDataService) {
        this.clusteredDataService = clusteredDataService;
    }

    @PostMapping("insertDeal")
    public void insertDeal(@RequestBody @Valid FxDeal fxDeal){

        clusteredDataService.insertData(fxDeal);
    }


}
