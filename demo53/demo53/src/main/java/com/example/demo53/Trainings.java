package com.example.demo53;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="trainings")
public class Trainings {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="user_id")
private int UserId;
@Column(name="mentor_id")
private int MentorId;
@Column(name="skill_id")
private int SkillId;
@Column(name="status")
private String Status;
@Column(name="progress")
private String Progress;
@Column(name="rating")
private int Rating;
@Column(name="start_date")
private Date StartDate;
@Column(name="end_date")
private Date EndDate;
@Column(name="amount_received")
private int AmountReceived;
public Trainings()
{
	super();
}
public Trainings(int id, int userId, int mentorId, int skillId, String status, String progress, int rating,
		Date startDate, Date endDate, int amountReceived) {
	super();
	this.id = id;
	this.UserId = userId;
	this.MentorId = mentorId;
	this.SkillId = skillId;
	this.Status = status;
	this.Progress = progress;
	this.Rating = rating;
	this.StartDate = startDate;
	this.EndDate = endDate;
	this.AmountReceived = amountReceived;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getUserId() {
	return UserId;
}
public void setUserId(int userId) {
	UserId = userId;
}
public int getMentorId() {
	return MentorId;
}
public void setMentorId(int mentorId) {
	MentorId = mentorId;
}
public int getSkillId() {
	return SkillId;
}
public void setSkillId(int skillId) {
	SkillId = skillId;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}
public String getProgress() {
	return Progress;
}
public void setProgress(String progress) {
	Progress = progress;
}
public int getRating() {
	return Rating;
}
public void setRating(int rating) {
	Rating = rating;
}
public Date getStartDate() {
	return StartDate;
}
public void setStartDate(Date startDate) {
	StartDate = startDate;
}
public Date getEndDate() {
	return EndDate;
}
public void setEndDate(Date endDate) {
	EndDate = endDate;
}
public int getAmountReceived() {
	return AmountReceived;
}
public void setAmountReceived(int amountReceived) {
	AmountReceived = amountReceived;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + AmountReceived;
	result = prime * result + ((EndDate == null) ? 0 : EndDate.hashCode());
	result = prime * result + MentorId;
	result = prime * result + ((Progress == null) ? 0 : Progress.hashCode());
	result = prime * result + Rating;
	result = prime * result + SkillId;
	result = prime * result + ((StartDate == null) ? 0 : StartDate.hashCode());
	result = prime * result + ((Status == null) ? 0 : Status.hashCode());
	result = prime * result + UserId;
	result = prime * result + id;
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
	Trainings other = (Trainings) obj;
	if (AmountReceived != other.AmountReceived)
		return false;
	if (EndDate == null) {
		if (other.EndDate != null)
			return false;
	} else if (!EndDate.equals(other.EndDate))
		return false;
	if (MentorId != other.MentorId)
		return false;
	if (Progress == null) {
		if (other.Progress != null)
			return false;
	} else if (!Progress.equals(other.Progress))
		return false;
	if (Rating != other.Rating)
		return false;
	if (SkillId != other.SkillId)
		return false;
	if (StartDate == null) {
		if (other.StartDate != null)
			return false;
	} else if (!StartDate.equals(other.StartDate))
		return false;
	if (Status == null) {
		if (other.Status != null)
			return false;
	} else if (!Status.equals(other.Status))
		return false;
	if (UserId != other.UserId)
		return false;
	if (id != other.id)
		return false;
	return true;
}
@Override
public String toString() {
	return "Trainings [id=" + id + ", UserId=" + UserId + ", MentorId=" + MentorId + ", SkillId=" + SkillId
			+ ", Status=" + Status + ", Progress=" + Progress + ", Rating=" + Rating + ", StartDate=" + StartDate
			+ ", EndDate=" + EndDate + ", AmountReceived=" + AmountReceived + "]";
}

}
