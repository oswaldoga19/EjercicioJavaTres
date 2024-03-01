/*
 * Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. El porcentaje de retención en la fuente es del 12,5% 
   del salario bruto. Se desea saber cuál es el salario bruto, la retención en la fuente y el salario neto del trabajador.
 */
package ejeciciojavatres;

public class EjecicioJavaTres {

    public static void main(String[] args) {
        double horasTrabajadas = 48;
        double valorHora = 5000; // valor por hora
        double rtf = 12.5; // Porcentaje de retención en la fuente

        // Cálculos arimeticos
        double salarioBruto = valorHora * horasTrabajadas;
        double retencionFuente = (rtf / 100) * salarioBruto;
        double salarioNeto = salarioBruto - retencionFuente;

        // Imprimir los resultados
        System.out.println("El salario Bruto: $" + salarioBruto);
        System.out.println("la retención en la Fuente: $" + retencionFuente);
        System.out.println("El salario Neto: $" + salarioNeto);
    }
    
}
