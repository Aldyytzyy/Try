public class Array{
    public static void main(String[] args){
        print("Aldyy",10);
    }
        static void print(String name, int times){
            System.out.println(name +":"+times);
            if(times>1){
                print(name,times -2);
            }
        }
}
