/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package single.queue.simulator;

/**
 *
 * @author Syifa Laili
 */
public class singlequeueconsole {
    int Tmax, I, t[], S[];
    
    public singlequeueconsole() {
        this.I = 10;
        this.t = new int[]{4, 10, 13, 19, 20, 29, 31, 34, 43, 47};
        this.S = new int[]{3, 5, 6, 4, 7, 3, 6, 7, 2, 6};
        this.Tmax = 50;
    }
    
    public static void main(String[] args) {
        //make chart
        singlequeueconsole X = new singlequeueconsole();
        int indexT = 1;
        int indexB = 1;
        int indexC = 1;
        int indexS = 0;
        int remain = 99;
        int[] a = new int[X.Tmax];
        int q = 0;
        int work = 1;
        for(int i = 0; i < X.Tmax; i++){
            a[i] = 0;
        }
        for(int i = 0; i < X.I; i++){
            a[X.t[i]] = 1;
        }
        
        int[] n = new int[58];
        for(int i = 0; i < X.Tmax; i++){
            if(a[i] == 1){
                q++;
                System.out.println(i+"\t"+"t"+indexT+"\t"+q);
                indexT++;
            }
            if(remain == 0){
                work = 1;
                q--;
                System.out.println(i+"\t"+"c"+indexC+"\t"+q);
                indexC++;
            }
            if(work == 1 && q!=0){
                System.out.println(i+"\t"+"b"+indexB+"\t"+q);
                work = 0;
                remain = X.S[indexS];
                indexB++;
                indexS++;
            }
            remain--;
            n[i] = q;
        }
        int j = 50;
        while(q != 0){
            if(remain == 0){
                work = 1;
                q--;
                System.out.println(j+"\t"+"c"+indexC+"\t"+q);
                indexC++;
            }
            if(work == 1 && q!=0){
                System.out.println(j+"\t"+"b"+indexB+"\t"+q);
                work = 0;
                remain = X.S[indexS];
                indexB++;
                indexS++;
            }
            remain--;
            j++;
            n[j] = q;
        }

        //find nbar
        int sigmaN = 0;
        for(int i = 0; i < 58; i++){
            sigmaN = sigmaN + n[i];
        }
        double nbar = (double)sigmaN/(double)56;
        System.out.println("\nRata-rata jumlah kastemer dalam sistem adalah " + nbar);
        
        //find wbar
        double wbar = (double)sigmaN/(double)10;
        System.out.println("\nRata-rata waktu sebuah kastemer dalam sistem adalah " + wbar);
    }
}
