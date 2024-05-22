/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelHewan;
import java.util.List;
/**
 *
 * @author BIMA
 */
interface interfaceDAOhewan {
    public void insert(modelHewan hewan);
    public void update(modelHewan hewan);
    public void delete(int id);
    
    public List<modelHewan>getAll();

    public boolean hapusData(String id);
}
