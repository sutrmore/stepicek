import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean n = true;
        List<String> favouriteBooks = new ArrayList<String>();
        while(n==true){
            System.out.print("Enter Book Name: ");
            String bookName = sc.nextLine();
            if(bookName.equals("konec")){
                n = false;
                for(int i=0; i<favouriteBooks.size(); i++){
                    System.out.println(favouriteBooks.get(i));
                }
            }
            else{
                favouriteBooks.add(bookName);
            }
        }
    }
}