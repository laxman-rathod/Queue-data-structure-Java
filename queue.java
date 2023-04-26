//Queue Operations
import java.util.*;
public class queue {
    int max = 5;
    int front,rear;
    int data[] = new int[max];
    void initialize() {
        front = rear = -1;
    }
    int full() {
        if(rear == max -1) {
            return (1);
        }
        else {
            return (0);
        }
    }
    int empty() {
        if(rear == -1) {
            return (1);
        }
        else {
            return (0);
        }
    }
    void insertion() {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter data for insertion : ");
        x = sc.nextInt();
        if(rear == -1) {
            front = rear = 0;
			data[rear] = x;
        }
        else {
            rear = rear +1;
            data[rear] = x;
        }
        System.out.println("\nData insertion successfully!!");
    }
    void deletion() {
        int x;
        x = data[front];
        if(front == rear) {
            front = rear = -1;
        }
        else {
            front = front +1;
        }
        System.out.println("\nData deletion successfully!!");
    }
    void count() {
        int i,Count = 0;
        if(rear == -1) {
            System.out.println("\nQueue is empty!!");
        }
        else {
            for(i = front; i <= rear; i++) {
                Count++;
            }
        }
        System.out.println("\nTotal data present in the queue are : " + Count);
    }
    void display() {
        int i;
        if(rear == -1) {
            System.out.println("\nQueue is empty!!");
        }
        else {
            System.out.print("Queue Data : ");
            for(i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        queue q = new queue();
        int ch;
        q.initialize();
        do {
            System.out.println("\n*******Queueu Operations*******");
            System.out.println("1. INSERTION");
            System.out.println("2. DELETION");
            System.out.println("3. Coutn");
            System.out.println("4. DISPLAY");
            System.out.println("5. EXIT");
            System.out.print("Enter your choice : ");
            ch = sc.nextInt();
            switch(ch) {
                case 1:
                    if(q.full() == 0) {
                        q.insertion();
                    }
                    else {
                        System.out.println("Queue is full!!");
                    }
                    break;
                case 2:
                    if(q.empty() == 0) {
                        q.deletion();
                    }
                    else {
                        System.out.println("Queue is empty!!");
                    }
                    break;
                case 3:
                    q.count();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Thank you!!");
                    break;
                default:
                    System.out.println("Invalid choice!!");
                    break;
            }
        }while(ch != 5);
    }
}