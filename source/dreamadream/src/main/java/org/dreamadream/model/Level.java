package org.dreamadream.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "program_level")
public class Level {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "level")
	private String level;
	
	@Column(name = "level_date_of_joining")
	private String levelDateOfJoining;
	
	@Column(name = "level_end_date")
	private String levelEndDate;
	
	@Column(name = "ngo_comments")
	private String ngoComments;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevelDateOfJoining() {
		return levelDateOfJoining;
	}
	public void setLevelDateOfJoining(String levelDateOfJoining) {
		this.levelDateOfJoining = levelDateOfJoining;
	}
	public String getLevelEndDate() {
		return levelEndDate;
	}
	public void setLevelEndDate(String levelEndDate) {
		this.levelEndDate = levelEndDate;
	}
	public String getNgoComments() {
		return ngoComments;
	}
	public void setNgoComments(String ngoComments) {
		this.ngoComments = ngoComments;
	}
		
	
	@Override
	public String toString(){
		return "id="+userId;
	}
	  
}

