import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p143_PagaTrabjadorGUI extends JFrame {
    private JTextField txtHoras, txtPaga;
    private JLabel lblPagaBruta, lblImpuesto, lblPagaNeta;

    public p143_PagaTrabjadorGUI() {
        setLayout(null);
        
        add(new JLabel("Horas trabajadas:")).setBounds(20, 20, 150, 25);
        txtHoras = new JTextField();
        txtHoras.setBounds(150, 20, 100, 25);
        add(txtHoras);
        
        add(new JLabel("Paga por hora:")).setBounds(20, 50, 150, 25);
        txtPaga = new JTextField();
        txtPaga.setBounds(150, 50, 100, 25);
        add(txtPaga);
        
        JButton btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(20, 90, 100, 25);
        add(btnCalcular);

        lblPagaBruta = new JLabel("Paga Bruta: ");
        lblPagaBruta.setBounds(20, 130, 200, 25);
        add(lblPagaBruta);

        lblImpuesto = new JLabel("Impuesto: ");
        lblImpuesto.setBounds(20, 160, 200, 25);
        add(lblImpuesto);

        lblPagaNeta = new JLabel("Paga Neta: ");
        lblPagaNeta.setBounds(20, 190, 200, 25);
        add(lblPagaNeta);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularPaga();
            }
        });
        
        setTitle("Calculadora de Paga");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void calcularPaga() {
        int horas = Integer.parseInt(txtHoras.getText());
        double paga = Double.parseDouble(txtPaga.getText());
        double tasa = 0.3;

        double pagabruta = horas * paga;
        double impuesto = pagabruta * tasa;
        double paganeta = pagabruta - impuesto;

        lblPagaBruta.setText("Paga Bruta: " + pagabruta);
        lblImpuesto.setText("Impuesto: " + impuesto);
        lblPagaNeta.setText("Paga Neta: " + paganeta);
    }

    public static void main(String[] args) {
        new p143_PagaTrabjadorGUI().setVisible(true);
    }
}
