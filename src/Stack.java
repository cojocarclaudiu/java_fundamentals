public class Stack {

    Integer[] stack;
    int index;
    public Stack(int count){
        stack = new Integer[count];
        this.index = 0;
    }
    public void push(Integer e){
        if(isFull()){
            System.out.println("The stack is full...");
        }else{
            int i = 0;
            while(stack[i]!=null){
                i++;
            }
            stack[i] = e;
            index++;
        }
    }
    public Integer pop(){
        if(isEmpty()){
            System.out.println("The stack is empty...");
            return null;
        }else{
            Integer copy = stack[index-1];
            stack[index-1] = null;
            index--;
            return copy;
        }
    }
    public boolean isEmpty(){
        return index==0 ? true : false;
    }
    public boolean isFull(){
        return index == stack.length ? true : false;
    }
    @Override
    public String toString(){
        String stackToString ="";
        for(Integer item:stack){
            if(item!=null){
                stackToString += (item + " ");
            }
        }
        return stackToString.equals("")? "Stack is empty" : stackToString;
    }


}
