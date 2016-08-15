public class Session7Assignment1
{
    public static void main(String [] args) 
    {
          try
            {
                  int arr[]=new int[5];
                   arr[0] = 10;
                   arr[1] = 20;
                   arr[2] = 30;
                   arr[3] = 40;
                   arr[4] = 50; 

                   System.out.println("The elements of the arrays are : ");
                   for (int i=0; i < arr.length; i++)
                   {
                       System.out.println(arr[i] + " ");

                   }                
        
                   System.out.println("Element at 7th position is : "+ arr[6]);
              }

      catch(ArrayIndexOutOfBoundsException e)
      {
       
          System.out.println("Array is out of Bounds : "+e);
      }        
          
   }
}