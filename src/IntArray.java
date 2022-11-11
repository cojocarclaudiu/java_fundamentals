public class IntArray {

    private Integer[] array;
    public static int currentIndex;
    public IntArray(int size) {
        this.array = new Integer[size];
        currentIndex = 0;
    }

    public void add(Integer value){
        if(currentIndex == array.length){
            rewritesArray();
            array[currentIndex] = value;
            currentIndex++;
        }else{
            array[currentIndex] = value;
            currentIndex++;
        }
    }

    private void rewritesArray() {
        Integer[] arrayCopy = array;
        array = new Integer[array.length+1];
        for(int i = 0 ; i < arrayCopy.length ; i++){
            array[i] = arrayCopy[i];
        }
    }

    public void add(Integer value, int idx){
        while(idx > array.length){
            rewritesArray();
            currentIndex ++;
        }
        rewritesArray();
        moveArray(value,idx);
    }

    private void moveArray(Integer value, int idx){
        for(int i = array.length-1 ; i> idx ; i--){
            array[i] = array[i-1];
        }
        array[idx] = value;
    }

    public String get(int idx){
        if(idx < array.length){
            return "Element on the " + idx + " position is " +array[idx];
        }else return "Index out of range...";
    }

    public void remove(int idx){
        if(idx> array.length){
            System.out.println("Index out of range...");
        }else {
            Integer[] arrayCopy = new Integer[array.length - 1];
            for(int i = 0 ; i < idx ; i++){
                arrayCopy[i] = array[i];
            }
            for(int i = idx ; i < arrayCopy.length ; i++){
                arrayCopy[i] = array[i+1];
            }
            array = arrayCopy;
        }

    }

    public void swap(int from, int to){
        if(from > array.length || to > array.length){
            System.out.println("Indexes out of range...");
        }else{
            Integer copy = array[from];
            array[from] = array[to];
            array[to] = copy;
        }
    }

    @Override
    public String toString() {
        String array = "";
        for(Integer element: this.array){
            array += (element + " ");
        }
        return array;
    }
}
