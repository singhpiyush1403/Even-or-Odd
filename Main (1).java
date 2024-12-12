public class Main {
    public static void main(String args[]){
        
        A o = new A();
    
        o.getData(7);
        boolean isEven = o.checkEven();
        
        if(isEven)
    
            System.out.print("even");
        else
            System.out.println("odd");
            
            int y = o.square();
            System.out.println(y);
            
    }
}

class A {
    int num1;
    int square(){
        return num1 * num1;
    
    }
    void getData(int x){
        num1 = x;
    }
    
    boolean checkEven(){
        if(num1 % 2 == 0){
           
            return true;}
        
        else {
            return false;
        }
    }
}
