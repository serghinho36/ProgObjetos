public class IMC{
	public static void main(String[]args){
		System.out.println("ingrese su estatura");
		double estatura = Double.parseDouble(System.console().readLine());
		System.out.println("ingrese su peso");
		double peso= Double.parseDouble(System.console().readLine());
		double IMC=peso/(estatura*estatura);
		if (IMC<18.5){
			System.out.println("calificacion de infrapeso:");
			if (IMC<16.0){
				System.out.println("delgadez severa");
			}else if (IMC<17.0){
				System.out.println("delgadez moderada");
				}else{
					System.out.println("delgadez no muy pronunciada");
				}
		}
		if (IMC<25.0 && IMC>18.5){
			System.out.println("normal");
		}
		if (IMC>=25.0){
			System.out.println("Calificacion de sobrepeso:");
			if (IMC<30.0){
				System.out.println("Pre-obeso");
			}else if (IMC>=30.0){
				System.out.println("Calificacion de obesidad:");
				if (IMC<35.0){
					System.out.println("Obeso tipo I");
				}else if (IMC<40){
					System.out.println("Obeso tipo II");
					}else{
						System.out.println("Obeso tipo III");
					}
			}
		}
		System.out.println("El indice de masa corporal es:" + IMC);
	}
}




























