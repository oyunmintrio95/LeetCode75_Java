package day15;

public class Day15_LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((stone1, stone2) -> stone2 - stone1);

        //Adding elements of stones array into priorityQueue
        //It will be ordered in acending order
        for(int stone: stones){
            pq.add(stone);
        }

        while(!pq.isEmpty()){
            //take heaviest stone
            int y = pq.poll();
            if(pq.isEmpty()){
                // if the only one stone is left, then that is the answer
                return y;
            }else{
                // take the second heaviest stone
                int x = pq.poll();
                if(x != y){
                    pq.add(y-x);
                }
            }
        }

        return 0;

    }
}
