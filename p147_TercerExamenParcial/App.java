package p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;

public class App extends JFrame implements ActionListener{
    ArrayList<Jugador> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla, pnlDatos, pnlBotones;
    JDialog jdlAcercaDe;
    JLabel lblDatos, lblNombre, lblEdad, lblSexo, lblEstadoCivil, lblDescripcion, lblSalario;
    JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    public App() {
        super("Datos de Jugadores");
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        
        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        
        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        
        smnAcercade = new JMenuItem("Acerca de ..");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
        
        jdlAcercaDe = new JDialog(this, "Acerca de ..");
        jdlAcercaDe.setSize(300, 250);
        jdlAcercaDe.setLocationRelativeTo(null);
        
        lblDatos = new JLabel("<html>Programación Orientada a Objetos I<br>Noe Arredondo Hernandez</html>", JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);
        
        setLayout(new GridLayout(3, 1));
        
        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla, BoxLayout.X_AXIS));
        add(pnlTabla);
        
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
        
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[] { "Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario" });
        table.setModel(modelo);
        
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });
        
        pnlDatos = new JPanel();
        add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(6, 2, 0, 0));
        
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        
        lblSexo = new JLabel("Sexo");
        lblSexo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSexo = new JTextField();
        pnlDatos.add(lblSexo);
        pnlDatos.add(txtSexo);
        
        lblEstadoCivil = new JLabel("Estado Civil");
        lblEstadoCivil.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEstadoCivil = new JTextField();
        pnlDatos.add(lblEstadoCivil);
        pnlDatos.add(txtEstadoCivil);
        
        lblDescripcion = new JLabel("Descripción");
        lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
        txtDescripcion = new JTextField();
        pnlDatos.add(lblDescripcion);
        pnlDatos.add(txtDescripcion);
        
        lblSalario = new JLabel("Salario");
        lblSalario.setHorizontalAlignment(SwingConstants.RIGHT);
        txtSalario = new JTextField();
        pnlDatos.add(lblSalario);
        pnlDatos.add(txtSalario);
        
        pnlBotones = new JPanel();
        
        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        
        add(pnlBotones);
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        while (dm.getRowCount() > 0) dm.removeRow(0);
        Object[] obj = new Object[6];
        for (Jugador jugador : datos) {
            obj[0] = jugador.getNombre();
            obj[1] = jugador.getEdad();
            obj[2] = jugador.getSexo();
            obj[3] = jugador.getEstadoCivil();
            obj[4] = jugador.getDescripcion();
            obj[5] = jugador.getSalario();
            modelo.addRow(obj);
        }
    }

    public void mostrarDatos(int ren) {
        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString(datos.get(ren).getEdad()));
        txtSexo.setText(String.valueOf(datos.get(ren).getSexo()));
        txtEstadoCivil.setText(datos.get(ren).getEstadoCivil());
        txtDescripcion.setText(datos.get(ren).getDescripcion());
        txtSalario.setText(Double.toString(datos.get(ren).getSalario()));
    }

    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                cp.setEnabled(actdes);
    }

    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
            if (cp instanceof JTextField)
                ((JTextField) cp).setText("");
    }

    public void guardarCampos() {
        Jugador jugador = new Jugador(
                txtNombre.getText(),
                Integer.parseInt(txtEdad.getText()),
                txtSexo.getText().charAt(0),
                txtEstadoCivil.getText(),
                txtDescripcion.getText(),
                Double.parseDouble(txtSalario.getText())
        );
        datos.add(jugador);
        cargarDatos();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if (e.getSource() == smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            abrirArchivo();
        } else if (e.getSource() == smnGuardar) {
            guardarArchivo();
        } else if (e.getSource() == btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if (e.getSource() == btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    private void abrirArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setCurrentDirectory(new File("."));
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        int res = fchArchivo.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            try {
                datos = Util.desSerializarDatos(fchArchivo.getSelectedFile().getName());
                cargarDatos();
                JOptionPane.showMessageDialog(this, "Archivo cargado correctamente.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void guardarArchivo() {
        fchArchivo = new JFileChooser();
        fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos (.dat)", "dat"));
        fchArchivo.setCurrentDirectory(new File("."));
        int res = fchArchivo.showSaveDialog(this);
        if (res == JFileChooser.APPROVE_OPTION) {
            try {
                Util.serializarDatos(fchArchivo.getSelectedFile().getName(), datos);
                JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 600, 450);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false);
    }
}
