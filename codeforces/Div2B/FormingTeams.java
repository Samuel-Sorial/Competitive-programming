import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FormingTeams {

    static boolean[] visited;
    static int[] firstEnemies;
    static int[] secondEnemies;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalStudents = in.nextInt();
        int totalArchenemies = in.nextInt();
        in.nextLine();
        visited = new boolean[totalStudents +1];
        firstEnemies = new int[totalStudents +1];
        secondEnemies = new int[totalStudents +1];
        for(int i = 1; i <= totalArchenemies; i++){
            int j = in.nextInt();
            int y = in.nextInt();
            int max = Integer.max(j,y);
            int min = Integer.min(j,y);
            if(firstEnemies[min] != 0){
                secondEnemies[min] = max;
            }else{
                firstEnemies[min] = max;
            }
        }
        int totalBenched = 0;
        for(int i = 1; i <= totalStudents; i++){
            int cycleCount = dfs(i);
            if(cycleCount % 2 == 0)
                continue;
            else
                totalBenched += 1;
        }
        if( (totalStudents - totalBenched )% 2 != 0)
            totalBenched +=1;
        System.out.println(totalBenched);
    }

    private static int dfs(int i) {
            visited[i] = true;
            if(firstEnemies[i] != 0 && secondEnemies[i] != 0 && !visited[firstEnemies[i]] && !visited[secondEnemies[i]] )
                return 2 + dfs(firstEnemies[i]) + dfs(secondEnemies[i]);
            else if(firstEnemies[i] != 0 && !visited[firstEnemies[i]])
                return 1 + dfs(firstEnemies[i]);
            else if(!visited[secondEnemies[i]])
                return  1 + dfs(secondEnemies[i]);
            else
                return 0;
    }
}
