package paket;

public class soru2 {

	public static void main(String[] args) {

		int[][] matris = new int[][]{
		    {1,2,3,4,5},
		    {6,7,8,9,10},
		    {11,12,13,14,15},
		    {16,17,18,19,20},
		    {21,22,23,24,25}};;

		for (int i = 0; i < matris.length; i++) {

			for (int j = 0; j < matris[0].length; j++) {

				System.out.print(matris[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		for (int k = 0; k < 5; k++) {

			for (int t = 4; t < 0; t--) {

				System.out.print(matris[k][t] + "\t");
			}

		}
		int k=0;
		int[] dizi = new int[matris.length*matris[0].length];
		for(int i=0;i<matris.length;i++) {
			for(int j=0;j<matris[0].length;j++) {
				dizi[k]=matris[i][j];			
				k++;
			}
		}
		for(int n=0;n<dizi.length;n++)
			System.out.print(dizi[n]+" ");
	}
}