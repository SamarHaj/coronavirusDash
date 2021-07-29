package edu.bu.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Infections {
@Id
private int countryCode ;  
private String	dateAndTime; 
private String reportedBy; 
private String sourceURL;
private int	numberOfInfections;
private int	numberOfDeaths;
private int	numberOfRecoveries;
public int getCountryCode() {
	return countryCode;
}
public void setCountryCode(int countryCode) {
	this.countryCode = countryCode;
}
public String getDateAndTime() {
	return dateAndTime;
}
public void setDateAndTime(String dateAndTime) {
	this.dateAndTime = dateAndTime;
}
public String getReportedBy() {
	return reportedBy;
}
public void setReportedBy(String reportedBy) {
	this.reportedBy = reportedBy;
}
public String getSourceURL() {
	return sourceURL;
}
public void setSourceURL(String sourceURL) {
	this.sourceURL = sourceURL;
}
public int getNumberOfInfections() {
	return numberOfInfections;
}
public void setNumberOfInfections(int numberOfInfections) {
	this.numberOfInfections = numberOfInfections;
}
public int getNumberOfDeaths() {
	return numberOfDeaths;
}
public void setNumberOfDeaths(int numberOfDeaths) {
	this.numberOfDeaths = numberOfDeaths;
}
public int getNumberOfRecoveries() {
	return numberOfRecoveries;
}
public void setNumberOfRecoveries(int numberOfRecoveries) {
	this.numberOfRecoveries = numberOfRecoveries;
}

	
	
	

}
