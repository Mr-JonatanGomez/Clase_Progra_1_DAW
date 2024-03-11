package controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model.Asalariado;
import model.Autonomo;
import model.Jefe;
import model.Trabajador;

import java.util.ArrayList;
import java.util.Scanner;


@Setter
@Getter
public class Empresa {
    private ArrayList<Trabajador> listaTrabajadores;
    private String nombre;
    private int numeroJefes = 0;
    private int numeroAutonomos = 0;
    private int numeroAsalariados = 0;

    public Empresa(String nombre) {
        this.nombre=nombre;
        this.listaTrabajadores = new ArrayList<>();
    }

    public void contratarTrabajador(Trabajador trabajador) {
        listaTrabajadores.add(trabajador);
        for (Trabajador item : listaTrabajadores) {
            if (item instanceof Autonomo) {
                ((Autonomo) item).setContratado(true);
            } else if (item instanceof Asalariado) {
                ((Asalariado) item).setContratado(true);
            }
        }
    }


    public void despedirTrabajador(Trabajador trabajador) {
        listaTrabajadores.remove(trabajador);
        if (trabajador instanceof Autonomo) {
            ((Autonomo) trabajador).setContratado(false);
        } else if (trabajador instanceof Asalariado) {
            //casteamos trabajador que es de la SUPERclase a ASALARIADO
            ((Asalariado) trabajador).setContratado(false);
        }

    }

    public void iniciarJornada() {
        for (Trabajador item : listaTrabajadores) {
            item.trabajar();
        }
    }

    public void mostrarPlantillaActual() {
        for (Trabajador item : listaTrabajadores) {
            item.mostrarDatos();
        }
    }


    public void menuRegistro() {
        int opcion;
        do {
            System.out.println("\tQue trabajador quieres registrar??\n\n" +
                    "1.- Jefe\n2.- Autonomo\n3.- Asalariado\n4.- No agregar más");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();
            int numeroTrabajador = 1;
            switch (opcion) {

                case 1:
                    boolean dniRepe = false;
                    if (numeroJefes < 1) {
                        Jefe jefe = new Jefe();
                        jefe.agregarDatos();
                        for (Trabajador itemDni : listaTrabajadores) {
                            if (itemDni.getDni().equalsIgnoreCase(jefe.getDni())) {
                                dniRepe = true;
                            } else {
                                dniRepe = false;
                            }
                        }

                        if (!dniRepe) {
                            listaTrabajadores.add(jefe);
                            numeroJefes++;
                            break;
                        } else {
                            if (dniRepe) {
                                System.out.println("⚠ No puede repetirse el dni ⚠");
                            }
                        }
                        break;
                    } else {
                        System.out.println("⚠ No puede haber más de un jefe ⚠");
                    }
                    break;

                case 2:
                    dniRepe = false;
                    Autonomo autonomo = new Autonomo();
                    autonomo.agregarDatos();
                    for (Trabajador itemDni : listaTrabajadores) {
                        if (itemDni.getDni().equalsIgnoreCase(autonomo.getDni())) {
                            dniRepe = true;
                        } else {
                            dniRepe = false;
                        }
                    }
                    if (!dniRepe) {
                        listaTrabajadores.add(autonomo);
                        autonomo.setContratado(true);
                        numeroAutonomos++;
                        break;
                    } else {
                        System.out.println("⚠ No puede repetirse el dni ⚠");
                        break;
                    }

                case 3:
                    dniRepe = false;
                    Asalariado asalariado = new Asalariado();
                    asalariado.agregarDatos();
                    for (Trabajador itemDni : listaTrabajadores) {
                        if (itemDni.getDni().equalsIgnoreCase(asalariado.getDni())) {
                            dniRepe = true;
                        } else {
                            dniRepe = false;
                        }
                    }
                    if (!dniRepe) {
                        listaTrabajadores.add(asalariado);
                        asalariado.setContratado(true);
                        numeroAsalariados++;
                        break;
                    } else {
                        System.out.println("⚠ No puede repetirse el dni ⚠");
                        break;
                    }
                case 4:
                    System.out.println("Se cerraron las contrataciones");
                    break;
                default:
                    System.out.println("opcion no valida");
                    break;
            }
        } while (opcion != 4);


    }

    public void mostrarDatosEmpresa(){
        System.out.println("\nLa empresa "+nombre+" tiene");
        System.out.println("Numero de Jefes: "+numeroJefes);
        System.out.println("Numero de Autonomos: "+numeroAutonomos);
        System.out.println("Numero de Asalariados: "+numeroAsalariados);
    }

}

