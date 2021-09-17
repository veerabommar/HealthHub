package com.healthhub.reports.entity;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "report")
public class Report {
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getVisitId() {
		return visitId;
	}
	public void setVistiId(String visitId) {
		this.visitId = visitId;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public Date getVistiDate() {
		return vistiDate;
	}
	public void setVistiDate(Date vistiDate) {
		this.vistiDate = vistiDate;
	}
	public Date getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getReportName() {
		return reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}
	public String getReportDesc() {
		return reportDesc;
	}
	public void setReportDesc(String reportDesc) {
		this.reportDesc = reportDesc;
	}
	public String getFileId() {
		return fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	
	@Id
	private String id;
	private String visitId;
	private String eid;
	private Date vistiDate;
	private Date uploadDate;
	private String reportName;
	private String reportDesc;
	private String fileId;	
}
