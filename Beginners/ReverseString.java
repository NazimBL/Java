 public static void main(String[] args) {
        
        String reverse="",output="";
        Scanner input=new Scanner(System.in);
        
        reverse=input.nextLine();
        int l=reverse.length()-1;
        
        for(int i=l;i>=0;i--)output=output+reverse.charAt(i);
       
        System.out.print(output);
        
    }
