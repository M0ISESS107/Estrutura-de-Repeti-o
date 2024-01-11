import javax.swing.*;
public class tabuada {

    public static void main(String[] args) 
    {
      //variaveis globais
      int tabuada,resuntado,numero=0;
      char op;
      String msg,msgentr;
      
      msgentr=" digite 1 para tabuada com for.\n digite 2 pra while.\n digite 3 para Do while";
      msg="";
      //entrada de dados
      tabuada=Integer.parseInt( JOptionPane.showInputDialog("escreva um numero para a tabuada"));
      op=JOptionPane.showInputDialog(msgentr).charAt(0);
      
      //processamento
        switch(op)
        {
        case '1':
         { msg="tabuada do "+tabuada+" pela estrutura for.\n";           
           for(int n=0; n<=10; n+=1)
           {
             resuntado=tabuada*n;
              msg=msg+tabuada+"X"+n+"="+resuntado+"\n";
           }
          break; 
         }
        case '2':
           {
               msg="tabuada do "+tabuada+" pela estrutura while.\n";
            while(numero<=10)
            {
                resuntado= tabuada*numero;
              msg=msg+tabuada+"X"+numero+"="+resuntado+"\n";  
              numero+=1;
            }
            break;
           }
        case '3':
           { msg="tabuada do "+tabuada+" pela estrutura do/while.\n";
               
            do{
              resuntado= tabuada*numero;
            msg=msg+tabuada+"X"+numero+"="+resuntado+"\n";
            numero+=1;
              } while(numero<=10);     
               break;
           }
        default: JOptionPane.showMessageDialog (null,"por favor escolha uma das opções");
        }
    //saida de dados
    JOptionPane.showMessageDialog(null,msg);
    
         System.exit(0);      
       }
    }
    

