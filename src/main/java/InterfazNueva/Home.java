package InterfazNueva;

import com.unb001.mascotasenred.modelo.Denuncia;
import com.unb001.mascotasenred.modelo.Denunciante;
import com.unb001.mascotasenred.modelo.Mascota;
import java.awt.Color;
import java.awt.Component;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {

    int x, y;

    public Home() {
        initComponents();
        // AWTUtilities.setWindowOpaque(this, false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VentanaDeFondo = new javax.swing.JPanel();
        EspacioMenu = new javax.swing.JPanel();
        BotonBuscarMascota = new javax.swing.JLabel();
        BotonCrearAviso = new javax.swing.JLabel();
        BotonCargarDenunciante = new javax.swing.JLabel();
        BotonRegistrarMascota = new javax.swing.JLabel();
        BotonDenunciaMaltrato = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelBuscarMascota = new javax.swing.JPanel();
        BotonCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        TituloBuscarMascota = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BtnBuscarMascota = new javax.swing.JButton();
        jTextRazaBuscarMascota = new javax.swing.JTextField();
        jTextEstadoBuscarMascota = new javax.swing.JTextField();
        jTextTipoBuscarMascota = new javax.swing.JTextField();
        jTextTamañoBuscarMascota = new javax.swing.JTextField();
        jTextColorBuscarMascota = new javax.swing.JTextField();
        jTextZonaBuscarMascota = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableBuscarMascota = new javax.swing.JTable();
        PanelCrearAviso = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        TituloCrearAviso = new javax.swing.JLabel();
        jCBEstadoCrearAviso = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCBTamañoCrearAviso = new javax.swing.JComboBox<>();
        jLabel23 = new javax.swing.JLabel();
        jCBTipoCrearAviso = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        jCBColorCrearAviso = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        BtnCargarCrearAviso = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextNombreCrearAviso = new javax.swing.JTextField();
        jTextCaractCrearAviso = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jTextDenuncianteCrearAviso = new javax.swing.JTextField();
        BtnCancelarCrearAviso = new javax.swing.JButton();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextNroAvisoCrearAviso = new javax.swing.JTextField();
        jTextFechaCrearAviso = new javax.swing.JTextField();
        jTextIDCrearAviso = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        BotonCerrar2 = new javax.swing.JButton();
        BtnMostrarCrearAviso = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCrearAviso = new javax.swing.JTable();
        jTextRazaCrearAviso = new javax.swing.JTextField();
        jTextZonaCrearAviso = new javax.swing.JTextField();
        PanelCargarDenunciante = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        TituloCargarDenunciante = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        BtnGuardar = new javax.swing.JButton();
        jTextDNICargarDenunciante = new javax.swing.JTextField();
        jTextNombreCargarDenunciante = new javax.swing.JTextField();
        jTextApellidoCargarDenunciante = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextDireccionCargarDenunciante = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextTelCargarDenunciante = new javax.swing.JTextField();
        BtnCancelar = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTextEmailCargarDenunciante = new javax.swing.JTextField();
        BotonCerrar1 = new javax.swing.JButton();
        BtnMostrarDenunciantes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDenunciantes = new javax.swing.JTable();
        PanelRegistrarMascota = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        TituloRegistrarMascota = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jCBTamañoRegistrarMascota = new javax.swing.JComboBox<>();
        jLabel33 = new javax.swing.JLabel();
        jCBTipoRegistrarMascota = new javax.swing.JComboBox<>();
        jLabel34 = new javax.swing.JLabel();
        jCBColorRegistrarMascota = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        BtnCargarRegistrarMascota = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextNombreRegistrarMascota = new javax.swing.JTextField();
        jTextCaractRegistrarMascota = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextDenuncianteRegistrarMascota = new javax.swing.JTextField();
        BtnCancelarRegistrarMascota = new javax.swing.JButton();
        jTextEstadoRegistarMascota = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        jTextIDRegistrarMascota = new javax.swing.JTextField();
        BotonCerrar3 = new javax.swing.JButton();
        BtnMostrarRegistrarMascota = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableMostrarMascotasRegistradas = new javax.swing.JTable();
        jTextRazaRegistrarMascota = new javax.swing.JTextField();
        jTextZonaRegistrarMascota = new javax.swing.JTextField();
        PanelDenunciaMaltrato = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        TituloBuscarMascota1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        BotonCerrar4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setSize(new java.awt.Dimension(0, 0));

        VentanaDeFondo.setBackground(new java.awt.Color(230, 230, 230));
        VentanaDeFondo.setPreferredSize(new java.awt.Dimension(1280, 1024));

        EspacioMenu.setBackground(new java.awt.Color(61, 0, 112));
        EspacioMenu.setPreferredSize(new java.awt.Dimension(278, 1024));

        BotonBuscarMascota.setBackground(new java.awt.Color(88, 30, 138));
        BotonBuscarMascota.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonBuscarMascota.setForeground(new java.awt.Color(255, 255, 255));
        BotonBuscarMascota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonBuscarMascota.setText("  BUSCAR MASCOTA");
        BotonBuscarMascota.setName("BotonBuscarMascota"); // NOI18N
        BotonBuscarMascota.setOpaque(true);
        BotonBuscarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonBuscarMascotaMouseClicked(evt);
            }
        });

        BotonCrearAviso.setBackground(new java.awt.Color(35, 0, 66));
        BotonCrearAviso.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCrearAviso.setForeground(new java.awt.Color(255, 255, 255));
        BotonCrearAviso.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCrearAviso.setText("  CREAR AVISO");
        BotonCrearAviso.setName("BotonCrearAviso"); // NOI18N
        BotonCrearAviso.setOpaque(true);
        BotonCrearAviso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCrearAvisoMouseClicked(evt);
            }
        });

        BotonCargarDenunciante.setBackground(new java.awt.Color(35, 0, 66));
        BotonCargarDenunciante.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCargarDenunciante.setForeground(new java.awt.Color(255, 255, 255));
        BotonCargarDenunciante.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonCargarDenunciante.setText("  CARGAR DENUNCIANTE");
        BotonCargarDenunciante.setName("BotonBuscarMascota"); // NOI18N
        BotonCargarDenunciante.setOpaque(true);
        BotonCargarDenunciante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCargarDenuncianteMouseClicked(evt);
            }
        });

        BotonRegistrarMascota.setBackground(new java.awt.Color(35, 0, 66));
        BotonRegistrarMascota.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonRegistrarMascota.setForeground(new java.awt.Color(255, 255, 255));
        BotonRegistrarMascota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonRegistrarMascota.setText("  REGISTRAR MASCOTA");
        BotonRegistrarMascota.setName("BotonBuscarMascota"); // NOI18N
        BotonRegistrarMascota.setOpaque(true);
        BotonRegistrarMascota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegistrarMascotaMouseClicked(evt);
            }
        });

        BotonDenunciaMaltrato.setBackground(new java.awt.Color(35, 0, 66));
        BotonDenunciaMaltrato.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonDenunciaMaltrato.setForeground(new java.awt.Color(255, 255, 255));
        BotonDenunciaMaltrato.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonDenunciaMaltrato.setText("  DENUNCIA DE MALTRATO");
        BotonDenunciaMaltrato.setName("BotonBuscarMascota"); // NOI18N
        BotonDenunciaMaltrato.setOpaque(true);
        BotonDenunciaMaltrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDenunciaMaltratoMouseClicked(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/logo final.png"))); // NOI18N

        javax.swing.GroupLayout EspacioMenuLayout = new javax.swing.GroupLayout(EspacioMenu);
        EspacioMenu.setLayout(EspacioMenuLayout);
        EspacioMenuLayout.setHorizontalGroup(
            EspacioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspacioMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(EspacioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonCrearAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(BotonBuscarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(BotonCargarDenunciante, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(BotonRegistrarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addComponent(BotonDenunciaMaltrato, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(EspacioMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        EspacioMenuLayout.setVerticalGroup(
            EspacioMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EspacioMenuLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(BotonBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(BotonRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonDenunciaMaltrato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(4578, Short.MAX_VALUE))
        );

        PanelBuscarMascota.setBackground(new java.awt.Color(230, 230, 230));
        PanelBuscarMascota.setAlignmentX(0.0F);
        PanelBuscarMascota.setAlignmentY(0.0F);
        PanelBuscarMascota.setMaximumSize(new java.awt.Dimension(1002, 1024));
        PanelBuscarMascota.setPreferredSize(new java.awt.Dimension(1002, 1024));

        BotonCerrar.setBackground(new java.awt.Color(61, 0, 112));
        BotonCerrar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCerrar.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar.setText("X");
        BotonCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrarActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(61, 0, 112));
        jSeparator1.setPreferredSize(new java.awt.Dimension(0, 5));

        TituloBuscarMascota.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TituloBuscarMascota.setForeground(new java.awt.Color(61, 0, 112));
        TituloBuscarMascota.setText(" > Buscar Mascota");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(61, 0, 112));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Estado");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(61, 0, 112));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Tamaño");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(61, 0, 112));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Tipo");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(61, 0, 112));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Color");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(61, 0, 112));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Raza");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(61, 0, 112));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Zona");

        BtnBuscarMascota.setBackground(new java.awt.Color(61, 0, 112));
        BtnBuscarMascota.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnBuscarMascota.setForeground(new java.awt.Color(240, 240, 240));
        BtnBuscarMascota.setText("BUSCAR");
        BtnBuscarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnBuscarMascota.setName("Boton Buscar"); // NOI18N
        BtnBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarMascotaActionPerformed(evt);
            }
        });

        jTextRazaBuscarMascota.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        jTableBuscarMascota.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ESTADO", "NOMBRE", "TIPO", "RAZA", "COLOR", "CARACT. ESP.", "TAMAÑO", "ZONA", "DENUNCIANTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTableBuscarMascota);

        javax.swing.GroupLayout PanelBuscarMascotaLayout = new javax.swing.GroupLayout(PanelBuscarMascota);
        PanelBuscarMascota.setLayout(PanelBuscarMascotaLayout);
        PanelBuscarMascotaLayout.setHorizontalGroup(
            PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                        .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                                .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBuscarMascotaLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextTamañoBuscarMascota))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBuscarMascotaLayout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextEstadoBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 54, Short.MAX_VALUE)
                                .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarMascotaLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextColorBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarMascotaLayout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextTipoBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBuscarMascotaLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextRazaBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelBuscarMascotaLayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BtnBuscarMascota)
                                            .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextZonaBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                                .addComponent(TituloBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 36, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBuscarMascotaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCerrar)
                .addGap(39, 39, 39))
            .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        PanelBuscarMascotaLayout.setVerticalGroup(
            PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonCerrar)
                .addGap(39, 39, 39)
                .addComponent(TituloBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                        .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jTextEstadoBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTipoBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextZonaBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9)
                                .addComponent(jLabel11)
                                .addComponent(jTextTamañoBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextColorBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextRazaBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10)))
                .addGap(18, 18, 18)
                .addComponent(BtnBuscarMascota)
                .addContainerGap(809, Short.MAX_VALUE))
            .addGroup(PanelBuscarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelBuscarMascotaLayout.createSequentialGroup()
                    .addGap(287, 287, 287)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelCrearAviso.setBackground(new java.awt.Color(230, 230, 230));
        PanelCrearAviso.setAlignmentX(0.0F);
        PanelCrearAviso.setAlignmentY(0.0F);
        PanelCrearAviso.setMaximumSize(new java.awt.Dimension(1002, 1024));
        PanelCrearAviso.setPreferredSize(new java.awt.Dimension(1002, 1024));

        jSeparator2.setBackground(new java.awt.Color(61, 0, 112));
        jSeparator2.setPreferredSize(new java.awt.Dimension(0, 5));

        TituloCrearAviso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TituloCrearAviso.setForeground(new java.awt.Color(61, 0, 112));
        TituloCrearAviso.setText(" > Crear Aviso");

        jCBEstadoCrearAviso.setBackground(new java.awt.Color(230, 230, 230));
        jCBEstadoCrearAviso.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCBEstadoCrearAviso.setForeground(new java.awt.Color(51, 51, 51));
        jCBEstadoCrearAviso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Perdido", "Encontrado", "Adopción" }));
        jCBEstadoCrearAviso.setBorder(null);
        jCBEstadoCrearAviso.setName("ComboBoxEstado"); // NOI18N
        jCBEstadoCrearAviso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCBEstadoCrearAvisoMouseMoved(evt);
            }
        });
        jCBEstadoCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBEstadoCrearAvisoActionPerformed(evt);
            }
        });
        jCBEstadoCrearAviso.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean hasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(new java.awt.Color(61,0,112));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setBackground(Color.WHITE);
                }
                return label;
            }
        });

        jLabel21.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(61, 0, 112));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel21.setText("Estado");

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(61, 0, 112));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel22.setText("Tamaño");

        jCBTamañoCrearAviso.setBackground(new java.awt.Color(230, 230, 230));
        jCBTamañoCrearAviso.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCBTamañoCrearAviso.setForeground(new java.awt.Color(51, 51, 51));
        jCBTamañoCrearAviso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Mediano", "Pequeño" }));
        jCBTamañoCrearAviso.setBorder(null);
        jCBTamañoCrearAviso.setName("ComboBoxEstado"); // NOI18N
        jCBTamañoCrearAviso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCBTamañoCrearAvisoMouseMoved(evt);
            }
        });
        jCBTamañoCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTamañoCrearAvisoActionPerformed(evt);
            }
        });
        jCBTamañoCrearAviso.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean hasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(new java.awt.Color(61,0,112));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setBackground(Color.WHITE);
                }
                return label;
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(61, 0, 112));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Tipo");

        jCBTipoCrearAviso.setBackground(new java.awt.Color(230, 230, 230));
        jCBTipoCrearAviso.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCBTipoCrearAviso.setForeground(new java.awt.Color(51, 51, 51));
        jCBTipoCrearAviso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato", "Perro", "Conejo", "Tortuga", "Otro" }));
        jCBTipoCrearAviso.setBorder(null);
        jCBTipoCrearAviso.setName("ComboBoxEstado"); // NOI18N
        jCBTipoCrearAviso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCBTipoCrearAvisoMouseMoved(evt);
            }
        });
        jCBTipoCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoCrearAvisoActionPerformed(evt);
            }
        });
        jCBTipoCrearAviso.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean hasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(new java.awt.Color(61,0,112));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setBackground(Color.WHITE);
                }
                return label;
            }
        });

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(61, 0, 112));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel24.setText("Color");

        jCBColorCrearAviso.setBackground(new java.awt.Color(230, 230, 230));
        jCBColorCrearAviso.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCBColorCrearAviso.setForeground(new java.awt.Color(51, 51, 51));
        jCBColorCrearAviso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Marrón Oscuro", "Marrón claro", "Otro" }));
        jCBColorCrearAviso.setBorder(null);
        jCBColorCrearAviso.setName("ComboBoxEstado"); // NOI18N
        jCBColorCrearAviso.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCBColorCrearAvisoMouseMoved(evt);
            }
        });
        jCBColorCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBColorCrearAvisoActionPerformed(evt);
            }
        });
        jCBColorCrearAviso.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean hasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(new java.awt.Color(61,0,112));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setBackground(Color.WHITE);
                }
                return label;
            }
        });

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(61, 0, 112));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel25.setText("Raza");

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(61, 0, 112));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel26.setText("Zona");

        BtnCargarCrearAviso.setBackground(new java.awt.Color(61, 0, 112));
        BtnCargarCrearAviso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnCargarCrearAviso.setForeground(new java.awt.Color(240, 240, 240));
        BtnCargarCrearAviso.setText("CARGAR");
        BtnCargarCrearAviso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCargarCrearAviso.setName("Boton Buscar"); // NOI18N
        BtnCargarCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarCrearAvisoActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(61, 0, 112));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel27.setText("Nombre");

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(61, 0, 112));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel28.setText("Caract.");

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(61, 0, 112));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel30.setText("Denunciante");

        jTextDenuncianteCrearAviso.setText("dni del denunciante");

        BtnCancelarCrearAviso.setBackground(new java.awt.Color(77, 77, 77));
        BtnCancelarCrearAviso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnCancelarCrearAviso.setForeground(new java.awt.Color(240, 240, 240));
        BtnCancelarCrearAviso.setText("CANCELAR");
        BtnCancelarCrearAviso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCancelarCrearAviso.setName("Boton Buscar"); // NOI18N
        BtnCancelarCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarCrearAvisoActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(61, 0, 112));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel41.setText("N Aviso");

        jLabel43.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(61, 0, 112));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel43.setText("Fecha");

        jTextNroAvisoCrearAviso.setText("inserte 0");
        jTextNroAvisoCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNroAvisoCrearAvisoActionPerformed(evt);
            }
        });

        jTextFechaCrearAviso.setText("enter para cargar fecha actual");
        jTextFechaCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFechaCrearAvisoActionPerformed(evt);
            }
        });

        jTextIDCrearAviso.setText("inserte 0");
        jTextIDCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDCrearAvisoActionPerformed(evt);
            }
        });

        jLabel42.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(61, 0, 112));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel42.setText("ID");

        BotonCerrar2.setBackground(new java.awt.Color(61, 0, 112));
        BotonCerrar2.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCerrar2.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar2.setText("X");
        BotonCerrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrar2ActionPerformed(evt);
            }
        });

        BtnMostrarCrearAviso.setBackground(new java.awt.Color(77, 77, 77));
        BtnMostrarCrearAviso.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnMostrarCrearAviso.setForeground(new java.awt.Color(240, 240, 240));
        BtnMostrarCrearAviso.setText("MOSTRAR");
        BtnMostrarCrearAviso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMostrarCrearAviso.setName("Boton Buscar"); // NOI18N
        BtnMostrarCrearAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarCrearAvisoActionPerformed(evt);
            }
        });

        jTableCrearAviso.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ESTADO", "NOMBRE", "TIPO", "RAZA", "COLOR", "CARACT. ESP.", "TAMAÑO", "ZONA", "DENUNCIANTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableCrearAviso);

        javax.swing.GroupLayout PanelCrearAvisoLayout = new javax.swing.GroupLayout(PanelCrearAviso);
        PanelCrearAviso.setLayout(PanelCrearAvisoLayout);
        PanelCrearAvisoLayout.setHorizontalGroup(
            PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                        .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TituloCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCrearAvisoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonCerrar2)
                        .addGap(54, 54, 54))
                    .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                        .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelCrearAvisoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextNroAvisoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jCBEstadoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                                        .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                                                .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextIDCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCBTipoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCrearAvisoLayout.createSequentialGroup()
                                                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel22)
                                                    .addComponent(jLabel27))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                                                        .addComponent(jTextNombreCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel28))
                                                    .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                                                        .addComponent(jCBTamañoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel24)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jCBColorCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextCaractCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGap(14, 14, 14)
                                        .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel30))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFechaCrearAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                    .addComponent(jTextDenuncianteCrearAviso)
                                    .addComponent(jTextRazaCrearAviso)
                                    .addComponent(jTextZonaCrearAviso))))
                        .addGap(0, 45, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCrearAvisoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCargarCrearAviso)
                .addGap(18, 18, 18)
                .addComponent(BtnCancelarCrearAviso)
                .addGap(18, 18, 18)
                .addComponent(BtnMostrarCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        PanelCrearAvisoLayout.setVerticalGroup(
            PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCrearAvisoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonCerrar2)
                .addGap(26, 26, 26)
                .addComponent(TituloCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextNroAvisoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jCBEstadoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43)
                    .addComponent(jTextFechaCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(jTextIDCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(jCBTipoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25)
                    .addComponent(jTextRazaCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jCBTamañoCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jCBColorCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jTextZonaCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextNombreCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28)
                    .addComponent(jTextCaractCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30)
                    .addComponent(jTextDenuncianteCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(PanelCrearAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCargarCrearAviso)
                    .addComponent(BtnCancelarCrearAviso)
                    .addComponent(BtnMostrarCrearAviso))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(273, Short.MAX_VALUE))
        );

        PanelCargarDenunciante.setBackground(new java.awt.Color(230, 230, 230));
        PanelCargarDenunciante.setAlignmentX(0.0F);
        PanelCargarDenunciante.setAlignmentY(0.0F);
        PanelCargarDenunciante.setMaximumSize(new java.awt.Dimension(1002, 1024));
        PanelCargarDenunciante.setPreferredSize(new java.awt.Dimension(1002, 1024));

        jSeparator6.setBackground(new java.awt.Color(61, 0, 112));
        jSeparator6.setPreferredSize(new java.awt.Dimension(0, 5));

        TituloCargarDenunciante.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TituloCargarDenunciante.setForeground(new java.awt.Color(61, 0, 112));
        TituloCargarDenunciante.setText(" > Cargar Denunciante");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(61, 0, 112));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("DNI");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(61, 0, 112));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Nombre");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(61, 0, 112));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Apellido");

        BtnGuardar.setBackground(new java.awt.Color(61, 0, 112));
        BtnGuardar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnGuardar.setForeground(new java.awt.Color(240, 240, 240));
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGuardar.setName("Boton Buscar"); // NOI18N
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        jTextDNICargarDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDNICargarDenuncianteActionPerformed(evt);
            }
        });
        jTextDNICargarDenunciante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDNICargarDenuncianteKeyTyped(evt);
            }
        });

        jTextNombreCargarDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreCargarDenuncianteActionPerformed(evt);
            }
        });
        jTextNombreCargarDenunciante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNombreCargarDenuncianteKeyTyped(evt);
            }
        });

        jTextApellidoCargarDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextApellidoCargarDenuncianteActionPerformed(evt);
            }
        });
        jTextApellidoCargarDenunciante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextApellidoCargarDenuncianteKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(61, 0, 112));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel19.setText("Direccion");

        jTextDireccionCargarDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDireccionCargarDenuncianteActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(61, 0, 112));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel20.setText("Tel");

        jTextTelCargarDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTelCargarDenuncianteActionPerformed(evt);
            }
        });
        jTextTelCargarDenunciante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextTelCargarDenuncianteKeyTyped(evt);
            }
        });

        BtnCancelar.setBackground(new java.awt.Color(77, 77, 77));
        BtnCancelar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnCancelar.setForeground(new java.awt.Color(240, 240, 240));
        BtnCancelar.setText("CANCELAR");
        BtnCancelar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCancelar.setName("Boton Buscar"); // NOI18N
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(61, 0, 112));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Email");

        jTextEmailCargarDenunciante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextEmailCargarDenuncianteActionPerformed(evt);
            }
        });

        BotonCerrar1.setBackground(new java.awt.Color(61, 0, 112));
        BotonCerrar1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCerrar1.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar1.setText("X");
        BotonCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrar1ActionPerformed(evt);
            }
        });

        BtnMostrarDenunciantes.setBackground(new java.awt.Color(77, 77, 77));
        BtnMostrarDenunciantes.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnMostrarDenunciantes.setForeground(new java.awt.Color(240, 240, 240));
        BtnMostrarDenunciantes.setText("MOSTRAR");
        BtnMostrarDenunciantes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMostrarDenunciantes.setName("Boton Buscar"); // NOI18N
        BtnMostrarDenunciantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarDenunciantesActionPerformed(evt);
            }
        });

        jTableDenunciantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "DNI", "NOMBRE", "APELLIDO", "DIRECCION", "TELEFONO", "MAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDenunciantes);

        javax.swing.GroupLayout PanelCargarDenuncianteLayout = new javax.swing.GroupLayout(PanelCargarDenunciante);
        PanelCargarDenunciante.setLayout(PanelCargarDenuncianteLayout);
        PanelCargarDenuncianteLayout.setHorizontalGroup(
            PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                        .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextDNICargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNombreCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextApellidoCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextEmailCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(TituloCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                                        .addComponent(jTextDireccionCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextTelCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1))))
                        .addGap(64, 64, 64))
                    .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtnMostrarDenunciantes, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCargarDenuncianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCerrar1)
                .addGap(53, 53, 53))
        );
        PanelCargarDenuncianteLayout.setVerticalGroup(
            PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BotonCerrar1)
                .addGap(18, 18, 18)
                .addComponent(TituloCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCargarDenuncianteLayout.createSequentialGroup()
                        .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel15)
                            .addComponent(jTextDNICargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNombreCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel29)
                                .addComponent(jTextEmailCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel19)
                                .addComponent(jLabel20)
                                .addComponent(jTextDireccionCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextTelCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jTextApellidoCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64)
                .addGroup(PanelCargarDenuncianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnCancelar)
                    .addComponent(BtnMostrarDenunciantes))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
        );

        PanelRegistrarMascota.setBackground(new java.awt.Color(230, 230, 230));
        PanelRegistrarMascota.setAlignmentX(0.0F);
        PanelRegistrarMascota.setAlignmentY(0.0F);
        PanelRegistrarMascota.setMaximumSize(new java.awt.Dimension(1002, 1024));
        PanelRegistrarMascota.setPreferredSize(new java.awt.Dimension(1002, 1024));

        jSeparator3.setBackground(new java.awt.Color(61, 0, 112));
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 5));

        TituloRegistrarMascota.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TituloRegistrarMascota.setForeground(new java.awt.Color(61, 0, 112));
        TituloRegistrarMascota.setText(" > Registrar Mascota");

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(61, 0, 112));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel31.setText("Estado");

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(61, 0, 112));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel32.setText("Tamaño");

        jCBTamañoRegistrarMascota.setBackground(new java.awt.Color(230, 230, 230));
        jCBTamañoRegistrarMascota.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCBTamañoRegistrarMascota.setForeground(new java.awt.Color(51, 51, 51));
        jCBTamañoRegistrarMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grande", "Mediano", "Pequeño" }));
        jCBTamañoRegistrarMascota.setBorder(null);
        jCBTamañoRegistrarMascota.setName("ComboBoxEstado"); // NOI18N
        jCBTamañoRegistrarMascota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCBTamañoRegistrarMascotaMouseMoved(evt);
            }
        });
        jCBTamañoRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTamañoRegistrarMascotaActionPerformed(evt);
            }
        });
        jCBTamañoRegistrarMascota.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean hasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(new java.awt.Color(61,0,112));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setBackground(Color.WHITE);
                }
                return label;
            }
        });

        jLabel33.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(61, 0, 112));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel33.setText("Tipo");

        jCBTipoRegistrarMascota.setBackground(new java.awt.Color(230, 230, 230));
        jCBTipoRegistrarMascota.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCBTipoRegistrarMascota.setForeground(new java.awt.Color(51, 51, 51));
        jCBTipoRegistrarMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gato", "Perro", "Conejo", "Tortuga", "Otro" }));
        jCBTipoRegistrarMascota.setBorder(null);
        jCBTipoRegistrarMascota.setName("ComboBoxEstado"); // NOI18N
        jCBTipoRegistrarMascota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCBTipoRegistrarMascotaMouseMoved(evt);
            }
        });
        jCBTipoRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoRegistrarMascotaActionPerformed(evt);
            }
        });
        jCBTipoRegistrarMascota.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean hasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(new java.awt.Color(61,0,112));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setBackground(Color.WHITE);
                }
                return label;
            }
        });

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(61, 0, 112));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel34.setText("Color");

        jCBColorRegistrarMascota.setBackground(new java.awt.Color(230, 230, 230));
        jCBColorRegistrarMascota.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jCBColorRegistrarMascota.setForeground(new java.awt.Color(51, 51, 51));
        jCBColorRegistrarMascota.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Blanco", "Marrón Oscuro", "Marrón claro", "Otro" }));
        jCBColorRegistrarMascota.setBorder(null);
        jCBColorRegistrarMascota.setName("ComboBoxEstado"); // NOI18N
        jCBColorRegistrarMascota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCBColorRegistrarMascotaMouseMoved(evt);
            }
        });
        jCBColorRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBColorRegistrarMascotaActionPerformed(evt);
            }
        });
        jCBColorRegistrarMascota.setRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(
                JList list, Object value, int index,
                boolean isSelected, boolean hasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(
                    list, value, index, isSelected, hasFocus);
                if (isSelected) {
                    label.setForeground(Color.WHITE);
                    label.setBackground(new java.awt.Color(61,0,112));
                } else {
                    label.setForeground(Color.BLACK);
                    label.setBackground(Color.WHITE);
                }
                return label;
            }
        });

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(61, 0, 112));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel35.setText("Raza");

        jLabel36.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(61, 0, 112));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel36.setText("Zona");

        BtnCargarRegistrarMascota.setBackground(new java.awt.Color(61, 0, 112));
        BtnCargarRegistrarMascota.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnCargarRegistrarMascota.setForeground(new java.awt.Color(240, 240, 240));
        BtnCargarRegistrarMascota.setText("CARGAR");
        BtnCargarRegistrarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCargarRegistrarMascota.setName("Boton Buscar"); // NOI18N
        BtnCargarRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargarRegistrarMascotaActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(61, 0, 112));
        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel37.setText("Nombre");

        jLabel38.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(61, 0, 112));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel38.setText("Caract.");

        jLabel39.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(61, 0, 112));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel39.setText("Dueño");

        jTextDenuncianteRegistrarMascota.setText("dni del denunciante");
        jTextDenuncianteRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDenuncianteRegistrarMascotaActionPerformed(evt);
            }
        });

        BtnCancelarRegistrarMascota.setBackground(new java.awt.Color(77, 77, 77));
        BtnCancelarRegistrarMascota.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnCancelarRegistrarMascota.setForeground(new java.awt.Color(240, 240, 240));
        BtnCancelarRegistrarMascota.setText("CANCELAR");
        BtnCancelarRegistrarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCancelarRegistrarMascota.setName("Boton Buscar"); // NOI18N
        BtnCancelarRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarRegistrarMascotaActionPerformed(evt);
            }
        });

        jTextEstadoRegistarMascota.setText("Registrado");

        jLabel40.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(61, 0, 112));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel40.setText("ID");

        jTextIDRegistrarMascota.setText("inserte 0");
        jTextIDRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextIDRegistrarMascotaActionPerformed(evt);
            }
        });

        BotonCerrar3.setBackground(new java.awt.Color(61, 0, 112));
        BotonCerrar3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCerrar3.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar3.setText("X");
        BotonCerrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrar3ActionPerformed(evt);
            }
        });

        BtnMostrarRegistrarMascota.setBackground(new java.awt.Color(77, 77, 77));
        BtnMostrarRegistrarMascota.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        BtnMostrarRegistrarMascota.setForeground(new java.awt.Color(240, 240, 240));
        BtnMostrarRegistrarMascota.setText("MOSTRAR MASCOTAS REGISTRADAS");
        BtnMostrarRegistrarMascota.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnMostrarRegistrarMascota.setName("Boton Buscar"); // NOI18N
        BtnMostrarRegistrarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMostrarRegistrarMascotaActionPerformed(evt);
            }
        });

        jTableMostrarMascotasRegistradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "ESTADO", "NOMBRE", "TIPO", "RAZA", "COLOR", "CARACT. ESP.", "TAMAÑO", "ZONA", "DENUNCIANTE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableMostrarMascotasRegistradas);

        javax.swing.GroupLayout PanelRegistrarMascotaLayout = new javax.swing.GroupLayout(PanelRegistrarMascota);
        PanelRegistrarMascota.setLayout(PanelRegistrarMascotaLayout);
        PanelRegistrarMascotaLayout.setHorizontalGroup(
            PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                            .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                                        .addComponent(TituloRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                                                .addComponent(jLabel37)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextNombreRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelRegistrarMascotaLayout.createSequentialGroup()
                                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel32)
                                                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jCBTamañoRegistrarMascota, 0, 255, Short.MAX_VALUE)
                                                    .addComponent(jTextEstadoRegistarMascota)))
                                            .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                                                .addComponent(jLabel40)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextIDRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelRegistrarMascotaLayout.createSequentialGroup()
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jCBTipoRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelRegistrarMascotaLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarMascotaLayout.createSequentialGroup()
                                                        .addComponent(jLabel34)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jCBColorRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarMascotaLayout.createSequentialGroup()
                                                        .addComponent(jLabel38)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jTextCaractRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextDenuncianteRegistrarMascota, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                            .addComponent(jTextRazaRegistrarMascota)
                                            .addComponent(jTextZonaRegistrarMascota)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarMascotaLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(BtnCargarRegistrarMascota)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnCancelarRegistrarMascota)
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnMostrarRegistrarMascota)))
                                .addGap(48, 48, 48)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelRegistrarMascotaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonCerrar3)
                        .addGap(59, 59, 59))))
            .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );
        PanelRegistrarMascotaLayout.setVerticalGroup(
            PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BotonCerrar3)
                .addGap(18, 18, 18)
                .addComponent(TituloRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel31)
                                    .addComponent(jTextEstadoRegistarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel32)
                                    .addComponent(jCBTamañoRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel37)
                                    .addComponent(jTextNombreRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel33)
                                    .addComponent(jCBTipoRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel34)
                                    .addComponent(jCBColorRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel38)
                                    .addComponent(jTextCaractRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(jTextIDRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jTextRazaRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jTextZonaRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel39)
                            .addComponent(jTextDenuncianteRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCargarRegistrarMascota)
                    .addComponent(BtnCancelarRegistrarMascota)
                    .addComponent(BtnMostrarRegistrarMascota))
                .addContainerGap(775, Short.MAX_VALUE))
            .addGroup(PanelRegistrarMascotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PanelRegistrarMascotaLayout.createSequentialGroup()
                    .addGap(298, 298, 298)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        PanelDenunciaMaltrato.setBackground(new java.awt.Color(230, 230, 230));
        PanelDenunciaMaltrato.setAlignmentX(0.0F);
        PanelDenunciaMaltrato.setAlignmentY(0.0F);
        PanelDenunciaMaltrato.setMaximumSize(new java.awt.Dimension(1002, 1024));
        PanelDenunciaMaltrato.setPreferredSize(new java.awt.Dimension(1002, 1024));

        jSeparator4.setBackground(new java.awt.Color(61, 0, 112));
        jSeparator4.setPreferredSize(new java.awt.Dimension(0, 5));

        TituloBuscarMascota1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        TituloBuscarMascota1.setForeground(new java.awt.Color(61, 0, 112));
        TituloBuscarMascota1.setText(" > Denuncia de Maltrato");

        jScrollPane3.setToolTipText("");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jTextArea2.setRows(3);
        jTextArea2.setTabSize(5);
        jTextArea2.setText("Ley Nacional 14.346 de Protección Animal\n\nArt. 1º: Será reprimido con prisión de 15 días a un año el que infligiere malos tratos o hiciere víctima de actos de crueldad a los animales. \n\nArt. 2º: Serán considerados actos de maltrato: \n1) No alimentar en cantidad y calidad suficiente a los animales domésticos o cautivos. \n2) Azuzarlos para el trabajo mediante instrumentos que, no siendo de simple estímulo, les provoquen innecesarios castigos o sensaciones dolorosas. \n3) Hacerlos trabajar en jornadas excesivas, sin proporcionarles descanso adecuado, según las estaciones climáticas. \n4) Emplearlos en el trabajo cuando no se hallen en estado físico adecuado. \n5) Estimularlos con drogas sin perseguir fines terapéuticos. \n6) Emplear animales en el tiro de vehículos que excedan notoriamente sus fuerzas. \n\nArt. 3º: Serán considerados actos de crueldad: \n1) Practicar la vivisección con fines que no sean científicamente demostrables y en lugares o por personas que no estén debidamente autorizadas para ello. \n2) Mutilar cualquier parte del cuerpo de un animal, salvo que el acto tenga fines de mejoramiento, marcación o higiene de la respectiva especie animal o se realice por motivos de piedad. \n3) Intervenir quirúrgicamente animales sin anestesia y sin poseer el título de médico o veterinario, con fines que no sean terapéuticos o de perfeccionamiento técnico operatorio, salvo en casos de urgencia debidamente comprobada. \n4) Experimentar con animales de grado superior en la escala zoológica al indispensable según la naturaleza de la experiencia. \n5) Abandonar a sus propios medios a los animales utilizados en la experimentación. \n6) Causar la muerte de animales grávidos, cuando tal estado sea patente en el animal y salvo en el caso de las industrias legalmente establecidas que se fundan sobre la explotación del nonato. \n7) Lastimar o arrollar animales intencionalmente, causarles torturas o sufrimientos innecesarios, o matarlos por el sólo espíritu de perversidad. \n8) Realizar actos públicos o privados de riñas de animales, corridas de toros, novilladas y parodias, en que se mate, hiera u hostilice animales. \n\nArt. 4º: Comuníquese al Poder Ejecutivo. \n\n\n¿QUE HACER EN CASO DE MALTRATO Y CRUELDAD CONTRA ANIMALES? \n\nDebes tener presente: \n1. Es un delito penado por el Código Penal. \n2. Es un delito que tiene Acción Pública, es decir que puede ser denunciado por cualquier persona. \n3. El hecho se puede denunciar ante la Policía o fiscalía. \n\n\nLey 14.346 - DENUNCIAS POR MALTRATO \n\nPasos y requisitos necesarios para concretar una denuncia: \n\n1. Las denuncias son personales, debe efectuarlas la persona que presencia el hecho y que es testigo del hecho. \n2. El/la denunciante debe ser mayor de edad, (21 años), y acreditar su identidad con Documento Nacional de Identidad, Libreta de Enrolamiento o Cívica. Si es extranjero y no posee D.N.I., por medio de su Cédula de Identidad. \n3. La denuncia puede hacerse verbalmente o por escrito, ante las autoridades del lugar en que ocurrió el hecho. En caso de realizarse por escrito deberá ser firmada ante el funcionario que la recibe. \n4. La denuncia no exige mayores formalidades. Basta con describir los hechos considerados delictuosos, el lugar y tiempo en el que ocurren o han ocurrido y, si se lo conoce, el nombre, apodo, señas, y/o domicilio del culpable y cualquier otro dato de interés que pueda facilitar la investigación. \n5. La denuncia debe formularse ante la Comisaría de la zona, Juez competente, o el Ministerio Fiscal. LA POLICIA TIENE LA OBLIGACIÓN DE TOMAR LA DENUNCIA: LA LEY DE PROTECCIÓN AL ANIMAL NRO. 14.346 ES UNA LEY PENAL Y HAY QUE HACERLA CUMPLIR. \n6. El denunciante no contrae ninguna obligación que lo ligue al proceso, ni es necesario el asesoramiento de abogados. \n\n¿Dónde realizar la denuncia? \n\nEn la comisaría más próxima o ante el fiscal en turno o en los Tribunales\n");
        jScrollPane3.setViewportView(jTextArea2);

        BotonCerrar4.setBackground(new java.awt.Color(61, 0, 112));
        BotonCerrar4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        BotonCerrar4.setForeground(new java.awt.Color(255, 255, 255));
        BotonCerrar4.setText("X");
        BotonCerrar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCerrar4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelDenunciaMaltratoLayout = new javax.swing.GroupLayout(PanelDenunciaMaltrato);
        PanelDenunciaMaltrato.setLayout(PanelDenunciaMaltratoLayout);
        PanelDenunciaMaltratoLayout.setHorizontalGroup(
            PanelDenunciaMaltratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDenunciaMaltratoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDenunciaMaltratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelDenunciaMaltratoLayout.createSequentialGroup()
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addGap(982, 982, 982))
                    .addGroup(PanelDenunciaMaltratoLayout.createSequentialGroup()
                        .addComponent(TituloBuscarMascota1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDenunciaMaltratoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDenunciaMaltratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonCerrar4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        PanelDenunciaMaltratoLayout.setVerticalGroup(
            PanelDenunciaMaltratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDenunciaMaltratoLayout.createSequentialGroup()
                .addComponent(BotonCerrar4)
                .addGap(44, 44, 44)
                .addComponent(TituloBuscarMascota1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(435, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout VentanaDeFondoLayout = new javax.swing.GroupLayout(VentanaDeFondo);
        VentanaDeFondo.setLayout(VentanaDeFondoLayout);
        VentanaDeFondoLayout.setHorizontalGroup(
            VentanaDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentanaDeFondoLayout.createSequentialGroup()
                .addComponent(EspacioMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(VentanaDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentanaDeFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VentanaDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelDenunciaMaltrato, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentanaDeFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PanelBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        VentanaDeFondoLayout.setVerticalGroup(
            VentanaDeFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(EspacioMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 5056, Short.MAX_VALUE)
            .addGroup(VentanaDeFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDenunciaMaltrato, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCargarDenunciante, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelCrearAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelRegistrarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(VentanaDeFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(VentanaDeFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //ESPACIO MENU-----------------------------------------------------------------------------
    private void BotonBuscarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonBuscarMascotaMouseClicked
        //CAMBIA COLORES DE LOS BOTONES---------------------------------
        resetLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        //CAMBIA PANELES SEGUN EL BOTON CLICKEADO-----------------------
        BotonCerrar.setVisible(true);
        PanelBuscarMascota.setVisible(true);
        PanelCrearAviso.setVisible(false);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(false);
        //jLabelLogo.setVisible(true);
    }//GEN-LAST:event_BotonBuscarMascotaMouseClicked

    private void BotonCrearAvisoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCrearAvisoMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        resetLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        BotonCerrar.setVisible(true);
        PanelBuscarMascota.setVisible(false);
        PanelCrearAviso.setVisible(true);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(false);
    }//GEN-LAST:event_BotonCrearAvisoMouseClicked

    private void BotonCargarDenuncianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCargarDenuncianteMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        resetLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        BotonCerrar.setVisible(true);
        PanelBuscarMascota.setVisible(false);
        PanelCrearAviso.setVisible(false);
        PanelCargarDenunciante.setVisible(true);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(false);
    }//GEN-LAST:event_BotonCargarDenuncianteMouseClicked

    private void BotonRegistrarMascotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegistrarMascotaMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        resetLblColor(BotonRegistrarMascota);
        setLblColor(BotonDenunciaMaltrato);
        BotonCerrar.setVisible(true);
        PanelBuscarMascota.setVisible(false);
        PanelCrearAviso.setVisible(false);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(true);
        PanelDenunciaMaltrato.setVisible(false);
    }//GEN-LAST:event_BotonRegistrarMascotaMouseClicked

    private void BotonDenunciaMaltratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDenunciaMaltratoMouseClicked
        // TODO add your handling code here:
        setLblColor(BotonBuscarMascota);
        setLblColor(BotonCrearAviso);
        setLblColor(BotonCargarDenunciante);
        setLblColor(BotonRegistrarMascota);
        resetLblColor(BotonDenunciaMaltrato);
        BotonCerrar.setVisible(true);
        PanelBuscarMascota.setVisible(false);
        PanelCrearAviso.setVisible(false);
        PanelCargarDenunciante.setVisible(false);
        PanelRegistrarMascota.setVisible(false);
        PanelDenunciaMaltrato.setVisible(true);

        //-----------FIN CAMBIO COLORES INCATIVO/ACTIVO-----------------------------------------------------
    }//GEN-LAST:event_BotonDenunciaMaltratoMouseClicked
//FIN ESPACIO MENU--------------------------------------------------------------------------------------------

    private void BtnBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarMascotaActionPerformed
        String estado, tipo, raza, tamaño, color, zona;
        String stEstado, stTipo, stRaza, stTamaño, stColor, stZona;
        estado = jTextEstadoBuscarMascota.getText();
        tipo = jTextTipoBuscarMascota.getText();
        raza = jTextRazaBuscarMascota.getText();
        tamaño = jTextTamañoBuscarMascota.getText();
        color = jTextColorBuscarMascota.getText();
        zona = jTextZonaBuscarMascota.getText();
        if ((estado.equals("")) || (estado == null)) {
            stEstado = "m.estado !=null";
        } else {
            stEstado = "m.estado LIKE '%" + estado + "%'";
        }
        if ((tipo.equals("")) || (tipo == null)) {
            stTipo = "m.tipoMascota !=null";
        } else {
            stTipo = "m.tipoMascota LIKE '%" + tipo + "%'";
        }
        if ((raza.equals("")) || (raza == null)) {
            stRaza = "m.raza !=null";
        } else {
            stRaza = "m.raza LIKE '%" + raza + "%'";
        }
        if ((tamaño.equals("")) || (tamaño == null)) {
            stTamaño = "m.tamanio !=null";
        } else {
            stTamaño = "m.tamanio LIKE '%" + tamaño + "%'";
        }
        if ((color.equals("")) || (color == null)) {
            stColor = "m.color !=null";
        } else {
            stColor = "m.color LIKE '%" + color + "%'";
        }

        if ((zona.equals("")) || (zona == null)) {
            stZona = "m.zona !=null";
        } else {
            stZona = "m.zona LIKE '%" + zona + "%'";
        }

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        DefaultTableModel dfmAviso = new DefaultTableModel();
        this.jTableBuscarMascota.setModel(dfmAviso);
        dfmAviso.setColumnIdentifiers(new Object[]{"ID", "ESTADO", "NOMBRE", "TIPO", "RAZA", "COLOR", "CARACT. ESP.", "TAMAÑO", "ZONA", "DENUNCIANTE"});
        Query query = manager.createQuery("SELECT m FROM Mascota m WHERE " + stEstado + "  AND " + stTipo + " AND " + stRaza + " AND " + stTamaño + " AND " + stColor + " AND " + stZona + "");

        for (Mascota m : (Collection<Mascota>) query.getResultList()) {
            dfmAviso.addRow(new Object[]{m.getIdMascota(), m.getEstado(), m.getNombre(), m.getTipoMascota(), m.getRaza(), m.getColor(), m.getCaracteristicasEspeciales(), m.getTamanio(), m.getZona(), m.getDenunciante().getDni()});
        }
        manager.close();

        emf.close();
        limpiarBuscarMascota();
    }//GEN-LAST:event_BtnBuscarMascotaActionPerformed
//FIN BUSCAR MASCOTA-------------------------------------------------------------------------------------------------

    public void limpiarCrearAviso() {
        jTextNroAvisoCrearAviso.setText("");
        jTextFechaCrearAviso.setText("");
        jTextIDCrearAviso.setText("");
        jTextNombreCrearAviso.setText("");
        jTextCaractCrearAviso.setText("");
        jTextDenuncianteCrearAviso.setText("");
    }

    public void limpiarBuscarMascota() {
        jTextEstadoBuscarMascota.setText("");
        jTextTipoBuscarMascota.setText("");
        jTextRazaBuscarMascota.setText("");
        jTextColorBuscarMascota.setText("");
        jTextZonaBuscarMascota.setText("");
        jTextTamañoBuscarMascota.setText("");
    }

    public void bloquearCrearAviso() {
        jTextNroAvisoCrearAviso.setEnabled(false);
        jTextFechaCrearAviso.setEnabled(false);
        jTextIDCrearAviso.setEnabled(false);
        jTextNombreCrearAviso.setEnabled(false);
        jTextCaractCrearAviso.setEnabled(false);
        jTextDenuncianteCrearAviso.setEnabled(false);
        BtnCargarCrearAviso.setEnabled(false); //activa el boton
        BtnCancelarCrearAviso.setEnabled(true);
    }

    public void habilitarCrearAviso() {
        jTextNroAvisoCrearAviso.setEnabled(true);
        jTextFechaCrearAviso.setEnabled(true);
        jTextIDCrearAviso.setEnabled(true);
        jTextNombreCrearAviso.setEnabled(true);
        jTextCaractCrearAviso.setEnabled(true);
        jTextDenuncianteCrearAviso.setEnabled(true);
        BtnCargarCrearAviso.setEnabled(true); //activa el boton
        BtnCancelarCrearAviso.setEnabled(false);
    }
    //FIN CREAR AVISO---------------------------------------------------------------------------

    //CARGAR DENUNCIANTE------------------------------------------------------------
    private void jTextDireccionActionPerformed(java.awt.event.ActionEvent evt) {
        jTextDireccionCargarDenunciante.transferFocus();
    }

    private void jTextDNICargarDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDNICargarDenuncianteActionPerformed
        jTextDNICargarDenunciante.transferFocus();

    }//GEN-LAST:event_jTextDNICargarDenuncianteActionPerformed

   

    private void jTextNombreCargarDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreCargarDenuncianteActionPerformed
        jTextNombreCargarDenunciante.transferFocus();
    }//GEN-LAST:event_jTextNombreCargarDenuncianteActionPerformed

    private void jTextApellidoCargarDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextApellidoCargarDenuncianteActionPerformed
        jTextApellidoCargarDenunciante.transferFocus();
    }//GEN-LAST:event_jTextApellidoCargarDenuncianteActionPerformed
    /*
    private void jTextDireccionActionPerformed(java.awt.event.ActionEvent evt) {                                               
        jTextDireccionCargarDenunciante.transferFocus();
    }          */

    private void jTextEmailActionPerformed(java.awt.event.ActionEvent evt) {
        jTextEmailCargarDenunciante.transferFocus();
    }


    private void jTextDireccionCargarDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDireccionCargarDenuncianteActionPerformed
        jTextDireccionCargarDenunciante.transferFocus();
    }//GEN-LAST:event_jTextDireccionCargarDenuncianteActionPerformed

    private void jTextTelCargarDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTelCargarDenuncianteActionPerformed
        jTextTelCargarDenunciante.transferFocus();
    }//GEN-LAST:event_jTextTelCargarDenuncianteActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        String nombre, apellido, dire, email;
        int dni = Integer.parseInt(jTextDNICargarDenunciante.getText());
        long telefono = Long.valueOf(jTextTelCargarDenunciante.getText());
        //int id = Integer.parseInt(jTextIDCargarDenunciante.getText());
        nombre = jTextNombreCargarDenunciante.getText();
        apellido = jTextApellidoCargarDenunciante.getText();
        dire = jTextDireccionCargarDenunciante.getText();
        email = jTextEmailCargarDenunciante.getText();
        Denunciante dn = new Denunciante(dni, nombre, apellido, dire, email, telefono);

        try {
            // manager.merge(nuevo5);
            manager.persist(dn);
            manager.getTransaction().commit();

            JOptionPane.showMessageDialog(null, "Denunciante guardado con éxito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ya existe este dato", "Error", x);
            //System.out.println("ya existe este dato");
        }
        manager.close();
        emf.close();
        limpiarDenunciante();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        bloquearDenunciante();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void jTextEmailCargarDenuncianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextEmailCargarDenuncianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextEmailCargarDenuncianteActionPerformed

    private void BotonCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCerrarActionPerformed

    private void jCBTamañoRegistrarMascotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBTamañoRegistrarMascotaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTamañoRegistrarMascotaMouseMoved

    private void jCBTamañoRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTamañoRegistrarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTamañoRegistrarMascotaActionPerformed

    private void jCBTipoRegistrarMascotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBTipoRegistrarMascotaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoRegistrarMascotaMouseMoved

    private void jCBTipoRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoRegistrarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBTipoRegistrarMascotaActionPerformed

    private void jCBColorRegistrarMascotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBColorRegistrarMascotaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBColorRegistrarMascotaMouseMoved

    private void jCBColorRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBColorRegistrarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBColorRegistrarMascotaActionPerformed

    private void BtnCargarRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarRegistrarMascotaActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        String estado, tipoMascota, raza, tamanio, color, zona, nombre, caracteristicasEspeciales;

        int dni = Integer.parseInt(jTextDenuncianteRegistrarMascota.getText());
        int idMascota = Integer.parseInt(jTextIDRegistrarMascota.getText());
        estado = jTextEstadoRegistarMascota.getText();
        tipoMascota = jCBTipoCrearAviso.getSelectedItem().toString();
        raza = jTextRazaRegistrarMascota.getText();
        tamanio = jCBTamañoRegistrarMascota.getSelectedItem().toString();
        color = jCBColorRegistrarMascota.getSelectedItem().toString();
        zona = jTextZonaRegistrarMascota.getText();
        nombre = jTextNombreRegistrarMascota.getText();
        caracteristicasEspeciales = jTextCaractRegistrarMascota.getText();
//
        try {
            Denunciante denunciante = manager.find(Denunciante.class,
                    dni);
            Mascota masc = new Mascota(idMascota, nombre, tipoMascota, raza, color, caracteristicasEspeciales, tamanio, zona, estado);
            masc.setDenunciante(denunciante);
            manager.persist(masc);
            manager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Mascota registrada con éxito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (EntityExistsException e) {
            System.out.println("ya existe este dato");
        }
        manager.close();
        emf.close();
        limpiarRegistarMascota();
     }//GEN-LAST:event_BtnCargarRegistrarMascotaActionPerformed


    private void BtnCancelarRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarRegistrarMascotaActionPerformed
        bloquearRegistrarMascota();
    }//GEN-LAST:event_BtnCancelarRegistrarMascotaActionPerformed

    private void jTextIDRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDRegistrarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDRegistrarMascotaActionPerformed

    private void jTextDenuncianteRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDenuncianteRegistrarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDenuncianteRegistrarMascotaActionPerformed

    private void BotonCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCerrar1ActionPerformed

    private void BotonCerrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrar3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_BotonCerrar3ActionPerformed

    private void BotonCerrar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrar4ActionPerformed
        this.dispose();    }//GEN-LAST:event_BotonCerrar4ActionPerformed

    private void BtnMostrarDenunciantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarDenunciantesActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        DefaultTableModel dfm = new DefaultTableModel();
        this.jTableDenunciantes.setModel(dfm);
        dfm.setColumnIdentifiers(new Object[]{"DNI", "NOMBRE", "APELLIDO", "DIRECCION", "TELEFONO", "EMAIL"});
        Query query = manager.createQuery("SELECT e FROM Denunciante e");

        for (Denunciante e : (Collection<Denunciante>) query.getResultList()) {
            dfm.addRow(new Object[]{e.getDni(), e.getNombre(), e.getApellido(), e.getDireccion(), e.getTelefono(), e.getEmail()});
    }//GEN-LAST:event_BtnMostrarDenunciantesActionPerformed
        manager.close();

        emf.close();

    }


    private void BtnMostrarCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarCrearAvisoActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        DefaultTableModel dfmAviso = new DefaultTableModel();
        this.jTableCrearAviso.setModel(dfmAviso);
        dfmAviso.setColumnIdentifiers(new Object[]{"ID", "ESTADO", "NOMBRE", "TIPO", "RAZA", "COLOR", "CARACT. ESP.", "TAMAÑO", "ZONA", "DENUNCIANTE"});
        Query query = manager.createQuery("SELECT m FROM Mascota m");

        for (Mascota m : (Collection<Mascota>) query.getResultList()) {
            dfmAviso.addRow(new Object[]{m.getIdMascota(), m.getEstado(), m.getNombre(), m.getTipoMascota(), m.getRaza(), m.getColor(), m.getCaracteristicasEspeciales(), m.getTamanio(), m.getZona(), m.getDenunciante().getDni()});
        }
        manager.close();

        emf.close();
    }//GEN-LAST:event_BtnMostrarCrearAvisoActionPerformed

    private void BotonCerrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCerrar2ActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BotonCerrar2ActionPerformed

    private void jTextIDCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextIDCrearAvisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextIDCrearAvisoActionPerformed

    private void jTextFechaCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFechaCrearAvisoActionPerformed
        DateFormat df = DateFormat.getDateInstance();
        Date fechaActual = new Date();
        jTextFechaCrearAviso.setText(df.format(fechaActual));
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd");
        String f = formateador.format(fechaActual);
    }//GEN-LAST:event_jTextFechaCrearAvisoActionPerformed

    private void jTextNroAvisoCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNroAvisoCrearAvisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNroAvisoCrearAvisoActionPerformed

    private void BtnCancelarCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarCrearAvisoActionPerformed
        bloquearCrearAviso();
    }//GEN-LAST:event_BtnCancelarCrearAvisoActionPerformed

    private void BtnCargarCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargarCrearAvisoActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        String estado, tipoMascota, raza, tamanio, color, zona, nombre, caracteristicasEspeciales;
        int nro = Integer.parseInt(jTextNroAvisoCrearAviso.getText());
        String tipoDenuncia;
        DateFormat df = DateFormat.getDateInstance();
        Date fechaActual = new Date();
        jTextFechaCrearAviso.setText(df.format(fechaActual));
        SimpleDateFormat formateador = new SimpleDateFormat("yyyy/MM/dd");
        String f = formateador.format(fechaActual);
        int dni = Integer.parseInt(jTextDenuncianteCrearAviso.getText());
        int idMascota = Integer.parseInt(jTextIDCrearAviso.getText());
        estado = jCBEstadoCrearAviso.getSelectedItem().toString();
        tipoMascota = jCBTipoCrearAviso.getSelectedItem().toString();
        raza = jTextRazaCrearAviso.getText();
        tamanio = jCBTamañoCrearAviso.getSelectedItem().toString();
        color = jCBColorCrearAviso.getSelectedItem().toString();
        zona = jTextZonaCrearAviso.getText();
        nombre = jTextNombreCrearAviso.getText();
        caracteristicasEspeciales = jTextCaractCrearAviso.getText();

        try {
            Denunciante denunciante = manager.find(Denunciante.class, dni);
            Mascota masc = new Mascota(idMascota, nombre, tipoMascota, raza, color, caracteristicasEspeciales, tamanio, zona, estado);
            masc.setDenunciante(denunciante);
            manager.persist(masc);
            Denuncia den = new Denuncia(nro, estado, fechaActual);
            den.setMascota(masc);
            den.setDenunciante(denunciante);
            manager.persist(den);
            manager.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Aviso creado con éxito", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        } catch (EntityExistsException e) {
            JOptionPane.showMessageDialog(null, "Ya existe este dato", "Error", x);
            //System.out.println("ya existe este dato");
        }
        manager.close();
        emf.close();
        limpiarCrearAviso();
    }//GEN-LAST:event_BtnCargarCrearAvisoActionPerformed

    private void jCBColorCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBColorCrearAvisoActionPerformed

    }//GEN-LAST:event_jCBColorCrearAvisoActionPerformed

    private void jCBColorCrearAvisoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBColorCrearAvisoMouseMoved

    }//GEN-LAST:event_jCBColorCrearAvisoMouseMoved

    private void jCBTipoCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoCrearAvisoActionPerformed

    }//GEN-LAST:event_jCBTipoCrearAvisoActionPerformed

    private void jCBTipoCrearAvisoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBTipoCrearAvisoMouseMoved

    }//GEN-LAST:event_jCBTipoCrearAvisoMouseMoved

    private void jCBTamañoCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTamañoCrearAvisoActionPerformed

    }//GEN-LAST:event_jCBTamañoCrearAvisoActionPerformed

    private void jCBTamañoCrearAvisoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBTamañoCrearAvisoMouseMoved

    }//GEN-LAST:event_jCBTamañoCrearAvisoMouseMoved

    private void jCBEstadoCrearAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBEstadoCrearAvisoActionPerformed

    }//GEN-LAST:event_jCBEstadoCrearAvisoActionPerformed

    //CREAR AVISO--------------------------------------------------------------------------------------------------
    private void jCBEstadoCrearAvisoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBEstadoCrearAvisoMouseMoved

    }//GEN-LAST:event_jCBEstadoCrearAvisoMouseMoved

    private void BtnMostrarRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMostrarRegistrarMascotaActionPerformed
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MascotasEnRedPersistence");
        EntityManager manager = emf.createEntityManager();
        manager.getTransaction().begin();
        DefaultTableModel dfmAviso = new DefaultTableModel();
        this.jTableMostrarMascotasRegistradas.setModel(dfmAviso);
        dfmAviso.setColumnIdentifiers(new Object[]{"ID", "ESTADO", "NOMBRE", "TIPO", "RAZA", "COLOR", "CARACT. ESP.", "TAMAÑO", "ZONA", "DENUNCIANTE"});
        Query query = manager.createQuery("SELECT m FROM Mascota m WHERE m.estado = 'Registrado'");

        for (Mascota m : (Collection<Mascota>) query.getResultList()) {
            dfmAviso.addRow(new Object[]{m.getIdMascota(), m.getEstado(), m.getNombre(), m.getTipoMascota(), m.getRaza(), m.getColor(), m.getCaracteristicasEspeciales(), m.getTamanio(), m.getZona(), m.getDenunciante().getDni()});
        }
        manager.close();

        emf.close();
    }//GEN-LAST:event_BtnMostrarRegistrarMascotaActionPerformed


    private void jCBZonaRegistrarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBZonaRegistrarMascotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBZonaRegistrarMascotaActionPerformed

    private void jCBZonaRegistrarMascotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBZonaRegistrarMascotaMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBZonaRegistrarMascotaMouseMoved

    private void jTextDNICargarDenuncianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDNICargarDenuncianteKeyTyped
        char caracter = evt.getKeyChar();
        //Verificar si la tecla pulsada no es un digito
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingresar numero");
        }
    }//GEN-LAST:event_jTextDNICargarDenuncianteKeyTyped

    private void jTextApellidoCargarDenuncianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextApellidoCargarDenuncianteKeyTyped
       char caracter = evt.getKeyChar();

  if ((caracter<'a' || caracter> 'z') && (caracter< 'A' || caracter> 'Z')&& (caracter != '\b' /*corresponde a BACK_SPACE*/) ){  
            evt.consume();
   JOptionPane.showMessageDialog(null, "Solo ingresar letras");
        }
    }//GEN-LAST:event_jTextApellidoCargarDenuncianteKeyTyped

    private void jTextTelCargarDenuncianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextTelCargarDenuncianteKeyTyped
        char caracter = evt.getKeyChar();
        //Verificar si la tecla pulsada no es un digito
        if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo ingresar numero");
        }// TODO add your handling code here:
    }//GEN-LAST:event_jTextTelCargarDenuncianteKeyTyped

    private void jTextNombreCargarDenuncianteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNombreCargarDenuncianteKeyTyped
       char caracter = evt.getKeyChar();
  if ((caracter<'a' || caracter> 'z') && (caracter< 'A' || caracter> 'Z')&& (caracter != '\b' /*corresponde a BACK_SPACE*/) ){  
            evt.consume();
   JOptionPane.showMessageDialog(null, "Solo ingresar letras");
        }
    }//GEN-LAST:event_jTextNombreCargarDenuncianteKeyTyped

    public void limpiarRegistarMascota() {
        jTextDenuncianteRegistrarMascota.setText("");
        jTextNombreRegistrarMascota.setText("");
        jTextCaractRegistrarMascota.setText("");
        jTextIDRegistrarMascota.setText("");
        jTextRazaRegistrarMascota.setText("");
        jTextZonaRegistrarMascota.setText("");
    }

    /* 
         public void bloquearRegistrarMascota() {
        jTextDenuncianteRegistrarMascota.setEnabled(false);
        jTextNombreRegistrarMascota.setEnabled(false);
        jTextCaractRegistrarMascota.setEnabled(false);
        jTextIDRegistrarMascota.setEnabled(false);
        BtnCargarRegistrarMascota.setEnabled(false); //activa el boton
        BtnCancelarRegistrarMascota.setEnabled(true);
    }

    //public void habilitar() {
    public void habilitarRegistrarMascota() {

        jTextDenuncianteRegistrarMascota.setEnabled(true);
        jTextNombreRegistrarMascota.setEnabled(true);
        jTextCaractRegistrarMascota.setEnabled(true);
        jTextIDRegistrarMascota.setEnabled(true);
        BtnCargarRegistrarMascota.setEnabled(true); //activa el boton
        BtnCancelarRegistrarMascota.setEnabled(false);
    }
     */
    public void limpiarDenunciante() {
        jTextDNICargarDenunciante.setText("");
        jTextNombreCargarDenunciante.setText("");
        jTextApellidoCargarDenunciante.setText("");
        jTextDireccionCargarDenunciante.setText("");
        jTextTelCargarDenunciante.setText("");
        jTextEmailCargarDenunciante.setText("");
        //jTextIDCargarDenunciante.setText("");
    }

    //public void bloquear() {
    public void bloquearDenunciante() {

        jTextDNICargarDenunciante.setEnabled(false);
        jTextNombreCargarDenunciante.setEnabled(false);
        jTextApellidoCargarDenunciante.setEnabled(false);
        jTextDireccionCargarDenunciante.setEnabled(false);
        jTextTelCargarDenunciante.setEnabled(false);
        jTextEmailCargarDenunciante.setEnabled(false);
        BtnGuardar.setEnabled(false); //activa el boton
        BtnCancelar.setEnabled(true);
    }

    //public void habilitar() {
    public void habilitarDenunciante() {

        jTextDNICargarDenunciante.setEnabled(true);
        jTextNombreCargarDenunciante.setEnabled(true);
        jTextApellidoCargarDenunciante.setEnabled(true);
        jTextDireccionCargarDenunciante.setEnabled(true);
        jTextTelCargarDenunciante.setEnabled(true);
        BtnGuardar.setEnabled(true); //activa el boton
        BtnCancelar.setEnabled(false);

    }

    public void limpiarRegistrarMascota() {
        jTextNombreRegistrarMascota.setText("");
        jTextCaractRegistrarMascota.setText("");
        jTextDenuncianteRegistrarMascota.setText("");
    }

    public void bloquearRegistrarMascota() {
        jTextNombreRegistrarMascota.setEnabled(false);
        jTextCaractRegistrarMascota.setEnabled(false);
        jTextDenuncianteRegistrarMascota.setEnabled(false);
        BtnCargarRegistrarMascota.setEnabled(false); //activa el boton
        BtnCancelarRegistrarMascota.setEnabled(true);
    }

    public void habilitarRegistrarMascota() {
        jTextNombreRegistrarMascota.setEnabled(true);
        jTextCaractRegistrarMascota.setEnabled(true);
        jTextDenuncianteRegistrarMascota.setEnabled(true);
        BtnCargarRegistrarMascota.setEnabled(true); //activa el boton
        BtnCancelarRegistrarMascota.setEnabled(false);
    }

    /*public Home(){
        initComponents();
        limpiar();
        bloquear();
    }
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel BotonBuscarMascota;
    public javax.swing.JLabel BotonCargarDenunciante;
    private javax.swing.JButton BotonCerrar;
    private javax.swing.JButton BotonCerrar1;
    private javax.swing.JButton BotonCerrar2;
    private javax.swing.JButton BotonCerrar3;
    private javax.swing.JButton BotonCerrar4;
    public javax.swing.JLabel BotonCrearAviso;
    public javax.swing.JLabel BotonDenunciaMaltrato;
    public javax.swing.JLabel BotonRegistrarMascota;
    private javax.swing.JButton BtnBuscarMascota;
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnCancelarCrearAviso;
    private javax.swing.JButton BtnCancelarRegistrarMascota;
    private javax.swing.JButton BtnCargarCrearAviso;
    private javax.swing.JButton BtnCargarRegistrarMascota;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnMostrarCrearAviso;
    private javax.swing.JButton BtnMostrarDenunciantes;
    private javax.swing.JButton BtnMostrarRegistrarMascota;
    private javax.swing.JPanel EspacioMenu;
    private javax.swing.JPanel PanelBuscarMascota;
    private javax.swing.JPanel PanelCargarDenunciante;
    private javax.swing.JPanel PanelCrearAviso;
    private javax.swing.JPanel PanelDenunciaMaltrato;
    private javax.swing.JPanel PanelRegistrarMascota;
    private javax.swing.JLabel TituloBuscarMascota;
    private javax.swing.JLabel TituloBuscarMascota1;
    private javax.swing.JLabel TituloCargarDenunciante;
    private javax.swing.JLabel TituloCrearAviso;
    private javax.swing.JLabel TituloRegistrarMascota;
    private javax.swing.JPanel VentanaDeFondo;
    private javax.swing.JComboBox<String> jCBColorCrearAviso;
    private javax.swing.JComboBox<String> jCBColorRegistrarMascota;
    private javax.swing.JComboBox<String> jCBEstadoCrearAviso;
    private javax.swing.JComboBox<String> jCBTamañoCrearAviso;
    private javax.swing.JComboBox<String> jCBTamañoRegistrarMascota;
    private javax.swing.JComboBox<String> jCBTipoCrearAviso;
    private javax.swing.JComboBox<String> jCBTipoRegistrarMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTable jTableBuscarMascota;
    private javax.swing.JTable jTableCrearAviso;
    private javax.swing.JTable jTableDenunciantes;
    private javax.swing.JTable jTableMostrarMascotasRegistradas;
    private javax.swing.JTextField jTextApellidoCargarDenunciante;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextCaractCrearAviso;
    private javax.swing.JTextField jTextCaractRegistrarMascota;
    private javax.swing.JTextField jTextColorBuscarMascota;
    private javax.swing.JTextField jTextDNICargarDenunciante;
    private javax.swing.JTextField jTextDenuncianteCrearAviso;
    private javax.swing.JTextField jTextDenuncianteRegistrarMascota;
    private javax.swing.JTextField jTextDireccionCargarDenunciante;
    private javax.swing.JTextField jTextEmailCargarDenunciante;
    private javax.swing.JTextField jTextEstadoBuscarMascota;
    private javax.swing.JTextField jTextEstadoRegistarMascota;
    private javax.swing.JTextField jTextFechaCrearAviso;
    private javax.swing.JTextField jTextIDCrearAviso;
    private javax.swing.JTextField jTextIDRegistrarMascota;
    private javax.swing.JTextField jTextNombreCargarDenunciante;
    private javax.swing.JTextField jTextNombreCrearAviso;
    private javax.swing.JTextField jTextNombreRegistrarMascota;
    private javax.swing.JTextField jTextNroAvisoCrearAviso;
    private javax.swing.JTextField jTextRazaBuscarMascota;
    private javax.swing.JTextField jTextRazaCrearAviso;
    private javax.swing.JTextField jTextRazaRegistrarMascota;
    private javax.swing.JTextField jTextTamañoBuscarMascota;
    private javax.swing.JTextField jTextTelCargarDenunciante;
    private javax.swing.JTextField jTextTipoBuscarMascota;
    private javax.swing.JTextField jTextZonaBuscarMascota;
    private javax.swing.JTextField jTextZonaCrearAviso;
    private javax.swing.JTextField jTextZonaRegistrarMascota;
    // End of variables declaration//GEN-END:variables

    private void setLblColor(JLabel lbl) {
        lbl.setBackground(new Color(35, 0, 66));
    }

    private void resetLblColor(JLabel lbl) {
        lbl.setBackground(new Color(88, 30, 138));
    }
}
