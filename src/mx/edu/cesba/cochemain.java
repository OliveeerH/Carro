package mx.edu.cesba;

import javax.swing.JOptionPane;

public class cochemain {
    private int modelo;
     private String matricula;
     private String marca;
     private boolean electrico;

    
    public void imprimircoche()
    {
        
        JOptionPane.showMessageDialog(null,"Modelo: " + modelo);
        JOptionPane.showMessageDialog(null,"Matricula: " + matricula);
        JOptionPane.showMessageDialog(null,"Marca: " + marca);
        //JOptionPane.showMessageDialog(null,"Es electrico: " + electrico);

   }

    public void setmodelo(int modelo)
    {
        if (modelo>=1970 && modelo<2024)
        {
            this.modelo=modelo;
            JOptionPane.showMessageDialog(null,"El modelo es: " + modelo + " SI es eectrico");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El modelo es: " + modelo + " NO es electrico");           
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
}

    
    
    
    
    
    
}
