package copiarypegar;
//importar la librería de gráficos
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import javax.swing.*;
//clase CopiarYpegar
public class CopiarYPegar extends JFrame {
    //componente: Texto
    JTextField textCopiar = new JTextField();
    JTextField textPegar = new JTextField();
    //componente: Etiqueta
    JLabel textocopiar = new JLabel();
    JLabel textopegar = new JLabel();
    //componente: Botones, dentro del paréntesis se muestra texto en el botón
    JButton botonCopiar = new JButton("Copiar");
    JButton botonPegar = new JButton("Pegar");
    String texto;      
    //constructor de la clase
    public CopiarYPegar(){
        //titulo de la ventana
        setTitle("Programa Copiar Y Pegar 2024");
        //tamaño en pixeles de la ventana
        setSize(600,500);
        //ubicación de la ventana, queremos que esté en medio
        setLocationRelativeTo(null);
        //cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        textocopiar = new JLabel ("Copiar");
        textopegar = new JLabel ("Pegar");
        textCopiar = new JTextField(10);
        textPegar = new JTextField(10);
        botonCopiar = new JButton("Copiar");
        botonPegar = new JButton("Pegar");
    }
    public void Componentes(CopiarYPegar Ventana){
        Ventana.add(textocopiar);
        Ventana.add(textCopiar);
        Ventana.add(botonCopiar);
        Ventana.add(textopegar);
        Ventana.add(textPegar);
        Ventana.add(botonPegar);
        
        botonPegar.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               btncopiar();
               btnpegar();
            }
            public void btncopiar(){
             texto=textCopiar.getText();
            }
            public void btnpegar(){
            textPegar.setText(texto);
            }
        });
    }    
     //main
    public static void main(String[] args) {
        //mandar llamar a la ventana, instanciarla/crearla
        CopiarYPegar Ventana = new CopiarYPegar();
        Ventana.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
        Ventana.setBackground(Color.yellow);
        Ventana.Componentes(Ventana);
        //mostrar la ventana
        Ventana.setVisible(true);
    } 
}
