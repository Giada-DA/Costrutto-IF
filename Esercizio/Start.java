public class Start {
    public static void main(String[] args) {
        String myName = "Giada";
        int length = myName.length();   //stringa -> numero
        //System.out.println(length);  //5
        if(length %2 == 0){
            System.out.println(myName + " è" + " pari");
        }else{
            System.out.println(myName + " è" + " dispari");
        }
    }
}