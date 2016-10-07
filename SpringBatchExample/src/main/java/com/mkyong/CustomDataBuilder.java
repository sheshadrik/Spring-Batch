package com.mkyong;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.mkyong.model.Report;

public class CustomDataBuilder {

	
	CustomDataBuilder(){
		
	}
	
	static List<Report> getReportsData() {

		List<Report> reportList = new ArrayList<Report>();
		Report report = new Report();
		report.setId(1);
		report.setQty(12);
		report.setSales(new BigDecimal("10.4"));
		report.setStaffName("Staff Name1");
		reportList.add(report);
		Report report1 = new Report();
		report1.setId(2);
		report1.setQty(13);
		report1.setSales(new BigDecimal("14.5"));
		report1.setStaffName("Staff Name2");
		reportList.add(report1);
		return reportList;
	}
	
	
}
