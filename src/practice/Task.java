package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task>{
  //プログラムを作成
	private LocalDate date;
	  private String task;
	  
	  public Task(String task,LocalDate date) {
		  
		  this.task=task;
		  this.date=date;
		  
	  }
	public LocalDate getDate() {
		return date;
	}
	public String getTask() {
		return task;
	}
	
	@Override
	public String toString() {
		return "task"+task+",date="+date;
	}
	
	@Override
	public int compareTo(Task t){
		return this.date.compareTo(t.date);
	}
}