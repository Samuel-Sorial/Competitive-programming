package ProblemSolving.Queues;

import java.util.*;

public class QueueUsingTwoStacks {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        TwoStackQueue<Integer> queue = new TwoStackQueue<>();
        int totalQueries = in.nextInt();
        for(int i = 0; i < totalQueries; i++){
            int queryType = in.nextInt();
            if(queryType != 1){
                performQuery(queryType, 0, queue);
            }else{
                int currItem = in.nextInt();
                performQuery(queryType, currItem, queue);
            }
        }
    }

    private static void performQuery(int queryType, int currItem, TwoStackQueue<Integer> queue) {
        switch (queryType){
            case 1:
                queue.enqueue(currItem);
                break;
            case 2:
                queue.dequeue();
                break;
            case 3:
                System.out.println(queue.peek());
        }
    }


    private static class TwoStackQueue<Item>{
        private Stack<Item> firstStack;
        private Stack<Item> secondStack;

        public TwoStackQueue(){
            firstStack = new Stack<>();
            secondStack = new Stack<>();
        }
        private void enqueue(Item i){
            firstStack.push(i);
        }
        private Item dequeue(){
            if(secondStack.empty())
                fillSecond();
            return secondStack.pop();
        }

        private Item peek(){
            if(secondStack.empty())
                fillSecond();
            return secondStack.peek();
        }

        private void fillSecond() {
            while (!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }
        }
    }
}
