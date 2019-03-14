
package reserva;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class cambiarImagen {
    
    static int contador = 0;
    static String nomH;
    
    /*public cambiarImagen(String nom){
        nomH=nom;
    }*/
    
    public static void main(String[] args) {
       
        int velocidad = 3;
        
        Timer timer;
        TimerTask tarea;
        int velmil = velocidad*1000;
        
        final Home19 albercas = new Home19();
        albercas.setVisible(true);
        
        
        tarea = new TimerTask(){
            @Override
            public void run() {
                Icon icono;
                
                switch(contador)
                {
                    case 0: 
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/Albercas/b.jpeg"));
                        albercas.albecas.setIcon(icono);
                        break;
                    case 1:
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/Albercas/c.jpeg"));
                        albercas.albecas.setIcon(icono);
                        break;
                    case 2: 
                        contador = 3;
                        icono = new ImageIcon(getClass().getResource("/Albercas/c.jpeg"));
                        albercas.albecas.setIcon(icono);
                        break;
                    case 3: 
                        contador = 4;
                        icono = new ImageIcon(getClass().getResource("/Albercas/d.jpeg"));
                        albercas.albecas.setIcon(icono);
                        break;
                    case 4: 
                        contador = 5;
                        icono = new ImageIcon(getClass().getResource("/Albercas/e.jpeg"));
                        albercas.albecas.setIcon(icono);
                        break;
                    case 5:
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/Albercas/f.jpeg"));
                        albercas.albecas.setIcon(icono);
                        break;
                    
                }
            }
            
        };
        
        timer = new Timer();
        
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }

    
}
