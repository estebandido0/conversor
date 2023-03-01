import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        // Instancia la ventana
        final String[] divisas = { "USD", "EUR", "GBP", "JPY", "KRW", "CLP" };
        ConversorGui gui = new ConversorGui(divisas);

        gui.campoTexto1.setText("ingresa valor");
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
                double monedaOrigen = Double.parseDouble(gui.campoTexto1.getText().trim());

                // Crea instancia moneda
                Moneda moneda = new Moneda(monedaOrigen, divisaOrigen);

                // Convierte la moneda y la muestra
                gui.campoTexto2.setText("" + moneda.convertir(divisaObjetivo));
            }
        });
    }
}
