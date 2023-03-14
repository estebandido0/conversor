import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Main {
    public static void main(String[] args) {

        // Crea un string array con los valores del enum Divisas
        String[] divisas = new String[Divisas.values().length];
        for (int i = 0; i < divisas.length; i++) {
            divisas[i] = Divisas.values()[i].name();
        }

        // Instancia la ventana con los valores Divisas
        ConversorGui gui = new ConversorGui(divisas);

        gui.campoTexto1.setForeground(Color.gray);
        gui.campoTexto1.setText("Monto");
        gui.botonConvertir.setText("CONVERTIR!");

        // Funcionalidad de intercambiar divisa
        gui.botonIntercambiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object selected1 = gui.selectorDivisas1.getSelectedItem();
                gui.selectorDivisas1.setSelectedItem(gui.selectorDivisas2.getSelectedItem());
                gui.selectorDivisas2.setSelectedItem(selected1);
            }
        });

        // Funcionalidad de convertir
        gui.botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Extrae valores de los campos.
                String divisaOrigen = gui.selectorDivisas1.getSelectedItem().toString();
                String divisaObjetivo = gui.selectorDivisas2.getSelectedItem().toString();
                
                if (!(gui.campoTexto1.getText().trim().matches("^[1-9]+[0-9]*$|^[0-9]*[.][0-9]+$"))) {
                    gui.campoTexto1.setText(""); 
                    gui.campoTexto2.setForeground(Color.red);
                    gui.campoTexto2.setText("Monto invalido!");
                    return;
                }
                double monedaOrigen = Double.parseDouble(gui.campoTexto1.getText().trim());
                
                // Crea instancia moneda
                Moneda moneda = new Moneda(monedaOrigen, divisaOrigen);

                // Convierte la moneda y la muestra
                gui.campoTexto2.setForeground(Color.black);
                gui.campoTexto2.setText(String.format("%.2f", moneda.convertir(divisaObjetivo)) );

            }
        });
    
        //Prompt
        gui.campoTexto1.addFocusListener(new FocusListener() {
            
            @Override
            public void focusLost(FocusEvent e) {
                if(gui.campoTexto1.getText().isEmpty()) {
                    gui.campoTexto1.setForeground(Color.gray);
                    gui.campoTexto1.setText("Monto");
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                gui.campoTexto1.setForeground(Color.black);
                if(gui.campoTexto1.getText().equals("Monto")) {
                    gui.campoTexto1.setText("");
                }
            }
        });
    }
}
