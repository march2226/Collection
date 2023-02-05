package practice;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	public static void main(String[] args) {
	    // プログラムを作成
		List<Task> list = new ArrayList<>();
		
		  Task task1 = new Task("牛乳を買う", LocalDate.of(2021, 10, 21));
		  Task task2 = new Task("○○社面接", LocalDate.of(2021, 9, 15));
		  Task task3 = new Task("手帳を買う。",LocalDate.of(2021,12,4));
		  Task task4 = new Task("散髪に行く。",LocalDate.of(2021,8,10));
		  Task task5 = new Task("スクールの課題を解く。",LocalDate.of(2021,11,9));
		
		 list.add(task1);
		 list.add(task2);
		 list.add(task3);
		 list.add(task4);
		 list.add(task5);
	
		 Collections.sort(list);
	 
		 for (Task t : list) {
		      System.out.println(t.getDate() + ":" + t.getTask());
		 }
	  }
}
