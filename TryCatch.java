public class TryCatch{
    public static void main(String[] args) {
       int k=1;
       try{
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        for(int i=1;i<=b;i++){
            k=k*a;
        }
        System.out.println(k);
       }catch(Exception e){
        System.out.println("ela number to sarkha nakh mara bhai!!!");
       }
    }
}