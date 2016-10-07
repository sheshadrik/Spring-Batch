package com.mkyong;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.mkyong.model.Report;

public class CustomReader implements ItemReader<Report> {

	int nextIndex = 0;
	boolean isDataInitialized = false;
	List<Report> reportList;
	@Override
	public Report read() throws Exception, UnexpectedInputException, ParseException,
			NonTransientResourceException {
		if(!isDataInitialized){
			reportList = CustomDataBuilder.getReportsData();
			isDataInitialized = true;
		}
		Report report = null;
		if(nextIndex < reportList.size()){
		report = reportList.get(nextIndex);
		nextIndex++;
		}
		return report;
	}

}
