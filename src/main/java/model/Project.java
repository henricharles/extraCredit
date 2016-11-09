package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;


@Entity
public class Project {
	@Id
	@GeneratedValue
	private int pro_id;
	@Temporal(TemporalType.DATE)
	Date start;
	@Temporal(TemporalType.DATE)
	Date end;
	@Enumerated
	Status sttus;
	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Status getSttus() {
		return sttus;
	}
	public void setSttus(Status sttus) {
		this.sttus = sttus;
	}
	public byte[] getDescription() {
		return description;
	}
	public void setDescription(byte[] description) {
		this.description = description;
	}
	public List<Task> getTaskes() {
		return taskes;
	}
	public void setTaskes(List<Task> taskes) {
		this.taskes = taskes;
	}
	public List<Beneficiarie> getBeneficiare() {
		return beneficiare;
	}
	public void setBeneficiare(List<Beneficiarie> beneficiare) {
		this.beneficiare = beneficiare;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Admin getAdmin() {
		return admin;
	}
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	@Lob
	private byte[] description;
	@OneToMany(mappedBy="project")
	List<Task> taskes=new ArrayList<Task>();
	@OneToMany(mappedBy="projecId")
	List<Beneficiarie> beneficiare=new ArrayList<Beneficiarie>();
	private String location;
	@OneToOne
	@JoinColumn(name="admin_id")
	private Admin admin;
	public Project()
	{
		
	}
	
	
	

}
