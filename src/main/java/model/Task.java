package model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Task {
	@Id
	@GeneratedValue
	private int task_id;
	@Enumerated
	Status status;
	public int getTask_id() {
		return task_id;
	}
	public void setTask_id(int task_id) {
		this.task_id = task_id;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	public Volunteer getVolunteer() {
		return volunteer;
	}
	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}
	@OneToMany(mappedBy="task")
	List<Resource>resources=new ArrayList<Resource>();
	@OneToOne
	Volunteer volunteer;
	public Task()
	{
		
	}
	

}
