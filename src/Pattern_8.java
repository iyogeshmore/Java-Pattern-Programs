public class Pattern_8 {
    public static void main(String args[]){
        int x = 5;
        int y =2;
        for (int i=1;i<=x;i++){
            for (int j=1;j<=x;j++){
                System.out.printf("%3d",y);
                y+=2;
            }
            System.out.println();
        }
    }
}
