import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Main {
    public static void main(String[] args) {
        // Instancia la ventana
        final String[] divisas = { "USD", "EUR", "GBP", "JPY", "KRW", "CLP" };
        ConversorGui gui = new ConversorGui(divisas);

        gui.campoTexto1.setText("Valor");
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
                    gui.campoTexto2.setText("Error!"); 
                    return;
                }
                double monedaOrigen = Double.parseDouble(gui.campoTexto1.getText().trim());
                
                // Crea instancia moneda
                Moneda moneda = new Moneda(monedaOrigen, divisaOrigen);

                // Convierte la moneda y la muestra
                gui.campoTexto2.setText(String.format("%.2f", moneda.convertir(divisaObjetivo)) );

            }
        });
    
        //Prompt
        gui.campoTexto1.addFocusListener(new FocusListener() {
            
            @Override
            public void focusLost(FocusEvent e) {
                if(gui.campoTexto1.getText().isEmpty()) {
                    gui.campoTexto1.setText("Valor");
                }
            }

            @Override
            public void focusGained(FocusEvent e) {
                if(gui.campoTexto1.getText().equals("Valor")) {
                    gui.campoTexto1.setText("");
                }
            }
        });
    }
}
