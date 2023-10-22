/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5;

/**
 *
 * @author zaqiah ahmad
 */
public class MainPresiden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Presiden calon = new Presiden();
    
    calon.SetPresiden("Prabowo");
    calon.SetSuara("Sensor");
    
    System.out.println("Presiden = " + calon.GetPresiden());
    System.out.println("hasil suara = " + calon.GetSuara());
    }
    
}
