import java.util.*;
public class ListApplication {
    public static void main(String[] args) {
        List<Integer>run=new ArrayList<>();
        List<String>player=new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number of Players: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter the PLayer "+(i+1) +" name: ");
            String b=sc.nextLine();
            player.add(b);
            System.out.println("Enter the run of the Player "+(i+1));
            int r=sc.nextInt();
            sc.nextLine();
            run.add(r);

        }
        for(String pl: player){
            System.out.println(pl);
        }
        for(int rr:run){
            System.out.println(rr);
        }
    }
}
