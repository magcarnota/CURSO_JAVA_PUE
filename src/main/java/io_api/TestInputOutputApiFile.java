package io_api;

import java.io.*;

/**
 * Clase para testing de api IO y NIO
 * Archivo para pruebas: src/resources/origen.txt
 * @author magcarnota
 */
public class TestInputOutputApiFile {

    private static final String ARCHIVO_ORIGEN = "src/resources/origen.txt";
    private static final String ARCHIVO_DESTINO = "src/resources/destino.txt";

    public static void main(String[] args) {

        leerDeByteEnByte(ARCHIVO_ORIGEN);

        System.out.println("-----------------------------------");

        leerArrayBytes(ARCHIVO_ORIGEN, 4);

        System.out.println("-----------------------------------");

        leerDeCaracterEnCaracter(ARCHIVO_ORIGEN);

        System.out.println("-----------------------------------");

        escribirDeCaracterEnCaracter(ARCHIVO_DESTINO, "Texto a escribir.");
    }

    private static void leerDeByteEnByte(String archvo) {
        System.out.println("Leyendo archivo byte a byte:");
        try( InputStream is = new FileInputStream(archvo) ) {
            int byteLeido;
            while( ( byteLeido = is.read() ) != -1) {
                System.out.print((char)byteLeido);
                Thread.sleep(250);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println("No se ha podido realizar la operación con el archivo");
        } catch (InterruptedException ex) {
            System.out.println("No se ha podido realizar el Thread.sleep()");
        }
    }

    private static void leerArrayBytes(String archivo, int numeroDeBytes) {
        System.out.println("Leyendo de " + numeroDeBytes + " en " + numeroDeBytes + " bytes:");
        try( InputStream is = new FileInputStream(archivo) ) {
            byte[] bytesLeidos = new byte[numeroDeBytes];
            int leido = 0;
            while( (leido = is.read(bytesLeidos)) != -1 ) {
                System.out.print(new String(bytesLeidos));
                Thread.sleep(250);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println("No se ha podido realizar la operación con el archivo");
        } catch (InterruptedException ex) {
            System.out.println("No se ha podido realizar el Thread.sleep()");
        }
    }

    private static void leerDeCaracterEnCaracter(String archivo) {
        System.out.println("Leyendo con Reader de caracter en caracter:");
        try (Reader reader = new FileReader(archivo)){
            int caracter = reader.read();
            while(caracter != -1) {
                System.out.print((char)caracter);
                caracter = reader.read();
                Thread.sleep(250);
            }
            System.out.println();
        } catch (IOException ex) {
            System.out.println("No se ha podido leer de caracter en caracter.");
        } catch (InterruptedException ex) {
            System.out.println("No se ha podido realizar el Thread.sleep()");
        }
    }

    private static void escribirDeCaracterEnCaracter(String archivo, String textToWrite) {
        System.out.println("Escribiendo con Writer de caracter en caracter:");
        try (Writer writer = new FileWriter(archivo)){
            writer.write(textToWrite);
        } catch (IOException ex) {
            System.out.println("No se ha podido escribir en el archivo!");
        }
        leerDeCaracterEnCaracter(ARCHIVO_DESTINO);
    }
}
