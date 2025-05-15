
package Metodos;

import DatosPokemon.Pokemones;
import DatosPokemon.Usuarios; // Importar la nueva clase Usuario
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.UUID; // Para generar IDs únicos para Pokémon
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Metodos {

    
    public Vector<Pokemones> vPrincipal = new Vector<>();
    // Vector para Usuarios (nuevo)
    public Vector<Usuarios> vUsuarios = new Vector<>();

    // Archivos de texto
    private static final String ARCHIVO_POKEMONES = "Pokemones.txt";
    private static final String ARCHIVO_USUARIOS = "usuarios.txt";

    // --- Métodos para Pokémon ---

    // Método para generar un ID único para Pokémon
    public String generarIdPokemon() {
        return UUID.randomUUID().toString().substring(0, 8); // Un ID corto de 8 caracteres
    }

    // Guardar Pokémon en el vector en memoria (no cambia mucho)
    public void guardarPokemonEnVector(Pokemones unPokemon) {
        vPrincipal.addElement(unPokemon);
    }

    // Guardar Pokémon en el archivo de texto
    public void guardarPokemonEnArchivo(Pokemones pokemon) {
        try {
           
            FileWriter fw = new FileWriter(ARCHIVO_POKEMONES, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println(pokemon.getId() + "|" +
                       pokemon.getNombre() + "|" +
                       pokemon.getTipo() + "|" +
                       pokemon.getHabilidad() + "|" +
                       pokemon.getHabilidad2() + "|" +
                       pokemon.getNaturaleza() + "|" +
                       pokemon.getGenero() + "|" +
                       pokemon.getPeso());
            pw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar Pokémon en archivo: " 
                    + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Cargar lista de Pokémon para la tabla
    public DefaultTableModel listaPokemones() {
        Vector<String> cabeceras = new Vector<>();
        cabeceras.addElement("ID");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Tipo");
        cabeceras.addElement("Habilidad 1");
        cabeceras.addElement("Habilidad 2");
        cabeceras.addElement("Naturaleza");
        cabeceras.addElement("Género");
        cabeceras.addElement("Peso");

        DefaultTableModel mdlTabla = new DefaultTableModel(cabeceras, 0);

        try (FileReader fr = new FileReader(ARCHIVO_POKEMONES);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            vPrincipal.clear(); // Limpiar el vector antes de cargar para evitar duplicados si se llama múltiples veces
            while ((linea = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(linea, "|");
                if (dato.countTokens() >= 8) { // Asegurarse que la línea tiene todos los datos
                    Vector<Object> fila = new Vector<>();
                    String id = dato.nextToken();
                    String nombre = dato.nextToken();
                    String tipo = dato.nextToken();
                    String habilidad = dato.nextToken();
                    String habilidad2 = dato.nextToken();
                    String naturaleza = dato.nextToken();
                    String genero = dato.nextToken();
                    double peso = Double.parseDouble(dato.nextToken());

                    fila.addElement(id);
                    fila.addElement(nombre);
                    fila.addElement(tipo);
                    fila.addElement(habilidad);
                    fila.addElement(habilidad2);
                    fila.addElement(naturaleza);
                    fila.addElement(genero);
                    fila.addElement(peso);
                    mdlTabla.addRow(fila);

                    // Opcional: Cargar también al vector vPrincipal si es necesario tenerlos en memoria
                    vPrincipal.addElement(new Pokemones(id, nombre, tipo, habilidad, habilidad2, naturaleza, genero, peso));
                }
            }
        } catch (FileNotFoundException e) {
            // No es un error si el archivo aún no existe la primera vez.
            // Se creará al guardar el primer Pokémon.
            System.out.println("Archivo " + ARCHIVO_POKEMONES + " no encontrado, se creará uno nuevo.");
        } catch (IOException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al leer Pokémon del archivo: " + 
                    e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return mdlTabla;
    }

    // Reescribir TODO el archivo de Pokémones (útil para eliminar y editar)
    public void reescribirArchivoPokemones(DefaultTableModel model) {
        try (FileWriter fw = new FileWriter(ARCHIVO_POKEMONES, false); // false para sobrescribir
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            for (int i = 0; i < model.getRowCount(); i++) {
                StringBuilder linea = new StringBuilder();
                for (int j = 0; j < model.getColumnCount(); j++) {
                    linea.append(model.getValueAt(i, j).toString());
                    if (j < model.getColumnCount() - 1) {
                        linea.append("|");
                    }
                }
                pw.println(linea.toString());
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al reescribir el archivo de Pokémones: " 
                    + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    // --- Métodos para Usuarios (Nuevos) ---

    // Registrar un nuevo usuario
    public boolean registrarUsuario(Usuarios nuevoUsuario) {
        // Verificar si el usuario ya existe
        if (buscarUsuario(nuevoUsuario.getNombreUsuario()) != null) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe.", 
                    "Error de Registro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        try (FileWriter fw = new FileWriter(ARCHIVO_USUARIOS, true); // true para append
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            pw.println(nuevoUsuario.getNombreUsuario() + "|" +
                       nuevoUsuario.getContrasena() + "|" + // Idealmente hashear contraseña antes de guardar
                       nuevoUsuario.getRol());
            // Opcional: agregar al vector de usuarios en memoria
            vUsuarios.addElement(nuevoUsuario);
            return true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar usuario: " 
                    + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    // Buscar un usuario por nombre de usuario para login o para verificar existencia
    public Usuarios buscarUsuario(String nombreUsuario) {
        // Primero intenta cargar desde el archivo si vUsuarios está vacío
        if (vUsuarios.isEmpty()) {
            cargarUsuariosDesdeArchivo();
        }

        for (Usuarios usr : vUsuarios) {
            if (usr.getNombreUsuario().equalsIgnoreCase(nombreUsuario)) {
                return usr;
            }
        }
        
        try (FileReader fr = new FileReader(ARCHIVO_USUARIOS);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(linea, "|");
                if (dato.countTokens() >= 3) {
                    String usrNombre = dato.nextToken();
                    String usrContra = dato.nextToken();
                    String usrRol = dato.nextToken();
                    if (usrNombre.equalsIgnoreCase(nombreUsuario)) {
                        return new Usuarios(usrNombre, usrContra, usrRol);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            // El archivo puede no existir si no hay usuarios registrados
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al buscar usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null; // Usuario no encontrado
    }

    // Cargar todos los usuarios desde el archivo al vector vUsuarios
    public void cargarUsuariosDesdeArchivo() {
        vUsuarios.clear();
        try (FileReader fr = new FileReader(ARCHIVO_USUARIOS);
             BufferedReader br = new BufferedReader(fr)) {
            String linea;
            while ((linea = br.readLine()) != null) {
                StringTokenizer dato = new StringTokenizer(linea, "|");
                if (dato.countTokens() >= 3) {
                    vUsuarios.addElement(new Usuarios(dato.nextToken(), dato.nextToken(), dato.nextToken()));
                }
            }
        } catch (FileNotFoundException e) {
            // Normal si el archivo no existe aún
            System.out.println("Archivo " + ARCHIVO_USUARIOS + " no encontrado. Se creará al registrar el primer usuario.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar usuarios: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Validar credenciales de usuario
    public Usuarios validarCredenciales(String nombreUsuario, String contrasena) {
        Usuarios usuario = buscarUsuario(nombreUsuario);
        if (usuario != null && usuario.getContrasena().equals(contrasena)) { // Comparación directa de contraseña
            return usuario;
        }
        return null; // Credenciales incorrectas o usuario no encontrado
    }
}
    

