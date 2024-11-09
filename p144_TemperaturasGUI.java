import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p144_TemperaturasGUI extends JFrame {
    private JTextField txtTemperatura;
    private JLabel lblResultado;
    private JRadioButton rbtnFtoC, rbtnCtoF;
    private JButton btnConvertir;

    public p144_TemperaturasGUI() {
        setLayout(null);

        add(new JLabel("Temperatura:")).setBounds(20, 20, 100, 25);
        txtTemperatura = new JTextField();
        txtTemperatura.setBounds(120, 20, 100, 25);
        add(txtTemperatura);

        rbtnFtoC = new JRadioButton("Fahrenheit a Celsius");
        rbtnFtoC.setBounds(20, 60, 200, 25);
        add(rbtnFtoC);

        rbtnCtoF = new JRadioButton("Celsius a Fahrenheit");
        rbtnCtoF.setBounds(20, 90, 200, 25);
        add(rbtnCtoF);

        ButtonGroup group = new ButtonGroup();
        group.add(rbtnFtoC);
        group.add(rbtnCtoF);

        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(20, 130, 100, 25);
        add(btnConvertir);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20, 170, 200, 25);
        add(lblResultado);

        btnConvertir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertirTemperatura();
            }
        });

        setTitle("Conversor de Temperatura");
        setSize(300, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void convertirTemperatura() {
        try {
            float temp = Float.parseFloat(txtTemperatura.getText());
            float resultado;

            if (rbtnFtoC.isSelected()) {
                resultado = (temp - 32) * 5 / 9;
                lblResultado.setText(String.format("Resultado: %.2f °C", resultado));
            } else if (rbtnCtoF.isSelected()) {
                resultado = (temp * 9 / 5) + 32;
                lblResultado.setText(String.format("Resultado: %.2f °F", resultado));
            } else {
                lblResultado.setText("Seleccione una opción de conversión.");
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Entrada no válida.");
        }
    }

    public static void main(String[] args) {
        new p144_TemperaturasGUI().setVisible(true);
    }
}
