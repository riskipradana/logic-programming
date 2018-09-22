package strukturdata.stack;

/**
 *
 * @author riskipradana
 */
public class Stack {
    private int size;
    private int top;
    private int []data;
    
    public Stack(int n){
        top = -1;
        size = n;
        data = new int[size];
    }
    
    public boolean isFull(){
        return top == (size-1);
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    
    public void push(int dt){
        if (!isFull()){
            data[++top] = dt;
        }
    }
    
    public int pop(){
        int hasil = 0;
        if(!isEmpty()){
            hasil = data[top--];
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        
//        Stack stack = new Stack(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop());
//        }
        
        //app stack
        int nilai = 10;
        Stack stackModulo = new Stack(100);
        while(nilai != 0){
            int sisa = nilai % 2;
            stackModulo.push(sisa);
            nilai = nilai/2;
        }
        while (!stackModulo.isEmpty()){
            System.out.println(stackModulo.pop());
        }
    }
}
