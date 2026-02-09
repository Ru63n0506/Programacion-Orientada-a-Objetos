public class testarreglos
{
    int arreglo[], arreglo4;   //arreglo 4 es entero
    int []arreglo2, arreglo5;  //ambos son arreglos
    int[] arreglo3, arreglo6;  //ambos son arreglos
    int matriz[][] = new int[3][3]; ///matriz de 3x3
    int matriz2[][]= { {1,2,3}, {4}, {5,6,7,8}, {9,0} };

    public testarreglos()
    {
        arreglo = new int[5];
        arreglo2 = arreglo;
        arreglo3 = new int[100];

        for(int indice=0;indice<arreglo3.length;indice++)
        {
            arreglo3[indice]=indice;
        }

        arreglo[2]=50;

    }
}