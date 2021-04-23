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

        public linkedlist(int a) {
            start.next = null;
        }

        public void append(int element) {
            Node temp = new Node(element);
            temp = start;
            while (temp.next != null){
                temp = temp.next;
            }
            temp = temp.next;
        }

    }

    public static void main(String[] args){


    }
}
