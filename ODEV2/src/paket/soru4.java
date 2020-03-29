package paket;

public class soru4 {

	public static void main(String[] args) {
		int dizi[] = {1, 2, 4, 5, 11, 33, 2, 5, 55, 100, 1, 3, 8, 9};
		for(int i=0; i<dizi.length; i++) {
			for(int j=i+1; j<dizi.length; j++) {
				
				if(dizi[i]==dizi[j])
				System.out.print(dizi[i] + " ");
			}
		}
	}
}