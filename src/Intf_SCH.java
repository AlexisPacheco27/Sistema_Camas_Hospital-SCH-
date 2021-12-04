
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexis Pacheco
 */
public class Intf_SCH extends javax.swing.JFrame implements Runnable{

    public Intf_SCH() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("SISTEMA CAMAS HOSPITAL");
        h1 = new Thread(this);
        h1.start();
        indicadores();
        StartCamas();
    }
    
    Thread h1;
    public String hora, minutos, segundos, ampm;
    public String [] status = {"Recuperacion","Delicado","Grave","Muy grave"};
    public registros cama1 = new registros();
    public registros cama2 = new registros();
    public registros cama3 = new registros();
    public registros cama4 = new registros();
    public registros cama5 = new registros();
    public registros cama6 = new registros();
    public registros cama7 = new registros();
    public registros cama8 = new registros();
    public registros cama9 = new registros();
    public registros cama10 = new registros();
    public registros cama11 = new registros();
    public registros cama12 = new registros();
    public registros cama13 = new registros();
    public registros cama14 = new registros();
    public registros cama15 = new registros();
    public registros cama16 = new registros();
    public registros cama17 = new registros();
    public registros cama18 = new registros();
    public registros cama19 = new registros();
    public registros cama20 = new registros();
    public registros cama21 = new registros();
    public registros cama22 = new registros();
    public registros cama23 = new registros();
    public registros cama24 = new registros();
    public registros cama25 = new registros();
    public registros cama26 = new registros();
    public registros cama27 = new registros();
    public registros cama28 = new registros();
    public registros cama29 = new registros();
    public registros cama30 = new registros();
    public registros cama31 = new registros();
    public registros cama32 = new registros();
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_StatusC1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_StatusC2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_StatusC3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_StatusC4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_StatusC5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_StatusC7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_StatusC8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_StatusC9 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_StatusC10 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_StatusC11 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_StatusC12 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_StatusC13 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_StatusC14 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_StatusC15 = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        txt_StatusC16 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        txt_StatusC17 = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_StatusC18 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        txt_StatusC19 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_StatusC20 = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        txt_StatusC21 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        txt_StatusC22 = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        txt_StatusC23 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        txt_StatusC24 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        txt_StatusC25 = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        txt_StatusC26 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        txt_StatusC27 = new javax.swing.JTextField();
        jLabel45 = new javax.swing.JLabel();
        txt_StatusC28 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        txt_StatusC29 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        txt_StatusC30 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        txt_StatusC31 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        txt_StatusC32 = new javax.swing.JTextField();
        txt_StatusC6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        txt_disponible = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_recuperacion = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txt_delicado = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txt_grave = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txt_muygrave = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        cbx_numC = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btn_detalles = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jlb_fech_hr = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jlb_nomPaciente = new javax.swing.JLabel();
        jlb_nomMedico = new javax.swing.JLabel();
        jlb_motvIngre = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jlb_estado = new javax.swing.JLabel();
        jlb_sexo = new javax.swing.JLabel();
        jbl_edad = new javax.swing.JLabel();
        jbl_reloj = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_setAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VISTA GENERAL");

        jLabel2.setText("Cama 1");

        jLabel3.setText("Cama 2");

        jLabel4.setText("Cama 3");

        jLabel5.setText("Cama 4");

        jLabel6.setText("Cama 5");

        jLabel7.setText("Cama 6");

        jLabel8.setText("Cama 7");

        jLabel9.setText("Cama 8");

        jLabel10.setText("Cama 9");

        jLabel11.setText("Cama 10");

        jLabel12.setText("Cama 11");

        jLabel13.setText("Cama 12");

        jLabel14.setText("Cama 13");

        jLabel15.setText("Cama 14");

        jLabel16.setText("Cama 15");

        jLabel33.setText("Cama 16");

        jLabel34.setText("Cama 17");

        jLabel35.setText("Cama 18");

        jLabel36.setText("Cama 19");

        jLabel37.setText("Cama 20");

        jLabel38.setText("Cama 21");

        jLabel39.setText("Cama 22");

        jLabel40.setText("Cama 23");

        jLabel41.setText("Cama 24");

        jLabel42.setText("Cama 25");

        jLabel43.setText("Cama 26");

        jLabel44.setText("Cama 27");

        jLabel45.setText("Cama 28");

        jLabel46.setText("Cama 29");

        jLabel47.setText("Cama 30");

        jLabel48.setText("Cama 31");

        jLabel49.setText("Cama 32");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC16, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC17, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC18, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC19, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC20, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC21, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC23, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC24, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC25, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC26, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel48)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC31, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC32, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_StatusC27, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel45)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC28, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel46)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC29, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel47)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC30, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txt_StatusC6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_StatusC7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_StatusC1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_StatusC2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(91, 91, 91))
                                    .addComponent(txt_StatusC9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC10, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC4, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txt_StatusC13, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC14, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_StatusC15, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_StatusC1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_StatusC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_StatusC3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_StatusC4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_StatusC5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txt_StatusC7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_StatusC8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_StatusC9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txt_StatusC10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_StatusC6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txt_StatusC11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txt_StatusC12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txt_StatusC13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txt_StatusC14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txt_StatusC15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(txt_StatusC16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txt_StatusC17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35)
                    .addComponent(txt_StatusC18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36)
                    .addComponent(txt_StatusC19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(txt_StatusC20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(txt_StatusC21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39)
                    .addComponent(txt_StatusC22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40)
                    .addComponent(txt_StatusC23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41)
                    .addComponent(txt_StatusC24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42)
                    .addComponent(txt_StatusC25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(txt_StatusC26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44)
                    .addComponent(txt_StatusC27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel45)
                    .addComponent(txt_StatusC28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel46)
                    .addComponent(txt_StatusC29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47)
                    .addComponent(txt_StatusC30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(txt_StatusC31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(txt_StatusC32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel50.setText("INDICADORES");

        jLabel17.setText("Disponible");

        jLabel18.setText("Recuperación");

        jLabel19.setText("Delicado");

        jLabel20.setText("Grave");

        jLabel21.setText("Muy grave");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel50)
                    .addComponent(jLabel17)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(txt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txt_muygrave, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addComponent(txt_grave, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_delicado, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt_recuperacion, javax.swing.GroupLayout.Alignment.LEADING)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50)
                .addGap(11, 11, 11)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_disponible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_recuperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_delicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_grave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_muygrave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 153, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel51.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("MÁS DETALLES");

        jLabel52.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("Selecciona: el número de cama:");

        cbx_numC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Cama 1", "Cama 2", "Cama 3", "Cama 4", "Cama 5", "Cama 6", "Cama 7", "Cama 8", "Cama 9", "Cama 10", "Cama 11", "Cama 12", "Cama 13", "Cama 14", "Cama 15", "Cama 16", "Cama 17", "Cama 18", "Cama 19", "Cama 20", "Cama 21", "Cama 22", "Cama 23", "Cama 24", "Cama 25", "Cama 26", "Cama 27", "Cama 28", "Cama 29", "Cama 30", "Cama 31", "Cama 32" }));

        btn_detalles.setText("Detalles");
        btn_detalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_detallesActionPerformed(evt);
            }
        });

        jLabel53.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setText("Fecha y hora ingresado");

        jlb_fech_hr.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlb_fech_hr.setForeground(new java.awt.Color(255, 255, 255));

        jLabel55.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Nombre del paciente:");

        jLabel56.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Atendido por el médico:");

        jLabel57.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Motivo de ingreso:");

        jlb_nomPaciente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlb_nomPaciente.setForeground(new java.awt.Color(255, 255, 255));

        jlb_nomMedico.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlb_nomMedico.setForeground(new java.awt.Color(255, 255, 255));

        jlb_motvIngre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlb_motvIngre.setForeground(new java.awt.Color(255, 255, 255));

        jLabel61.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Sexo:");

        jLabel62.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Edad:");

        jLabel63.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Estado:");

        jlb_estado.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlb_estado.setForeground(new java.awt.Color(255, 255, 255));

        jlb_sexo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jlb_sexo.setForeground(new java.awt.Color(255, 255, 255));

        jbl_edad.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbl_edad.setForeground(new java.awt.Color(255, 255, 255));

        jbl_reloj.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jbl_reloj.setForeground(new java.awt.Color(255, 255, 255));

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_setAlta.setText("Dar Alta");
        btn_setAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_setAltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbx_numC, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(btn_detalles))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jLabel51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel55)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jlb_nomPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel61))
                                    .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbl_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlb_sexo, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlb_nomMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addGap(18, 18, 18)
                                .addComponent(jlb_motvIngre, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_setAlta)
                        .addGap(60, 60, 60)
                        .addComponent(btn_actualizar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlb_fech_hr, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(73, 73, 73))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jSeparator1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel51)
                    .addComponent(jbl_reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel52)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbx_numC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_detalles)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(jLabel63)
                    .addComponent(jlb_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlb_fech_hr, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61)
                    .addComponent(jlb_sexo, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel55)
                        .addComponent(jlb_nomPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbl_edad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel56)
                    .addComponent(jlb_nomMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlb_motvIngre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_setAlta))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_detallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_detallesActionPerformed
        String selectCama = getNumCama();
        if(selectCama.equals("-")== true){
            JOptionPane.showMessageDialog(null, "ERROR: NO SELECCIONASTE UN NUMERO DE CAMA");
        }else{
            mostrarDatos(selectCama);
        }
    }//GEN-LAST:event_btn_detallesActionPerformed

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        String selectCama = getNumCama();
        String status;
        if(selectCama.equals("-")== true){
            JOptionPane.showMessageDialog(null, "ERROR: NO SELECCIONASTE UN NUMERO DE CAMA");
        }else{
            status = getStatusCama(selectCama);
            if(status.equals("Disponible")== true){
                String nom_paciente = JOptionPane.showInputDialog(null,"Ingresa nombre del paciente:");                
                String [] sexos = {"Hombre","Mujer"};
                Object optSx = JOptionPane.showInputDialog(null, "Sexo del paciente:","Sexo",JOptionPane.QUESTION_MESSAGE,null,sexos,sexos[0]);
                String edad = JOptionPane.showInputDialog(null,"Edad del paciente");
                String nom_medico = JOptionPane.showInputDialog(null,"Ingresa nombre del medico:");
                String motv_ingre = JOptionPane.showInputDialog(null,"Motivo de ingreso:");
                String sexo = optSx.toString();
                String fecha = setFecha();   
                String [] estados = {"Recuperacion","Delicado","Grave","Muy grave"};
                Object opt = JOptionPane.showInputDialog(null,"Estado del paciente:","Option",JOptionPane.QUESTION_MESSAGE,null,estados,estados[0]);
                String estado = opt.toString();
                JOptionPane.showMessageDialog(null, "DATOS DE PACIENTE INGRESADO\n" + "Nombre del paciente:" + nom_paciente +"\n"+ "Sexo:"+sexo +"\n"+ "Edad:"+ edad +"\n"+ "Motivo de ingreso:"+ motv_ingre +"\n"+ "Medico que lo atendio:"+ nom_medico +"\n"+ "Estado:"+ estado +"\n"+ "Fecha de ingreso:"+ fecha);
                setDatos(selectCama, nom_paciente, sexo, edad, nom_medico, motv_ingre, estado, fecha);
            }else{
                String [] data = {"Nombre del paciente", "Edad", "Nombre del medico", "Estado"};
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona la opcion a modificar:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,data,data[0]);
                String selectOPT = opcion.toString();
                update(selectCama, selectOPT);
            }
        }
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_setAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_setAltaActionPerformed
        String num_cama = getNumCama();
        setDatos(num_cama, " ", " ", " ", " ", " ", "Disponible", " ");
    }//GEN-LAST:event_btn_setAltaActionPerformed

    public void run(){
        Thread ct = Thread.currentThread();
        while(ct == h1){
            calReloj();
            jbl_reloj.setText( hora + ":" + minutos + ":" + segundos + " " + ampm);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
    
    public void indicadores(){
        txt_disponible.setEditable(false); txt_disponible.setBackground(new java.awt.Color(172, 255, 51));        
        txt_recuperacion.setEditable(false); txt_recuperacion.setBackground(new java.awt.Color(51, 100, 255));        
        txt_delicado.setEditable(false); txt_delicado.setBackground(new java.awt.Color(255, 236, 51));        
        txt_grave.setEditable(false); txt_grave.setBackground(new java.awt.Color(255, 159, 51));        
        txt_muygrave.setEditable(false); txt_muygrave.setBackground(new java.awt.Color(172, 51, 255));                
    }
    
    public void StartCamas(){
        txt_StatusC1.setEditable(false); txt_StatusC1.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC1.setText("Disponible");
        txt_StatusC2.setEditable(false); txt_StatusC2.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC2.setText("Disponible");
        txt_StatusC3.setEditable(false); txt_StatusC3.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC3.setText("Disponible");
        txt_StatusC4.setEditable(false); txt_StatusC4.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC4.setText("Disponible");
        txt_StatusC5.setEditable(false); txt_StatusC5.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC5.setText("Disponible");
        txt_StatusC6.setEditable(false); txt_StatusC6.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC6.setText("Disponible");
        txt_StatusC7.setEditable(false); txt_StatusC7.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC7.setText("Disponible");
        txt_StatusC8.setEditable(false); txt_StatusC8.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC8.setText("Disponible");
        txt_StatusC9.setEditable(false); txt_StatusC9.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC9.setText("Disponible");
        txt_StatusC10.setEditable(false); txt_StatusC10.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC10.setText("Disponible");
        txt_StatusC11.setEditable(false); txt_StatusC11.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC11.setText("Disponible");
        txt_StatusC12.setEditable(false); txt_StatusC12.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC12.setText("Disponible");
        txt_StatusC13.setEditable(false); txt_StatusC13.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC13.setText("Disponible");
        txt_StatusC14.setEditable(false); txt_StatusC14.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC14.setText("Disponible");
        txt_StatusC15.setEditable(false); txt_StatusC15.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC15.setText("Disponible");
        txt_StatusC16.setEditable(false); txt_StatusC16.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC16.setText("Disponible");
        txt_StatusC17.setEditable(false); txt_StatusC17.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC17.setText("Disponible");
        txt_StatusC18.setEditable(false); txt_StatusC18.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC18.setText("Disponible");
        txt_StatusC19.setEditable(false); txt_StatusC19.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC19.setText("Disponible");
        txt_StatusC20.setEditable(false); txt_StatusC20.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC20.setText("Disponible");
        txt_StatusC21.setEditable(false); txt_StatusC21.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC21.setText("Disponible");
        txt_StatusC22.setEditable(false); txt_StatusC22.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC22.setText("Disponible");
        txt_StatusC23.setEditable(false); txt_StatusC23.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC23.setText("Disponible");
        txt_StatusC24.setEditable(false); txt_StatusC24.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC24.setText("Disponible");
        txt_StatusC25.setEditable(false); txt_StatusC25.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC25.setText("Disponible");
        txt_StatusC26.setEditable(false); txt_StatusC26.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC26.setText("Disponible");
        txt_StatusC27.setEditable(false); txt_StatusC27.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC27.setText("Disponible");
        txt_StatusC28.setEditable(false); txt_StatusC28.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC28.setText("Disponible");
        txt_StatusC29.setEditable(false); txt_StatusC29.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC29.setText("Disponible");
        txt_StatusC30.setEditable(false); txt_StatusC30.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC30.setText("Disponible");
        txt_StatusC31.setEditable(false); txt_StatusC31.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC31.setText("Disponible");
        txt_StatusC32.setEditable(false); txt_StatusC32.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC32.setText("Disponible");
    }

    public String setFecha(){
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        String fech = dtf4.format(LocalDateTime.now());
        return fech;
    }
    
    public String getNumCama(){
        String numCama = (String) cbx_numC.getSelectedItem();
        return numCama;
    }
    
    public String getStatusCama(String num_cama){
        String status = ""; 
        if(num_cama.equals("Cama 1")){
            status = txt_StatusC1.getText();
        }else if(num_cama.equals("Cama 2")){
            status = txt_StatusC2.getText(); 
        }else if(num_cama.equals("Cama 3")){
            status = txt_StatusC3.getText(); 
        }else if(num_cama.equals("Cama 4")){
            status = txt_StatusC4.getText(); 
        }else if(num_cama.equals("Cama 5")){
            status = txt_StatusC5.getText(); 
        }else if(num_cama.equals("Cama 6")){
            status = txt_StatusC6.getText(); 
        }else if(num_cama.equals("Cama 7")){
            status = txt_StatusC7.getText(); 
        }else if(num_cama.equals("Cama 8")){
            status = txt_StatusC8.getText(); 
        }else if(num_cama.equals("Cama 9")){
            status = txt_StatusC9.getText(); 
        }else if(num_cama.equals("Cama 10")){
            status = txt_StatusC10.getText(); 
        }else if(num_cama.equals("Cama 11")){
            status = txt_StatusC11.getText(); 
        }else if(num_cama.equals("Cama 12")){
            status = txt_StatusC12.getText(); 
        }else if(num_cama.equals("Cama 13")){
            status = txt_StatusC13.getText();
        }else if(num_cama.equals("Cama 14")){
            status = txt_StatusC14.getText();
        }else if(num_cama.equals("Cama 15")){
            status = txt_StatusC15.getText();
        }else if(num_cama.equals("Cama 16")){
            status = txt_StatusC16.getText();
        }else if(num_cama.equals("Cama 17")){
            status = txt_StatusC17.getText();
        }else if(num_cama.equals("Cama 18")){
            status = txt_StatusC18.getText();
        }else if(num_cama.equals("Cama 19")){
            status = txt_StatusC19.getText();
        }else if(num_cama.equals("Cama 20")){
            status = txt_StatusC20.getText();
        }else if(num_cama.equals("Cama 21")){
            status = txt_StatusC21.getText();
        }else if(num_cama.equals("Cama 22")){
            status = txt_StatusC22.getText();
        }else if(num_cama.equals("Cama 23")){
            status = txt_StatusC23.getText();
        }else if(num_cama.equals("Cama 24")){
            status = txt_StatusC24.getText();
        }else if(num_cama.equals("Cama 25")){
            status = txt_StatusC25.getText();
        }else if(num_cama.equals("Cama 26")){
            status = txt_StatusC26.getText();
        }else if(num_cama.equals("Cama 27")){
            status = txt_StatusC27.getText();
        }else if(num_cama.equals("Cama 28")){
            status = txt_StatusC28.getText();
        }else if(num_cama.equals("Cama 29")){
            status = txt_StatusC29.getText();
        }else if(num_cama.equals("Cama 30")){
            status = txt_StatusC30.getText();
        }else if(num_cama.equals("Cama 31")){
            status = txt_StatusC31.getText();
        }else if(num_cama.equals("Cama 32")){
            status = txt_StatusC32.getText();
        }
        return status; 
    }
    
    public void updateStatus(String num_cama, String status){
        if(num_cama.equals("Cama 1")){
            if(status.equals("Recuperacion")){
                txt_StatusC1.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC1.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC1.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC1.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC1.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC1.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC1.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC1.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC1.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC1.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 2")){
            if(status.equals("Recuperacion")){
                txt_StatusC2.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC2.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC2.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC2.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC2.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC2.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC2.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC2.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC2.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC2.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 3")){
            if(status.equals("Recuperacion")){
                txt_StatusC3.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC3.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC3.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC3.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC3.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC3.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC3.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC3.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC3.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC3.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 4")){
            if(status.equals("Recuperacion")){
                txt_StatusC4.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC4.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC4.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC4.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC4.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC4.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC4.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC4.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC4.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC4.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 5")){
            if(status.equals("Recuperacion")){
                txt_StatusC5.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC5.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC5.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC5.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC5.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC5.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC5.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC5.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC5.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC5.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 6")){
            if(status.equals("Recuperacion")){
                txt_StatusC6.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC6.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC6.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC6.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC6.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC6.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC6.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC6.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC6.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC6.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 7")){
            if(status.equals("Recuperacion")){
                txt_StatusC7.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC7.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC7.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC7.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC7.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC7.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC7.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC7.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC7.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC7.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 8")){
            if(status.equals("Recuperacion")){
                txt_StatusC8.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC8.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC8.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC8.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC8.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC8.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC8.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC8.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC8.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC8.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 9")){
            if(status.equals("Recuperacion")){
                txt_StatusC9.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC9.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC9.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC9.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC9.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC9.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC9.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC9.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC9.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC9.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 10")){
            if(status.equals("Recuperacion")){
                txt_StatusC10.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC10.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC10.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC10.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC10.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC10.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC10.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC10.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC10.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC10.setText("Disponible");
            } 
        }else if(num_cama.equals("Cama 11")){
            if(status.equals("Recuperacion")){
                txt_StatusC11.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC11.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC11.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC11.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC11.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC11.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC11.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC11.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC11.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC11.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 12")){
            if(status.equals("Recuperacion")){
                txt_StatusC12.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC12.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC12.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC12.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC12.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC12.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC12.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC12.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC12.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC12.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 13")){
            if(status.equals("Recuperacion")){
                txt_StatusC13.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC13.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC13.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC13.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC13.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC13.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC13.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC13.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC13.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC13.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 14")){
            if(status.equals("Recuperacion")){
                txt_StatusC14.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC14.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC14.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC14.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC14.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC14.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC14.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC14.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC14.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC14.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 15")){
            if(status.equals("Recuperacion")){
                txt_StatusC15.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC15.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC15.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC15.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC15.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC15.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC15.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC15.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC15.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC15.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 16")){
            if(status.equals("Recuperacion")){
                txt_StatusC16.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC16.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC16.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC16.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC16.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC16.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC16.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC16.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC16.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC16.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 17")){
            if(status.equals("Recuperacion")){
                txt_StatusC17.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC17.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC17.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC17.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC17.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC17.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC17.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC17.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC17.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC17.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 18")){
            if(status.equals("Recuperacion")){
                txt_StatusC18.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC18.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC18.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC18.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC18.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC18.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC18.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC18.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC18.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC18.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 19")){
            if(status.equals("Recuperacion")){
                txt_StatusC19.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC19.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC19.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC19.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC19.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC19.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC19.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC19.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC19.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC19.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 20")){
            if(status.equals("Recuperacion")){
                txt_StatusC20.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC20.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC20.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC20.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC20.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC20.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC20.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC20.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC20.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC20.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 21")){
            if(status.equals("Recuperacion")){
                txt_StatusC21.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC21.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC21.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC21.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC21.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC21.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC21.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC21.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC21.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC21.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 22")){
            if(status.equals("Recuperacion")){
                txt_StatusC22.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC22.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC22.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC22.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC22.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC22.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC22.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC22.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC22.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC22.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 23")){
            if(status.equals("Recuperacion")){
                txt_StatusC23.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC23.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC23.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC23.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC23.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC23.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC23.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC23.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC23.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC23.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 24")){
            if(status.equals("Recuperacion")){
                txt_StatusC24.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC24.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC24.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC24.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC24.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC24.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC24.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC24.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC24.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC24.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 25")){
            if(status.equals("Recuperacion")){
                txt_StatusC25.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC25.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC25.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC25.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC25.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC25.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC25.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC25.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC25.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC25.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 26")){
            if(status.equals("Recuperacion")){
                txt_StatusC26.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC26.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC26.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC26.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC26.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC26.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC26.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC26.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC26.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC26.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 27")){
            if(status.equals("Recuperacion")){
                txt_StatusC27.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC27.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC27.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC27.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC27.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC27.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC27.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC27.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC27.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC27.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 28")){
            if(status.equals("Recuperacion")){
                txt_StatusC28.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC28.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC28.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC28.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC28.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC28.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC28.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC28.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC28.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC28.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 29")){
            if(status.equals("Recuperacion")){
                txt_StatusC29.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC29.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC29.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC29.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC29.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC29.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC29.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC29.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC29.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC29.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 30")){
            if(status.equals("Recuperacion")){
                txt_StatusC30.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC30.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC30.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC30.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC30.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC30.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC30.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC30.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC30.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC30.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 31")){
            if(status.equals("Recuperacion")){
                txt_StatusC31.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC31.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC31.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC31.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC31.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC31.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC31.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC31.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC31.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC31.setText("Disponible");
            }
        }else if(num_cama.equals("Cama 32")){
            if(status.equals("Recuperacion")){
                txt_StatusC32.setBackground(new java.awt.Color(51, 100, 255)); txt_StatusC32.setText("Recuperacion");
            }else if(status.equals("Delicado")){
                txt_StatusC32.setBackground(new java.awt.Color(255, 236, 51)); txt_StatusC32.setText("Delicado");
            }else if(status.equals("Grave")){
                txt_StatusC32.setBackground(new java.awt.Color(255, 159, 51)); txt_StatusC32.setText("Grave");
            }else if(status.equals("Muy grave")){
                txt_StatusC32.setBackground(new java.awt.Color(172, 51, 255)); txt_StatusC32.setText("Muy grave");
            }else if(status.equals("Disponible")){
                txt_StatusC32.setBackground(new java.awt.Color(172, 255, 51)); txt_StatusC32.setText("Disponible");
            }
        }
    }
    
    public void setDatos(String num_cama, String nom_paciente, String sexo, String edad, String nom_medico, String motv_ingre, String estado, String fecha){
        if(num_cama.equals("Cama 1")){               
            cama1.setNomPaciente(nom_paciente);
            cama1.setSexo(sexo);
            cama1.setEdad(edad);
            cama1.setNomMedico(nom_medico);
            cama1.setMotvIngre(motv_ingre);
            cama1.setEstado(estado);
            cama1.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 2")){
            cama2.setNomPaciente(nom_paciente);
            cama2.setSexo(sexo);
            cama2.setEdad(edad);
            cama2.setNomMedico(nom_medico);
            cama2.setMotvIngre(motv_ingre);
            cama2.setEstado(estado);
            cama2.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 3")){
            cama3.setNomPaciente(nom_paciente);
            cama3.setSexo(sexo);
            cama3.setEdad(edad);
            cama3.setNomMedico(nom_medico);
            cama3.setMotvIngre(motv_ingre);
            cama3.setEstado(estado);
            cama3.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 4")){
            cama4.setNomPaciente(nom_paciente);
            cama4.setSexo(sexo);
            cama4.setEdad(edad);
            cama4.setNomMedico(nom_medico);
            cama4.setMotvIngre(motv_ingre);
            cama4.setEstado(estado);
            cama4.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 5")){
            cama5.setNomPaciente(nom_paciente);
            cama5.setSexo(sexo);
            cama5.setEdad(edad);
            cama5.setNomMedico(nom_medico);
            cama5.setMotvIngre(motv_ingre);
            cama5.setEstado(estado);
            cama5.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 6")){
            cama6.setNomPaciente(nom_paciente);
            cama6.setSexo(sexo);
            cama6.setEdad(edad);
            cama6.setNomMedico(nom_medico);
            cama6.setMotvIngre(motv_ingre);
            cama6.setEstado(estado);
            cama6.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 7")){
            cama7.setNomPaciente(nom_paciente);
            cama7.setSexo(sexo);
            cama7.setEdad(edad);
            cama7.setNomMedico(nom_medico);
            cama7.setMotvIngre(motv_ingre);
            cama7.setEstado(estado);
            cama7.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 8")){
            cama8.setNomPaciente(nom_paciente);
            cama8.setSexo(sexo);
            cama8.setEdad(edad);
            cama8.setNomMedico(nom_medico);
            cama8.setMotvIngre(motv_ingre);
            cama8.setEstado(estado);
            cama8.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 9")){
            cama9.setNomPaciente(nom_paciente);
            cama9.setSexo(sexo);
            cama9.setEdad(edad);
            cama9.setNomMedico(nom_medico);
            cama9.setMotvIngre(motv_ingre);
            cama9.setEstado(estado);
            cama9.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 10")){
            cama10.setNomPaciente(nom_paciente);
            cama10.setSexo(sexo);
            cama10.setEdad(edad);
            cama10.setNomMedico(nom_medico);
            cama10.setMotvIngre(motv_ingre);
            cama10.setEstado(estado);
            cama10.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 11")){
            cama11.setNomPaciente(nom_paciente);
            cama11.setSexo(sexo);
            cama11.setEdad(edad);
            cama11.setNomMedico(nom_medico);
            cama11.setMotvIngre(motv_ingre);
            cama11.setEstado(estado);
            cama11.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 12")){
            cama12.setNomPaciente(nom_paciente);
            cama12.setSexo(sexo);
            cama12.setEdad(edad);
            cama12.setNomMedico(nom_medico);
            cama12.setMotvIngre(motv_ingre);
            cama12.setEstado(estado);
            cama12.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 13")){
            cama13.setNomPaciente(nom_paciente);
            cama13.setSexo(sexo);
            cama13.setEdad(edad);
            cama13.setNomMedico(nom_medico);
            cama13.setMotvIngre(motv_ingre);
            cama13.setEstado(estado);
            cama13.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 14")){
            cama14.setNomPaciente(nom_paciente);
            cama14.setSexo(sexo);
            cama14.setEdad(edad);
            cama14.setNomMedico(nom_medico);
            cama14.setMotvIngre(motv_ingre);
            cama14.setEstado(estado);
            cama14.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 15")){
            cama15.setNomPaciente(nom_paciente);
            cama15.setSexo(sexo);
            cama15.setEdad(edad);
            cama15.setNomMedico(nom_medico);
            cama15.setMotvIngre(motv_ingre);
            cama15.setEstado(estado);
            cama15.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 16")){
            cama16.setNomPaciente(nom_paciente);
            cama16.setSexo(sexo);
            cama16.setEdad(edad);
            cama16.setNomMedico(nom_medico);
            cama16.setMotvIngre(motv_ingre);
            cama16.setEstado(estado);
            cama16.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 17")){
            cama17.setNomPaciente(nom_paciente);
            cama17.setSexo(sexo);
            cama17.setEdad(edad);
            cama17.setNomMedico(nom_medico);
            cama17.setMotvIngre(motv_ingre);
            cama17.setEstado(estado);
            cama17.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 18")){
            cama18.setNomPaciente(nom_paciente);
            cama18.setSexo(sexo);
            cama18.setEdad(edad);
            cama18.setNomMedico(nom_medico);
            cama18.setMotvIngre(motv_ingre);
            cama18.setEstado(estado);
            cama18.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 19")){
            cama19.setNomPaciente(nom_paciente);
            cama19.setSexo(sexo);
            cama19.setEdad(edad);
            cama19.setNomMedico(nom_medico);
            cama19.setMotvIngre(motv_ingre);
            cama19.setEstado(estado);
            cama19.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 20")){
            cama20.setNomPaciente(nom_paciente);
            cama20.setSexo(sexo);
            cama20.setEdad(edad);
            cama20.setNomMedico(nom_medico);
            cama20.setMotvIngre(motv_ingre);
            cama20.setEstado(estado);
            cama20.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 21")){
            cama21.setNomPaciente(nom_paciente);
            cama21.setSexo(sexo);
            cama21.setEdad(edad);
            cama21.setNomMedico(nom_medico);
            cama21.setMotvIngre(motv_ingre);
            cama21.setEstado(estado);
            cama21.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 22")){
            cama22.setNomPaciente(nom_paciente);
            cama22.setSexo(sexo);
            cama22.setEdad(edad);
            cama22.setNomMedico(nom_medico);
            cama22.setMotvIngre(motv_ingre);
            cama22.setEstado(estado);
            cama22.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 23")){
            cama23.setNomPaciente(nom_paciente);
            cama23.setSexo(sexo);
            cama23.setEdad(edad);
            cama23.setNomMedico(nom_medico);
            cama23.setMotvIngre(motv_ingre);
            cama23.setEstado(estado);
            cama23.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 24")){
            cama24.setNomPaciente(nom_paciente);
            cama24.setSexo(sexo);
            cama24.setEdad(edad);
            cama24.setNomMedico(nom_medico);
            cama24.setMotvIngre(motv_ingre);
            cama24.setEstado(estado);
            cama24.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 25")){
            cama25.setNomPaciente(nom_paciente);
            cama25.setSexo(sexo);
            cama25.setEdad(edad);
            cama25.setNomMedico(nom_medico);
            cama25.setMotvIngre(motv_ingre);
            cama25.setEstado(estado);
            cama25.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 26")){
            cama26.setNomPaciente(nom_paciente);
            cama26.setSexo(sexo);
            cama26.setEdad(edad);
            cama26.setNomMedico(nom_medico);
            cama26.setMotvIngre(motv_ingre);
            cama26.setEstado(estado);
            cama26.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 27")){
            cama27.setNomPaciente(nom_paciente);
            cama27.setSexo(sexo);
            cama27.setEdad(edad);
            cama27.setNomMedico(nom_medico);
            cama27.setMotvIngre(motv_ingre);
            cama27.setEstado(estado);
            cama27.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 28")){
            cama28.setNomPaciente(nom_paciente);
            cama28.setSexo(sexo);
            cama28.setEdad(edad);
            cama28.setNomMedico(nom_medico);
            cama28.setMotvIngre(motv_ingre);
            cama28.setEstado(estado);
            cama28.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 29")){
            cama29.setNomPaciente(nom_paciente);
            cama29.setSexo(sexo);
            cama29.setEdad(edad);
            cama29.setNomMedico(nom_medico);
            cama29.setMotvIngre(motv_ingre);
            cama29.setEstado(estado);
            cama29.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 30")){
            cama30.setNomPaciente(nom_paciente);
            cama30.setSexo(sexo);
            cama30.setEdad(edad);
            cama30.setNomMedico(nom_medico);
            cama30.setMotvIngre(motv_ingre);
            cama30.setEstado(estado);
            cama30.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 31")){
            cama31.setNomPaciente(nom_paciente);
            cama31.setSexo(sexo);
            cama31.setEdad(edad);
            cama31.setNomMedico(nom_medico);
            cama31.setMotvIngre(motv_ingre);
            cama31.setEstado(estado);
            cama31.setFecha(fecha);
            updateStatus(num_cama, estado);
        }else if(num_cama.equals("Cama 32")){
            cama32.setNomPaciente(nom_paciente);
            cama32.setSexo(sexo);
            cama32.setEdad(edad);
            cama32.setNomMedico(nom_medico);
            cama32.setMotvIngre(motv_ingre);
            cama32.setEstado(estado);
            cama32.setFecha(fecha);
            updateStatus(num_cama, estado);
        }   
        
    }
    
    public void mostrarDatos(String num_cama){
        if(num_cama.equals("Cama 1")){
            jlb_nomPaciente.setText(cama1.getNomPaciente());
            jlb_sexo.setText(cama1.getSexo());
            jbl_edad.setText(cama1.getEdad());
            jlb_nomMedico.setText(cama1.getNomMedico());
            jlb_motvIngre.setText(cama1.getMotvIngre());
            jlb_estado.setText(cama1.getEstado());
            jlb_fech_hr.setText(cama1.getFecha());
        }else if(num_cama.equals("Cama 2")){
            jlb_nomPaciente.setText(cama2.getNomPaciente());
            jlb_sexo.setText(cama2.getSexo());
            jbl_edad.setText(cama2.getEdad());
            jlb_nomMedico.setText(cama2.getNomMedico());
            jlb_motvIngre.setText(cama2.getMotvIngre());
            jlb_estado.setText(cama2.getEstado());
            jlb_fech_hr.setText(cama2.getFecha());
        }else if(num_cama.equals("Cama 3")){
            jlb_nomPaciente.setText(cama3.getNomPaciente());
            jlb_sexo.setText(cama3.getSexo());
            jbl_edad.setText(cama3.getEdad());
            jlb_nomMedico.setText(cama3.getNomMedico());
            jlb_motvIngre.setText(cama3.getMotvIngre());
            jlb_estado.setText(cama3.getEstado());
            jlb_fech_hr.setText(cama3.getFecha());
        }else if(num_cama.equals("Cama 4")){
            jlb_nomPaciente.setText(cama4.getNomPaciente());
            jlb_sexo.setText(cama4.getSexo());
            jbl_edad.setText(cama4.getEdad());
            jlb_nomMedico.setText(cama4.getNomMedico());
            jlb_motvIngre.setText(cama4.getMotvIngre());
            jlb_estado.setText(cama4.getEstado());
            jlb_fech_hr.setText(cama4.getFecha());            
        }else if(num_cama.equals("Cama 5")){
            jlb_nomPaciente.setText(cama5.getNomPaciente());
            jlb_sexo.setText(cama5.getSexo());
            jbl_edad.setText(cama5.getEdad());
            jlb_nomMedico.setText(cama5.getNomMedico());
            jlb_motvIngre.setText(cama5.getMotvIngre());
            jlb_estado.setText(cama5.getEstado());
            jlb_fech_hr.setText(cama5.getFecha());
        }else if(num_cama.equals("Cama 6")){
            jlb_nomPaciente.setText(cama6.getNomPaciente());
            jlb_sexo.setText(cama6.getSexo());
            jbl_edad.setText(cama6.getEdad());
            jlb_nomMedico.setText(cama6.getNomMedico());
            jlb_motvIngre.setText(cama6.getMotvIngre());
            jlb_estado.setText(cama6.getEstado());
            jlb_fech_hr.setText(cama6.getFecha());            
        }else if(num_cama.equals("Cama 7")){
            jlb_nomPaciente.setText(cama7.getNomPaciente());
            jlb_sexo.setText(cama7.getSexo());
            jbl_edad.setText(cama7.getEdad());
            jlb_nomMedico.setText(cama7.getNomMedico());
            jlb_motvIngre.setText(cama7.getMotvIngre());
            jlb_estado.setText(cama7.getEstado());
            jlb_fech_hr.setText(cama7.getFecha());
        }else if(num_cama.equals("Cama 8")){
            jlb_nomPaciente.setText(cama8.getNomPaciente());
            jlb_sexo.setText(cama8.getSexo());
            jbl_edad.setText(cama8.getEdad());
            jlb_nomMedico.setText(cama8.getNomMedico());
            jlb_motvIngre.setText(cama8.getMotvIngre());
            jlb_estado.setText(cama8.getEstado());
            jlb_fech_hr.setText(cama8.getFecha());
        }else if(num_cama.equals("Cama 9")){
            jlb_nomPaciente.setText(cama9.getNomPaciente());
            jlb_sexo.setText(cama9.getSexo());
            jbl_edad.setText(cama9.getEdad());
            jlb_nomMedico.setText(cama9.getNomMedico());
            jlb_motvIngre.setText(cama9.getMotvIngre());
            jlb_estado.setText(cama9.getEstado());
            jlb_fech_hr.setText(cama9.getFecha());
        }else if(num_cama.equals("Cama 10")){
            jlb_nomPaciente.setText(cama10.getNomPaciente());
            jlb_sexo.setText(cama10.getSexo());
            jbl_edad.setText(cama10.getEdad());
            jlb_nomMedico.setText(cama10.getNomMedico());
            jlb_motvIngre.setText(cama10.getMotvIngre());
            jlb_estado.setText(cama10.getEstado());
            jlb_fech_hr.setText(cama10.getFecha());
        }else if(num_cama.equals("Cama 11")){
            jlb_nomPaciente.setText(cama11.getNomPaciente());
            jlb_sexo.setText(cama11.getSexo());
            jbl_edad.setText(cama11.getEdad());
            jlb_nomMedico.setText(cama11.getNomMedico());
            jlb_motvIngre.setText(cama11.getMotvIngre());
            jlb_estado.setText(cama11.getEstado());
            jlb_fech_hr.setText(cama11.getFecha());
        }else if(num_cama.equals("Cama 12")){
            jlb_nomPaciente.setText(cama12.getNomPaciente());
            jlb_sexo.setText(cama12.getSexo());
            jbl_edad.setText(cama12.getEdad());
            jlb_nomMedico.setText(cama12.getNomMedico());
            jlb_motvIngre.setText(cama12.getMotvIngre());
            jlb_estado.setText(cama12.getEstado());
            jlb_fech_hr.setText(cama12.getFecha());
        }else if(num_cama.equals("Cama 13")){
            jlb_nomPaciente.setText(cama13.getNomPaciente());
            jlb_sexo.setText(cama13.getSexo());
            jbl_edad.setText(cama13.getEdad());
            jlb_nomMedico.setText(cama13.getNomMedico());
            jlb_motvIngre.setText(cama13.getMotvIngre());
            jlb_estado.setText(cama13.getEstado());
            jlb_fech_hr.setText(cama13.getFecha());
        }else if(num_cama.equals("Cama 14")){
            jlb_nomPaciente.setText(cama14.getNomPaciente());
            jlb_sexo.setText(cama14.getSexo());
            jbl_edad.setText(cama14.getEdad());
            jlb_nomMedico.setText(cama14.getNomMedico());
            jlb_motvIngre.setText(cama14.getMotvIngre());
            jlb_estado.setText(cama14.getEstado());
            jlb_fech_hr.setText(cama14.getFecha());
        }else if(num_cama.equals("Cama 15")){
            jlb_nomPaciente.setText(cama15.getNomPaciente());
            jlb_sexo.setText(cama15.getSexo());
            jbl_edad.setText(cama15.getEdad());
            jlb_nomMedico.setText(cama15.getNomMedico());
            jlb_motvIngre.setText(cama15.getMotvIngre());
            jlb_estado.setText(cama15.getEstado());
            jlb_fech_hr.setText(cama15.getFecha());
        }else if(num_cama.equals("Cama 16")){
            jlb_nomPaciente.setText(cama16.getNomPaciente());
            jlb_sexo.setText(cama16.getSexo());
            jbl_edad.setText(cama16.getEdad());
            jlb_nomMedico.setText(cama16.getNomMedico());
            jlb_motvIngre.setText(cama16.getMotvIngre());
            jlb_estado.setText(cama16.getEstado());
            jlb_fech_hr.setText(cama16.getFecha());           
        }else if(num_cama.equals("Cama 17")){
            jlb_nomPaciente.setText(cama17.getNomPaciente());
            jlb_sexo.setText(cama17.getSexo());
            jbl_edad.setText(cama17.getEdad());
            jlb_nomMedico.setText(cama17.getNomMedico());
            jlb_motvIngre.setText(cama17.getMotvIngre());
            jlb_estado.setText(cama17.getEstado());
            jlb_fech_hr.setText(cama17.getFecha());
        }else if(num_cama.equals("Cama 18")){
            jlb_nomPaciente.setText(cama18.getNomPaciente());
            jlb_sexo.setText(cama18.getSexo());
            jbl_edad.setText(cama18.getEdad());
            jlb_nomMedico.setText(cama18.getNomMedico());
            jlb_motvIngre.setText(cama18.getMotvIngre());
            jlb_estado.setText(cama18.getEstado());
            jlb_fech_hr.setText(cama18.getFecha());
        }else if(num_cama.equals("Cama 19")){
            jlb_nomPaciente.setText(cama19.getNomPaciente());
            jlb_sexo.setText(cama19.getSexo());
            jbl_edad.setText(cama19.getEdad());
            jlb_nomMedico.setText(cama19.getNomMedico());
            jlb_motvIngre.setText(cama19.getMotvIngre());
            jlb_estado.setText(cama19.getEstado());
            jlb_fech_hr.setText(cama19.getFecha());
        }else if(num_cama.equals("Cama 20")){
            jlb_nomPaciente.setText(cama20.getNomPaciente());
            jlb_sexo.setText(cama20.getSexo());
            jbl_edad.setText(cama20.getEdad());
            jlb_nomMedico.setText(cama20.getNomMedico());
            jlb_motvIngre.setText(cama20.getMotvIngre());
            jlb_estado.setText(cama20.getEstado());
            jlb_fech_hr.setText(cama20.getFecha());
        }else if(num_cama.equals("Cama 21")){
            jlb_nomPaciente.setText(cama21.getNomPaciente());
            jlb_sexo.setText(cama21.getSexo());
            jbl_edad.setText(cama21.getEdad());
            jlb_nomMedico.setText(cama21.getNomMedico());
            jlb_motvIngre.setText(cama21.getMotvIngre());
            jlb_estado.setText(cama21.getEstado());
            jlb_fech_hr.setText(cama21.getFecha());
        }else if(num_cama.equals("Cama 22")){
            jlb_nomPaciente.setText(cama22.getNomPaciente());
            jlb_sexo.setText(cama22.getSexo());
            jbl_edad.setText(cama22.getEdad());
            jlb_nomMedico.setText(cama22.getNomMedico());
            jlb_motvIngre.setText(cama22.getMotvIngre());
            jlb_estado.setText(cama22.getEstado());
            jlb_fech_hr.setText(cama22.getFecha());
        }else if(num_cama.equals("Cama 23")){
            jlb_nomPaciente.setText(cama23.getNomPaciente());
            jlb_sexo.setText(cama23.getSexo());
            jbl_edad.setText(cama23.getEdad());
            jlb_nomMedico.setText(cama23.getNomMedico());
            jlb_motvIngre.setText(cama23.getMotvIngre());
            jlb_estado.setText(cama23.getEstado());
            jlb_fech_hr.setText(cama23.getFecha());          
        }else if(num_cama.equals("Cama 24")){
            jlb_nomPaciente.setText(cama24.getNomPaciente());
            jlb_sexo.setText(cama24.getSexo());
            jbl_edad.setText(cama24.getEdad());
            jlb_nomMedico.setText(cama24.getNomMedico());
            jlb_motvIngre.setText(cama24.getMotvIngre());
            jlb_estado.setText(cama24.getEstado());
            jlb_fech_hr.setText(cama24.getFecha());
        }else if(num_cama.equals("Cama 25")){
            jlb_nomPaciente.setText(cama25.getNomPaciente());
            jlb_sexo.setText(cama25.getSexo());
            jbl_edad.setText(cama25.getEdad());
            jlb_nomMedico.setText(cama25.getNomMedico());
            jlb_motvIngre.setText(cama25.getMotvIngre());
            jlb_estado.setText(cama25.getEstado());
            jlb_fech_hr.setText(cama25.getFecha());
        }else if(num_cama.equals("Cama 26")){
            jlb_nomPaciente.setText(cama26.getNomPaciente());
            jlb_sexo.setText(cama26.getSexo());
            jbl_edad.setText(cama26.getEdad());
            jlb_nomMedico.setText(cama26.getNomMedico());
            jlb_motvIngre.setText(cama26.getMotvIngre());
            jlb_estado.setText(cama26.getEstado());
            jlb_fech_hr.setText(cama26.getFecha());
        }else if(num_cama.equals("Cama 27")){
            jlb_nomPaciente.setText(cama27.getNomPaciente());
            jlb_sexo.setText(cama27.getSexo());
            jbl_edad.setText(cama27.getEdad());
            jlb_nomMedico.setText(cama27.getNomMedico());
            jlb_motvIngre.setText(cama27.getMotvIngre());
            jlb_estado.setText(cama27.getEstado());
            jlb_fech_hr.setText(cama27.getFecha());
        }else if(num_cama.equals("Cama 28")){
            jlb_nomPaciente.setText(cama28.getNomPaciente());
            jlb_sexo.setText(cama28.getSexo());
            jbl_edad.setText(cama28.getEdad());
            jlb_nomMedico.setText(cama28.getNomMedico());
            jlb_motvIngre.setText(cama28.getMotvIngre());
            jlb_estado.setText(cama28.getEstado());
            jlb_fech_hr.setText(cama28.getFecha());          
        }else if(num_cama.equals("Cama 29")){
            jlb_nomPaciente.setText(cama29.getNomPaciente());
            jlb_sexo.setText(cama29.getSexo());
            jbl_edad.setText(cama29.getEdad());
            jlb_nomMedico.setText(cama29.getNomMedico());
            jlb_motvIngre.setText(cama29.getMotvIngre());
            jlb_estado.setText(cama29.getEstado());
            jlb_fech_hr.setText(cama29.getFecha());
        }else if(num_cama.equals("Cama 30")){
            jlb_nomPaciente.setText(cama30.getNomPaciente());
            jlb_sexo.setText(cama30.getSexo());
            jbl_edad.setText(cama30.getEdad());
            jlb_nomMedico.setText(cama30.getNomMedico());
            jlb_motvIngre.setText(cama30.getMotvIngre());
            jlb_estado.setText(cama30.getEstado());
            jlb_fech_hr.setText(cama30.getFecha());
        }else if(num_cama.equals("Cama 31")){
            jlb_nomPaciente.setText(cama31.getNomPaciente());
            jlb_sexo.setText(cama31.getSexo());
            jbl_edad.setText(cama31.getEdad());
            jlb_nomMedico.setText(cama31.getNomMedico());
            jlb_motvIngre.setText(cama31.getMotvIngre());
            jlb_estado.setText(cama31.getEstado());
            jlb_fech_hr.setText(cama31.getFecha());           
        }else if(num_cama.equals("Cama 32")){
            jlb_nomPaciente.setText(cama32.getNomPaciente());
            jlb_sexo.setText(cama32.getSexo());
            jbl_edad.setText(cama32.getEdad());
            jlb_nomMedico.setText(cama32.getNomMedico());
            jlb_motvIngre.setText(cama32.getMotvIngre());
            jlb_estado.setText(cama32.getEstado());
            jlb_fech_hr.setText(cama32.getFecha());
        }
    }
    
    public void update(String num_cama, String option){
        if(num_cama.equals("Cama 1")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama1.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama1.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama1.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama1.setEstado(selectOPT);
            }
        }else if(num_cama.equals("Cama 2")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama2.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama2.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama2.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama2.setEstado(selectOPT);
            } 
        }else if(num_cama.equals("Cama 3")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama3.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama3.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama3.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama3.setEstado(selectOPT);
            }             
        }else if(num_cama.equals("Cama 4")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama4.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama4.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama4.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama4.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 5")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama5.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama5.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama5.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama5.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 6")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama6.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama6.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama6.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama6.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 7")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama7.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama7.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama7.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama7.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 8")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama8.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama8.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama8.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama8.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 9")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama9.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama9.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama9.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama9.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 10")){
             if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama10.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama10.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama10.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama10.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 11")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama11.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama11.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama11.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama11.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 12")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama12.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama12.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama12.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama12.setEstado(selectOPT);
            }      
        }else if(num_cama.equals("Cama 13")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama13.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama13.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama13.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama13.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 14")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama14.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama14.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama14.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama14.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 15")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama15.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama15.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama15.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama15.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 16")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama16.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama16.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama16.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama16.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 17")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama17.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama17.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama17.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama17.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 18")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama18.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama18.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama18.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama18.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 19")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama19.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama19.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama19.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama19.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 20")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama20.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama20.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama20.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama20.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 21")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama21.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama21.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama21.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama21.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 22")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama22.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama22.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama22.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama22.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 23")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama23.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama23.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama23.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama23.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 24")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama24.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama24.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama24.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama24.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 25")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama25.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama25.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama25.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama25.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 26")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama26.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama26.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama26.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama26.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 27")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama27.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama27.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama27.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama27.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 28")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama28.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama28.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama28.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama28.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 29")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama29.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama29.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama29.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama29.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 30")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama30.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama30.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama30.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama30.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 31")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama31.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama31.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama31.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama31.setEstado(selectOPT);
            }     
        }else if(num_cama.equals("Cama 32")){
            if(option.equals("Nombre del paciente")){
                String nomPaciente = JOptionPane.showInputDialog(null, "Introduce el nombre del paciente:", JOptionPane.QUESTION_MESSAGE);
                cama32.setNomPaciente(nomPaciente);
            }else if(option.equals("Edad")){
                String edad = JOptionPane.showInputDialog(null, "Introduce la edad:", JOptionPane.QUESTION_MESSAGE);
                cama32.setEdad(edad);
            }else if(option.equals("Nombre del medico")){
                String nomMedico = JOptionPane.showInputDialog(null, "Introduce el nombre del medico:", JOptionPane.QUESTION_MESSAGE);
                cama32.setNomMedico(nomMedico);
            }else if(option.equals("Estado")){                
                Object opcion = JOptionPane.showInputDialog(null,"Selecciona el estado del paciente:", "Elegir", JOptionPane.QUESTION_MESSAGE,null,status,status[0]);
                String selectOPT = opcion.toString();
                updateStatus(num_cama, selectOPT);
                cama32.setEstado(selectOPT);
            }     
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_detalles;
    private javax.swing.JButton btn_setAlta;
    private javax.swing.JComboBox<String> cbx_numC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jbl_edad;
    private javax.swing.JLabel jbl_reloj;
    private javax.swing.JLabel jlb_estado;
    private javax.swing.JLabel jlb_fech_hr;
    private javax.swing.JLabel jlb_motvIngre;
    private javax.swing.JLabel jlb_nomMedico;
    private javax.swing.JLabel jlb_nomPaciente;
    private javax.swing.JLabel jlb_sexo;
    private javax.swing.JTextField txt_StatusC1;
    private javax.swing.JTextField txt_StatusC10;
    private javax.swing.JTextField txt_StatusC11;
    private javax.swing.JTextField txt_StatusC12;
    private javax.swing.JTextField txt_StatusC13;
    private javax.swing.JTextField txt_StatusC14;
    private javax.swing.JTextField txt_StatusC15;
    private javax.swing.JTextField txt_StatusC16;
    private javax.swing.JTextField txt_StatusC17;
    private javax.swing.JTextField txt_StatusC18;
    private javax.swing.JTextField txt_StatusC19;
    private javax.swing.JTextField txt_StatusC2;
    private javax.swing.JTextField txt_StatusC20;
    private javax.swing.JTextField txt_StatusC21;
    private javax.swing.JTextField txt_StatusC22;
    private javax.swing.JTextField txt_StatusC23;
    private javax.swing.JTextField txt_StatusC24;
    private javax.swing.JTextField txt_StatusC25;
    private javax.swing.JTextField txt_StatusC26;
    private javax.swing.JTextField txt_StatusC27;
    private javax.swing.JTextField txt_StatusC28;
    private javax.swing.JTextField txt_StatusC29;
    private javax.swing.JTextField txt_StatusC3;
    private javax.swing.JTextField txt_StatusC30;
    private javax.swing.JTextField txt_StatusC31;
    private javax.swing.JTextField txt_StatusC32;
    private javax.swing.JTextField txt_StatusC4;
    private javax.swing.JTextField txt_StatusC5;
    private javax.swing.JTextField txt_StatusC6;
    private javax.swing.JTextField txt_StatusC7;
    private javax.swing.JTextField txt_StatusC8;
    private javax.swing.JTextField txt_StatusC9;
    private javax.swing.JTextField txt_delicado;
    private javax.swing.JTextField txt_disponible;
    private javax.swing.JTextField txt_grave;
    private javax.swing.JTextField txt_muygrave;
    private javax.swing.JTextField txt_recuperacion;
    // End of variables declaration//GEN-END:variables

    private void calReloj() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
            hora = h>9?"" + h:"0" + h;
        }else{
            hora = calendario.get(Calendar.HOUR_OF_DAY)>9?"" + calendario.get(Calendar.HOUR_OF_DAY):"0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE)>9?"" + calendario.get(Calendar.MINUTE):"0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?"" + calendario.get(Calendar.SECOND):"0" + calendario.get(Calendar.SECOND);
    }
}
