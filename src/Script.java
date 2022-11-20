//Importação dos métodos / classes usados no código

import java.util.ArrayList; // Importação do ArrayList
import javax.swing.JOptionPane; // Importação do "JOP", que será usado para mensagens de erro

public class Script {
    
    ArrayList <String> listaNumerosOperadores = new ArrayList(); // Declaração do ArrayList
    
    String equacao; // Declaração da variavel equacao
    private String respostaEquacao; // Declaração da variavel private "respostaEquacao" que tem seus métodos acessores, Getter e Setter;

    public String getRespostaEquacao() {
        // Método get do "respostaEquacao"
        return respostaEquacao;
    }

    public void setRespostaEquacao(String respostaEquacao) {
        // Método set do "respostaEquacao"
        this.respostaEquacao = respostaEquacao;
    }

    public void ResolverEquacao(String eq){
        
        // Método que adiciona os valores corretamento no ArrayList e resolve as expressões a partir disso
        
        equacao = eq.trim().replaceAll("÷", "/").replaceAll("x", "*").replaceAll(",", ".");
        // Formatar a equacao para existir apenas símbolos que o Java entende para resolver as expressões
        
        while(equacao.contains("  ")){
            // Tratar erro de espaços duplos, tornando a expressão com apenas espaços únicos
            equacao = equacao.replace("  ", " ");
        }
    
        String eqAux = equacao; // variavel auxiliar para ser usada na implementação dos valores no arraylist
         
        while(true){ // Criação do cliclo infinito 
            
            String aux = eqAux.substring(0, 1); // Outra variavel auxiliar, que recebe a primeira posição da String  
            if(aux.equals(" ")){
                // Caso essa posição tiver um espaço em branco, a string é atualizada para ser iniciada a partir da próxima posição
                eqAux = eqAux.substring(1);
            } 
            else{
                // Caso não for um espaço
                int auxProximoEspaco = eqAux.indexOf(" "); // Recebe a posição do próximo espaço existente na String
                
                if(auxProximoEspaco != -1){
                    // Se for diferente de -1 ( ou seja, se tiver um próximo espaço ) 
                    /*
                    A variável auxiliar recebe a String do inico até antes do espaço, assim sendo um necessariamente
                    ou um número, ou um operador
                    */
                    aux = eqAux.substring(0, auxProximoEspaco); 
                }
                
                else{
                    // Caso não existir mais próximo espaço, significa que so resta um número ou operador na String
                    aux = eqAux.substring(0); // A variavel recebe do inicio até o fim da String
                    listaNumerosOperadores.add(aux); // Esse número / operador é adicionado no array
                    break; // Quebra o ciclo infinito, pois não existe mais nada a se adicionar no array
                }
                
                listaNumerosOperadores.add(aux); // a variavel auxiliar é adicionada ao array
                
                if(eqAux.length() != 0){
                    // Teste se ainda existe algum texto na String
                    eqAux = eqAux.substring(auxProximoEspaco + 1); 
                    // Então a variavel "eqAux" é atualizada para começar a partir de depois do próximo espaço até o fim da String
                }
                else break; // Mas caso não tiver mais nada na String, então o ciclo infinito é quebrado
            }
        }
        
        if(listaNumerosOperadores.size() == 1){
            // Se o usuário apenas digitar um número, isso não é uma expressão a ser resolvida, asism exibindo a mensagem de erro
            JOptionPane.showMessageDialog(null, "Essa expressão não é uma conta.");
            listaNumerosOperadores.clear(); // Limpar Array e esperar uma nova entrada do usuário
            
        }else{
            // Abaixo a conta será resolvida na ordem de procedência
            ResolverPotRaiz();
            ResolverMultDiv();        
            ResolverSomas();
            
            
            if(listaNumerosOperadores.isEmpty()){
                // Se o array não tiver nenhum item dentro dele, é adicionado uma String vazia na posição 0, para evitar erros ao dar setText depois
                listaNumerosOperadores.add("");
            }
            
            Design d = new Design(); // Criação do objeto da classe Design
            
            setRespostaEquacao(d.FormatarNumeroNaoDecimal(listaNumerosOperadores.get(0)));
            /*
            A variavel "respostaEquacao" da classe Design ganha o valor formatado da posição 0 do ArrayList, que ao fim das contas, é a resposta da expresão
            */
  
            listaNumerosOperadores.clear(); // ao fim de tudo, o array é limpo, esperando uma nova entrada do usuário
        }
         
        
        
    }
    
