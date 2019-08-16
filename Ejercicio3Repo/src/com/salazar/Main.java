package com.salazar;

public class Main {

    public static void main(String[] args) {
        Empleado Jose = new Empleado("Jose", "jose.salazar3264@gmail.com", 125000d, "El mero mero");
        Empleado Marina = new Empleado("Marina", "marina.diamandis@icloud.com", 1000000d, "Cantante");
        Empleado Thayris = new Empleado("Thayris", "aguilar_nicole96@outlook.com", 3d, "Criada");
        Empleado Moises = new Empleado("Moises", "antoniofloresjr@gmail.com", 10000d, "Ing. en sistemas");
        Empleado Kevin = new Empleado("Kevin", "kevinmamado@gmail.com", 4000d, "Gerente de un hotel");

        Empleado[] info = new Empleado[5];

        for(int i=0; i<5; i++){
            if (Empleado.salario > 30000){
                System.out.println("Empleado: " + info.length + " Salario: " + info.length);

            }
        }

    }
}
