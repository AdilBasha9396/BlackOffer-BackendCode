package com.jpa.test.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.sql.Timestamp;

@Entity
@Table(name = "data")
public class Data {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;
 private Integer end_year;
 private Double citylng;
 private Double citylat;
 private Integer intensity;
 private String sector;
 private String topic;
 private String insight;
 private String swot;
 private String url;
 private String region;
 private Integer impact;
 private Timestamp added;
 private Timestamp published;
 private String city;
 private String country;
 private Integer relevance;
 private String pestle;
 private String source;
 private String title;
 private Integer likelihood;
public Data(Long id, Integer end_year, Double citylng, Double citylat, Integer intensity, String sector, String topic,
		String insight, String swot, String url, String region, Integer impact, Timestamp added, Timestamp published,
		String city, String country, Integer relevance, String pestle, String source, String title,
		Integer likelihood) {
	super();
	this.id = id;
	this.end_year = end_year;
	this.citylng = citylng;
	this.citylat = citylat;
	this.intensity = intensity;
	this.sector = sector;
	this.topic = topic;
	this.insight = insight;
	this.swot = swot;
	this.url = url;
	this.region = region;
	this.impact = impact;
	this.added = added;
	this.published = published;
	this.city = city;
	this.country = country;
	this.relevance = relevance;
	this.pestle = pestle;
	this.source = source;
	this.title = title;
	this.likelihood = likelihood;
}
public Data() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Integer getEnd_year() {
	return end_year;
}
public void setEnd_year(Integer end_year) {
	this.end_year = end_year;
}
public Double getCitylng() {
	return citylng;
}
public void setCitylng(Double citylng) {
	this.citylng = citylng;
}
public Double getCitylat() {
	return citylat;
}
public void setCitylat(Double citylat) {
	this.citylat = citylat;
}
public Integer getIntensity() {
	return intensity;
}
public void setIntensity(Integer intensity) {
	this.intensity = intensity;
}
public String getSector() {
	return sector;
}
public void setSector(String sector) {
	this.sector = sector;
}
public String getTopic() {
	return topic;
}
public void setTopic(String topic) {
	this.topic = topic;
}
public String getInsight() {
	return insight;
}
public void setInsight(String insight) {
	this.insight = insight;
}
public String getSwot() {
	return swot;
}
public void setSwot(String swot) {
	this.swot = swot;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public Integer getImpact() {
	return impact;
}
public void setImpact(Integer impact) {
	this.impact = impact;
}
public Timestamp getAdded() {
	return added;
}
public void setAdded(Timestamp added) {
	this.added = added;
}
public Timestamp getPublished() {
	return published;
}
public void setPublished(Timestamp published) {
	this.published = published;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public Integer getRelevance() {
	return relevance;
}
public void setRelevance(Integer relevance) {
	this.relevance = relevance;
}
public String getPestle() {
	return pestle;
}
public void setPestle(String pestle) {
	this.pestle = pestle;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public Integer getLikelihood() {
	return likelihood;
}
public void setLikelihood(Integer likelihood) {
	this.likelihood = likelihood;
}
@Override
public String toString() {
	return "Data [id=" + id + ", end_year=" + end_year + ", citylng=" + citylng + ", citylat=" + citylat
			+ ", intensity=" + intensity + ", sector=" + sector + ", topic=" + topic + ", insight=" + insight
			+ ", swot=" + swot + ", url=" + url + ", region=" + region + ", impact=" + impact + ", added=" + added
			+ ", published=" + published + ", city=" + city + ", country=" + country + ", relevance=" + relevance
			+ ", pestle=" + pestle + ", source=" + source + ", title=" + title + ", likelihood=" + likelihood + "]";
}

 // Getters and Setters
}