    public void TratamentoDeErro(String eq){
        // Método usado para fazer o tratamento de erro da expressão.
        
        if(eq.equals("")){
            // Se a equação estiver vazia de inicio, o array é limpo e a mensagem de erro aparece
            JOptionPane.showMessageDialog(null, "Não existe expressão para fazer a conta!");
            listaNumerosOperadores.clear();
            ResolverEquacao(eq); // Ao retornar uma String vazia para o método "ResolverEquacao", o texto do painel continuará vazio
        }
        else{
            String eqFinal = eq.trim(); // Variavel que recebe o valor da String do parametro
            
        
        eqFinal = eqFinal.replaceAll(" - ", " -"); // Tranformando o sinal de "-" em acompanhamento do número a sua frente
        eqFinal = eqFinal.replaceAll("-", "+ -");
        /*
        Modificando a expressão trocando o "-" por "+ -", para facilitar as contas depois
        */
        
        
        if(eqFinal.startsWith("+ ")){
            /*
            Para o caso do usuário digitar um número negativo de primeira
            como por ex: -4 + 2
            
            Ao substituir o "-" por "+ -" daria erro, então isso é resolvido antes do tratamento geral
            */
            eqFinal = eqFinal.substring(2); // A equação é iniciada a partir de uma posição depois do espaço do "+"
        }
        
        while(eqFinal.contains("- ")){
                // O "- " com espaço é substituido por "-" sem espaços, assim deixando de ser operador, e virando determinação de negativo
                eqFinal = eqFinal.replace("- ", "-");   
            }
        
  
        String tratamentoEq = eqFinal; // variavel auxiliar para tratar os erros]
        
        
        //Substituir todos os operadores por "|" para ter um tratamento de erro mais fácil
        

        tratamentoEq = tratamentoEq.replaceAll("\\+", "|");
        tratamentoEq = tratamentoEq.replaceAll("x", "|");
        tratamentoEq = tratamentoEq.replaceAll("\\*", "|");
        tratamentoEq = tratamentoEq.replaceAll("√", "|");
        tratamentoEq = tratamentoEq.replaceAll(",", "|");
        tratamentoEq = tratamentoEq.replaceAll("\\^", "|");
        
        if(tratamentoEq.startsWith("|")){
            // Se por algum motivo a expressão inicar com um operador por causa de algum bug, a String é atualizada a partir da proxima posição
            tratamentoEq = tratamentoEq.substring(1);
        }
       
        
        
                
        if(tratamentoEq.contains(" |  | ") || tratamentoEq.startsWith("|") || tratamentoEq.endsWith("|") || tratamentoEq.contains(" - ")){
            // Conferindo todas as possibilidades de erro nas expressões, inclusive se existe algum " - " com espaços atrás e na frente.
            JOptionPane.showMessageDialog(null, "Expressão Inválida!");
        }
        else{
            ResolverEquacao(eqFinal); // Com tudo dando certo, a String original é levada para ser resolvida
        }
        }
        
        
        
    }
    
   
    public void ResolverPotRaiz(){
        // Método para resolver a primeira procedência, Radiciação E Potenciação
        
        while(listaNumerosOperadores.contains("√") || listaNumerosOperadores.contains("^")){
            // Equanto existir os sinais de pot e raiz no array, o for será feito
            for(Object ob : listaNumerosOperadores){
            /*
            Conferindo Objeto por objeto procurando se algum deles é uma raiz ou uma potência    
            */
            if(ob.equals("√") || ob.equals("^")){
                if(ob.equals("√")){
                    // Se for uma raiz, o método para a resolver é chamado
                    ResolverRaiz();
                    break; // E o break é ativado para recomeçar a busca no For
                }
                else if(ob.equals("^")){
                    // Se for uma potência, o método para a resolver é chamado
                    ResolverPot();
                    break; // E o break é ativado para recomeçar a busca no For
                    
                    }
                }
            }
        }
        
    }
    
    public void ResolverMultDiv(){
        // Método para resolver a segunda procedência, Multiplicações e Divisões
        while(listaNumerosOperadores.contains("*") || listaNumerosOperadores.contains("/")){
            // Enquanto existirem sinais de mult e div no array, as contas serão realizadas
            for(Object ob : listaNumerosOperadores){
                /*
                Verificando Objeto por objeto no array, ele compara com os sinais
                "*" e "/", ao achar qualquer um deles, os métodos para os resolver
                é chamado, assim quebrando o For e voltando pra dentro do While
                */
            if(ob.equals("*") || ob.equals("/")){
                if(ob.equals("*")){
                    ResolverMulti();
                    break;
                }
                else if(ob.equals("/")){
                    ResolverDiv();
                    break;
                    
                    }
                }
            }
        }
        
    }
    
