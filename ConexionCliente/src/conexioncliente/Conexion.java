
package conexioncliente;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class Conexion {
    private final int PUERTO = 1234 ;
    private final String HOST  = "192.168.43.245";
    protected String mensajeservidor ;
    protected ServerSocket ss;
    protected Socket cs;
    protected DataOutputStream  salidaServidor , salidaCliente ;
    
    public Conexion (String tipo) throws IOException{
     if  (tipo.equalsIgnoreCase("servidor")) {
         ss= new ServerSocket(PUERTO);
         cs= new Socket();
    }
     else{
         cs= new Socket (HOST, PUERTO);
     }
    
    }
}
