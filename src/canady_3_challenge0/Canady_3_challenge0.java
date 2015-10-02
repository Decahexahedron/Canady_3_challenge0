package canady_3_challenge0;

public class Canady_3_challenge0 {

    public static void main(String[] args) {
        for(int i=1; i<500; i++){
            if(isDivtwo(i).equals("2") && isDivthree(i).equals("3") && isDivfive(i).equals("5")){
                System.out.println("Team Building");     
            }
            else if(isDivtwo(i).equals("2") && isDivthree(i).equals("3")){
                System.out.println("chismé");
            }
            else if(isDivthree(i).equals("2") && isDivthree(i).equals("5")){
                System.out.println("Old School");
            }
            else if(isDivtwo(i).equals("22")){
                System.out.println("ninja");
            }
            else if(isDivthree(i).equals("33")){
                System.out.println("Herr Direktor");
            }
            else if(isDivthree(i).equals("55")){
                System.out.println("Animate this!");
            }
            else if(isDivtwo(i).equals("2")){
                System.out.println("Davis");
            }
            else if(isDivthree(i).equals("3")){
                System.out.println("Claughton");
            }
            else if(isDivfive(i).equals("5")){
                System.out.println("Vidal");
            }
            else {
                System.out.println(i);
            }
            
        } //END OF FOR LOOP
    } //THIS IS THE MAIN CLASS CLOSING BRACKET
    
static String isDivtwo(int number){
    if(number % 22 == 0){
        return "22";
    }
    else{
        if(number % 2 == 0){
            return "2";
            }
        else{
            return "none";
        }
        }
    
} //END OF DAVIS  
    
static String isDivthree(int number){
    if(number % 33 == 0){
        return "33";
    }
    else{
        if(number % 3 == 0){
            return "3";
        }
        else{
                return "none";
                    }
    }
} //END OF CLAUGHTON

static String isDivfive(int number){
    if(number % 55 == 0){
        return "55";
    }
    else{
        if(number % 5 == 0){
            return "5";
        }
        else{
                return "none";
                    }
    }
} //END OF VIDAL
    
} //THIS IS THE LAST BRACKET