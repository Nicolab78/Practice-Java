package exo9;

public class IndexOf {

    public static void run(){
        System.out.println("exo 9 : Index Of");
    }

    public static int IndexOf(String s, char c){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                return i;
            }
        }

        return -1;

    }
}
