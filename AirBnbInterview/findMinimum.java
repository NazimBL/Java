public static int secondOrdermin(int a[]){
    
    int min=a[0];
    int min2=a[1];
    for(int i=0;i<a.length;i++){
    
        if(a[i]<min){
           min2=min;
           min=a[i];
        }else if(a[i]<min2)min2=a[i];
    
    }
    return min2;
}

public static int secondOrderminBis(int a[]){
    
    int min=a[0];
    int index=0;
   
    for(int i=0;i<a.length;i++){
    
        if(a[i]<min){
           index=i;
           min=a[i];
        }
    }
    
    min=a[0];
    for(int i=0;i<a.length;i++)if(a[i]<min && i!=index) min=a[i];
    return min;
    
    }
    
public static int nthOrderMin(int a[],int n){
         
     int swap;
      //sort till index n to reduce time complexity
     for(int i=0;i<=n;i++){
         
         for(int j=0;j<a.length-1;j++){
             
            if(a[j+1]<a[j]){
                swap=a[j+1];
                a[j+1]=a[j];
                a[j]=swap;
              
            } 
         }
     }
     return a[n];
    }
    public static void sortArray(int a[]){
     
    int tmp;
    for(int i=0;i<a.length;i++){
        
      for(int j=0;j<a.length-1;j++){
          
          if(a[j+1]<a[j]){
            tmp=a[j+1];
            a[j+1]=a[j];
            a[j]=tmp;
          }
      }           
    }   
  }
