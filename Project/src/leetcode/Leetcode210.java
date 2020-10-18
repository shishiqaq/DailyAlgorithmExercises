package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Leetcode210 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        int[] degree = new int[numCourses];
        int[] order = new int[numCourses];
        
        for(int i = 0; i < prerequisites.length; i++){
            int dest = prerequisites[i][0];
            int src = prerequisites[i][1];
            List<Integer> l = adjList.getOrDefault(src, new ArrayList<Integer>());
            l.add(dest);
            adjList.put(src, l);
            
            degree[dest] += 1;
        }
        
        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < numCourses; i++)
            if(degree[i] == 0)
                q.add(i);
        
        int i = 0;
        while(!q.isEmpty()){
            int node = q.remove();
            order[i++] = node;
            
            if(adjList.containsKey(node)){
                for(Integer neighbor : adjList.get(node)){
                    degree[neighbor]--;
                    
                    if(degree[neighbor] == 0)
                        q.add(neighbor);
                }
                    
            }
        }
        if(i == numCourses)
            return order;
    
        return new int[0];
    }
}
