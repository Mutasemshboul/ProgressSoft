package com.ClusteredData;

import com.ClusteredData.Exceptions.ClusterdDataException;
import com.ClusteredData.model.entity.FxDeal;
import com.ClusteredData.model.enums.Currency;
import com.ClusteredData.service.ClusteredDataService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ClusteredDataApplicationTests {
	private ClusteredDataService clusteredDataService;

	@Autowired
	public ClusteredDataApplicationTests(ClusteredDataService clusteredDataService) {
		this.clusteredDataService = clusteredDataService;
	}

//	@Test
//	void contextLoads() {
//	}

	@Test
	public void testInsertFxDeal() {
		FxDeal validFxDeal = FxDeal.builder()
				.dealAmount(-43l)
				.fromCurrency("USD")
				.toCurrency(Currency.EUR.getCode()).build();

		 clusteredDataService.insertData(validFxDeal);

		//assertNotNull(validFxDeal);
		assert(true);
	}

	@Test
	public void testInsertFxDeal2() {
		FxDeal validFxDeal = FxDeal.builder()
				.fromCurrency("USD")
				.toCurrency(Currency.EUR.getCode())
				.dealAmount(34l).build();

		clusteredDataService.insertData(validFxDeal);

		assert(true);

	}

}
