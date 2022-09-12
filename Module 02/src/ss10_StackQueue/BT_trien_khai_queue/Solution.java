package ss10_StackQueue.BT_trien_khai_queue;

import java.util.Scanner;

public class Solution {
    private static Queue<Integer> queue=new Queue<>();
    public static void main(String[] args) {
        enQueue();
        System.out.println();
        deQueue();
    }

    public static void enQueue()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        for (int i=1; i<10; i++)
        {
            int input = scanner.nextInt();
            queue.enQueue(input);
            System.out.print(input+" ");
        }
    }

    public static void deQueue()
    {
        System.out.print("Output: ");
        do {
            Node node=queue.deQueue();
            if(node==null) break;
            System.out.print(node.data+" ");
        }while (true);
    }
}
