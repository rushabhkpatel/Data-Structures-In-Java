package datastructure.linkedlist;

import java.util.Scanner;

public class LinkedList {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List list = new List();
		while(true) {
			System.out.println("Enter the option : ");
			System.out.println("1. Add Node at any position.");
			System.out.println("2. Delete Node.");
			System.out.println("3. Display List.");
			System.out.println("Press any key to stop!");
			int option = in.nextInt();
			switch(option) {
			case 1 :
				System.out.println("Enter the value of the node and the position");
				int k = in.nextInt();
				int pos = in.nextInt();
				list.add(k,pos);
				break;
			case 2 :
				if(list.head == null) {
					System.out.println("List is empty, nothing to delete");
					break;
				}
				System.out.println("Enter the Node you want to delete.");
				int l = in.nextInt();
				list.delete(l);
				break;
			case 3 :
				if(list.head == null) {
					System.out.println("List is empty.");
					break;
				}
				System.out.println("The list elements are : ");
				list.display();
				break;
			default :
				break;
			}
			if(!(option > 0 && option < 4)) {
				break;
			}
		}
		in.close();
	}
}
