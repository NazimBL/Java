
public void writeexample {
 
String sourcePath="D:\\source.dat";
 String targetPath="D:\\target.txt";

    File sourceFile=new File(sourcePath);
        if(sourceFile.exists()){
            try{
                DataInputStream inputStream=new DataInputStream(new FileInputStream(sourceFile));
                int bytesCopied =inputStream.available();
                //the destination array on which we will store the data read from the file
                byte[] bytes=new byte[bytesCopied];

                //this line read our file content and store into our array of bytes
                inputStream.read(bytes,0,bytesCopied);

                DataOutputStream dataOutputStream=new DataOutputStream(new FileOutputStream(targetPath));
                //write the array of bytes into our target file
                dataOutputStream.write(bytes,0,bytesCopied);

                System.out.println(sourceFile+ " Copied to "+targetPath);
                System.out.println(bytesCopied+" bytes copied");
            }catch(IOException e){
                System.out.println(e.toString());
            }
        }else System.out.println("Source ile doesn't exist , check your path string");

}

 public void readexample(File file) throws Exception{
        FileInputStream inputStream=new FileInputStream(file);
        System.out.println(inputStream.available());
        byte[] bytes=new byte[inputStream.available()];

        System.out.println(inputStream.read(bytes,0,inputStream.available()));
        for(int i=0;i<bytes.length;i++){
            System.out.print((char)bytes[i]);
        }
    }

