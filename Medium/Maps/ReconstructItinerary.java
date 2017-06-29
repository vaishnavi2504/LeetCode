//https://leetcode.com/problems/reconstruct-itinerary/#/description

//Steps
//Have a hash map- key- arrivals from the string matrix and value- priority queue of departures
//Having priority queue ensures that lexicographical order is maintained
//Use DFS with "JFK" as the starting point

public class Solution {
//LinkedList supports addfirst operation
    LinkedList<String>path=new LinkedList<>();
    Map<String, PriorityQueue<String>> hm=new HashMap<>();
    
    public List<String> findItinerary(String[][] tickets) {
        for(int i=0;i<tickets.length;i++){
            hm.putIfAbsent(tickets[i][0],new PriorityQueue<String>());
            hm.get(tickets[i][0]).add(tickets[i][1]);
        }
        dfs("JFK");
        return path;
    }
    
    public void dfs(String arrivals){
        PriorityQueue<String> dep=hm.get(arrivals);
        while(dep!=null&&!dep.isEmpty()){
            dfs(dep.poll());
        }
        path.addFirst(arrivals);
    }
}