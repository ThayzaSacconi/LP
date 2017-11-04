package softwarelp;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author Thayza
 */
public class Tela extends javax.swing.JFrame {
    int posicao;
    double num_conta= 10000;
    boolean logado;
    public static ArrayList<Cliente> clientes = new ArrayList<>(100);

    public ArrayList<Cliente> getVoos() {
        return clientes;
    }
    
    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        
        logado = false;
        posicao=0;
        
         //add algms clintes para teste
         clientes.add(new Cliente("Ana",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","12345" ,"123456",200.00)); 
         clientes.add(new Cliente("Flavia",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","45000" ,"083181",200.00)); 
         clientes.add(new Cliente("Nani",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","15372" ,"131311",200.00)); 
         clientes.add(new Cliente("Thayza",".com","estudante", "123.4566.788-00", "(27)99000-0000","F","12/12/12","23100" ,"242255",200.00)); 
         
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonEscolhaSexo = new javax.swing.ButtonGroup();
        jPanelTotal = new javax.swing.JPanel();
        jPanelMenu = new javax.swing.JPanel();
        Titulo = new javax.swing.JPanel();
        jTitulo = new javax.swing.JLabel();
        jSubTitulo = new javax.swing.JLabel();
        jSeparator = new javax.swing.JSeparator();
        jSaldo = new javax.swing.JPanel();
        icon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDepositar = new javax.swing.JPanel();
        icon3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSacar = new javax.swing.JPanel();
        icon2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jConta = new javax.swing.JPanel();
        icon4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jExtrato = new javax.swing.JPanel();
        icon5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanelTelas = new javax.swing.JPanel();
        jBoasVindas = new javax.swing.JPanel();
        jSair = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        iconBorboletas = new javax.swing.JLabel();
        Texto2 = new javax.swing.JLabel();
        Texto1 = new javax.swing.JLabel();
        jButtonCadastrar = new javax.swing.JButton();
        jPanelSacar = new javax.swing.JPanel();
        DentroSacar = new javax.swing.JPanel();
        iconDinheiro = new javax.swing.JLabel();
        jLabelValorSacar = new javax.swing.JLabel();
        jTextoValorSacar = new javax.swing.JFormattedTextField();
        jButtonSacar = new javax.swing.JButton();
        jSeparator12 = new javax.swing.JSeparator();
        jInsiraSenha = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        SenhaSacar = new javax.swing.JPasswordField();
        textSacar = new javax.swing.JLabel();
        jLabeVOLTAR = new javax.swing.JLabel();
        jPanelCadastro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        TelaCadastro = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        TextoNome = new javax.swing.JTextField();
        jNome = new javax.swing.JLabel();
        jEmail = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        TextoEmail = new javax.swing.JTextField();
        jProfissao = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        TextoProfissao = new javax.swing.JTextField();
        jCpf = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jTelefone = new javax.swing.JLabel();
        jDataNasc = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jTelefone1 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jSexo = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        SexoFem = new javax.swing.JCheckBox();
        SexoMasc = new javax.swing.JCheckBox();
        jButtonSalvar = new javax.swing.JButton();
        jSenha = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jTextoSenha = new javax.swing.JPasswordField();
        TextoCpf = new javax.swing.JFormattedTextField();
        TextoTelefone = new javax.swing.JFormattedTextField();
        TextoDataNasc = new javax.swing.JFormattedTextField();
        iconVoltar = new javax.swing.JLabel();
        jPanelLogin = new javax.swing.JPanel();
        TelaLogin = new javax.swing.JPanel();
        iconUser = new javax.swing.JLabel();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        TextoUserLogin = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        TextoSenhaLogin = new javax.swing.JPasswordField();
        buttonEntrar = new javax.swing.JButton();
        TextoLogin = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TelaLogado = new javax.swing.JPanel();
        jSair4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        iconBorboletas1 = new javax.swing.JLabel();
        Texto3 = new javax.swing.JLabel();
        Texto4 = new javax.swing.JLabel();
        pegaNome = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTotal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenu.setBackground(new java.awt.Color(0, 255, 204));
        jPanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setBackground(new java.awt.Color(0, 255, 204));
        Titulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitulo.setFont(new java.awt.Font("Broadway", 0, 24)); // NOI18N
        jTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borboleta.png"))); // NOI18N
        jTitulo.setText("Metamorfose");
        Titulo.add(jTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 250, 50));

        jSubTitulo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSubTitulo.setText("Banco");
        Titulo.add(jSubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, 40));

        jSeparator.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator.setForeground(new java.awt.Color(0, 0, 0));
        Titulo.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 10));

        jPanelMenu.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 140));

