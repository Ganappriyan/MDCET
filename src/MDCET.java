import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MDCET1 extends Frame implements ActionListener{
    TextField tf;
    String name,ph_no,e_mail,designation,path;
    Button next, mdcet, close, department, faculty, update, back, cse, ece, eee, afsal, pranov, sharan;
    Label l1,l2,l3,l4,l5,l6,l7,l8;
    MDCET1(){
        tf=new TextField();
        tf.setBounds(160,140,150,20);
        mdcet =new Button("MDCET");
        mdcet.setBounds(200,200,70,30);
        next =new Button("NEXT");
        next.setBounds(200,240,70,20);
        close =new Button("CLOSE");
        close.setBounds(300,300,70,30);
        mdcet.addActionListener(this);
        next.addActionListener(this);
        close.addActionListener(this);
        add(mdcet);
        add(close);
        setSize(500,500);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        add(tf);
        tf.setSize(160,20);
        tf.setFont(null);
        if(e.getSource()== mdcet){
            tf.setText("Welcome to M.D.COLLEGE");
            mdcet.setVisible(false);
            add(next);
        }else if(e.getSource()== next){
            tf.setVisible(false);
            next.setVisible(false);
            close.setBounds(400,410,40,20);
            Option();
        }else if(e.getSource()==department){
            department.setVisible(false);
            faculty.setVisible(false);
            update.setVisible(false);
            Department();
        }
        else if(e.getSource()==faculty){
            department.setVisible(false);
            faculty.setVisible(false);
            update.setVisible(false);
            Faculty();
        }
        else if(e.getSource()==update){
            department.setVisible(false);
            faculty.setVisible(false);
            update.setVisible(false);
            Update();
        }else if(e.getSource()== afsal){
            afsal.setVisible(false);
            pranov.setVisible(false);
            sharan.setVisible(false);
            name="AFSAL";
            ph_no="9012345678";
            e_mail="afsal123@gmail.com";
            designation="PROFESSOR";
            path="D:output.jpg";
            new Resume().main(name,ph_no,e_mail,designation,path);
        }else if(e.getSource()== pranov){
            afsal.setVisible(false);
            pranov.setVisible(false);
            sharan.setVisible(false);
            name="PRANOV";
            ph_no="8765432109";
            e_mail="pranov123@gmail.com";
            designation="PROFESSOR";
            path="D:input.jpg";
            new Resume().main(name,ph_no,e_mail,designation,path);
        }else if(e.getSource()== sharan){
            afsal.setVisible(false);
            pranov.setVisible(false);
            sharan.setVisible(false);
            name="SHARAN";
            ph_no="9876543210";
            e_mail="sharan123@gmail.com";
            designation="PROFESSOR";
            path="D:output.jpg";
            new Resume().main(name,ph_no,e_mail,designation,path);
        }else if(e.getSource()== close){
            setVisible(false);
        }
    }
    void Option(){
        department = new Button("Department");
        department.setBounds(200,100,70,30);
        back = new Button("Back");
        back.setBounds(450,410,40,20);
        faculty = new Button("Faculty");
        faculty.setBounds(200,150,70,30);
        update = new Button("Updates");
        update.setBounds(200,200,70,30);
        department.addActionListener(this);
        faculty.addActionListener(this);
        update.addActionListener(this);
        back.addActionListener(this);
        add(department);
        add(faculty);
        add(update);
        add(back);
    }
    void Department() {
        cse = new Button("CSE");
        cse.setBounds(200, 100, 70, 30);
        ece = new Button("ECE");
        ece.setBounds(200, 150, 70, 30);
        eee = new Button("EEE");
        eee.setBounds(200, 200, 70, 30);
        back.addActionListener(this);
        add(cse);
        add(ece);
        add(eee);
        add(back);
    }
    void Faculty(){
        afsal = new Button("Afsal");
        afsal.setBounds(200, 100, 70, 30);
        pranov = new Button("Pranov");
        pranov.setBounds(200, 150, 70, 30);
        sharan = new Button("Sharan");
        sharan.setBounds(200, 200, 70, 30);
        afsal.addActionListener(this);
        pranov.addActionListener(this);
        sharan.addActionListener(this);
        add(afsal);
        add(pranov);
        add(sharan);
    }
    void Update(){
        l1 = new Label("--> Ganappriyan got the greatest imposter of the year award 2020");
        l1.setBounds(20, 40, 500, 20);
        l2 = new Label("--> Arunachalam got the best crewmate of the year award 2020");
        l2.setBounds(20, 80, 500, 20);
        l3 = new Label("--> The Maker's Clan won the war against China's CORONA clan");
        l3.setBounds(20, 120, 500, 20);
        l4 = new Label("--> Hari Prakash got the Laziest student of the year awardn 2020");
        l4.setBounds(20, 160, 500, 20);
        l5 = new Label("--> In war Marker clan got 86 stars in that Ganappriyan and Dhinesh got 80 Stars");
        l5.setBounds(20, 200, 500, 20);
        l6 = new Label("--> Ganappriyan got the best youtuber award 2020");
        l6.setBounds(20, 240, 500, 20);
        l7 = new Label("--> Dhinesh got Best Mini Miltia Player award 2020");
        l7.setBounds(20, 280, 450, 20);
        l8 = new Label("--> Arun kumar got Best Singer award 2020");
        l8.setBounds(20, 320, 450, 20);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);

    }
    public static void main(String[] args){
        new MDCET1();
    }
}
class Resume extends Canvas {
    String Name,  Ph_no,  E_mail,  Designation,  Path;
    void main(String name, String ph_no, String e_mail, String designation, String path){
        Name= name;
        Ph_no=ph_no;
        E_mail=e_mail;
        Designation = designation;
        Path=path;
        new Resume1().main(name,ph_no,e_mail,designation,path);
    }
}
class Resume1 extends Resume{
    public void paint(Graphics g) {
        Toolkit t=Toolkit.getDefaultToolkit();
        Image i=t.getImage(Path);
        g.drawImage(i,70,70,110,110,this);
    }
    void main(String name, String ph_no, String e_mail, String designation, String path){
        JFrame f = new JFrame();
        Resume1 m = new Resume1();
        Label l1 = new Label("NAME-->"+name);
        l1.setBounds(200, 70, 200, 20);
        Label l2 = new Label("PH.NO-->"+ph_no);
        l2.setBounds(200, 110, 200, 20);
        Label l3 = new Label("E-MAIL-->"+e_mail);
        l3.setBounds(200, 140, 200, 20);
        Label l4 = new Label("DESIGNATION-->"+designation);
        l4.setBounds(200, 170, 200, 20);
        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(m);
        f.setSize(500,300);
        f.setVisible(true);
    }
}