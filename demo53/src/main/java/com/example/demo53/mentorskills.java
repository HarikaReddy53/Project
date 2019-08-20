package com.example.demo53;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="mentorskills")
public class mentorskills {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="mid")
	private int mid;
	@Column(name="sid")
	private int sid;
	@Column(name="self_rating")
	private int selfrating;
	@Column(name="years_of_experience")
	private int yearofExperience;
	@Column(name="trainings_delivered")
	private int trainingsDelivered;
	@Column(name="facilities_offered")
	private String facilitiesOffered;
	public mentorskills() {
		super();
	}
	
	
	public mentorskills(int id, int mid, int sid, int selfrating, int yearofExperience, int trainingsDelivered,
			String facilitiesOffered) {
		super();
		this.id = id;
		this.mid = mid;
		this.sid = sid;
		this.selfrating = selfrating;
		this.yearofExperience = yearofExperience;
		this.trainingsDelivered = trainingsDelivered;
		this.facilitiesOffered = facilitiesOffered;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSelfrating() {
		return selfrating;
	}
	public void setSelfrating(int selfrating) {
		this.selfrating = selfrating;
	}
	public int getYearofExperience() {
		return yearofExperience;
	}
	public void setYearofExperience(int yearofExperience) {
		this.yearofExperience = yearofExperience;
	}
	public int getTrainingsDelivered() {
		return trainingsDelivered;
	}
	public void setTrainingsDelivered(int trainingsDelivered) {
		this.trainingsDelivered = trainingsDelivered;
	}
	public String getFacilitiesOffered() {
		return facilitiesOffered;
	}
	public void setFacilitiesOffered(String facilitiesOffered) {
		this.facilitiesOffered = facilitiesOffered;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((facilitiesOffered == null) ? 0 : facilitiesOffered.hashCode());
		result = prime * result + id;
		result = prime * result + mid;
		result = prime * result + selfrating;
		result = prime * result + sid;
		result = prime * result + trainingsDelivered;
		result = prime * result + yearofExperience;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		mentorskills other = (mentorskills) obj;
		if (facilitiesOffered == null) {
			if (other.facilitiesOffered != null)
				return false;
		} else if (!facilitiesOffered.equals(other.facilitiesOffered))
			return false;
		if (id != other.id)
			return false;
		if (mid != other.mid)
			return false;
		if (selfrating != other.selfrating)
			return false;
		if (sid != other.sid)
			return false;
		if (trainingsDelivered != other.trainingsDelivered)
			return false;
		if (yearofExperience != other.yearofExperience)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "mentorskills [id=" + id + ", mid=" + mid + ", sid=" + sid + ", selfrating=" + selfrating
				+ ", yearofExperience=" + yearofExperience + ", trainingsDelivered=" + trainingsDelivered
				+ ", facilitiesOffered=" + facilitiesOffered + "]";
	}
	
	

}
