package Libreria;
import java.util.Scanner;
public class Libreria{
    public static void main(String[]args) throws Exception{
        Scanner entrada =new Scanner(System.in);
        int opcion, opcion2, opcion3;
        Libro libro =new Libro();
        Autor autor =new Autor(); 
        Editorial editorial = new Editorial();
        do{
            System.out.println("******Menu principal******");
            System.out.println("1. Libros");
            System.out.println("2. Autores");
            System.out.println("3. Editoriales");
            System.out.println("4. Salir");
            System.out.println("Escribe la opcion que deseas realizar");
            opcion = entrada.nextInt();
            switch (opcion){
                case 1: // menu principal libros
                    do{
                        System.out.println("*****Menu libro***");
                        System.out.println("1. Agregar libro");
                        System.out.println("2. Modificar libro");
                        System.out.println("3. Eliminar libro");
                        System.out.println("4. Listar libro");
                        System.out.println("5. Regresar");
                        System.out.println("Escribe el numero de opcion a realizar");
                        opcion2 =entrada.nextInt();
                        switch(opcion2){
                            case 1: // agregar libro
                                System.out.println("****Agregando libro****");
                                System.out.println("Ingrese titulo el libro");
                                libro.setTitulo(entrada.next()); 
                                entrada.nextLine();
                                System.out.println("Ingrese el autor del libro");
                                libro.setAutor(entrada.next());
                                entrada.nextLine();
                                System.out.println("Ingrese fecha de publicacion");
                                libro.setFechapub(entrada.next());
                                entrada.nextLine();
                                System.out.println("Ingrese la editorial del libro");
                                libro.setEditorial(entrada.next());
                                entrada.nextLine();
                                System.out.println("Ingrese precio del libro");
                                libro.setPrecio(entrada.nextFloat()); 
                                System.out.println("------Libro agregado correctamente-------");
                            break;//agregando libro
                            case 2://modificar libro
                                do{
                                    System.out.println("***Modificando libro***");
                                    System.out.println("Titulo: " + libro.getTtitulo());
                                    System.out.println("Autor: " + libro.getAutor());
                                    System.out.println("Fecha de publicación: " + libro.getFechapub());
                                    System.out.println("Editorial: " + libro.getEditorial());
                                    System.out.println("Precio: " + libro.getPrecio());
                                    System.out.println("Que deseas modificar?");
                                    System.out.println("1. Titulo");
                                    System.out.println("2. Autor");
                                    System.out.println("3. Fecha de publicación");
                                    System.out.println("4. Editorial");
                                    System.out.println("5. Precio");
                                    System.out.println("6. Regresar");
                                    opcion3 = entrada.nextInt();
                                    switch(opcion3){
                                        case 1:
                                            System.out.println("Ingresa el nuevo titulo");
                                            libro.setTitulo(entrada.nextLine());
                                            break;
                                        case 2:
                                            System.out.println("Ingresa el nuevo autor");
                                            libro.setAutor(entrada.nextLine());
                                            break;
                                        case 3:
                                            System.out.println("Ingrese la nueva fecha de publicación");
                                            libro.setFechapub(entrada.nextLine());
                                            break;
                                        case 4:
                                            System.out.println("Ingrese la nueva editorial");
                                            libro.setEditorial(entrada.nextLine());
                                            break;
                                        case 5:
                                            System.out.println("Ingrese el nuevo precio");
                                            libro.setPrecio(entrada.nextFloat());
                                            break;
                                        case 6:
                                            break;
                                        default:
                                            System.out.println("Opcion no valida"); 
                                            break;

                                    }//switch de modificando libro
                                    break;
                                }while(opcion3 !=6);//es hasta opcion 6 para que regrese al menu libros, do case 2 de libros, y  do de modificar libros
                                //modificando libro
                            case 3://eliminar libro
                                System.out.println("***Eliminando libro***");
                                libro.setTitulo("");
                                libro.setAutor("");
                                libro.setFechapub("");
                                libro.setEditorial("");
                                libro.setPrecio(0);
                                System.out.println("-----Libro eliminado correctamente--------");
                            break;//eliminar libro
                            case 4://listar libro
                                System.out.println("****Listando libro***");
                                System.out.println("Titulo: " + libro.getTtitulo());
                                System.out.println("Autor: " + libro.getAutor());
                                System.out.println("Fecha de publicación: " + libro.getFechapub());
                                System.out.println("Editorial: " + libro.getEditorial());
                                System.out.println("Precio: " + libro.getPrecio());
                            break;// listar libro
                            case 5://regresar
                            break;
                            default:
                                System.out.println("Opción no valida");
                                break;
                        }//cierra switch para las opciones de menu libros
                    }while (opcion2 != 5);//cierra menu de libros y 5 para regresar a principal
                    break;
                case 2: // menu principal autores
                    do{
                        System.out.println("*****Menu Autor******");
                        System.out.println("1. Agregar autores");
                        System.out.println("2. Modificar autor");
                        System.out.println("3. Eliminar autor");
                        System.out.println("4. Listar autor");
                        System.out.println("5. Regresar");
                        System.out.println("Escriba el numero de opción a realizar");
                        opcion2 = entrada.nextInt();  
                        switch(opcion2) {
                            case 1://agregar autores
                                System.out.println("****Agregando autores****");
                                entrada.nextLine();
                                System.out.println("Ingresa el nombre del autor: ");
                                autor.setNombre(entrada.nextLine());
                                System.out.println("Ingrese la pagina web del autor");
                                autor.setPaginaweb(entrada.nextLine());
                                System.out.println("Ingrese el email del autor");
                                autor.setEmail(entrada.nextLine());
                                System.out.println("-----Autor agregado correctamente-----");
                            break;//agregar autores
                            case 2://modificar autores
                                System.out.println("****Modificando autor****");
                                System.out.println("Nombre: " + autor.getNombre());
                                System.out.println("Pagina web: " + autor.getPaginaweb());
                                System.out.println("Email: " + autor.getEmail());
                                System.out.println("Que desea modificar?");
                                System.out.println("1. Nombre");
                                System.out.println("2. Pagina web");
                                System.out.println("3. Email");
                                System.out.println("4. Regresar");
                                opcion2 = entrada.nextInt();
                                switch(opcion2){
                                    case 1://nombre
                                        System.out.println("Ingresa el nuevo nombre del autor: ");
                                        autor.setNombre(entrada.nextLine());
                                        break;//nombre
                                    case 2: //pagina web
                                        System.out.println("Ingresa la nueva pagina web del autor: ");
                                        autor.setPaginaweb(entrada.nextLine());
                                        break;//paginaweb
                                    case 3: // email
                                        System.out.println("Ingrese el nuevo email: ");
                                        autor.setEmail(entrada.nextLine());
                                        break;//email
                                    default:
                                        System.out.println("Opción no valida");
                                        break;
                                }//switch de modificar autor
                            break;//modificar autores
                            case 3:// eliminar autor
                                System.out.println("***Eliminando autor***");
                                autor.setNombre("");
                                autor.setPaginaweb("");
                                autor.setEmail("");
                                System.out.println("----Autor eliminado correctamente------");
                            break;//eliminar autor
                            case 4://listar autor
                                System.out.println("***Listando autor***");
                                System.out.println("Nombre: "+ autor.getNombre());
                                System.out.println("Pagina web: "+ autor.getPaginaweb());
                                System.out.println("Email: "+ autor.getEmail());
                            break;//listar autor
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }// switch de menu autor para las opciones de el
                    }while(opcion2 !=5); // cierra do de menu autor 
                break;
                case 3: // menu principal editoriales
                    do{
                        System.out.println("*****Menu Editorial*****");
                        System.out.println("1. Agregar editoral");
                        System.out.println("2. Modificar editorial");
                        System.out.println("3. Eliminar datos editorial");
                        System.out.println("4. Listar editorial");
                        System.out.println("5. Regresar");
                        opcion2 = entrada.nextInt();
                        switch (opcion2){
                            case 1://agregar editorial
                                System.out.println("****Agregando editorial****");
                                System.out.println("Ingrese el nombre de la editorial");
                                editorial.setNombre(entrada.nextLine());
                                System.out.println("Ingrese la dirección");
                                editorial.setDireccion(entrada.nextLine());
                                System.out.println("Ingrese el telefono de la editorial");
                                editorial.setTelefono(entrada.nextLine());
                                System.out.println("Ingrese el contacto de la editorial");
                                editorial.setContacto(entrada.nextLine());
                            break;//agregar editorial
                            case 2://modificar editorial
                                System.out.println("****Modificando editorial****");
                                System.out.println("Nombre: " + editorial.getNombre());
                                System.out.println("Direccion: " + editorial.getDireccion());
                                System.out.println("Telefono: " + editorial.getTelefono());
                                System.out.println("Contacto: " + editorial.getContacto());
                                System.out.println("Que desas modificar?");
                                System.out.println("1. Nombre");
                                System.out.println("2. Dirección");
                                System.out.println("3. Telefono");
                                System.out.println("4. Contacto");
                                System.out.println("5. Regresar");
                                opcion3 = entrada.nextInt();
                                switch(opcion3){
                                    case 1://nomre
                                        System.out.println("Ingresa el nuevo nombre de la editorial: ");
                                        editorial.setNombre(entrada.nextLine());
                                    break;//nombre
                                    case 2://direccion
                                        System.out.println("Ingrese la nueva dirección: ");
                                        editorial.setDireccion(entrada.nextLine());
                                    break;//direccion
                                    case 3://telefono
                                        System.out.println("Ingrese el nuevo telefono: ");
                                        editorial.setTelefono(entrada.nextLine());
                                    break;//telefono
                                    case 4://contacto
                                        System.out.println("Ingrese el nuevo contacto: ");
                                        editorial.setContacto(entrada.nextLine());
                                    break;//contacto
                                    default:
                                        System.out.println("Opción no válida");
                                        break;
                                }//switch de modificar editorial
                            break;//modificar editorial
                            case 3:// eliminar editorial
                                System.out.println("***Eliminando editorial***");
                                editorial.setNombre("");
                                editorial.setDireccion("");
                                editorial.setTelefono("");
                                editorial.setContacto("");
                                System.out.println("-----Editorial eliminada correctamente-------");
                            break;//eliminar editorial
                            case 4: // listar editorial
                                System.out.println("***Listando editorial***");
                                System.out.println("Nombre: "+ editorial.getNombre());
                                System.out.println("Direccion: "+ editorial.getDireccion());
                                System.out.println("Telefono: "+ editorial.getTelefono());
                                System.out.println("Contacto: "+ editorial.getContacto());
                            break;//listar editorial
                            default:
                                System.out.println("Opcion no valida");
                                break;
                        }// cierra switch de menu editorial
                    }while (opcion2 != 5); //cierra do de editoriales
                    break;
                case 4: // menu principal salir
                    System.out.println("Gracias por usar el sistema");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }//switch que encierra todo los cases de menu principal
        }while(opcion != 4); //cierra do while que encierra todo el codigo
        entrada.close();
    }// cierra public static void
}// llave de puclic class libreria