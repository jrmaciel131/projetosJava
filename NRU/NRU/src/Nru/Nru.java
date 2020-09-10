package Nru;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jrmac
 */
public class Nru {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o numero de paginas.");
        int pag = sc.nextInt();
        int m[][] = new int[pag][4];

        atribuirValor(m, pag);//atribuir valores
        organiza(m, pag);//organizar valores
        print(m, pag);//printar
        pag = NRU(m, pag);//MRU remover menos usada recentemente
        print(m, pag);

    }

    public static void print(int m[][], int pag) {
        System.out.println("    Pagina    ||    Referenciado    ||    Modificado");
        for (int i = 0; i <= pag - 1; i++) {
            System.out.println("      " + m[i][0] + "                  " + m[i][1] + "                    " + m[i][2]);
        }
    }

    public static void organiza(int m[][], int pag) {
        for (int j = 0; j < pag - 1; j++) {
            for (int i = 0; i < pag - 1; i++) {
                if (m[i + 1][3] < m[i][3]) {
                    int aux[] = new int[4];
                    aux[0] = m[i][0];
                    aux[1] = m[i][1];
                    aux[2] = m[i][2];
                    aux[3] = m[i][3];
                    m[i][0] = m[i + 1][0];
                    m[i][1] = m[i + 1][1];
                    m[i][2] = m[i + 1][2];
                    m[i][3] = m[i + 1][3];
                    m[i + 1][0] = aux[0];
                    m[i + 1][1] = aux[1];
                    m[i + 1][2] = aux[2];
                    m[i + 1][3] = aux[3];
                }
            }
        }
    }

    public static void atribuirValor(int m[][], int pag) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < pag; i++) {
            System.out.println("Entre com o valor de classificação da pagina " + (i + 1) + "\n0- não referenciado | não modificado "
                    + "\n1- não referenciado | modificado\n2- referenciado     | não modificado\n3- referenciado     | modificado");
            int aux = sc.nextInt();
            switch (aux) {
                case 0:
                    m[i][0] = i + 1;//numero da pagina
                    m[i][1] = 0;//referenciado
                    m[i][2] = 0;//modificado
                    m[i][3] = 4;//variavel de controle
                    break;
                case 1:
                    m[i][0] = i + 1;
                    m[i][1] = 0;
                    m[i][2] = 1;
                    m[i][3] = 2;
                    break;
                case 2:
                    m[i][0] = i + 1;
                    m[i][1] = 1;
                    m[i][2] = 0;
                    m[i][3] = 1;
                    break;
                case 3:
                    m[i][0] = i + 1;
                    m[i][1] = 1;
                    m[i][2] = 1;
                    m[i][3] = 0;
                    break;
                default:
                    System.out.println("Operação invalida atribuindo Não referenciada | não modificada");
                    m[i][0] = i + 1;
                    m[i][1] = 0;
                    m[i][2] = 0;
                    m[i][3] = 4;
                    break;
            }
        }
        sc.close();
    }

    public static int NRU(int m[][], int pag) {
        System.out.println("Removendo não usada recentemente");
        m[pag - 1][0] = 0;
        m[pag - 1][1] = 0;
        m[pag - 1][2] = 0;
        m[pag - 1][3] = 0;
        pag--;
        return pag;
    }

}
