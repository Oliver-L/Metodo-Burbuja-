/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author HP
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public class Auto {
        private String placa;
    private double velAct;
    private double velMax;
    private double velMin;
    private boolean estado;
    private double gasMax;
    private double gasMin;
    private double aceiteMax;
    private double aceiteMin;
    
    public Auto(){
        this.placa="RD1234";
        this.velAct=0;
        this.velMax=150;
        this.velMin=0;
        this.gasMax=20;
        this.gasMin=0;
        this.aceiteMax=1;
        this.aceiteMin=0;
        this.estado=false;
    }
    
    public void setPlaca(String placa){
        this.placa=placa;
    }
    
    public void setVelAct(double velAct){
        this.velAct=velAct;
    }
    
    public void setVelMAx(double velMax){
        this.velMax=velMax;
    }
    
    public void setvelMin(double velMin){
        this.velMin=velMin;
    }
    
    public void setEstado(boolean estado){
        this.estado=estado;
    }
    
    public void setGasMAx(double gasMax){
        this.gasMax=gasMax;
    }
    public void setGasMin(double gasMin){
        this.gasMin=gasMin;
    }
    public void setaceiteMAx(double aceiteMax){
        this.aceiteMax=aceiteMax;
    }
    public void setaceiteMin(double aceiteMin){
        this.aceiteMin=aceiteMin;
    }
    
    public String getPlaca(){
        return(this.placa);
    }
    
    public double getVelAct(){
        return (this.velAct);
    }
    
    public double getvelMax(){
        return(this.velMax);
    }
    
    public double getvelMin(){
        return (this.velMin);
    }
    
    public boolean getestado(){
        return(this.estado);
    }
    public double getgasMax(){
        return(this.gasMax);
    }
    public double getgasMin(){
        return(this.gasMin);
    }
    public double getaceiteMax(){
        return(this.aceiteMax);
    }
    public double getaceiteMin(){
        return(this.aceiteMin);
    }
    
        }

        
