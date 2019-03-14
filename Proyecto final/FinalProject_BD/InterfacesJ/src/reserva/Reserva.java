
package reserva;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;

public class Reserva
{
    static int contador = 0;
    public static void main(String[] args) 
    {
        final VentanaReserva a = new VentanaReserva();
        a.setVisible(true);

        // PARA QUE LAS IMÁGENES SE CAMBIEN CADA CIERTO TIEMPO
        int velocidad = 2;
        Timer timer;
        TimerTask tarea;
        int velmil = velocidad * 1000;
        
        tarea = new TimerTask()
        {
            @Override
            public void run()
            {
                Icon icono;
                switch(contador) //Para cambiar la imagen controlar con el contador
                {
                    case 0: //PRIMERA IMAGEN
                        contador = 1;
                        icono = new ImageIcon(getClass().getResource("/Iconos/Cancun.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 1: //SEGUNDA IMAGEN
                        contador = 2;
                        icono = new ImageIcon(getClass().getResource("/Iconos/Taxco.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 2: //TERCERA IMGEN
                        contador = 3;
                        icono = new ImageIcon(getClass().getResource("/Iconos/chichen-itza-tour01.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break; 
                    case 3: //CUARTA IMAGEN
                        contador = 4;
                        icono = new ImageIcon(getClass().getResource("/Iconos/cidade-de-cancun-1.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 4: //QUINTA IMAGEN
                        contador = 5;
                        icono = new ImageIcon(getClass().getResource("/Iconos/m_10932_Palacio de Bellas Artes.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 5: //SEXTA IMAGEN
                        contador = 6;
                        icono = new ImageIcon(getClass().getResource("/Iconos/revolucion.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 6: //SÉPTIMA IMAGEN
                        contador = 7;
                        icono = new ImageIcon(getClass().getResource("/Iconos/zacatlan.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 7: //OCTAVA IMAGEN
                        contador = 8;
                        icono = new ImageIcon(getClass().getResource("/Iconos/zacatecas.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 8: //NOVENA IMAGEN
                        contador = 9;
                        icono = new ImageIcon(getClass().getResource("/Iconos/vallebravo.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 9: //DÉCIMA IMAGEN
                        contador = 10;
                        icono = new ImageIcon(getClass().getResource("/Iconos/sinaloa.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 10: //IMAGEN 11
                        contador = 11;
                        icono = new ImageIcon(getClass().getResource("/Iconos/guanajuato.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 11: //IMAGEN 12
                        contador = 12;
                        icono = new ImageIcon(getClass().getResource("/Iconos/aca.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 12: //IMAGEN 13
                        contador = 13;
                        icono = new ImageIcon(getClass().getResource("/Iconos/colima.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 13: //IMAGEN 14
                        contador = 14;
                        icono = new ImageIcon(getClass().getResource("/Iconos/coahuila.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                    case 14: //IMAGEN 15
                        contador = 0;
                        icono = new ImageIcon(getClass().getResource("/Iconos/aguascalientes.png"));
                        a.LBL_FOTOS_PRINCIPAL.setIcon(icono);
                        break;
                }
            }
        };
        
        timer = new Timer();
        timer.scheduleAtFixedRate(tarea, velmil, velmil);
    }
    
}
