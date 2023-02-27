import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // Instancia la ventana
        ConversorGui gui = new ConversorGui();

        gui.campoTexto1.setText("ingresa valor");
        gui.botonConvertir.setText("CONVERTIR!");

        // Agrega comportamiento del boton
        gui.botonConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Extrae valores de los campos.
                String divisaOrigen = gui.selectorDivisas1.getSelectedItem().toString();
                String divisaObjetivo = gui.selectorDivisas2.getSelectedItem().toString();
                double monedaOrigen = Double.parseDouble(gui.campoTexto1.getText().trim());

                // Crea instancia moneda
                Moneda moneda = new Moneda(monedaOrigen, divisaOrigen);

                // Convierte la moneda y la muestra  
                gui.campoTexto2.setText(""+moneda.convertir(divisaObjetivo));
            }
        });


    }
}
