package practica1;

import java.util.Scanner;

public class nomina {
        //Rellenar nomina
    String nombre;
    String DNI;
    int AnioDeAntiguedad;
    Double SalarioBase;
    Double ComplementosSalariales1;
    Double ComplementosSalariales2;
    Double ComplementosSalariales3;
    Double CobroDeLaExtra;
    int NumeroPagaExtra;
    Double ComplementosNoSalariales;
        // calcular nomina
    Double SalarioBruto;
    Double ContigenciasComunes;
    Double IRPF;
    Double SalarioNeto;
    Double ProrrataDeLaPagaExtra;

    public void RellenarNomina() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Su nombre: ");
        nombre = sc.nextLine();

        Scanner f = new Scanner(System.in);

        System.out.println("Su DNI: ");
        DNI = f.nextLine();

        Scanner x = new Scanner(System.in);

        System.out.println("Sus años de antuguedad: ");
        AnioDeAntiguedad = x.nextInt();

        Scanner z = new Scanner(System.in);

        System.out.println("Su salario base: ");
        SalarioBase = z.nextDouble();

        Scanner c = new Scanner(System.in);

        System.out.println("Sus complementos salariales: ");
        ComplementosSalariales1 = c.nextDouble();
        
        Scanner r = new Scanner(System.in);

        System.out.println("Sus complementos salariales: ");
        ComplementosSalariales2 = r.nextDouble();
        
        Scanner y = new Scanner(System.in);

        System.out.println("Sus complementos salariales: ");
        ComplementosSalariales3 = y.nextDouble();

        Scanner v = new Scanner(System.in);

        System.out.println("Su paga doble: ");
        CobroDeLaExtra = v.nextDouble();

        Scanner b = new Scanner(System.in);

        System.out.println("Su paga extras: ");
        NumeroPagaExtra = b.nextInt();

    }
    
    public void CalcularNomina() {
        
        SalarioBruto = SalarioBase + ComplementosSalariales1 + ComplementosSalariales2 + ComplementosSalariales3 + ComplementosNoSalariales;
        double ProrataDeLaExtra = (CobroDeLaExtra * NumeroPagaExtra) / 12;
        ContigenciasComunes = (SalarioBase + ComplementosSalariales1 + ComplementosSalariales2 + ComplementosSalariales3 + ComplementosNoSalariales + ProrataDeLaExtra) * 4.7 / 100;
        SalarioNeto = SalarioBruto - ContigenciasComunes - IRPF;
    }

        
    public void ImprimirNomina() {
        System.out.println("Su salario bruto es " + SalarioBruto + ", el descuento por contingencias comunes es " + ContigenciasComunes + " y el IRPF es " + IRPF + " por tanto, su salario neto es " + SalarioNeto);
    }

        
        
        
    }
    


