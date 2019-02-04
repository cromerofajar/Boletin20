package boletin20_2;

/**
 *
 * @author cromerofajar
 */
public class Metodos {
    public void piramide(int filas){
        int[] num1 = new int[0];
        for (int i=1;i<=filas;i++) {
            int[] num2 = new int[i];
            for (int j=0;j<i;j++) {
                if (j==0 || j==(i-1)) {
                    num2[j]=1;
                } else {
                    num2[j]=num1[j]+num1[j-1];
                }
                System.out.print(num2[j] +" ");
            }
            num1=num2;
            System.out.println();
        }
    }
}
