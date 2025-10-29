package Tema2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PokemonBattleSimulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreadLocalRandom rand = ThreadLocalRandom.current();

        // =================================================================================
        // --- DECLARACION DE ESTADISTICAS Y MOVIMIENTOS DE TODOS LOS POKEMON --- 
        // =================================================================================

        // --- Pikachu Stats & Moves ---
        int hpPikachu = 35, atkPikachu = 55, defPikachu = 40, spAtkPikachu = 50, spDefPikachu = 50, spePikachu = 90;
        String tipoPikachu = "Electrico";
        String movTipoPikachu = "Impactrueno";

        // --- Charmander Stats & Moves ---
        int hpCharmander = 39, atkCharmander = 52, defCharmander = 43, spAtkCharmander = 60, spDefCharmander = 50, speCharmander = 65;
        String tipoCharmander = "Fuego";
        String movTipoCharmander = "Ascuas";

        // --- Squirtle Stats & Moves ---
        int hpSquirtle = 44, atkSquirtle = 48, defSquirtle = 65, spAtkSquirtle = 50, spDefSquirtle = 64, speSquirtle = 43;
        String tipoSquirtle = "Agua";
        String movTipoSquirtle = "Pistola Agua";

        // --- Bulbasaur Stats & Moves ---
        int hpBulbasaur = 45, atkBulbasaur = 49, defBulbasaur = 49, spAtkBulbasaur = 65, spDefBulbasaur = 65, speBulbasaur = 45;
        String tipoBulbasaur = "Planta";
        String movTipoBulbasaur = "Latigo Cepa";

        // --- Movimientos Generales ---
        int poderPlacaje = 40;
        int poderMovTipo = 40; // Poder base para los ataques de tipo especial

        // =================================================================================
        // --- VARIABLES PARA LOS POKEMON DE LOS JUGADORES --- 
        // =================================================================================

        // --- Jugador 1 ---
        String p1_nombre = "";
        String p1_tipo = "";
        String p1_movTipoNombre = "";
        int p1_vidaMax = 0, p1_vidaActual = 0;
        int p1_atk = 0, p1_def = 0, p1_spAtk = 0, p1_spDef = 0, p1_spe = 0;

        // --- Jugador 2 ---
        String p2_nombre = "";
        String p2_tipo = "";
        String p2_movTipoNombre = "";
        int p2_vidaMax = 0, p2_vidaActual = 0;
        int p2_atk = 0, p2_def = 0, p2_spAtk = 0, p2_spDef = 0, p2_spe = 0;

        // =================================================================================
        // --- PANTALLA DE TITULO Y REGLAS ---
        // =================================================================================

        System.out.println("****************************************");
        System.out.println("*****************************************");
        System.out.println("Bienvenido a Pokemon Battle Simulator");
        System.out.println("*****************************************");
        System.out.println("****************************************");
        System.out.println("Presiona Enter para continuar...");
        sc.nextLine(); // Espera a que el usuario presione Enter

        System.out.println("Hecho por Hazard");
        System.out.println("\n--- Reglas del Juego ---");
        System.out.println("1. Cada jugador elige un Pokémon de entre las opciones disponibles. También puedes crear tu Pokemon");
        System.out.println("2. Los Pokémon tienen estadísticas base de HP, Ataque, Defensa, Ataque Especial, Defensa Especial y Velocidad.");
        System.out.println("3. El combate se desarrolla por turnos hasta que uno de los Pokémon se debilite.");
        System.out.println("4. En cada turno, puedes elegir entre 4 movimientos:");
        System.out.println("   - Placaje: Un ataque físico básico de tipo Normal.");
        System.out.println("   - Movimiento de Tipo: Un ataque especial del tipo de tu Pokémon (ej. Impactrueno para Pikachu).");
        System.out.println("   - Protección: Te protege completamente del siguiente ataque del oponente, pero solo dura un turno.");
        System.out.println("   - Recuperación: Restaura la mitad de tus Puntos de Salud máximos.");
        System.out.println("5. El daño se calcula en base a las estadísticas de ataque y defensa, el poder del movimiento, y modificadores como:");
        System.out.println("   - STAB (Same-Type Attack Bonus): Si el movimiento es del mismo tipo que tu Pokémon, el daño aumenta un 50%.");
        System.out.println("   - Crítico: Hay una pequeña probabilidad de que un ataque sea crítico, aumentando el daño.");
        System.out.println("   - Aleatoriedad: Un modificador aleatorio para simular la variabilidad del daño.");
        System.out.println("   - Efectividad de Tipo: Algunos tipos son más efectivos contra otros (x2 daño), y algunos son menos efectivos (x0.5 daño).");
        System.out.println("\n¡Que empiece el combate!");
        System.out.println("Presiona Enter para continuar...");
        sc.nextLine(); // Espera a que el usuario presione Enter

        // =================================================================================
        // --- SELECCION DE POKEMON JUGADOR 1 --- 
        // =================================================================================

        System.out.println("\nJugador 1, elige tu Pokemon: Pikachu, Charmander, Squirtle, Bulbasaur (o introduce otra cosa para crear el tuyo)");
        String eleccionInput = sc.nextLine();

        switch (eleccionInput) {
            case "Pikachu":
                p1_nombre = "Pikachu"; p1_tipo = tipoPikachu; p1_movTipoNombre = movTipoPikachu;
                p1_vidaMax = hpPikachu * 2; p1_atk = atkPikachu; p1_def = defPikachu; p1_spAtk = spAtkPikachu; p1_spDef = spDefPikachu; p1_spe = spePikachu;
                break;
            case "Charmander":
                p1_nombre = "Charmander"; p1_tipo = tipoCharmander; p1_movTipoNombre = movTipoCharmander;
                p1_vidaMax = hpCharmander * 2; p1_atk = atkCharmander; p1_def = defCharmander; p1_spAtk = spAtkCharmander; p1_spDef = spDefCharmander; p1_spe = speCharmander;
                break;
            case "Squirtle":
                p1_nombre = "Squirtle"; p1_tipo = tipoSquirtle; p1_movTipoNombre = movTipoSquirtle;
                p1_vidaMax = hpSquirtle * 2; p1_atk = atkSquirtle; p1_def = defSquirtle; p1_spAtk = spAtkSquirtle; p1_spDef = spDefSquirtle; p1_spe = speSquirtle;
                break;
            case "Bulbasaur":
                p1_nombre = "Bulbasaur"; p1_tipo = tipoBulbasaur; p1_movTipoNombre = movTipoBulbasaur;
                p1_vidaMax = hpBulbasaur * 2; p1_atk = atkBulbasaur; p1_def = defBulbasaur; p1_spAtk = spAtkBulbasaur; p1_spDef = spDefBulbasaur; p1_spe = speBulbasaur;
                break;
            default:
                System.out.println("\n--- CREADOR DE POKÉMON ---");
                System.out.print("Introduce el nombre de tu Pokémon: ");
                p1_nombre = sc.nextLine();

                // --- Selección de Tipo ---
                while (true) {
                    System.out.print("Elige su tipo (Electrico, Fuego, Agua, Planta): ");
                    String tipoElegido = sc.nextLine();
                    if (tipoElegido.equalsIgnoreCase("Electrico")) {
                        p1_tipo = tipoPikachu; p1_movTipoNombre = movTipoPikachu; break;
                    } else if (tipoElegido.equalsIgnoreCase("Fuego")) {
                        p1_tipo = tipoCharmander; p1_movTipoNombre = movTipoCharmander; break;
                    } else if (tipoElegido.equalsIgnoreCase("Agua")) {
                        p1_tipo = tipoSquirtle; p1_movTipoNombre = movTipoSquirtle; break;
                    } else if (tipoElegido.equalsIgnoreCase("Planta")) {
                        p1_tipo = tipoBulbasaur; p1_movTipoNombre = movTipoBulbasaur; break;
                    } else {
                        System.out.println("Tipo no válido. Inténtalo de nuevo.");
                    }
                }

                // --- Distribución de Stats ---
                System.out.println("\nAhora distribuye 500 puntos entre las estadísticas (máximo 100 por stat).");
                int puntosRestantes = 500;
                String[] nombresStats = {"HP", "Ataque", "Defensa", "Ataque Especial", "Defensa Especial", "Velocidad"};
                int[] statsAsignadas = new int[6];

                for (int i = 0; i < nombresStats.length; i++) {
                    System.out.println("\nPuntos restantes: " + puntosRestantes);
                    //TODO: quitar while true
                    while (true) {
                        System.out.print("Puntos para " + nombresStats[i] + ": ");
                        int puntos = sc.nextInt();
                        sc.nextLine(); // Consumir salto de línea

                        if (puntos < 0 || puntos > 100) {
                            System.out.println("Error: Debes asignar entre 0 y 100 puntos.");
                        } else if (puntos > puntosRestantes) {
                            System.out.println("Error: No tienes tantos puntos restantes.");
                        } else if (i == 5 && puntos != puntosRestantes) {
                            System.out.println("Error: Debes usar todos los puntos restantes ("+ puntosRestantes +") en la última estadística.");
                        } else {
                            statsAsignadas[i] = puntos;
                            puntosRestantes -= puntos;
                            break;
                        }
                    }
                }
                
                p1_vidaMax = statsAsignadas[0] * 2; // Multiplicamos el HP base
                p1_atk = statsAsignadas[1];
                p1_def = statsAsignadas[2];
                p1_spAtk = statsAsignadas[3];
                p1_spDef = statsAsignadas[4];
                p1_spe = statsAsignadas[5];
                break;    
        }
        p1_vidaActual = p1_vidaMax;
        System.out.println("Jugador 1 ha elegido a " + p1_nombre + ".\n");

        // =================================================================================
        // --- SELECCION DE POKEMON JUGADOR 2 --- 
        // =================================================================================

        System.out.println("Jugador 2, elige tu Pokemon: Pikachu, Charmander, Squirtle, Bulbasaur (o introduce otra cosa para crear el tuyo)");
        eleccionInput = sc.nextLine();

        switch (eleccionInput) {
            case "Pikachu":
                p2_nombre = "Pikachu"; p2_tipo = tipoPikachu; p2_movTipoNombre = movTipoPikachu;
                p2_vidaMax = hpPikachu * 2; p2_atk = atkPikachu; p2_def = defPikachu; p2_spAtk = spAtkPikachu; p2_spDef = spDefPikachu; p2_spe = spePikachu;
                break;
            case "Charmander":
                p2_nombre = "Charmander"; p2_tipo = tipoCharmander; p2_movTipoNombre = movTipoCharmander;
                p2_vidaMax = hpCharmander * 2; p2_atk = atkCharmander; p2_def = defCharmander; p2_spAtk = spAtkCharmander; p2_spDef = spDefCharmander; p2_spe = speCharmander;
                break;
            case "Squirtle":
                p2_nombre = "Squirtle"; p2_tipo = tipoSquirtle; p2_movTipoNombre = movTipoSquirtle;
                p2_vidaMax = hpSquirtle * 2; p2_atk = atkSquirtle; p2_def = defSquirtle; p2_spAtk = spAtkSquirtle; p2_spDef = spDefSquirtle; p2_spe = speSquirtle;
                break;
            case "Bulbasaur":
                p2_nombre = "Bulbasaur"; p2_tipo = tipoBulbasaur; p2_movTipoNombre = movTipoBulbasaur;
                p2_vidaMax = hpBulbasaur * 2; p2_atk = atkBulbasaur; p2_def = defBulbasaur; p2_spAtk = spAtkBulbasaur; p2_spDef = spDefBulbasaur; p2_spe = speBulbasaur;
                break;
            default:
                System.out.println("\n--- CREADOR DE POKÉMON ---");
                System.out.print("Introduce el nombre de tu Pokémon: ");
                p2_nombre = sc.nextLine();

                // --- Selección de Tipo ---
                while (true) {
                    System.out.print("Elige su tipo (Electrico, Fuego, Agua, Planta): ");
                    String tipoElegido = sc.nextLine();
                    if (tipoElegido.equalsIgnoreCase("Electrico")) {
                        p2_tipo = tipoPikachu; p2_movTipoNombre = movTipoPikachu; break;
                    } else if (tipoElegido.equalsIgnoreCase("Fuego")) {
                        p2_tipo = tipoCharmander; p2_movTipoNombre = movTipoCharmander; break;
                    } else if (tipoElegido.equalsIgnoreCase("Agua")) {
                        p2_tipo = tipoSquirtle; p2_movTipoNombre = movTipoSquirtle; break;
                    } else if (tipoElegido.equalsIgnoreCase("Planta")) {
                        p2_tipo = tipoBulbasaur; p2_movTipoNombre = movTipoBulbasaur; break;
                    } else {
                        System.out.println("Tipo no válido. Inténtalo de nuevo.");
                    }
                }

                // --- Distribución de Stats ---
                System.out.println("\nAhora distribuye 500 puntos entre las estadísticas (máximo 100 por stat).");
                int puntosRestantes = 500;
                String[] nombresStats = {"HP", "Ataque", "Defensa", "Ataque Especial", "Defensa Especial", "Velocidad"};
                int[] statsAsignadas = new int[6];

                for (int i = 0; i < nombresStats.length; i++) {
                    System.out.println("\nPuntos restantes: " + puntosRestantes);
                    while (true) {
                        System.out.print("Puntos para " + nombresStats[i] + ": ");
                        int puntos = sc.nextInt();
                        sc.nextLine(); // Consumir salto de línea

                        if (puntos < 0 || puntos > 100) {
                            System.out.println("Error: Debes asignar entre 0 y 100 puntos.");
                        } else if (puntos > puntosRestantes) {
                            System.out.println("Error: No tienes tantos puntos restantes.");
                        } else if (i == 5 && puntos != puntosRestantes) {
                            System.out.println("Error: Debes usar todos los puntos restantes ("+ puntosRestantes +") en la última estadística.");
                        } else {
                            statsAsignadas[i] = puntos;
                            puntosRestantes -= puntos;
                            break;
                        }
                    }
                }
                
                p2_vidaMax = statsAsignadas[0] * 2; // Multiplicamos el HP base
                p2_atk = statsAsignadas[1];
                p2_def = statsAsignadas[2];
                p2_spAtk = statsAsignadas[3];
                p2_spDef = statsAsignadas[4];
                p2_spe = statsAsignadas[5];
                break;    
        }
        p2_vidaActual = p2_vidaMax;
        System.out.println("Jugador 2 ha elegido a " + p2_nombre + ".\n");

        // --- Determinar el orden de ataque basado en la velocidad ---
       //TODO: crear variables arriba
        boolean p1AtacaPrimero;
        if (p1_spe > p2_spe) {
            p1AtacaPrimero = true;
            System.out.println(p1_nombre + " es más rápido y atacará primero!");
        } else if (p2_spe > p1_spe) {
            p1AtacaPrimero = false;
            System.out.println(p2_nombre + " es más rápido y atacará primero!");
        } else {
            // Speed tie, 50/50 chance
            p1AtacaPrimero = rand.nextBoolean();
            System.out.println("¡Ambos Pokémon tienen la misma velocidad! " + (p1AtacaPrimero ? p1_nombre : p2_nombre) + " atacará primero por sorteo.");
        }
        System.out.println("Presiona Enter para empezar el combate...");
        sc.nextLine();

        // =================================================================================
        // --- BUCLE PRINCIPAL DEL COMBATE --- 
        // =================================================================================

        // Variables para gestionar el estado del combate entre turnos
        boolean p1_protegido_este_turno = false;
        boolean p2_protegido_este_turno = false;
        boolean p1_uso_proteccion_anterior = false;
        boolean p2_uso_proteccion_anterior = false;
        double p1_probabilidad_proteccion = 1.0;
        double p2_probabilidad_proteccion = 1.0;

        while (p1_vidaActual > 0 && p2_vidaActual > 0) {

            // --- Muestra el estado actual del combate (Barras de Vida) ---
            System.out.println("-----------------------------------------------------");
            // Barra de vida Jugador 1
            System.out.println("Jugador 1: " + p1_nombre);
            int totalBarras = 20;
            double porcentajeVida1 = (double) p1_vidaActual / p1_vidaMax;
            int barrasLlenas1 = (int) (porcentajeVida1 * totalBarras);
            String barraDeVida1 = "[";
            for (int i = 0; i < totalBarras; i++) {
                barraDeVida1 += (i < barrasLlenas1) ? "#" : "-";
            }
            barraDeVida1 += "] " + p1_vidaActual + "/" + p1_vidaMax + " PS";
            System.out.println(barraDeVida1);

            // Barra de vida Jugador 2
            System.out.println("\nJugador 2: " + p2_nombre);
            double porcentajeVida2 = (double) p2_vidaActual / p2_vidaMax;
            int barrasLlenas2 = (int) (porcentajeVida2 * totalBarras);
            String barraDeVida2 = "[";
            for (int i = 0; i < totalBarras; i++) {
                barraDeVida2 += (i < barrasLlenas2) ? "#" : "-";
            }
            barraDeVida2 += "] " + p2_vidaActual + "/" + p2_vidaMax + " PS";
            System.out.println(barraDeVida2);
            System.out.println("-----------------------------------------------------");

            // Resetea la protección al inicio de la ronda de turnos
            p1_protegido_este_turno = false;
            p2_protegido_este_turno = false;

            // Lógica de turnos basada en la velocidad
            if (p1AtacaPrimero) {
                // =================================================================================
                // --- TURNO DEL JUGADOR 1 (ATACA PRIMERO) --- 
                // =================================================================================
                System.out.println("\nTurno de Jugador 1: Que deberia hacer " + p1_nombre + "?");
                System.out.println("1. Placaje");
                System.out.println("2. " + p1_movTipoNombre);
                System.out.println("3. Proteccion");
                System.out.println("4. Recuperacion");
                System.out.print("Elige un movimiento (1-4): ");
                int eleccion1 = sc.nextInt();
                sc.nextLine(); // Consumir el salto de linea

                // --- Logica de Movimientos del Jugador 1 ---
                if (p2_protegido_este_turno) {
                    System.out.println(p2_nombre + " se protegio! El ataque de " + p1_nombre + " falla!");
                } else {
                    if (eleccion1 == 1 || eleccion1 == 2) { // Movimientos de ataque
                        String movElegidoNombre, movElegidoCategoria, movElegidoTipo;
                        int movElegidoPoder;

                        if (eleccion1 == 1) {
                            movElegidoNombre = "Placaje"; movElegidoCategoria = "Fisico"; movElegidoTipo = "Normal"; movElegidoPoder = poderPlacaje;
                        } else {
                            movElegidoNombre = p1_movTipoNombre; movElegidoCategoria = "Especial"; movElegidoTipo = p1_tipo; movElegidoPoder = poderMovTipo;
                        }

                        System.out.println("\n" + p1_nombre + " uso " + movElegidoNombre + "!");

                        // --- Calculo de Dano ---
                        int nivel = 50;
                        int ataqueUsado = movElegidoCategoria.equals("Fisico") ? p1_atk : p1_spAtk;
                        int defensaOponente = movElegidoCategoria.equals("Fisico") ? p2_def : p2_spDef;

                        double stab = movElegidoTipo.equals(p1_tipo) ? 1.5 : 1.0;
                        double critico = (rand.nextInt(24) == 0) ? 1.5 : 1.0;
                        if (critico > 1.0) System.out.println("Un golpe critico!");
                        double randomMod = rand.nextDouble(0.85, 1.0);
                        double efectividad = 1.0;

                        if (movElegidoTipo.equals("Electrico") && p2_tipo.equals("Agua") || movElegidoTipo.equals("Fuego") && p2_tipo.equals("Planta") || movElegidoTipo.equals("Agua") && p2_tipo.equals("Fuego") || movElegidoTipo.equals("Planta") && p2_tipo.equals("Agua" )) {
                        efectividad = 2;
                        }
                        else if (movElegidoTipo.equals("Electrico") && p2_tipo.equals("Planta") || movElegidoTipo.equals("Fuego") && p2_tipo.equals("Agua") || movElegidoTipo.equals("Agua") && p2_tipo.equals("Planta") || movElegidoTipo.equals("Planta") && p2_tipo.equals("Fuego")) {
                            efectividad = 0.5;
                        }

                        double danoCalculado = (((((2.0 * nivel / 5.0) + 2.0) * movElegidoPoder * ataqueUsado / defensaOponente) / 50.0) + 2.0) * stab * critico * randomMod * efectividad;
                        int danoFinal = (int) danoCalculado;
                        if (danoFinal < 1) danoFinal = 1;

                        p2_vidaActual -= danoFinal;
                        if (efectividad == 2) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Supereficaz");
                        else if (efectividad == 0.5) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Poco Eficaz");
                        else System.out.println("Causo " + danoFinal + " puntos de dano.");

                        p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                    } else if (eleccion1 == 3) { // Proteccion
                        if (rand.nextDouble() < p1_probabilidad_proteccion) {
                            System.out.println(p1_nombre + " uso Proteccion!");
                            p1_protegido_este_turno = true;
                            p1_uso_proteccion_anterior = true;
                            p1_probabilidad_proteccion /= 2.0; // La probabilidad se reduce a la mitad para el siguiente uso
                        } else {
                            System.out.println("Pero " + p1_nombre + " fallo al usar Proteccion!");
                            p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                        }
                    } else if (eleccion1 == 4) { // Recuperacion
                        if (rand.nextDouble() < 0.9) { // 90% de probabilidad de exito
                            int vidaRecuperada = p1_vidaMax / 2;
                            p1_vidaActual += vidaRecuperada;
                            if (p1_vidaActual > p1_vidaMax) p1_vidaActual = p1_vidaMax;
                            System.out.println(p1_nombre + " uso Recuperacion y recupero " + vidaRecuperada + " PS.");
                        } else {
                            System.out.println("Pero " + p1_nombre + " fallo al usar Recuperacion!");
                        }
                        p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                    } else {
                        System.out.println("Eleccion no valida. " + p1_nombre + " pierde el turno.");
                        p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                    }
                }

                if (p2_vidaActual <= 0) { p2_vidaActual = 0; System.out.println("\n" + p2_nombre + " se ha debilitado!"); break; }

                // =================================================================================
                // --- TURNO DEL JUGADOR 2 (ATACA SEGUNDO) --- 
                // =================================================================================
                System.out.println("\nTurno de Jugador 2: Que deberia hacer " + p2_nombre + "?");
                System.out.println("1. Placaje");
                System.out.println("2. " + p2_movTipoNombre);
                System.out.println("3. Proteccion");
                System.out.println("4. Recuperacion");
                System.out.print("Elige un movimiento (1-4): ");
                int eleccion2 = sc.nextInt();
                sc.nextLine(); // Consumir el salto de linea

                if (p1_protegido_este_turno) {
                    System.out.println(p1_nombre + " se protegio! El ataque de " + p2_nombre + " falla!");
                } else {
                    if (eleccion2 == 1 || eleccion2 == 2) { // Movimientos de ataque
                        String movElegidoNombre, movElegidoCategoria, movElegidoTipo;
                        int movElegidoPoder;

                        if (eleccion2 == 1) {
                            movElegidoNombre = "Placaje"; movElegidoCategoria = "Fisico"; movElegidoTipo = "Normal"; movElegidoPoder = poderPlacaje;
                        } else {
                            movElegidoNombre = p2_movTipoNombre; movElegidoCategoria = "Especial"; movElegidoTipo = p2_tipo; movElegidoPoder = poderMovTipo;
                        }

                        System.out.println("\n" + p2_nombre + " uso " + movElegidoNombre + "!");

                        int nivel = 50;
                        int ataqueUsado = movElegidoCategoria.equals("Fisico") ? p2_atk : p2_spAtk;
                        int defensaOponente = movElegidoCategoria.equals("Fisico") ? p1_def : p1_spDef;

                        double stab = movElegidoTipo.equals(p2_tipo) ? 1.5 : 1.0;
                        double critico = (rand.nextInt(24) == 0) ? 1.5 : 1.0;
                        if (critico > 1.0) System.out.println("Un golpe critico!");
                        double randomMod = rand.nextDouble(0.85, 1.0);
                        double efectividad = 1;

                        if (movElegidoTipo.equals("Electrico") && p1_tipo.equals("Agua") || movElegidoTipo.equals("Fuego") && p1_tipo.equals("Planta") || movElegidoTipo.equals("Agua") && p1_tipo.equals("Fuego") || movElegidoTipo.equals("Planta") && p1_tipo.equals("Agua" )) {
                            efectividad = 2;
                        }
                        else if (movElegidoTipo.equals("Electrico") && p1_tipo.equals("Planta") || movElegidoTipo.equals("Fuego") && p1_tipo.equals("Agua") || movElegidoTipo.equals("Agua") && p1_tipo.equals("Planta") || movElegidoTipo.equals("Planta") && p1_tipo.equals("Fuego")) {
                            efectividad = 0.5;
                        }

                        double danoCalculado = (((((2.0 * nivel / 5.0) + 2.0) * movElegidoPoder * ataqueUsado / defensaOponente) / 50.0) + 2.0) * stab * critico * randomMod * efectividad;
                        int danoFinal = (int) danoCalculado;
                        if (danoFinal < 1) danoFinal = 1;

                        p1_vidaActual -= danoFinal;
                        if (efectividad == 2) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Supereficaz");
                        else if (efectividad == 0.5) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Poco Eficaz");
                        else System.out.println("Causo " + danoFinal + " puntos de dano.");

                        p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                    } else if (eleccion2 == 3) { // Proteccion
                        if (rand.nextDouble() < p2_probabilidad_proteccion) {
                            System.out.println(p2_nombre + " uso Proteccion!");
                            p2_protegido_este_turno = true;
                            p2_uso_proteccion_anterior = true;
                            p2_probabilidad_proteccion /= 2.0;
                        } else {
                            System.out.println("Pero " + p2_nombre + " fallo al usar Proteccion!");
                            p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                        }
                    } else if (eleccion2 == 4) { // Recuperacion
                        if (rand.nextDouble() < 0.9) { // 90% de probabilidad de exito
                            int vidaRecuperada = p2_vidaMax / 2;
                            p2_vidaActual += vidaRecuperada;
                            if (p2_vidaActual > p2_vidaMax) p2_vidaActual = p2_vidaMax;
                            System.out.println(p2_nombre + " uso Recuperacion y recupero " + vidaRecuperada + " PS.");
                        } else {
                            System.out.println("Pero " + p2_nombre + " fallo al usar Recuperacion!");
                        }
                        p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                    } else {
                        System.out.println("Eleccion no valida. " + p2_nombre + " pierde el turno.");
                        p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                    }
                }

                if (p1_vidaActual <= 0) { p1_vidaActual = 0; System.out.println("\n" + p1_nombre + " se ha debilitado!"); break; }

            } else { // p2AtacaPrimero
                // =================================================================================
                // --- TURNO DEL JUGADOR 2 (ATACA PRIMERO) --- 
                // =================================================================================
                System.out.println("\nTurno de Jugador 2: Que deberia hacer " + p2_nombre + "?");
                System.out.println("1. Placaje");
                System.out.println("2. " + p2_movTipoNombre);
                System.out.println("3. Proteccion");
                System.out.println("4. Recuperacion");
                System.out.print("Elige un movimiento (1-4): ");
                int eleccion2 = sc.nextInt();
                sc.nextLine(); // Consumir el salto de linea

                if (p1_protegido_este_turno) {
                    System.out.println(p1_nombre + " se protegio! El ataque de " + p2_nombre + " falla!");
                } else {
                    if (eleccion2 == 1 || eleccion2 == 2) { // Movimientos de ataque
                        String movElegidoNombre, movElegidoCategoria, movElegidoTipo;
                        int movElegidoPoder;

                        if (eleccion2 == 1) {
                            movElegidoNombre = "Placaje"; movElegidoCategoria = "Fisico"; movElegidoTipo = "Normal"; movElegidoPoder = poderPlacaje;
                        } else {
                            movElegidoNombre = p2_movTipoNombre; movElegidoCategoria = "Especial"; movElegidoTipo = p2_tipo; movElegidoPoder = poderMovTipo;
                        }

                        System.out.println("\n" + p2_nombre + " uso " + movElegidoNombre + "!");

                        int nivel = 50;
                        int ataqueUsado = movElegidoCategoria.equals("Fisico") ? p2_atk : p2_spAtk;
                        int defensaOponente = movElegidoCategoria.equals("Fisico") ? p1_def : p1_spDef;

                        double stab = movElegidoTipo.equals(p2_tipo) ? 1.5 : 1.0;
                        double critico = (rand.nextInt(24) == 0) ? 1.5 : 1.0;
                        if (critico > 1.0) System.out.println("Un golpe critico!");
                        double randomMod = rand.nextDouble(0.85, 1.0);
                        double efectividad = 1;

                        if (movElegidoTipo.equals("Electrico") && p1_tipo.equals("Agua") || movElegidoTipo.equals("Fuego") && p1_tipo.equals("Planta") || movElegidoTipo.equals("Agua") && p1_tipo.equals("Fuego") || movElegidoTipo.equals("Planta") && p1_tipo.equals("Agua" )) {
                            efectividad = 2;
                        }
                        else if (movElegidoTipo.equals("Electrico") && p1_tipo.equals("Planta") || movElegidoTipo.equals("Fuego") && p1_tipo.equals("Agua") || movElegidoTipo.equals("Agua") && p1_tipo.equals("Planta") || movElegidoTipo.equals("Planta") && p1_tipo.equals("Fuego")) {
                            efectividad = 0.5;
                        }

                        double danoCalculado = (((((2.0 * nivel / 5.0) + 2.0) * movElegidoPoder * ataqueUsado / defensaOponente) / 50.0) + 2.0) * stab * critico * randomMod * efectividad;
                        int danoFinal = (int) danoCalculado;
                        if (danoFinal < 1) danoFinal = 1;

                        p1_vidaActual -= danoFinal;
                        if (efectividad == 2) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Supereficaz");
                        else if (efectividad == 0.5) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Poco Eficaz");
                        else System.out.println("Causo " + danoFinal + " puntos de dano.");

                        p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                    } else if (eleccion2 == 3) { // Proteccion
                        if (rand.nextDouble() < p2_probabilidad_proteccion) {
                            System.out.println(p2_nombre + " uso Proteccion!");
                            p2_protegido_este_turno = true;
                            p2_uso_proteccion_anterior = true;
                            p2_probabilidad_proteccion /= 2.0;
                        } else {
                            System.out.println("Pero " + p2_nombre + " fallo al usar Proteccion!");
                            p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                        }
                    } else if (eleccion2 == 4) { // Recuperacion
                        if (rand.nextDouble() < 0.9) { // 90% de probabilidad de exito
                            int vidaRecuperada = p2_vidaMax / 2;
                            p2_vidaActual += vidaRecuperada;
                            if (p2_vidaActual > p2_vidaMax) p2_vidaActual = p2_vidaMax;
                            System.out.println(p2_nombre + " uso Recuperacion y recupero " + vidaRecuperada + " PS.");
                        } else {
                            System.out.println("Pero " + p2_nombre + " fallo al usar Recuperacion!");
                        }
                        p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                    } else {
                        System.out.println("Eleccion no valida. " + p2_nombre + " pierde el turno.");
                        p2_uso_proteccion_anterior = false; p2_probabilidad_proteccion = 1.0;
                    }
                }

                if (p1_vidaActual <= 0) { p1_vidaActual = 0; System.out.println("\n" + p1_nombre + " se ha debilitado!"); break; }

                // =================================================================================
                // --- TURNO DEL JUGADOR 1 (ATACA SEGUNDO) --- 
                // =================================================================================
                System.out.println("\nTurno de Jugador 1: Que deberia hacer " + p1_nombre + "?");
                System.out.println("1. Placaje");
                System.out.println("2. " + p1_movTipoNombre);
                System.out.println("3. Proteccion");
                System.out.println("4. Recuperacion");
                System.out.print("Elige un movimiento (1-4): ");
                int eleccion1 = sc.nextInt();
                sc.nextLine(); // Consumir el salto de linea

                if (p2_protegido_este_turno) {
                    System.out.println(p2_nombre + " se protegio! El ataque de " + p1_nombre + " falla!");
                } else {
                    if (eleccion1 == 1 || eleccion1 == 2) { // Movimientos de ataque
                        String movElegidoNombre, movElegidoCategoria, movElegidoTipo;
                        int movElegidoPoder;

                        if (eleccion1 == 1) {
                            movElegidoNombre = "Placaje"; movElegidoCategoria = "Fisico"; movElegidoTipo = "Normal"; movElegidoPoder = poderPlacaje;
                        } else {
                            movElegidoNombre = p1_movTipoNombre; movElegidoCategoria = "Especial"; movElegidoTipo = p1_tipo; movElegidoPoder = poderMovTipo;
                        }

                        System.out.println("\n" + p1_nombre + " uso " + movElegidoNombre + "!");

                        int nivel = 50;
                        int ataqueUsado = movElegidoCategoria.equals("Fisico") ? p1_atk : p1_spAtk;
                        int defensaOponente = movElegidoCategoria.equals("Fisico") ? p2_def : p2_spDef;

                        double stab = movElegidoTipo.equals(p1_tipo) ? 1.5 : 1.0;
                        double critico = (rand.nextInt(24) == 0) ? 1.5 : 1.0;
                        if (critico > 1.0) System.out.println("Un golpe critico!");
                        double randomMod = rand.nextDouble(0.85, 1.0);
                        double efectividad = 1.0;

                        if (movElegidoTipo.equals("Electrico") && p2_tipo.equals("Agua") || movElegidoTipo.equals("Fuego") && p2_tipo.equals("Planta") || movElegidoTipo.equals("Agua") && p2_tipo.equals("Fuego") || movElegidoTipo.equals("Planta") && p2_tipo.equals("Agua" )) {
                        efectividad = 2;
                        }
                        else if (movElegidoTipo.equals("Electrico") && p2_tipo.equals("Planta") || movElegidoTipo.equals("Fuego") && p2_tipo.equals("Agua") || movElegidoTipo.equals("Agua") && p2_tipo.equals("Planta") || movElegidoTipo.equals("Planta") && p2_tipo.equals("Fuego")) {
                            efectividad = 0.5;
                        }

                        double danoCalculado = (((((2.0 * nivel / 5.0) + 2.0) * movElegidoPoder * ataqueUsado / defensaOponente) / 50.0) + 2.0) * stab * critico * randomMod * efectividad;
                        int danoFinal = (int) danoCalculado;
                        if (danoFinal < 1) danoFinal = 1;

                        p2_vidaActual -= danoFinal;
                        if (efectividad == 2) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Supereficaz");
                        else if (efectividad == 0.5) System.out.println("Causo " + danoFinal + " puntos de dano. Fué Poco Eficaz");
                        else System.out.println("Causo " + danoFinal + " puntos de dano.");

                        p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                    } else if (eleccion1 == 3) { // Proteccion
                        if (rand.nextDouble() < p1_probabilidad_proteccion) {
                            System.out.println(p1_nombre + " uso Proteccion!");
                            p1_protegido_este_turno = true;
                            p1_uso_proteccion_anterior = true;
                            p1_probabilidad_proteccion /= 2.0;
                        } else {
                            System.out.println("Pero " + p1_nombre + " fallo al usar Proteccion!");
                            p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                        }
                    } else if (eleccion1 == 4) { // Recuperacion
                        if (rand.nextDouble() < 0.9) { // 90% de probabilidad de exito
                            int vidaRecuperada = p1_vidaMax / 2;
                            p1_vidaActual += vidaRecuperada;
                            if (p1_vidaActual > p1_vidaMax) p1_vidaActual = p1_vidaMax;
                            System.out.println(p1_nombre + " uso Recuperacion y recupero " + vidaRecuperada + " PS.");
                        } else {
                            System.out.println("Pero " + p1_nombre + " fallo al usar Recuperacion!");
                        }
                        p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                    } else {
                        System.out.println("Eleccion no valida. " + p1_nombre + " pierde el turno.");
                        p1_uso_proteccion_anterior = false; p1_probabilidad_proteccion = 1.0;
                    }
                }

                if (p2_vidaActual <= 0) { p2_vidaActual = 0; System.out.println("\n" + p2_nombre + " se ha debilitado!"); break; }
            }

            System.out.println("\nPresiona Enter para pasar al siguiente turno...");
            sc.nextLine();
        }

        // =================================================================================
        // --- FIN DEL COMBATE ---
        // =================================================================================
        System.out.println("\n****************************************");
        System.out.println("*       EL COMBATE HA TERMINADO        *");
        System.out.println("****************************************");

        if (p1_vidaActual <= 0) {
            System.out.println("El ganador es el Jugador 2 con " + p2_nombre + "!");
        } else {
            System.out.println("El ganador es el Jugador 1 con " + p1_nombre + "!");
        }

        sc.close();
    }
}