        jSaldo.setBackground(new java.awt.Color(0, 255, 204));
        jSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSaldoMouseClicked(evt);
            }
        });

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Saldo.png"))); // NOI18N
        icon1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jSaldo.add(icon1);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Saldo");
        jSaldo.add(jLabel1);

        jPanelMenu.add(jSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 290, 40));

        jDepositar.setBackground(new java.awt.Color(0, 255, 204));
        jDepositar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDepositarMouseClicked(evt);
            }
        });

        icon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Novidades.png"))); // NOI18N
        jDepositar.add(icon3);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Depositar");
        jDepositar.add(jLabel3);

        jPanelMenu.add(jDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 40));

        jSacar.setBackground(new java.awt.Color(0, 255, 204));
        jSacar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jSacar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSacarMouseClicked(evt);
            }
        });

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/VendaPassagem.png"))); // NOI18N
        jSacar.add(icon2);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Sacar");
        jSacar.add(jLabel2);

        jPanelMenu.add(jSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 290, 40));

        jConta.setBackground(new java.awt.Color(0, 255, 204));
        jConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jContaMouseClicked(evt);
            }
        });

        icon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conta.png"))); // NOI18N
        icon4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jConta.add(icon4);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel11.setText("Conta | Login");
        jConta.add(jLabel11);

        jPanelMenu.add(jConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 40));

        jExtrato.setBackground(new java.awt.Color(0, 255, 204));
        jExtrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jExtratoMouseClicked(evt);
            }
        });

        icon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Extrato.png"))); // NOI18N
        icon5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jExtrato.add(icon5);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel12.setText("Extrato");
        jExtrato.add(jLabel12);

        jPanelMenu.add(jExtrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 290, 40));

        jPanelTotal.add(jPanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jPanelTelas.setBackground(new java.awt.Color(204, 204, 204));
        jPanelTelas.setLayout(new java.awt.CardLayout());

        jBoasVindas.setBackground(new java.awt.Color(255, 255, 255));
        jBoasVindas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSair.setBackground(new java.awt.Color(255, 255, 255));
        jSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSairMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N

        javax.swing.GroupLayout jSairLayout = new javax.swing.GroupLayout(jSair);
        jSair.setLayout(jSairLayout);
        jSairLayout.setHorizontalGroup(
            jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSairLayout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel5)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jSairLayout.setVerticalGroup(
            jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSairLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel5)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        jBoasVindas.add(jSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 0, -1, -1));

        iconBorboletas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borboleta2.jpg"))); // NOI18N
        jBoasVindas.add(iconBorboletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 132, 412, -1));

        Texto2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto2.setText("Cadastre-se para desfrutar dos nossos serviços.");
        jBoasVindas.add(Texto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, -1));

        Texto1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto1.setText("Bem vindo ao Banco Metamorfose! ");
        jBoasVindas.add(Texto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 322, -1, -1));

        jButtonCadastrar.setBackground(new java.awt.Color(153, 255, 204));
        jButtonCadastrar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        jBoasVindas.add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 440, 360, -1));

        jPanelTelas.add(jBoasVindas, "card3");

        jPanelSacar.setBackground(new java.awt.Color(255, 255, 255));
        jPanelSacar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DentroSacar.setBackground(new java.awt.Color(255, 204, 204));
        DentroSacar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconDinheiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Caixa.png"))); // NOI18N
        DentroSacar.add(iconDinheiro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 60, 60));

        jLabelValorSacar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelValorSacar.setText("Valor a ser sacado");
        DentroSacar.add(jLabelValorSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jTextoValorSacar.setBackground(new java.awt.Color(255, 204, 204));
        jTextoValorSacar.setBorder(null);
        jTextoValorSacar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));
        DentroSacar.add(jTextoValorSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 250, 30));

        jButtonSacar.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSacar.setText("SACAR");
        jButtonSacar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSacarActionPerformed(evt);
            }
        });
        DentroSacar.add(jButtonSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 100, 40));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        DentroSacar.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 250, 10));

        jInsiraSenha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jInsiraSenha.setText("Insira sua senha para prosseguir");
        DentroSacar.add(jInsiraSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        DentroSacar.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 250, 10));

        SenhaSacar.setBackground(new java.awt.Color(255, 204, 204));
        SenhaSacar.setBorder(null);
        DentroSacar.add(SenhaSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, 30));

        jPanelSacar.add(DentroSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 320, 340));

        textSacar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        textSacar.setText("Sacar");
        jPanelSacar.add(textSacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabeVOLTAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        jLabeVOLTAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabeVOLTARMouseClicked(evt);
            }
        });
        jPanelSacar.add(jLabeVOLTAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, -1));

        jPanelTelas.add(jPanelSacar, "card5");

        jPanelCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Tela Cadastro");
        jPanelCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        TelaCadastro.setBackground(new java.awt.Color(255, 255, 255));
        TelaCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        TelaCadastro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 419, 10));

        TextoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoNomeActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 420, 30));

        jNome.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jNome.setText("Nome completo");
        TelaCadastro.add(jNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jEmail.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jEmail.setText("E-mail");
        TelaCadastro.add(jEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));
        TelaCadastro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 419, 10));
        TelaCadastro.add(TextoEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 420, 30));

        jProfissao.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jProfissao.setText("Profissão");
        TelaCadastro.add(jProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));
        TelaCadastro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 419, 10));

        TextoProfissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoProfissaoActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoProfissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 420, 30));

        jCpf.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jCpf.setText("CPF");
        TelaCadastro.add(jCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        TelaCadastro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 210, 10));
        TelaCadastro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 10));

        jTelefone.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTelefone.setText("Telefone");
        TelaCadastro.add(jTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jDataNasc.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jDataNasc.setText("Data de nascimento");
        TelaCadastro.add(jDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 160, -1));
        TelaCadastro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 10));

        jTelefone1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jTelefone1.setText("Telefone");
        TelaCadastro.add(jTelefone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));
        TelaCadastro.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 10));

        jSexo.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSexo.setText("Sexo");
        TelaCadastro.add(jSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 160, -1));
        TelaCadastro.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 200, 10));

        SexoFem.setBackground(new java.awt.Color(153, 255, 204));
        buttonEscolhaSexo.add(SexoFem);
        SexoFem.setText("Feminino");
        SexoFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoFemActionPerformed(evt);
            }
        });
        TelaCadastro.add(SexoFem, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, 100, 30));

        SexoMasc.setBackground(new java.awt.Color(153, 255, 204));
        buttonEscolhaSexo.add(SexoMasc);
        SexoMasc.setText("Masculino");
        SexoMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SexoMascActionPerformed(evt);
            }
        });
        TelaCadastro.add(SexoMasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 100, 30));

        jButtonSalvar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        TelaCadastro.add(jButtonSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jSenha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSenha.setText("Senha");
        TelaCadastro.add(jSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));
        TelaCadastro.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 210, 10));

        jTextoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoSenhaActionPerformed(evt);
            }
        });
        TelaCadastro.add(jTextoSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 210, 30));

        try {
            TextoCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoCpfActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 30));

        try {
            TextoTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextoTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoTelefoneActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 210, 30));

        try {
            TextoDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TextoDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoDataNascActionPerformed(evt);
            }
        });
        TelaCadastro.add(TextoDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 200, 30));

        jPanelCadastro.add(TelaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 61, 440, 430));

        iconVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        iconVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconVoltarMouseClicked(evt);
            }
        });
        jPanelCadastro.add(iconVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 10, 30, -1));

        jPanelTelas.add(jPanelCadastro, "card3");

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TelaLogin.setBackground(new java.awt.Color(255, 204, 204));
        TelaLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/userM.png"))); // NOI18N
        TelaLogin.add(iconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        jLabelSenha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelSenha.setText("Senha");
        TelaLogin.add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabelUser.setText("Usuário");
        TelaLogin.add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        TextoUserLogin.setBackground(new java.awt.Color(255, 204, 204));
        TextoUserLogin.setBorder(null);
        TelaLogin.add(TextoUserLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 250, 40));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        TelaLogin.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 250, 20));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        TelaLogin.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 250, 20));

        TextoSenhaLogin.setBackground(new java.awt.Color(255, 204, 204));
        TextoSenhaLogin.setBorder(null);
        TextoSenhaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoSenhaLoginActionPerformed(evt);
            }
        });
        TelaLogin.add(TextoSenhaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 250, 40));

        buttonEntrar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEntrar.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        buttonEntrar.setText("Entrar");
        buttonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEntrarActionPerformed(evt);
            }
        });
        TelaLogin.add(buttonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 330, 250, -1));

        jPanelLogin.add(TelaLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, 290, 380));

        TextoLogin.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        TextoLogin.setText("Login");
        jPanelLogin.add(TextoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Desfazer.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanelLogin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 30, -1));

        jPanelTelas.add(jPanelLogin, "card4");

        TelaLogado.setBackground(new java.awt.Color(255, 255, 255));
        TelaLogado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSair4.setBackground(new java.awt.Color(255, 255, 255));
        jSair4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSair4MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N

        javax.swing.GroupLayout jSair4Layout = new javax.swing.GroupLayout(jSair4);
        jSair4.setLayout(jSair4Layout);
        jSair4Layout.setHorizontalGroup(
            jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSair4Layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel9)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jSair4Layout.setVerticalGroup(
            jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
            .addGroup(jSair4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jSair4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );

        TelaLogado.add(jSair4, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 0, -1, -1));

        iconBorboletas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/borboleta2.jpg"))); // NOI18N
        TelaLogado.add(iconBorboletas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 132, 412, -1));

        Texto3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto3.setText("Escolha uma ação no Menu.");
        TelaLogado.add(Texto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 460, -1));

        Texto4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        Texto4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Texto4.setText("Bem vindo ao Banco Metamorfose,");
        TelaLogado.add(Texto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 322, 460, -1));

        pegaNome.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        pegaNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pegaNome.setText("pegaNome");
        TelaLogado.add(pegaNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 460, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        jLabel6.setText("Sair da conta");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        TelaLogado.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 470, -1, -1));

        jPanelTelas.add(TelaLogado, "card3");

        jPanelTotal.add(jPanelTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 460, 500));

        getContentPane().add(jPanelTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoNomeActionPerformed

    private void TextoProfissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoProfissaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoProfissaoActionPerformed

    private void SexoMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoMascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoMascActionPerformed

    private void SexoFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SexoFemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SexoFemActionPerformed

    private void iconVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconVoltarMouseClicked
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
             jExtrato.setBackground(new Color(0,255,204));
             jSacar.setBackground(new Color(0,255,204));
             jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_iconVoltarMouseClicked

    private void jSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jSairMouseClicked

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        String sexo ="";
        Arquivos arq = new Arquivos();
        
        if(SexoFem.isSelected()){
                 sexo = "Masculino";
        }
        if(SexoMasc.isSelected()){
                 sexo = "Feminino";
        }        
        
        /*try{
        clientes.add(new Cliente(TextoNome.getText(), TextoEmail.getText(), TextoProfissao.getText(), TextoCpf.getText(),
                TextoTelefone.getText(), sexo , TextoDataNasc.getText(),jTextoSenha.getText(), Double.toString(num_conta)));
        
        arq.salvarEmDisco(clientes);
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, " Favor Insirir Todos Os Campos! ");
        }*/
        
        jPanelTelas.removeAll();
        
        jPanelTelas.repaint();
        jPanelTelas.revalidate();
        jPanelTelas.add(jBoasVindas);
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoSenhaActionPerformed

    private void TextoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoCpfActionPerformed

    private void TextoTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoTelefoneActionPerformed

    private void TextoDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoDataNascActionPerformed

    private void TextoSenhaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoSenhaLoginActionPerformed
  
    }//GEN-LAST:event_TextoSenhaLoginActionPerformed

    private void buttonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEntrarActionPerformed
        for(int i = 0; i<clientes.size(); i++){
            if(clientes.get(i).getNumConta().equals(TextoUserLogin.getText().toString()) && 
                    clientes.get(i).getSenha().equals(TextoSenhaLogin.getText().toString())){
                        logado = true;
                        posicao = i;
                        jPanelTelas.removeAll();
                        jPanelTelas.repaint();
                        jPanelTelas.revalidate();
                        pegaNome.setText(clientes.get(i).getNome());
                        jPanelTelas.add(TelaLogado);
            }           
        }
         TextoSenhaLogin.setText("");
         TextoUserLogin.setText("");
    }//GEN-LAST:event_buttonEntrarActionPerformed

    private void jSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSaldoMouseClicked
        if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelSacar);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(255,204,204));
            
            
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,153,153));
        }      
    }//GEN-LAST:event_jSaldoMouseClicked

    private void jContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jContaMouseClicked
        jPanelTelas.removeAll();
        jPanelTelas.repaint();
        jPanelTelas.revalidate();
        if(logado)    jPanelTelas.add(TelaLogado);           
        else{         
            jPanelTelas.add(jPanelLogin);       
        }
             jConta.setBackground(new Color(255,204,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_jContaMouseClicked

    private void jExtratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jExtratoMouseClicked
     if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelSacar);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(255,204,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));            
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,153,153));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
        } 
    }//GEN-LAST:event_jExtratoMouseClicked

    private void jButtonSacarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSacarActionPerformed
        if(clientes.get(posicao).getSenha().equals(SenhaSacar.getText().toString())){
            clientes.get(posicao).sacar(Double.parseDouble(jTextoValorSacar.getText()));
        
        }else{
            SenhaSacar.setText("");
            double valor =  clientes.get(posicao).getSaldoCliente();
            System.out.println(valor);
        }
        double valor =  clientes.get(posicao).getSaldoCliente();
            System.out.println(valor);
    }//GEN-LAST:event_jButtonSacarActionPerformed

    private void jSacarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSacarMouseClicked
        if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelSacar);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(255,204,204));
            jSaldo.setBackground(new Color(0,255,204));      
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,153,153));
            jSaldo.setBackground(new Color(0,255,204));
        }
    }//GEN-LAST:event_jSacarMouseClicked

    private void jSair4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSair4MouseClicked
            System.exit(0);
            
            //pegaNome.get
    }//GEN-LAST:event_jSair4MouseClicked

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelCadastro);
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabeVOLTARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabeVOLTARMouseClicked
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(TelaLogado);   
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,255,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
    }//GEN-LAST:event_jLabeVOLTARMouseClicked

    private void jDepositarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDepositarMouseClicked
        if(logado==true) {
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jPanelSacar);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(255,204,204));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));            
        }else{
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
            jConta.setBackground(new Color(0,255,204));
            jDepositar.setBackground(new Color(0,153,153));
            jExtrato.setBackground(new Color(0,255,204));
            jSacar.setBackground(new Color(0,255,204));
            jSaldo.setBackground(new Color(0,255,204));
        } 
    }//GEN-LAST:event_jDepositarMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
            logado = false;
            jPanelTelas.removeAll();
            jPanelTelas.repaint();
            jPanelTelas.revalidate();
            jPanelTelas.add(jBoasVindas);
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DentroSacar;
    private javax.swing.JPasswordField SenhaSacar;
    private javax.swing.JCheckBox SexoFem;
    private javax.swing.JCheckBox SexoMasc;
    private javax.swing.JPanel TelaCadastro;
    private javax.swing.JPanel TelaLogado;
    private javax.swing.JPanel TelaLogin;
    private javax.swing.JLabel Texto1;
    private javax.swing.JLabel Texto2;
    private javax.swing.JLabel Texto3;
    private javax.swing.JLabel Texto4;
    private javax.swing.JFormattedTextField TextoCpf;
    private javax.swing.JFormattedTextField TextoDataNasc;
    private javax.swing.JTextField TextoEmail;
    private javax.swing.JLabel TextoLogin;
    private javax.swing.JTextField TextoNome;
    private javax.swing.JTextField TextoProfissao;
    private javax.swing.JPasswordField TextoSenhaLogin;
    private javax.swing.JFormattedTextField TextoTelefone;
    private javax.swing.JTextField TextoUserLogin;
    private javax.swing.JPanel Titulo;
    private javax.swing.JButton buttonEntrar;
    private javax.swing.ButtonGroup buttonEscolhaSexo;
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JLabel icon3;
    private javax.swing.JLabel icon4;
    private javax.swing.JLabel icon5;
    private javax.swing.JLabel iconBorboletas;
    private javax.swing.JLabel iconBorboletas1;
    private javax.swing.JLabel iconDinheiro;
    private javax.swing.JLabel iconUser;
    private javax.swing.JLabel iconVoltar;
    private javax.swing.JPanel jBoasVindas;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonSacar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JPanel jConta;
    private javax.swing.JLabel jCpf;
    private javax.swing.JLabel jDataNasc;
    private javax.swing.JPanel jDepositar;
    private javax.swing.JLabel jEmail;
    private javax.swing.JPanel jExtrato;
    private javax.swing.JLabel jInsiraSenha;
    private javax.swing.JLabel jLabeVOLTAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JLabel jLabelValorSacar;
    private javax.swing.JLabel jNome;
    private javax.swing.JPanel jPanelCadastro;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPanel jPanelMenu;
    private javax.swing.JPanel jPanelSacar;
    private javax.swing.JPanel jPanelTelas;
    private javax.swing.JPanel jPanelTotal;
    private javax.swing.JLabel jProfissao;
    private javax.swing.JPanel jSacar;
    private javax.swing.JPanel jSair;
    private javax.swing.JPanel jSair4;
    private javax.swing.JPanel jSaldo;
    private javax.swing.JLabel jSenha;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel jSexo;
    private javax.swing.JLabel jSubTitulo;
    private javax.swing.JLabel jTelefone;
    private javax.swing.JLabel jTelefone1;
    private javax.swing.JPasswordField jTextoSenha;
    private javax.swing.JFormattedTextField jTextoValorSacar;
    private javax.swing.JLabel jTitulo;
    private javax.swing.JLabel pegaNome;
    private javax.swing.JLabel textSacar;
    // End of variables declaration//GEN-END:variables
}
