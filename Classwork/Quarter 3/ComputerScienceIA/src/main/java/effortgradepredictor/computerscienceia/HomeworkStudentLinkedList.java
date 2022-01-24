package effortgradepredictor.computerscienceia;

import java.io.*;

public class HomeworkStudentLinkedList implements Serializable{
	NodeHwStudent start;		// beginning/head/access point of the L. List

	public boolean isEmpty()
	{	return start == null;
	}
	
	public void append(int HomeworkID, int SetDate, int DueDate, int DueTime, String Description, boolean Completed)
	{	NodeHwStudent newNode = new NodeHwStudent(HomeworkID, SetDate, DueDate, DueTime, Description, Completed);
		if( isEmpty() )
		{	start = newNode;
			return;
		}
		NodeHwStudent temp = start;
		// while( temp.next != null ) // also, ...
		while( temp.hasNext() )
		{	temp = temp.next;
		}
		temp.next = newNode;
	}
	
	public void printList()
	{	
		if( isEmpty() )
		{	System.out.println("List is empty");
			return;
		}
		NodeHwStudent temp = start;
		System.out.print("Start -> ");
		while(temp != null)
		{	System.out.print(temp.getHomeworkID() + " ");
			temp = temp.next;
		}
		System.out.println(); //" <- End");
	}
	
        //To remove based on the ID
	public void removesearchID(int searchID)
	{
		if( isEmpty() == true )
		{	System.out.println("ERROR - List is empty.");
			return;
		}
		if( searchID == start.getHomeworkID() )
		{	start = start.next;
			return;
		}
		NodeHwStudent temp1 = start;
		NodeHwStudent temp2 = start.next;
		while(temp2 != null)
		{	if(temp2.getHomeworkID() == searchID)
			{	temp1.next = temp2.next;
				return; // removing this does something!
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}
        
        
        //To remove based on the set date
        public void removesetdate(int SetDate)
	{
		if( isEmpty() == true )
		{	System.out.println("ERROR - List is empty.");
			return;
		}
		if( SetDate == start.getSetDate() )
		{	start = start.next;
			return;
		}
		NodeHwStudent temp1 = start;
		NodeHwStudent temp2 = start.next;
		while(temp2 != null)
		{	if(temp2.getSetDate() == SetDate)
			{	temp1.next = temp2.next;
				return;
			}
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}
	
	public void insertInOrder(int HomeworkID, int SetDate, int DueDate, int DueTime, String Description, boolean Completed)
	{	
		NodeHwStudent newNode = new NodeHwStudent(HomeworkID, SetDate, DueDate, DueTime, Description, Completed);
		if( isEmpty() || HomeworkID < start.getHomeworkID() )
		{	newNode.next = start;
			start = newNode;
		} else {
			NodeHwStudent previous = start;
			NodeHwStudent current  = start.next;
			while(current != null && 
					current.getHomeworkID() < newNode.getHomeworkID())
			{	previous = previous.next;
				current  = current.next;
			}
			newNode.next = current;
			previous.next = newNode;
		}
	}
        
        public static void save() throws IOException{
        FileOutputStream subjectsFOS = new FileOutputStream("subjects.ser");
        ObjectOutputStream subjectOOS = new ObjectOutputStream(subjectsFOS);
        subjectOOS.writeObject(subjects);
        subjectOOS.close();
        subjectsFOS.close();
        System.out.println("\t\t\t\t\tSubjects file saved."); // optional
    }
	
}

