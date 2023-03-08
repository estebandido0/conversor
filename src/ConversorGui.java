/*
 * Esta clase crea un una ventana principal con un estilo y botones determinados.
 * La funcionalidad de los componentes no está definida.
 */

import java.awt.Color;
import javax.swing.*;

public class ConversorGui {

    // Componentes
    public JFrame frame = new JFrame("Conversor de divisas");
    public JPanel panel = new JPanel();
    public JTextField campoTexto1 = new JTextField();
    public JTextField campoTexto2 = new JTextField();
    public JButton botonConvertir = new JButton();
    public JButton botonIntercambiar = new JButton();
    public JComboBox<String> selectorDivisas1;
    public JComboBox<String> selectorDivisas2;
    public JLabel tittle = new JLabel("Conversor Alura");
    
    // Define colores
    private final Color GUI_PURPLE = new Color(0x526ED3);
    private final Color GUI_WHITE = new Color(0xF6F6F6);
    private final Color GUI_TEXT = new Color(0x191C30);

    // Constructor
    public ConversorGui(String[] divisas) {

        selectorDivisas1 = new JComboBox<>(divisas);
        selectorDivisas2 = new JComboBox<>(divisas);

        // Comportamiento de la ventana
        this.frame.setLayout(null);
        // frame.setSize(440, 350);
        this.frame.setSize(456, 389);
        this.frame.setLocation(100, 100);
        this.frame.setResizable(false);
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        // Estilos generales
        JComponent[] components = { campoTexto1, campoTexto2, botonConvertir, botonIntercambiar, selectorDivisas1, selectorDivisas2, tittle };
        for (JComponent component : components) {
            component.setFocusable(false);
            component.setFont(component.getFont().deriveFont(18f));
            component.setForeground(GUI_TEXT);
            frame.add(component);
        }

        // Estilos especificos

        // Panel principal
        this.panel.setLayout(null);
        this.panel.setBounds(0, 0, 440, 350);
        this.panel.setBackground(GUI_WHITE);
        frame.add(this.panel);

        // Titulo
        this.tittle.setBounds(24, 24, 392, 79);
        this.tittle.setFont(this.tittle.getFont().deriveFont(50f));

        // Selectores de divisas
        this.selectorDivisas1.setBounds(24, 119, 162, 56);
        this.selectorDivisas2.setBounds(255, 119, 162, 56);
        this.selectorDivisas1.setFocusable(true);
        this.selectorDivisas2.setFocusable(true);

        // Campos de texto
        this.campoTexto1.setBounds(24, 193, 160, 56);
        this.campoTexto2.setBounds(255, 193, 160, 56);
        this.campoTexto1.setFocusable(true);

        // Botones
        this.botonConvertir.setBounds(24, 264, 392, 61);
        this.botonConvertir.setBackground(GUI_PURPLE);
        this.botonConvertir.setForeground(GUI_WHITE);
        this.botonConvertir.setBorder(null);

        this.botonIntercambiar.setBounds(204, 135, 31, 24);
        this.botonIntercambiar.setBorder(null);
        this.botonIntercambiar.setBackground(GUI_WHITE);
        this.botonIntercambiar.setText("<>");

    }
}
