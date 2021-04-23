public class LinkedList {
    public class Node
    {
        int  data;
        Node next; // (self-reference)

        public Node(int d)	// constructor <- allows you to create
        {					// a node AND initialise its data at
            data = d;		// the same time (with one line of code).
            next = null;	// like: Node n = new Node(5);
        }

        public boolean hasNext()
        {
            if(next == null)
                return false;
            else
                return true;

            // OR // return next != null;
        }

/*
	public String toString()
	{
		return "" + data;
	}
*/

    }

    public class linkedlist {
        Node start;
        public linkedlist() {
            start.next = null;
        }

    }
    public void append(linkedlist a, int element) {
        Node temp;
        temp = a.start;
        while (temp.next != null){
            temp = temp.next;
        }
        Node appender = new Node(element);
        appender = temp.next;
    }

    public void printList(linkedlist a){
        Node temp2;
        temp2 = a.start;

        while (temp2.next!=null);
        temp2=temp2.next;
        System.out.print(temp.data + " ");
    }

    public void remove(linkedlist a, int element){
        Node temp3;
        temp3 = a.start;
        while (temp3.next != null){
            temp3=temp3.next;
            if (temp3.data == element);

        }
    }

    public static void main(String[] args){
        linkedlist a = new linkedlist();
        append(a, 5);


    }
}
