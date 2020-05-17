import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeamOlympiad {

    /* https://codeforces.com/contest/490/problem/A */
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalStudents = in.nextInt();
        in.nextLine();
        String students = in.nextLine().replaceAll("\\s","");
        List<Integer> programmingStudents = new ArrayList<>();
        List<Integer> mathStudents = new ArrayList<>();
        List<Integer> physicalStudents = new ArrayList<>();
        for(int i = 0; i < totalStudents; i++){
            char curr = students.charAt(i);
            switch (curr){
                case '1':
                    programmingStudents.add(i+1);
                    break;
                case '2':
                    mathStudents.add(i+1);
                    break;
                case '3':
                    physicalStudents.add(i+1);
            }
        }
        int teamNumbers = Integer.min(mathStudents.size(), Integer.min(programmingStudents.size(), physicalStudents.size()));
        System.out.println(teamNumbers);
        for(int i = 0; i < teamNumbers; i++){
            System.out.println(programmingStudents.get(i)+ " "  + mathStudents.get(i) + " " + physicalStudents.get(i));
        }
    }
}