    public void ResolverSomas(){
        /*
        Método para resolver a última ordem de precedência, somando tudo que estiver
        no arrayList, inclusive os números negativos
        */
         while(listaNumerosOperadores.contains("+")){
            // Enquanto existirem sinais de "+" no Array
            for(Object ob : listaNumerosOperadores){
                //O método vai comparar cada objeto dentro do Array para testar a igualdade com o "+"
                if(ob.equals("+")){
                    // Se existir algum "+" no Array, ele vai chamar a função abaixo na primeira ocorrência
                    
                    
                    ResolverMais();
                    break; // Depois de resolver, o break é usado para retornar ao while e sair do for atual
                }
            }
        }
    }
    
    public void atualizarArray(int posAntiga, String novoValor){
        /*
        Método usado ao final dos métodos de calcular uma operação específica.
        Ele é usado para substituir a expressão antiga, de antes do método resol-
        ver a expressão, pela resposta dessa conta.
        
        
        */
       
        listaNumerosOperadores.remove(posAntiga);
        listaNumerosOperadores.remove(posAntiga);
        listaNumerosOperadores.remove(posAntiga - 1);
        listaNumerosOperadores.add(posAntiga - 1, novoValor);
        
    }
    
    public void ResolverPot(){
        int posPot = listaNumerosOperadores.indexOf("^"); // Recebe posição do primeiro sinal de potência
        Object anteriorSinal = listaNumerosOperadores.get(posPot - 1); // Número antes do sinal
        Object posteriorSinal = listaNumerosOperadores.get(posPot + 1); // Número depois do sinal

        double resultadoSinal = Math.pow(Double.parseDouble(String.valueOf(anteriorSinal)),
                Double.parseDouble(String.valueOf(posteriorSinal)));
        /*
        Recebe o resultado da exponenciação usando o método .pow() da classe Math, passando como
        parametros os números declarado acima
        */
        
        String contaNova = String.valueOf(resultadoSinal); // Recebe a String do "resultadoSinal"
                              
                
                
        String contaVelha = String.valueOf(listaNumerosOperadores.get(posPot - 1)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posPot)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posPot + 1));
        //Recebe a String da expressão de exponenciação
       
        
        if(contaVelha.equals("0 ^ 0")){
            //Tratamento de erro, evitando que o usuário faça 0 ^ 0, que é uma expressão indeterminada
            listaNumerosOperadores.clear();
            JOptionPane.showMessageDialog(null, "Expressão Indeterminada, 0 elevado a 0 pode ser qualquer número");
            
        }else{
            equacao = equacao.replace(contaVelha, contaNova); // Atualizar a equação
            atualizarArray(posPot, contaNova); // Atualizar o ArrayList
        }
                    
        
 }
    
     public void ResolverRaiz(){
        int posRaiz = listaNumerosOperadores.indexOf("√"); // Pega a posição do primeiro símbolo de raiz    
        Object anteriorSinal = listaNumerosOperadores.get(posRaiz - 1); // Número do índice da riaz
        Object posteriorSinal = listaNumerosOperadores.get(posRaiz + 1); // Número que será tirado a raiz
        
        String contaVelha = String.valueOf(listaNumerosOperadores.get(posRaiz - 1)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posRaiz)) + " " + 
                            String.valueOf(listaNumerosOperadores.get(posRaiz + 1));
                            // Recebe a String da conta
                            
        double resultadoSinal = Math.pow(Double.parseDouble(String.valueOf(posteriorSinal)),
                (1 / Double.parseDouble(String.valueOf(anteriorSinal))));
        // Recebe o resultado da raiz, elevando o número a 1/x, sendo x o número do indice
 
        String contaNova = String.valueOf(resultadoSinal);
        // Recebe a String da variavel "resultadoSinal"
        
        if(posteriorSinal.equals("0")){
            // Tratamento de erro, para não deixar o usuário tentar usar 0 como índice
            JOptionPane.showMessageDialog(null, "O índice da raiz não pode ser 0.");
            listaNumerosOperadores.clear();
        }else{
            equacao = equacao.replace(contaVelha, contaNova); // Atualizar equação
            atualizarArray(posRaiz, contaNova); // Atualizar Array
        }
                    
        
        
 }
     
      public void ResolverMulti(){
        
        
        int posMulti = listaNumerosOperadores.indexOf("*"); // Recebe a posição do primeiro "*"   
        Object anteriorSinal = listaNumerosOperadores.get(posMulti - 1); // Recebe o número que está antes do sinal
        Object posteriorSinal = listaNumerosOperadores.get(posMulti + 1); // Recebe o número que está depois do sinal
           
        
        String contaVelha = String.valueOf(listaNumerosOperadores.get(posMulti - 1)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posMulti)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posMulti + 1));
        //Recebe a String da conta antes de ser resolvida
        
        
        double resultadoSinal = Double.parseDouble(String.valueOf(anteriorSinal))
                              * Double.parseDouble(String.valueOf(posteriorSinal));
        //Recebe o resultado da multiplicação dos dois números
                

        String contaNova = String.valueOf(resultadoSinal); //Recebe a String do resultado da conta
                    
        equacao = equacao.replace(contaVelha, contaNova); //Atualizar a equação com o resultado da conta
        
        atualizarArray(posMulti, contaNova); //Atualizar o ArrayList com os novos dados
        }
  

    
    
    public void ResolverDiv(){      
        //Método usado para resolver as divisões

        int posDiv = listaNumerosOperadores.indexOf("/"); 
        /*
        Recebe a posição da primeira "/" que 
        encontrar e indica sua posição.
        */
        
        Object anteriorSinal = listaNumerosOperadores.get(posDiv - 1);
        //Recebe o número que está uma posição atrás do sinal, retornando um objeto
        
        
        Object posteriorSinal = listaNumerosOperadores.get(posDiv + 1);
        //Recebe o número que está uma posição depois do sinal, retornando um objeto  
        
        String contaVelha = String.valueOf(listaNumerosOperadores.get(posDiv - 1)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posDiv)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posDiv + 1));
        
        /*
        A variavél "contaVelha" recebe a expressão que foi resolvida em formato de String,
        usando as posições para formar a String
        */
        
        double resultadoSinal = Double.parseDouble(String.valueOf(anteriorSinal))
                              / Double.parseDouble(String.valueOf(posteriorSinal));
        /*
        Resolve a operação de divisão com os números de antes e depois do sinal "/", usando os métodos
        String.valueOf() para tranformar o objeto em String, e o método
        Double.parseDouble() para transformar a String em número, assim tornando
        possível realizar a conta.
        */
 
        
        
        String contaNova = String.valueOf(resultadoSinal);
        //A variável "contaNova" recebe o valor em String da variavel "resultadoSinal"
        
        if(posteriorSinal.equals("0") || (String.valueOf(resultadoSinal).equals("INFINITY"))){ 
            /*
            Esse if testa 2 casos de divisão que não viáveis na calculadora
            0 / 0 que é indeterminado
            e
            x / 0 que é impossível de se resolver, pois não existe divisão por 0
            
            Além de limpar resetar ArrayList para iniciar uma nova expressão
            */
            listaNumerosOperadores.clear();
            JOptionPane.showMessageDialog(null, "Expressão Inválida, confira se "
                    + "não existe um número qualquer sendo dividido por 0 nela.");
            
        }else{
            /*
            A variável "equacao" faz uso do método .replace() para substitui a "contaVelha" pela "contaNova"
            Como na equação por exemplo:
            15 / 5 ser substituido por 3 na equacao
            
            Logo após substituir, o método atualizarArray é chamado para atualizar as informações
            no ArrayList também, assim criando uma nova expressão que será resolvida pela próximas execuções.
            */
            
            equacao = equacao.replace(contaVelha, contaNova);
            atualizarArray(posDiv, contaNova);
        }
                  
    }

    public void ResolverMais(){
        
        int posMais = listaNumerosOperadores.indexOf("+"); // Recebe a posição do primeiro "+"    
        Object anteriorSinal = listaNumerosOperadores.get(posMais - 1); // Recebe o número antecessor ao "+"
        Object posteriorSinal = listaNumerosOperadores.get(posMais + 1); // Recebe o número posterior ao "+"
                
        double resultadoSinal = Double.parseDouble(String.valueOf(anteriorSinal))
                              + Double.parseDouble(String.valueOf(posteriorSinal));
        /*
        "ResultadoSinal" recebe o valor da soma do antecessor e posterior ao sinal de "+"
        */
                
                
        String contaVelha = String.valueOf(listaNumerosOperadores.get(posMais - 1)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posMais)) + " " +
                            String.valueOf(listaNumerosOperadores.get(posMais + 1));
        /*
        "ContaVelha" recebe a String da conta baseado na sua posição no ArrayList
        */
        
        
        String contaNova = String.valueOf(resultadoSinal); // Recebe a String do resultado da conta
                    
        equacao = equacao.replace(contaVelha, contaNova); //  Trocar a conta velha pela nova na equaçãa
        
        atualizarArray(posMais, contaNova); // Atualiza o ArrayList com a conta nova substituindo a velha 
        
        
    }

   
    
    
    
    
    
    
}
