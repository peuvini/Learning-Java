package POO;
public class Person {
        private String firstName;
        private String lastName;
        private int age;
        
        public String getFirstName(){
            return firstName;
        }
        
        public String getLastName(){
            return lastName;
            
        }
        
        public int getAge() {
            return age;
        }
        
        public void setFirstName(String nome){
            firstName = nome;
        }
        
        public void setLastName(String nome2){
            lastName = nome2;
        }
        
        public void setAge(int age2){
            if(age2 < 0 || age2 > 100){
                age = 0;
            } else{
                age = age2;
            }
        }
        
        public boolean isTeen() {
            if(age > 12 && age < 20){
                return true;
            } else{
                return false;
            }
        }
        
        public String getFullName(){
            if((firstName.isEmpty() == true) && (lastName.isEmpty() == true)){
                return "";
            } else if (lastName.isEmpty() == true){
                return firstName;
            } else if(firstName.isEmpty() == true){
                return lastName;
            } else {
                return firstName + " " + lastName;
            }
        }  
}
