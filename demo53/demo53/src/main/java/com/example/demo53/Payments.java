package com.example.demo53;
import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="payments")
public class Payments {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="mentor_id")
	private int MentorId;
	@Column(name="training_id")
	private int TrainingId;
	@Column(name="txn_type")
	private String TransmissionType;
	@Column(name="amount")
	private int Amount;
	@Column(name="datetime")
	private Date DateTime;
	@Column(name="remarks")
	private String Remarks;
	public Payments() {
		super();
	}
	public Payments(int id, int mentorId, int trainingId, String transmissionType, int amount, Date dateTime,
			String remarks) {
		super();
		this.id = id;
		this.MentorId = mentorId;
		this.TrainingId = trainingId;
		this.TransmissionType = transmissionType;
		this.Amount = amount;
		this.DateTime = dateTime;
		this.Remarks = remarks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMentorId() {
		return MentorId;
	}
	public void setMentorId(int mentorId) {
		MentorId = mentorId;
	}
	public int getTrainingId() {
		return TrainingId;
	}
	public void setTrainingId(int trainingId) {
		TrainingId = trainingId;
	}
	public String getTransmissionType() {
		return TransmissionType;
	}
	public void setTransmissionType(String transmissionType) {
		TransmissionType = transmissionType;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public Date getDateTime() {
		return DateTime;
	}
	public void setDateTime(Date dateTime) {
		DateTime = dateTime;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Amount;
		result = prime * result + ((DateTime == null) ? 0 : DateTime.hashCode());
		result = prime * result + MentorId;
		result = prime * result + ((Remarks == null) ? 0 : Remarks.hashCode());
		result = prime * result + TrainingId;
		result = prime * result + ((TransmissionType == null) ? 0 : TransmissionType.hashCode());
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
		Payments other = (Payments) obj;
		if (Amount != other.Amount)
			return false;
		if (DateTime == null) {
			if (other.DateTime != null)
				return false;
		} else if (!DateTime.equals(other.DateTime))
			return false;
		if (MentorId != other.MentorId)
			return false;
		if (Remarks == null) {
			if (other.Remarks != null)
				return false;
		} else if (!Remarks.equals(other.Remarks))
			return false;
		if (TrainingId != other.TrainingId)
			return false;
		if (TransmissionType == null) {
			if (other.TransmissionType != null)
				return false;
		} else if (!TransmissionType.equals(other.TransmissionType))
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Payments [id=" + id + ", MentorId=" + MentorId + ", TrainingId=" + TrainingId + ", TransmissionType="
				+ TransmissionType + ", Amount=" + Amount + ", DateTime=" + DateTime + ", Remarks=" + Remarks + "]";
	}
	
	

}
