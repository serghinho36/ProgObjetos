class Foo{
	public static void main(String[]args){
		System.out.println("a cuantos empleados se le calculara la nomina?");
		double pagototal= 0;
		int num = Integer.parseInt(System.console().readLine());
		double[] nomina=new double[num];
		String[] nombres=new String[num];
		for(int i=0; i<num; i++){
			System.out.println("ingrese el nombre del empleado a calcular su pago");
			nombres[i]=System.console().readLine();
			System.out.println("cuantas horas trabajadas fueron?");
			int hsemana = Integer.parseInt(System.console().readLine());
			if(hsemana>60){
				System.out.println("ha excedido el numero maximo de horas...solo se le pagaran 60 horas");
				pagototal=40*8+20*1.5*8;
			}else if(hsemana>40){
					pagototal=(hsemana-40)*1.5*8+40*8;
				}else{
					pagototal=hsemana*8;
					}
			nomina[i]=pagototal;
			System.out.println("al empleado "+nombres[i]+" se le paga $"+nomina[i]+" dolares");
		}
		double ptotaln=0;
		for(int i=0; i<num; i++){
			ptotaln += nomina[i] ;
		}
		System.out.println("el total de nomina calculada es "+ptotaln);
	}
}