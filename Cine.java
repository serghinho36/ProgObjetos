public class Cine{
	static int ptotal=0;
	static int boletas;
	static int gafas;
	public static int gafas3d(){
		ptotal=ptotal+3000*gafas;
		return ptotal;
	}
	public static int localidad35mm(){
		System.out.println("ingrese la localidad 35mm");
		System.out.println(" 1.localidad general");
		System.out.println(" 2.localidad preferencial");
		int localidad = Integer.parseInt(System.console().readLine());
		if(localidad==1){
			System.out.println("cuantas boletas desea?");
			boletas = Integer.parseInt(System.console().readLine());
			ptotal=ptotal+8000*boletas;
		}else if(localidad==2){
				System.out.println("cuantas boletas desea?");
				boletas = Integer.parseInt(System.console().readLine());
				ptotal=ptotal+11000*boletas;				
			}else{
				System.out.println("digite un valor valido asigando a localidad");
				}
		return ptotal;
	}
	public static void localidad3d(){
		System.out.println("ingrese la localidad 3d");
		System.out.println(" 1.localidad general");
		System.out.println(" 2.localidad preferencial");
		int localidad = Integer.parseInt(System.console().readLine());
		if(localidad==1){
			System.out.println("cuantas boletas desea?");
			boletas = Integer.parseInt(System.console().readLine());
			ptotal=ptotal+12000*boletas;
		}else if(localidad==2){
				System.out.println("cuantas boletas desea?");
				boletas = Integer.parseInt(System.console().readLine());
				ptotal=ptotal+15000*boletas;				
			}else{
				System.out.println("digite un valor valido asigando a localidad");
				}
		System.out.println("cuatas gafas 3D desea? (si no desea oprima 0(cero))");
		gafas = Integer.parseInt(System.console().readLine());
		if(gafas!=0){
			if(gafas>boletas){
				System.out.println("señor usuario, se le recuerda que el numero de gafas no puede exceder el numero de boletas");
			}else{
				gafas3d();
				}
		}
	}
		
	public static void main(String[]args){
		System.out.println("eliga el tipo de pelicua:");
		System.out.println(" 1.pelicua tipo 35mm");
		System.out.println(" 2.pelicua tipo 3D");
		int tipopeli=Integer.parseInt(System.console().readLine());
		if(tipopeli==1){
			localidad35mm();
		}else if(tipopeli==2){
				localidad3d();			
			}else{
				System.out.println("digite un valor valido asigando a tipo de pelcula");
				}
		System.out.println(ptotal);
	}
}