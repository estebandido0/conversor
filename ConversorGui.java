import javax.swing.*;

public class ConversorGui {

    public JFrame frame = new JFrame("Conversor de divisas");
    public JPanel panel = new JPanel();
    public JTextField campoTexto1 = new JTextField();
    public JTextField campoTexto2 = new JTextField();
    public JButton botonConvertir = new JButton();
    private final String[] divisas = { "USD", "EUR", "GBP", "JPY", "KRW", "CLP" };
    public JComboBox<String> selectorDivisas1 = new JComboBox<>(divisas);
    public JComboBox<String> selectorDivisas2 = new JComboBox<>(divisas);
    public JLabel tittle = new JLabel("Conversor Alura");

    public ConversorGui() {

        // Comportamiento de la ventana
        this.frame.setLayout(null);
        // frame.setSize(440, 350);
        this.frame.setSize(456, 389);
        this.frame.setResizable(false);

        // Panel
        this.panel.setLayout(null);
        this.panel.setBounds(0, 0, 440, 350);
        this.frame.add(panel);

        // Inputs fields
        this.campoTexto1.setBounds(24, 193, 160, 56);
        this.campoTexto2.setBounds(255, 193, 160, 56);
        this.panel.add(campoTexto1);
        this.panel.add(campoTexto2);

        // Boton
        this.botonConvertir.setBounds(24, 264, 392, 61);
        this.panel.add(botonConvertir);

        // Divisas
        this.selectorDivisas1.setBounds(24, 119, 162, 56);
        this.selectorDivisas2.setBounds(255, 119, 162, 56);
        this.panel.add(selectorDivisas1);
        this.panel.add(selectorDivisas2);

        // Label
        this.tittle.setBounds(24, 24, 392, 79);
        // tittle.setFont(new FontUIResource("Dialog", 1, 40));
        this.panel.add(tittle);

        // Detiene la ejecucion
        this.frame.setVisible(true);
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
