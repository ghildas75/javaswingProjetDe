


import java.util.Random;

public class De {
private int chiffre;
private int max;
private static String fichierImage;
private String nomPicture;
public String getNomPicture() {
	return nomPicture;
}
public void setNomPicture(String nomPicture) {
	this.nomPicture = nomPicture;
}
public static int nbreDeReel=0;

public String toString() {
	return "De [chiffre=" + chiffre + ", max=" + max + "]";
}
	public De(int max) {
		this.max=6;
	    nbreDeReel++;
		tire();
		
	}
	public int getChiffre() {
		
		return chiffre;
	}
	public void setChiffre(int chiffre) {
		this.chiffre = chiffre;
	}
	public int getMax() {
		return max;
	}
	

	
public int tire(){
	
	this.chiffre = (int)((max)*Math.random())+1; 
	switch(chiffre){
	
	case 1:
		nomPicture="Des_1.png";
		 break;
	case 2:
		nomPicture="Des_2.png";
		 break;
	case 3:
		nomPicture="Des_3.png";
		 break;
	case 4:
		nomPicture="Des_4.png";
		 break;	 
	case 5:
		nomPicture="Des_5.png";
		 break;
	case 6:
		nomPicture="Des_6.png";
		 break;	 
	}
	return  chiffre;
}
	
	
public String getFichierImage() {
	return fichierImage;
}
public void setFichierImage(String fichierImage) {
	this.fichierImage = fichierImage;
}
}
