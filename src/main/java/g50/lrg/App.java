package g50.lrg;

import g50.lrg.view.GUIInformes;

public class App 
{
    public static void main( String[] args )
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIInformes().setVisible(true);
            }
        });

    }

}
