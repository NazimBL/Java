public static void main(String[] args) {
        
    int a[]={4,6,47,12,85};
    int b[]={4,47,85,12};
     
    System.out.println(findMissingXor(a,b));
    }
    
    public static int findMissingXor(int a[], int b[]){
    
   
    int xor_sum=0;
   
    for(int i=0;i<a.length;i++)xor_sum^=a[i];
    for(int i=0;i<b.length;i++)xor_sum^=b[i];
               
    return xor_sum;
    
    }

    public static int findMissing(int a[], int b[]){
    
    boolean tag=false;
    for(int i=0;i<a.length-1;i++)
    {
       
       //if(a[i]!=b[0] && a[i]!=b[1] && a[i]!=b[2] && a[i]!=b[3]) return a[i];
       for(int j=0;j<b.length-1;j++) if(a[i]==b[j])tag=true;
        
      if(!tag)return a[i]; 
      tag=false;
    }
    
    return 0;
    }
