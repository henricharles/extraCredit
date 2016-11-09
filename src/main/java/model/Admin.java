package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
@Entity
public class Admin extends User {
	@OneToOne(mappedBy="admin")
	Project project;
	
	public Admin()
	{
		
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	

}
