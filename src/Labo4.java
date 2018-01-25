
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;





public class Labo4 extends JFrame {

	private JPanel contentPane;
	private JPanel panelCentre;
	private JTextField txMax;
	private JTextField txtQtite;
	private ArrayList<De> tabDes; 
	private JButton btnRecalculer;
	private JButton  btnGo;
	int width=105;
	int height=103;
	int positionX=50;
	int positionY=20;	
	//PanelPhoto panelPhoto= new PanelPhoto();
	private String nomPhoto;
	private JLabel lblResult;

	public Labo4() {

		super("affichage des des");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		tabDes= new ArrayList<De>();
		buildGiu();
		setSize(500,300);
		setVisible(true);
	}

	private void buildGiu() {

		contentPane=new JPanel();
		contentPane.setLayout(new BorderLayout());
		JPanel panelNord= new JPanel();
		panelNord.setLayout(new FlowLayout());
		this.setContentPane(contentPane);
		JLabel lblMax = new JLabel("Max");
		txMax= new JTextField("");
		txMax.setColumns(10);;
		btnGo= new JButton("GO");
		JLabel lblQtite = new JLabel("Qtite");
		lblQtite.setBounds(253, 41, 57, 14);
		txtQtite= new JTextField("");
		txtQtite.setColumns(10);
		btnRecalculer= new JButton("Recalculer");
		panelNord.add(lblMax);
		panelNord.add(txMax);
		panelNord.add(btnGo);
		panelNord.add(lblQtite);
		panelNord.add(txtQtite);
		panelNord.add(btnRecalculer);
		contentPane.add(panelNord, BorderLayout.NORTH);
		panelCentre= new JPanel();
		//panelCentre.setPreferredSize(new Dimension(5000, 1000));
		panelCentre.setLayout(null);
		JScrollPane scroll = new JScrollPane(panelCentre);
		this.add(scroll,BorderLayout.CENTER);
		lblResult=new  JLabel("");
		contentPane.add(lblResult,BorderLayout.SOUTH);
		//lblResult.setVisible(false);
		btnGo.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {


				try {
					int qte=Integer.parseInt(txtQtite.getText());
					panelCentre.removeAll();
					panelCentre.setPreferredSize(new Dimension(5000, qte * 120) );
					display();
					panelCentre.repaint();
					if(qte>0){
						calculPoint(qte);
					} else {
						JOptionPane.showMessageDialog(Labo4.this,"entrer un nombre positive");
					}

				} catch (IOException e1) {
					e1.printStackTrace();
				}catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(Labo4.this,"entrer un nombre entier svp");
				}

			}



		});

		btnRecalculer.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				
				try {
					int qte=Integer.parseInt(txtQtite.getText());
					panelCentre.removeAll();
					panelCentre.setPreferredSize(new Dimension(5000, qte * 120) );
					display();
					panelCentre.repaint();
					if(qte>0){
						calculPoint(qte);
					} else {
						JOptionPane.showMessageDialog(Labo4.this,"entrer un nombre positive");
					}

				} catch (IOException e1) {
					e1.printStackTrace();
				}
				catch(NumberFormatException ex){
					JOptionPane.showMessageDialog(Labo4.this,"entrer un nombre entier svp");
				}
				for (int i=0;i<tabDes.size();i++) {
					tabDes.remove(i);
				}
				
			}

		});
	}


	public static void main(String[] args) {
		new Labo4();
	}
	private void display() throws IOException{
		int width=105;
		int height=106;
		int positionX=50;
		int positionY=20;
		int qte=Integer.parseInt(txtQtite.getText());
		int max=Integer.parseInt(txMax.getText());
		for (int i=0; i<qte;i++){

			tabDes.add(new De(max));
			File f= new File("resources");
			String images[]=f.list();
			//System.out.println(images[0]);
			PanelPhoto panelPhotoDe1= new PanelPhoto();
			nomPhoto=tabDes.get(i).getNomPicture();
			BufferedImage bi=ImageIO.read(new File("resources/"+nomPhoto));
			panelPhotoDe1.setBi(bi);
			switch (nomPhoto){
			case "Des_1.png":
				int count=0;
				panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				count++;
				if (count>1){
					positionX+=20+width;
					panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				}
				panelCentre.add(panelPhotoDe1);
				break;

			case "Des_2.png":

				positionX +=width+20;
				int count2=0;
				panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				count2++;
				if (count2>1){
					positionX+=20+width;
					panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				}
				panelCentre.add(panelPhotoDe1);
				break;

			case "Des_3.png":

				positionX +=width+20;
				int count3=0;
				panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				count3++;
				if (count3>1){
					positionX+=20+width;
					panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				}
				panelCentre.add(panelPhotoDe1);
				break;

			case "Des_4.png":
				positionX =50;
				positionY +=height+20;
				int count4=0;
				panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				count4++;
				if (count4>1){
					positionY+=20+height;
					panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				}
				panelCentre.add(panelPhotoDe1);
				break;
				//panelPhotoDe1.repaint();

			case "Des_5.png":
				positionX+=width+20;
				panelPhotoDe1.setBounds(positionX, positionY, 105, 103);
				int count5=0;
				panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				count5++;
				if (count5>1){
					positionX+=20+width;;
					panelPhotoDe1.setBounds(positionX,positionY , 105, 103);
				}
				panelCentre.add(panelPhotoDe1);
				break;

			case "Des_6.png":  

				positionY+=width+20;
				int count6=0;
				panelPhotoDe1.setBounds(positionX,positionY , 106, 103);
				count6++;
				if (count6>1){
					positionY+=width+20;
					panelPhotoDe1.setBounds(positionX,positionY , 106, 103);
				}
				panelCentre.add(panelPhotoDe1);
				break;
				//panelPhotoDe1.repaint();

			default:
				JOptionPane.showMessageDialog(null,"photo inexistante");

			}
		}

	}



	public void calculPoint(int qte) {
		int s=0;
		for (int i=0;i<qte;i++) {
			s+=tabDes.get(i).getChiffre();

		}

		int moy= (int)s/qte;
		lblResult.setText("Points gagnés est:"+moy+"pts"+ " (Qui est la moyenne des faces:)"+s+("/")+qte+"="+moy+">>>>"+moy+"pts");

	}
}

