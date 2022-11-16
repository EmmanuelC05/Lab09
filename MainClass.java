
import java.util.Stack;


public class MainClass {

    
    public static void main(String[] args) {
    }
    
public static boolean isBalanced(String expresion){
   
    char[] exp = expresion.toCharArray();
    Stack<Character> stack = new Stack();
    
    
    
    for(int i=0;1<exp.length;i++){
        if(exp[i]=='('){
            stack.push('(');
        }
         
    if(exp[i]==')'){
        if(stack.isEmpty()){
            return false;
            
        }
        stack.pop();
        System.out.println("Not balanced");  
    }
}
    if(stack.isEmpty())
    System.out.println("Balanced");{
        
        return true;
     
    }
    return false;
    }

    
}
