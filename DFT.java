public static double[] DFT(double data[],int harmonics){

        int size=data.length;
        double Xk[]=new double[harmonics];
        double realX[]=new double[harmonics];
        double imgX[]=new double[harmonics];

        Xk[0]=0;
        realX[0]=0;
        imgX[0]=0;

        for(int k=0;k<harmonics;k++){

            for(int n=0;n<size;n++){

                double arg=2*Math.PI*n*k/size;
                cos=Math.cos(arg);
                sin=Math.sin(arg);

                realX[k]+=(data[n]*cos);
                imgX[k]+=(data[n]*sin);

            }

        Xk[k]=(realX[k]*realX[k])+(imgX[k]*imgX[k]);
            Xk[k]=Math.sqrt(Xk[k]);

        }

        return Xk;
    }
