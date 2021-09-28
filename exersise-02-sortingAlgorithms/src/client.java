
public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
            int arr[] ={3,60,35,2,45,320,5};  
             
            System.out.println("Array Before any Sort");  
            for(int i=0; i < arr.length; i++){  
                    System.out.print(arr[i] + " ");  
            }  
            System.out.println();  
            
            BubbleSort b = new BubbleSort();
            
            
            b.bubbleSort(arr);//sorting array elements using bubble sort  
             
            InsertionSort i = new InsertionSort();
            
            i.insertionSort(arr);
            
            SelectionSort s = new SelectionSort();
            
            s.selectionSort(arr);
            

    }  
	

}

