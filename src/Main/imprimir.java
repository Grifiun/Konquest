package Main;

public class imprimir{
	String[][] mat = {{"aa", "bb", "cc", "dd"}, {"aaaa", "basdasdasbb", "cc", "ddddd"}, {"aa", "bb", "cc", "dd"}, {"aa", "bb", "cc", "dd"}};
	int longitud;
	public void imp(){
		longitud = verificarLongitudPalabras(mat);
		imprimirMatriz(mat);
	}

	public void imprimirMatriz(String[][] mat){
		int longaux = 0;
		for(int i = 1; i <= ((mat[0].length)*2 + 1); i++){//se multipĺica por 2 y se suma 1 para que cada cada dato tenga un borde
			for(int j = 1; j <= ((mat.length)*2 + 1); j++){//lo mismo se hace acá
				if((i + 1)%2 != 0){
					if((j + 1)%2 != 0){
						longaux = longitud  -  mat[((i+1)/2)-1][((j+1)/2)-1].length();
						imprimirSignos(longaux/2);
						System.out.print(mat[((i+1)/2)-1][((j+1)/2)-1]);
						if(longaux % 2 == 1)
							longaux++; 						
						imprimirSignos(longaux/2);
						longaux = 0;
					}else{
						imprimirSignos(longitud);;
					}
				}else{
					imprimirSignos(longitud);
				}
			}
			System.out.println("");
		}
	}

	public int verificarLongitudPalabras(String[][] matPalabras){
		int longitud = 0;
		for(int i = 0; i < matPalabras[0].length; i++){
			for(int j = 0; j < matPalabras.length; j++){
				if(matPalabras[i][j].length() > longitud){
					longitud = matPalabras[i][j].length();
				}
			}	
		}		
		return longitud;
	}
	public void imprimirSignos(int longitud){
		for(int k = 0; k < longitud; k++)
			System.out.print("#");
	}
}



