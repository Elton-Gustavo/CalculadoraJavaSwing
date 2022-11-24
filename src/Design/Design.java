package Design;

import TelaAtalhosDeTeclado.TelaAtalhosDeTeclado;
import Script.Script;
import java.awt.event.KeyEvent;


public class Design extends javax.swing.JFrame {
    Script sc; //Declaração variavel de acesso a classe Script
    String textoPainel; //Declaração variavel que guarda o texto do painel

    public void zerarPainel(){
        // Método utizado para deixar o painel da calculadora em branco.
        painel.setText("");
        painel.requestFocus();
                
    }
    
    

    public Design() {
        initComponents();
        sc = new Script(); //Criação do Objeto da classe Script
        this.setLocationRelativeTo(null); //Deixar Centralizado no meio o JFrame ao abrir
        painel.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        painel = new javax.swing.JTextField();
        KeyVirgula = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDouble0 = new javax.swing.JButton();
        btnIgual = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMais = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnVezes = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnDivisao = new javax.swing.JButton();
        btnLeftDirecional = new javax.swing.JButton();
        Preferencias = new javax.swing.JButton();
        menu = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);

        background.setBackground(new java.awt.Color(102, 102, 102));
        background.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic Medium", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        background.setForeground(new java.awt.Color(255, 255, 255));

