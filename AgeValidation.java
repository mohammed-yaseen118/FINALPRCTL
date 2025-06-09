public class AgeValidation {

    public String CheckAge(int age){

        if(age>=18){

            return "Eligible to vote";
        }else{
            return "not eligible to vote";
        }
    }
    public static void main(String[] args) {
        
        AgeValidation av = new AgeValidation();
        System.out.println("Age is :"+av.CheckAge(20));
    }
    
}
