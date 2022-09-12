package ar.edu.unq.po2.tp3;

public class Multiplos {
	   public int x;
	   public int y;
  
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public int maximoMultiploEntre(int x ,int y) {
		if(es_MultiploDe_y_(multiploMaxDe(x),x,y)){
			return multiploMaxDe(x);
		}
		else if(es_MultiploDe_y_(multiploMaxDe(y),x,y)) {
			return multiploMaxDe(y);
		}
		else { return -1; }
	}


public  boolean esMultiplo(int n1,int n2){
	if (n1%n2==0)
		return true;
	else
		return false;
}

public int multiploMasAltoEntre(int n1, int n2) {
	if(n1 > n2) {
		return n1;
	}
	else{return n2;}
}

public int multiploMaxDe(int n) {
	int num = 0;
	
	while(n <= 1000) {
	 num = (num * num);
	}
	
	return num;
}

public boolean es_MultiploDe_y_(int m, int n1, int n2) {
	if(esMultiplo(m, n1) && esMultiplo(m,n2)){
		return true;
	}
	else {return false;}
}
}

