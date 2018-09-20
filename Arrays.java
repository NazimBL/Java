public class Location {

    double max;
    int i,j;
        
    public Location(){
    max=0;
    i=0;
    j=0;
    }
        
    public Location(int i,int j,double m){
        this.i=i;
        this.j=j;
        this.max=m;

    }
}

 public static void convertToArray(int number){
        byte i=0;
        int[] array=new int[10];
        while(number>0){
            array[i]=number%10;
            number/=10;
            System.out.println(array[i]);
            i++;
        }
    }
    public static int digitOccurence(int number,int n){

        int temp,count=0;
        while(number>0){
            temp=number%10;
            if(temp==n)count++;
            number/=10;
        }
        return count;
    }
    public static int[][] makeMat(int n,int m){
        Scanner sc=new Scanner(System.in);
        int [][] matrix=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
                System.out.println(matrix[i][j]);
            }
        }
        return matrix;

    }
    public static int[][] multMat(int[][] matrix1,int[][] matrix2,int size){

        int[][] matrix3=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                for(int k=0;k<size;k++){
                    matrix3[i][j]+=matrix1[k][j]*matrix2[i][k];
                }
            }
        }
     return matrix3;
    }
    public static void showMat(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.println(matrix[i][j]);
            }
        }
    }

void maxTest(){

        int n=maxInt(26,33,1,16);
        System.out.println("Max of 26,33,1 and 16 is "+n);
        n=maxInt(new int[]{1,3,2});
        System.out.println("Max of 1,3 and to is "+n);
    }

    static int maxInt(int ...numbers){
        int result = 0;
        if (numbers.length != 0){
            result = numbers[0];
            for (int i=0; i<numbers.length; ++i){
                if (numbers[i]>result){
                    result = numbers[i];
                }
            }
        }
        return result;
    }
    public static void display(double[][] array){
        System.out.println("Array Content : ");
        for(int i=0;i<array.length;i++){
            for (int j=0;j<array[i].length;j++){
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    
    static void location(){

        double[][] array=readArray();
        Location location = detectLargestLocation(array);
        display(array);

        System.out.println(" Maximum Value : "+location.max);
        //+ 1 since our starts from 0
        System.out.println(" Row : "+(location.i+1));
        System.out.println(" Column : "+(location.j+1));
    }
    public static double[][] readArray(){
        System.out.println("Write the number of Rows ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        System.out.println("Write the number of Columns ");
        Scanner sc2 = new Scanner(System.in);
        int j = sc2.nextInt();

        double[][] array = new double[i][j];

        for (int k = 0; k < array.length; k++) {

            for (int l = 0; l < array[k].length; l++) {
                System.out.println("Write the array values ");
                Scanner sc3 = new Scanner(System.in);
                array[k][l] = sc3.nextDouble();

            }
        }
        return array;
    }


    public static Location detectLargestLocation(double[][] array) {
        int locX = 0, locY = 0;
        double max = 0;
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    locX = i;
                    locY = j;
                }
            }
        }

        return new Location(locX, locY, max);
    }
