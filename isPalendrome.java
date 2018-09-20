

public static boolean isPalendrome(String word){

        boolean tag=true;
        int i=0,j=word.length()-1;
        
        while(i<word.length()){
            if(word.charAt(i)!=word.charAt(j)){
                tag=false;
                break;
            }
            j--;
            i++;
        }
        return tag;
    }