        painel.setEditable(false);
        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        painel.setForeground(new java.awt.Color(0, 0, 0));
        painel.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        painel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                painelKeyPressed(evt);
            }
        });

        KeyVirgula.setBackground(new java.awt.Color(0, 0, 0));
        KeyVirgula.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        KeyVirgula.setForeground(new java.awt.Color(255, 255, 255));
        KeyVirgula.setText(",");
        KeyVirgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KeyVirgulaActionPerformed(evt);
            }
        });

        btn0.setBackground(new java.awt.Color(0, 0, 0));
        btn0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn0.setForeground(new java.awt.Color(255, 255, 255));
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnDouble0.setBackground(new java.awt.Color(0, 0, 0));
        btnDouble0.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnDouble0.setForeground(new java.awt.Color(255, 255, 255));
        btnDouble0.setText("00");
        btnDouble0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDouble0ActionPerformed(evt);
            }
        });

        btnIgual.setBackground(new java.awt.Color(0, 0, 0));
        btnIgual.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnIgual.setForeground(new java.awt.Color(255, 255, 255));
        btnIgual.setText("=");
        btnIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgualActionPerformed(evt);
            }
        });

        btn1.setBackground(new java.awt.Color(0, 0, 0));
        btn1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 255, 255));
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(0, 0, 0));
        btn2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn2.setForeground(new java.awt.Color(255, 255, 255));
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(0, 0, 0));
        btn3.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn3.setForeground(new java.awt.Color(255, 255, 255));
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnMais.setBackground(new java.awt.Color(0, 0, 0));
        btnMais.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnMais.setForeground(new java.awt.Color(255, 255, 255));
        btnMais.setText("+");
        btnMais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(0, 0, 0));
        btn4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(0, 0, 0));
        btn5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn5.setForeground(new java.awt.Color(255, 255, 255));
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setBackground(new java.awt.Color(0, 0, 0));
        btn6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn6.setForeground(new java.awt.Color(255, 255, 255));
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btnMenos.setBackground(new java.awt.Color(0, 0, 0));
        btnMenos.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        btnMenos.setForeground(new java.awt.Color(255, 255, 255));
        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });

        btn7.setBackground(new java.awt.Color(0, 0, 0));
        btn7.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn7.setForeground(new java.awt.Color(255, 255, 255));
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setBackground(new java.awt.Color(0, 0, 0));
        btn8.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn8.setForeground(new java.awt.Color(255, 255, 255));
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setBackground(new java.awt.Color(0, 0, 0));
        btn9.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btn9.setForeground(new java.awt.Color(255, 255, 255));
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnVezes.setBackground(new java.awt.Color(0, 0, 0));
        btnVezes.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnVezes.setForeground(new java.awt.Color(255, 255, 255));
        btnVezes.setText("X");
        btnVezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVezesActionPerformed(evt);
            }
        });

        btnC.setBackground(new java.awt.Color(0, 0, 0));
        btnC.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnC.setForeground(new java.awt.Color(255, 255, 255));
        btnC.setText("CE");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnPotencia.setBackground(new java.awt.Color(0, 0, 0));
        btnPotencia.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnPotencia.setForeground(new java.awt.Color(255, 255, 255));
        btnPotencia.setText("^");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });

        btnRaiz.setBackground(new java.awt.Color(0, 0, 0));
        btnRaiz.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnRaiz.setForeground(new java.awt.Color(255, 255, 255));
        btnRaiz.setText("√");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });

        btnDivisao.setBackground(new java.awt.Color(0, 0, 0));
        btnDivisao.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        btnDivisao.setForeground(new java.awt.Color(255, 255, 255));
        btnDivisao.setText("÷");
        btnDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisaoActionPerformed(evt);
            }
        });

        btnLeftDirecional.setBackground(new java.awt.Color(0, 0, 0));
        btnLeftDirecional.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnLeftDirecional.setForeground(new java.awt.Color(255, 255, 255));
        btnLeftDirecional.setText("⌫");
        btnLeftDirecional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeftDirecionalActionPerformed(evt);
            }
        });

        Preferencias.setBackground(new java.awt.Color(0, 0, 0));
        Preferencias.setForeground(new java.awt.Color(204, 204, 255));
        Preferencias.setText("Preferências");
        Preferencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreferenciasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDouble0, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btn9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btn3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(KeyVirgula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnVezes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnMenos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnMais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIgual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLeftDirecional, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Preferencias))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(painel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLeftDirecional))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Preferencias)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVezes, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMais, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(KeyVirgula, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDouble0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public String FormatarNumeroNaoDecimal(String resultado){  
        /*
        Método usado para tirar o ".0" de números naturais, ex: 10.0 virar 10
        */
        if(resultado.endsWith(".0")){
            resultado = resultado.substring(0, resultado.length() - 2);
        } 
        return resultado;
}
    
    public void KeyDivisao(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText();
        painel.setText(textoPainel + " ÷ ");
    }
    
    public void KeyVezes(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText();
        painel.setText(textoPainel + " x ");
    }
    
    public void KeyMenos(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText();
        painel.setText(textoPainel + " - ");
    }
    
    public void KeyMais(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText();
        painel.setText(textoPainel + " + ");
    }
    
    
    public void KeyEnter(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText().trim();
        sc.TratamentoDeErro(textoPainel);
        
        painel.setText(sc.getRespostaEquacao());
            
    }
    
    public void KeyRaiz(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText();
        painel.setText(textoPainel + " √ ");
    }
    
    public void KeyPotencia(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText();
        painel.setText(textoPainel + " ^ ");
    }
    
    public void KeyCE(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        painel.setText("");
    }
    
    public void KeyVirgula(){
        //Codigo para adicionar o botão desejado na String da expressão no painel
        textoPainel = painel.getText();
        painel.setText(textoPainel + ",");
        
    }
    
    public void KeyLeftBtn(){
        /*
        Metodo para Remover a ultima posição da String atual no painel
        Testando se existe algo digitado para não gerar erro de Index
        */
        textoPainel = painel.getText();
        if(textoPainel.length() != 0){
            painel.setText(textoPainel.substring(0, textoPainel.length() - 1));
        }
    }
    
    public void b0(){
        /*
        Método feito para adicionar 0 na String, porém limitando o usuário a não poder
        adicionar sequências de 0 a não ser que existe outro número antes
        000000001 não é possível de ser escrito pelo usário
        100000000 é possível.
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){}
        else{
            painel.setText(textoPainel + "0");
        }
        
        
        
        
    }
    
    public void b00(){
        /*
        Método feito para adicionar 00 na String, porém limitando o usuário a não poder
        adicionar sequências de 00 a não ser que existe outro número antes
        000000001 não é possível de ser escrito pelo usário
        já 100000000 é possível, ao deixar o 0 na ponta esquerda sozinho, ele pode ser substituido por um
        novo número digitado.
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || textoPainel.substring(ultimoEspaco + 1).equals("0")){}
        else if(textoPainel.equals("") || conta.equals("")){
            painel.setText(textoPainel + "0");
        }
        else{
            painel.setText(textoPainel + "00");
        }
        
    }
    
    public void b1(){
        /*
        Método para adicionar o número 1, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "1");
        }
        else{
            painel.setText(textoPainel + "1");
        }
        
        
    }
    
    public void b2(){
        /*
        Método para adicionar o número 2, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "2");
        }
        else{
            painel.setText(textoPainel + "2");
        }
        
    }
    
    public void b3(){
        /*
        Método para adicionar o número 3, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "3");
        }
        else{
            painel.setText(textoPainel + "3");
        }
        
    }
    
    public void b4(){
        /*
        Método para adicionar o número 4, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "4");
        }
        else{
            painel.setText(textoPainel + "4");
        }
        
    }
    
    public void b5(){
        /*
        Método para adicionar o número 5, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "5");
        }
        else{
            painel.setText(textoPainel + "5");
        }
        
    }
    
    public void b6(){
        /*
        Método para adicionar o número 6, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "6");
        }
        else{
            painel.setText(textoPainel + "6");
        }
        
    }
    
    public void b7(){
        /*
        Método para adicionar o número 7, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "7");
        }
        else{
            painel.setText(textoPainel + "7");
        }
        
    }
    
    public void b8(){
        /*
        Método para adicionar o número 8, substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "8");
        }
        else{
            painel.setText(textoPainel + "8");
        }
        
    }
    
    public void b9(){
        /*
        Método para adicionar o número 9,
        substituindo o 0 caso ele esteja na ponta esquerda da expressão que ele se encontra
        */
        textoPainel = painel.getText();
        int ultimoEspaco = textoPainel.lastIndexOf(" ");
        String conta = textoPainel.substring(ultimoEspaco + 1, textoPainel.length());
        if(textoPainel.equals("0") || conta.equals("0")){
            textoPainel = textoPainel.substring(0, textoPainel.length() - 1);
            painel.setText(textoPainel);
            painel.setText(textoPainel + "9");
        }
        else{
            painel.setText(textoPainel + "9");
        }
        
    }

    private void btnMaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyMais();
        painel.requestFocus();
    }//GEN-LAST:event_btnMaisActionPerformed

    private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyEnter();
        painel.requestFocus();
    }//GEN-LAST:event_btnIgualActionPerformed

    private void painelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_painelKeyPressed
        //Abaixo os if´s para captura do teclado para uso dos botões da calculadora por meio de KeyEvent
        
        if(evt.getKeyCode() == evt.VK_ENTER)KeyEnter();
        else if(evt.getKeyCode() == evt.VK_ADD || evt.getKeyCode() == evt.VK_PLUS)KeyMais();
        else if(evt.getKeyCode() == evt.VK_SUBTRACT  || evt.getKeyCode() == evt.VK_MINUS)KeyMenos();
        else if(evt.getKeyCode() == evt.VK_MULTIPLY || evt.getKeyCode() == evt.VK_X)KeyVezes();
        else if(evt.getKeyCode() == evt.VK_DIVIDE || evt.getKeyCode() == evt.VK_D)KeyDivisao();
        else if(evt.getKeyCode() == evt.VK_R || evt.getKeyCode() == evt.VK_R)KeyRaiz();
        else if(evt.getKeyCode() == evt.VK_P || evt.getKeyCode() == evt.VK_P)KeyPotencia();
        else if(evt.getKeyCode() == evt.VK_C || evt.getKeyCode() == evt.VK_C)KeyCE();
        else if(evt.getKeyCode() == evt.VK_LEFT)KeyLeftBtn();
        else if(evt.getKeyCode() == evt.VK_NUMPAD0 || evt.getKeyCode() == KeyEvent.VK_0)b0();
        else if(evt.getKeyCode() == evt.VK_NUMPAD1 || evt.getKeyCode() == KeyEvent.VK_1)b1();
        else if(evt.getKeyCode() == evt.VK_NUMPAD2 || evt.getKeyCode() == KeyEvent.VK_2)b2();
        else if(evt.getKeyCode() == evt.VK_NUMPAD3 || evt.getKeyCode() == KeyEvent.VK_3)b3();
        else if(evt.getKeyCode() == evt.VK_NUMPAD4 || evt.getKeyCode() == KeyEvent.VK_4)b4();
        else if(evt.getKeyCode() == evt.VK_NUMPAD5 || evt.getKeyCode() == KeyEvent.VK_5)b5();
        else if(evt.getKeyCode() == evt.VK_NUMPAD6 || evt.getKeyCode() == KeyEvent.VK_6)b6();
        else if(evt.getKeyCode() == evt.VK_NUMPAD7 || evt.getKeyCode() == KeyEvent.VK_7)b7();
        else if(evt.getKeyCode() == evt.VK_NUMPAD8 || evt.getKeyCode() == KeyEvent.VK_8)b8();
        else if(evt.getKeyCode() == evt.VK_NUMPAD9 || evt.getKeyCode() == KeyEvent.VK_9)b9();
    }//GEN-LAST:event_painelKeyPressed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyRaiz();
        painel.requestFocus();
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyMenos();
        painel.requestFocus();
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnVezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVezesActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyVezes();
        painel.requestFocus();
    }//GEN-LAST:event_btnVezesActionPerformed

    private void btnDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisaoActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyDivisao();
        painel.requestFocus();
    }//GEN-LAST:event_btnDivisaoActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyPotencia();
        painel.requestFocus();
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyCE();
        painel.requestFocus();
    }//GEN-LAST:event_btnCActionPerformed

    private void KeyVirgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KeyVirgulaActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyVirgula();
        painel.requestFocus();
    }//GEN-LAST:event_KeyVirgulaActionPerformed

    private void btnDouble0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDouble0ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b00();
        painel.requestFocus();
    }//GEN-LAST:event_btnDouble0ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b0();
        painel.requestFocus();
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b1();
        painel.requestFocus();
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b2();
        painel.requestFocus();
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b3();
        painel.requestFocus();
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b4();
        painel.requestFocus();
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b5();
        painel.requestFocus();
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b6();
        painel.requestFocus();
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b7();
        painel.requestFocus();
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b8();
        painel.requestFocus();
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        b9();
        painel.requestFocus();
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnLeftDirecionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeftDirecionalActionPerformed
        //Ao clicar no botão, chama o método programado referente a ele e o executa
        KeyLeftBtn();
        painel.requestFocus();
    }//GEN-LAST:event_btnLeftDirecionalActionPerformed

    private void PreferenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreferenciasActionPerformed
        //Abre a janela preferencias ao clicar no botão com texto "preferencias"
        new TelaAtalhosDeTeclado().setVisible(true);
    }//GEN-LAST:event_PreferenciasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Design.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Design().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KeyVirgula;
    private javax.swing.JButton Preferencias;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnDivisao;
    private javax.swing.JButton btnDouble0;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnLeftDirecional;
    private javax.swing.JButton btnMais;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnVezes;
    private javax.swing.JMenuBar menu;
    private javax.swing.JTextField painel;
    // End of variables declaration//GEN-END:variables
}
