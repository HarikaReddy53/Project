package com.example.demo53;
import java.sql.Time;
//import java.util.*;
import javax.persistence.*;
@Entity
@Table(name="Technologies")
public class Technologies {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="name")
private String Name;
@Column(name="TOC")
private String TOC;
@Column(name="duration")
private Time Duration;
@Column(name="prerequites")
private String Prerequites;
public Technologies() {
	super();
}
public Technologies(int id, String name, String tOC, Time duration, String prerequites) {
	super();
	this.id = id;
	this.Name = name;
	this.TOC = tOC;
	this.Duration = duration;
	this.Prerequites = prerequites;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getTOC() {
	return TOC;
}
public void setTOC(String tOC) {
	TOC = tOC;
}
public Time getDuration() {
	return Duration;
}
public void setDuration(Time duration) {
	Duration = duration;
}
public String getPrerequites() {
	return Prerequites;
}
public void setPrerequites(String prerequites) {
	Prerequites = prerequites;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((Duration == null) ? 0 : Duration.hashCode());
	result = prime * result + ((Name == null) ? 0 : Name.hashCode());
	result = prime * result + ((Prerequites == null) ? 0 : Prerequites.hashCode());
	result = prime * result + ((TOC == null) ? 0 : TOC.hashCode());
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
	Technologies other = (Technologies) obj;
	if (Duration == null) {
		if (other.Duration != null)
			return false;
	} else if (!Duration.equals(other.Duration))
		return false;
	if (Name == null) {
		if (other.Name != null)
			return false;
	} else if (!Name.equals(other.Name))
		return false;
	if (Prerequites == null) {
		if (other.Prerequites != null)
			return false;
	} else if (!Prerequites.equals(other.Prerequites))
		return false;
	if (TOC == null) {
		if (other.TOC != null)
			return false;
	} else if (!TOC.equals(other.TOC))
		return false;
	if (id != other.id)
		return false;
	return true;
}
@Override
public String toString() {
	return "Technologies [id=" + id + ", Name=" + Name + ", TOC=" + TOC + ", Duration=" + Duration + ", Prerequites="
			+ Prerequites + "]";
}


}
