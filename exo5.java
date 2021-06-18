public class exo5 {
    public static void main(String[] args) {
        System.out.println("1 Java atrapalha muita gente! ");
        int a=1; 
        int j = 2;
         
        while (j<=100){
            String nome = "";
            for (int i = 0; i <= a; i++ ){
                nome +="atrapalham ";
            }
            System.out.println(j + " Java " + nome + " muita gente!");
            
            j++;
            a++;
        }
        
    }
} 

