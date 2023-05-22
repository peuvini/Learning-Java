package POO;
public class SimpleCalculator {
    private  double firstNumber;
    private  double secondNumber;
    
    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    
    public void setFirstNumber(double n1){
        firstNumber = n1;
    }
    
    public void setSecondNumber (double n2){
        secondNumber = n2;
    }
    
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    
    public double getMultiplicationResult(){
        return secondNumber * firstNumber;
    }
    
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }else{
            return firstNumber / secondNumber;
        }
    }

}