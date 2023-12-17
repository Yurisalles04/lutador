package lutas;

public class Principal {
	
	public static void main(String[] args) {
		System.out.println("Yuri Raphael Salles;");
		Lutador l [] = new Lutador [6];
				
		l [0] = new Lutador ("Pretty boy", "França", 31, 1.95f, 68.9f, 11, 2, 1);
		l [1] = new Lutador ("Anderson Silva", "Brasil", 31, 1.89f, 68.1f, 23, 6, 2);
		
		
		
		Luta UCE01 = new Luta();
		UCE01.marcarLuta(l[1], l[0]);
		System.out.println();
		UCE01.lutar();
		
		
		
		
		
		
		
		
		
		//l [0].apresentar();
		//System.out.println();
		//l [1].apresentar();
		l [1].status();
		l [0].status();

	}

}
