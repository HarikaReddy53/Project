package com.example.demo53;

import java.sql.Time;
import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "mentorcalendar")
public class MentorCalendar {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "mid")
	private int mid;
	@Column(name = "start_time")
	private Time StartTime;
	@Column(name = "end_time")
	private Time EndTime;
	@Column(name = "start_date")
	private Date StartDate;
	@Column(name = "end_date")
	private Date EndDate;

	public MentorCalendar() {
		super();
	}

	public MentorCalendar(int id, int mid, Time startTime, Time endTime, Date startDate, Date endDate) {
		super();
		this.id = id;
		this.mid = mid;
		StartTime = startTime;
		EndTime = endTime;
		StartDate = startDate;
		EndDate = endDate;
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

	public Time getStartTime() {
		return StartTime;
	}

	public void setStartTime(Time startTime) {
		StartTime = startTime;
	}

	public Time getEndTime() {
		return EndTime;
	}

	public void setEndTime(Time endTime) {
		EndTime = endTime;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((EndDate == null) ? 0 : EndDate.hashCode());
		result = prime * result + ((EndTime == null) ? 0 : EndTime.hashCode());
		result = prime * result + ((StartDate == null) ? 0 : StartDate.hashCode());
		result = prime * result + ((StartTime == null) ? 0 : StartTime.hashCode());
		result = prime * result + id;
		result = prime * result + mid;
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
		MentorCalendar other = (MentorCalendar) obj;
		if (EndDate == null) {
			if (other.EndDate != null)
				return false;
		} else if (!EndDate.equals(other.EndDate))
			return false;
		if (EndTime == null) {
			if (other.EndTime != null)
				return false;
		} else if (!EndTime.equals(other.EndTime))
			return false;
		if (StartDate == null) {
			if (other.StartDate != null)
				return false;
		} else if (!StartDate.equals(other.StartDate))
			return false;
		if (StartTime == null) {
			if (other.StartTime != null)
				return false;
		} else if (!StartTime.equals(other.StartTime))
			return false;
		if (id != other.id)
			return false;
		if (mid != other.mid)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MentorCalendar [id=" + id + ", mid=" + mid + ", StartTime=" + StartTime + ", EndTime=" + EndTime
				+ ", StartDate=" + StartDate + ", EndDate=" + EndDate + "]";
	}

}