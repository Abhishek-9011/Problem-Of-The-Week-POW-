import java.util.*;
public class Solution3 {
    public static int appraoch1(Map<Integer, List<Integer>> adjList) {
        Set<Integer> visited = new HashSet<>();
        int groups = 0;

        for (int student : adjList.keySet()) {
            if (!visited.contains(student)) {
                dfs(student, adjList, visited);
                groups++;
            }
        }
        return groups;
    }

    private static void dfs(int node, Map<Integer, List<Integer>> adjList, Set<Integer> visited) {
        visited.add(node);
        for (int neighbor : adjList.get(node)) {
            if (!visited.contains(neighbor)) {
                dfs(neighbor, adjList, visited);
            }
        }
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        adjList.put(0, Arrays.asList(1));
        adjList.put(1, Arrays.asList(0, 2));
        adjList.put(2, Arrays.asList(1));
        adjList.put(3, Arrays.asList(4));
        adjList.put(4, Arrays.asList(3));
        adjList.put(5, new ArrayList<>()); 

        System.out.println(appraoch1(adjList)); 
    }
}
