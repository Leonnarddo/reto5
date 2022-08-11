package g50.lrg.util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;

public class JDBCutil {
        private static final String UBICACION_BD = "ProyectosConstruccion.db";

        public static Connection getConnection() throws SQLException {
    
            String url = "jdbc:sqlite:" + UBICACION_BD;
            return DriverManager.getConnection(url);
        }    
        
        
        public static void playSound(String soundName) {
              try {
               AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundName).getAbsoluteFile( ));
               Clip clip = AudioSystem.getClip( );
               clip.open(audioInputStream);
               clip.start( );
              }catch(Exception ex){
                System.out.println("Error, no se pudo reproducir el sonido.");
                ex.printStackTrace( );
              }
            }
        
}
