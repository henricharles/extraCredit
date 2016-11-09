package model;

import javax.persistence.*;
@Entity
public class Beneficiarie extends User{
	@ManyToOne
	@JoinColumn(name="project")
	Project project;
	public Beneficiarie()
	{
		
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}

}
