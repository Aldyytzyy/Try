import java.util.Scanner;
public class Introduction {
    public static void main(String[]args){
        String nama="";
        try(Scanner input=new Scanner(System.in)){
        System.out.print("Namamu?   :");
        nama=input.nextLine();
        }
        for(int i=0;i<100;i++){
            System.out.println("nice to meet you, "+nama);
        }
        
    } 
} 
