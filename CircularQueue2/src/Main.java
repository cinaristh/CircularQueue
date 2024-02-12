
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // write your code here
        int head = 0;
        int tail = -1;
        int itemCount = 0;//the queue is full if there is 10 items]
        String[] items = new String[10]; //a zero c=based array from 0 to 9

        //initialise empty array
        for (int i = 0; i <= 9; i++) {
            items[i] = "";

        }
        String input = "";

        while (input.equals("q") == false) {
            System.out.println("v to view or q to quit");
            System.out.println("a to add items to the tail of the queue");
            System.out.println("r to remove items from the head");

            Scanner inp = new Scanner(System.in);
            input = inp.nextLine();

            if (input.equals("v")) {
                System.out.println("\nFRONT");
                for (int i = 0; i <= itemCount - 1; i++) {
                    int index = (head + i) % 10;
                    System.out.println(index + ".." + items[index]);
                }
                System.out.println("\nREAR");
            }
            if (input.equals("a")) {
                if (itemCount == 10) {
                    System.out.println("Queue overflow + \ncan't add anymore!");

                } else {//add item
                    System.out.println("Type an item to add");
                    input = inp.nextLine();
                    //rotate round add algorithm
                    if (tail == 9) {
                        tail = 0;
                    }
                    tail = tail + 1;
                    items[tail] = input;
                    System.out.println(input + " added.\n");
                    itemCount = itemCount + 1;
                }

            }
            if (input.equals("r")) {
                if (itemCount == 0) {
                    System.out.println("QUEUE UNDERFLOW! \n can't remove from an empty queue.");

                } else {
                    //remove item
                    items[head] = " ";
                    if (head == 9) {
                        head = 0;
                    } else {
                        head = head + 1;
                    }
                    itemCount = itemCount - 1;
                    System.out.println("\nitem removed\n");

                }


            }
        }
    }

}