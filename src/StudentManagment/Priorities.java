package StudentManagment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priorities {
	
	private Queue<Student> queue = new PriorityQueue<>(
			Comparator.comparingDouble(Student::getCGPA).reversed()
			.thenComparing(Student::getName)
			.thenComparingInt(Student::getId));
	
	public void addStudent(String name, double cgpa) {
		queue.add(new Student(queue.size()+1,name,cgpa));
	}
	
	public void serveStudent() {
		if(!queue.isEmpty()) {
			queue.poll();
		}
	}
	
	public List<Student> getUnservedStudent(){
		return new ArrayList<>(queue);
	}

}
