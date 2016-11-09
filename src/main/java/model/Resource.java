package model;

import javax.persistence.*;
@Entity
public class Resource {
	
	@ManyToOne
	@JoinColumn(name="task")
	Task task;
	public Resource()
	{
		
	}
	public Task getTask() {
		return task;
	}
	public void setTask(Task task) {
		this.task = task;
	}
}
