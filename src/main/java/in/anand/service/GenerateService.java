package in.anand.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.anand.util.DateUtils;

@Service
public class GenerateService {
	
	@Autowired
	private DateUtils DateUtil;
	
	public GenerateService() {
		System.out.println("generate service");
	}
	
	public void generateDate()
	{
		
		LocalDate date=DateUtil.getDate();
		System.out.println("generated date::::"+date);
		
	}
	

}
