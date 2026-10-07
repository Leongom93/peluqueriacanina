
package com.mycompany.peluqueriacanina;

import com.mycompany.peluqueriacanina.igu.Principal;


public class PeluqueriaCanina {

    public static void main(String[] args) {
 
		//Importar Principal porque esta en otro paquete (igu)
		Principal princ = new Principal();
		princ.setVisible(true);
		princ.setLocationRelativeTo(null);
    }
}
