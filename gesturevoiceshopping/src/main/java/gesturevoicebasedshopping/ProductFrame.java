/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesturevoicebasedshopping;


import java.awt.Color;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;


public class ProductFrame extends javax.swing.JFrame {
    public static int count=1;
    public static String pname="phone";
    public static String pdname="Apple iPhone 11 Red";
    public static String path="/mobile1.jpg";
    public static String pdetails="<html><b>Price</b>: ₹54,900.00<br/><b>Model Name</b>: IPhone 11 64GB Red"
                 + "<br/><b>Wireless Carrier</b>: Unlocked for All Carriers<br/><b>Brand</b>: Apple"
                 + "<br/><b>Memory Storage Capacity</b>: 64 GB</html>";
    public static JButton bt2 = new JButton();

    /**
     * Creates new form StoreFrame
     */
    public ProductFrame() {
        initComponents();
         jLabel3.setHorizontalAlignment(JLabel.CENTER);
         jLabel3.setSize(300, 400);
         jButton2.setOpaque(false);       
         jLabel4.setText(pdname);
         jLabel3.setIcon(resizeIcon(path));
         jLabel5.setText(pdetails);
                 
         if(pname.equals("phone"))
             jButton3.setVisible(false);
         if(pname.equals("watch"))
             jButton1.setVisible(false);
         
         
         
        
                                   
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rightarrow.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 204, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("More Info");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/leftarrow.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 204, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(23, 23, 23)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tenor.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addContainerGap(219, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(299, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(368, 368, 368))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        productDetails();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    void productDetails()
    {
        
           
          if(count==1)
          {
           
            ProductDetailsFrame.path1="/mobile1.jpg";
            ProductDetailsFrame.path2="/mobile2.jpg";
            ProductDetailsFrame.path3="/mobile3.jpg";
            ProductDetailsFrame.path4="/mobile4.jpg";
            ProductDetailsFrame.pdname="Apple iPhone 11 Red";
            ProductDetailsFrame.price="₹54,900.00";
            String details="<html><b>About this item</b>"+"<br/><b>Price</b>: ₹54,900.00"
                    + "<br/>6.1-inch (15.5 cm diagonal) Super Retina XDR display<br/>Ceramic Shield, tougher than any smartphone glass"
                 + "<br/>A14 Bionic chip, the fastest chip ever in a smartphone<br/>12MP TrueDepth front camera with Night mode, 4K Dolby Vision HDR recording"
                 + "<br/>Industry-leading IP68 water resistance</html>";
            ProductDetailsFrame.pdetails=details;
            ProductDetailsFrame.pname="phone";
            
            
          
          }
          else if(count==2)
          {
            pname=pname.trim();
            ProductDetailsFrame.path1="/tv1.jpg";
            ProductDetailsFrame.path2="/tv2.jpg";
            ProductDetailsFrame.path3="/tv3.jpg";
            ProductDetailsFrame.path4="/tv4.jpg";
            ProductDetailsFrame.pdname="Sony W830 HD LED TV";
            ProductDetailsFrame.price="₹33,279.00";
            String details="<html><b>About this item</b>"+"<br/><b>Price</b>: ₹33,279.00"
                    + "<br/>Resolution: HD Ready (1366x768) | Refresh Rate: 60 hertz"
                    + "<br/>Smart TV Features: Android TV | Voice Search | Google Play |"
                 + "<br/>Warranty Information: 1 year warranty"
                    + "<br/>Display: X Reality Pro | HDR | Live Colour Display | Motionflow XR100"
                 + "<br/>Sound : 20 Watts Output | Clear Phase | Dolby Audio</html>";
            ProductDetailsFrame.pdetails=details;
            ProductDetailsFrame.pname="tv";
          
          }
           else if(count==3)
          {
            pname=pname.trim();
            ProductDetailsFrame.path1="/camera1.jpg";
            ProductDetailsFrame.path2="/camera2.jpg";
            ProductDetailsFrame.path3="/camera3.jpg";
            ProductDetailsFrame.path4="/camera4.jpg";
            ProductDetailsFrame.pdname="Sony Handycam";
            ProductDetailsFrame.price="₹33,279.00";
            String details="<html><b>About this item</b>"+"<br/><b>Price</b>: ₹33,279.00"
                    + "<br/>ZEISS lens(26.8mm) 20x optical zoom in 4K, 30x Clear Image Zoom in 4K"
                    + "<br/>3.0\" LCD (Touch panel), EVF, Wi-Fi/NFC, manual ring, night shot, 4K Time-lapse capture"
                 + "<br/>1 Lithium ion batteries required"
                    + "<br/>Operating Guide, Power Cord, Micro USB Cable,"
                 + "<br/>MPEG4-AVC/H.264, AVCHD format ver. 2.0</html>";
            ProductDetailsFrame.pdetails=details;
            ProductDetailsFrame.pname="camera";
          
          }
          else if(count==4)
          {
            pname=pname.trim();
            ProductDetailsFrame.path1="/wmachine1.jpg";
            ProductDetailsFrame.path2="/wmachine2.jpg";
            ProductDetailsFrame.path3="/wmachine3.jpg";
            ProductDetailsFrame.path4="/wmachine4.jpg";
            ProductDetailsFrame.pdname="LG Washing Machine";
            ProductDetailsFrame.price="₹11,490.00";
            String details="<html><b>About this item</b>"+"<br/><b>Price</b>: ₹11,490.00"
                    + "<br/>Semi-automatic washing Machine: Economical, Low water"
                    + "<br/>Capacity 7.0 kg (wash): Suitable for families with 3 to 4 members"
                 + "<br/>5 Star: Best in class efficiency"
                    + "<br/>Manufacturer Warranty: 2 Years Comprehensive & 5 years on Motor T&C"
                 + "<br/>1300 RPM: higher spin speeds helps in faster drying</html>";
            ProductDetailsFrame.pdetails=details;
            ProductDetailsFrame.pname="wmachine";
          
          }
           else if(count==5)
          {
            pname=pname.trim();
            ProductDetailsFrame.path1="/watch1.jpg";
            ProductDetailsFrame.path2="/watch2.jpg";
            ProductDetailsFrame.path3="/watch3.jpg";
            ProductDetailsFrame.path4="/watch4.jpg";
            ProductDetailsFrame.pdname="Skagen Men's Watch";
            ProductDetailsFrame.price="₹11,490.00";
            String details="<html><b>About this item</b>"+"<br/><b>Price</b>: ₹9,796.00"
                    + "<br/>Dial Color: Black, Case Shape: Round, Dial Glass Material: Mineral"
                    + "<br/>Band Color: Black, Band Material: Stainless Steel"
                 + "<br/>Watch Movement Type: Quartz, Watch Display Type: Analog"
                    + "<br/>Case Material: Stainless Steel, Case Diameter: 40 millimeters"
                 + "<br/>Water Resistance Depth: 30 meters, Fold-Over Clasp with Safety</html>";
            ProductDetailsFrame.pdetails=details;
            ProductDetailsFrame.pname="watch";
          
          }
            this.dispose();
            ProductDetailsFrame pf = new ProductDetailsFrame();
            ObjectKeeper.obpd=pf;
            pf.setVisible(true);
            pf.setExtendedState(MAXIMIZED_BOTH);
            pf.getContentPane().setBackground(Color.WHITE);
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:                
            funNext();
         
    }//GEN-LAST:event_jButton1ActionPerformed

    public void funNext()
    {
        if(count==1)
        {
          
         DataKeeper.player.close();
         
         jLabel4.setText("Sony W830 HD LED TV");
         jLabel3.setIcon(resizeIcon("/tv1.jpg"));
         String str="<html><b>Price</b>: ₹33,279.00"
                    + "<br/>Resolution: HD Ready (1366x768) | Refresh Rate: 60 hertz"
                    + "<br/>Smart TV Features: Android TV | Voice Search | Google Play |"
                 + "<br/>Warranty Information: 1 year warranty"
                    + "<br/>Display: X Reality Pro | HDR | Live Colour Display | Motionflow XR100"
                 + "<br/>Sound : 20 Watts Output | Clear Phase | Dolby Audio</html>";
         
         count++;
         jLabel5.setText(str);
         jButton3.setVisible(true);
         
         Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//sony.mp3"); 
        }
    },1000); 
            
        timer.cancel();
               
        }   
        
         else if(count==2)
        {
                    
         jLabel4.setText("Sony Handycam");
         jLabel3.setIcon(resizeIcon("/camera1.jpg"));
         String str="<html><b>Price</b>: ₹33,279.00<br/><b>Model Name</b>: HDRCX405"
                 + "<br/><b>Brand</b>: Sony"
                 + "<br/><b>Video Capture Resolution</b>: 1920 x 1080"
                 + "<br/><b>Connectivity Technology</b>: USB</html>";
         
         count++;
         jLabel5.setText(str);
         jButton3.setVisible(true);
         
         Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//camera.mp3"); 
        }
    },1000); 
            
        timer.cancel();
                 
        } 
        else if(count==3)
        {
                    
         jLabel4.setText("LG Washing Machine");
         jLabel3.setIcon(resizeIcon("/wmachine1.jpg"));
         String str="<html><b>Price</b>: ₹11,490.00<br/><b>Model Name</b>: P7020NGAZ"
                 + "<br/><b>Brand</b>: LG"
                 + "<br/><b>Colour</b>: Dark Gray"
                 + "<br/><b>Capacity</b>: 7 Kilograms</html>";
         
         count++;
         jLabel5.setText(str);
         jButton3.setVisible(true);
         
         Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//machine.mp3"); 
        }
    },1000); 
            
        timer.cancel();
                  
        } 
         else if(count==4)
        {
                    
         jLabel4.setText("Skagen Men's Watch");
         jLabel3.setIcon(resizeIcon("/watch1.jpg"));
         String str="<html><b>Price</b>: ₹9,796.00<br/><b>Model Name</b>: SKW6472"
                 + "<br/><b>Brand</b>: Skagen"
                 + "<br/><b>Colour</b>: Black"
                 + "<br/><b>Warranty</b>: 2 years</html>";
         
         count++;
         jLabel5.setText(str);
         jButton3.setVisible(true);
         jButton1.setVisible(false);
          //  System.out.println("count: "+count);
          Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//watch.mp3"); 
        }
    },1000); 
            
        timer.cancel();
         
        } 
        
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        funPrevious();
       
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

    void funPrevious()
    {
         if(count==5)
        {
         jLabel4.setText("LG Washing Machine");
         jLabel3.setIcon(resizeIcon("/wmachine1.jpg"));
         String str="<html><b>Price</b>: ₹11,490.00<br/><b>Model Name</b>: P7020NGAZ"
                 + "<br/><b>Brand</b>: LG"
                 + "<br/><b>Colour</b>: Dark Gray"
                 + "<br/><b>Capacity</b>: 7 Kilograms</html>";
         jLabel5.setText(str);
         jButton1.setVisible(true);
         count--;
         Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//machine.mp3"); 
        }
    },1000); 
            
        timer.cancel();
         
           
        }
        else if(count==4)
        {
         jLabel4.setText("Sony Handycam");
         jLabel3.setIcon(resizeIcon("/camera1.jpg"));
         String str="<html><b>Price</b>: ₹33,279.00<br/><b>Model Name</b>: HDRCX405"
                 + "<br/><b>Brand</b>: Sony"
                 + "<br/><b>Video Capture Resolution</b>: 1920 x 1080"
                 + "<br/><b>Connectivity Technology</b>: USB</html>";
         jLabel5.setText(str);
         jButton1.setVisible(true);
         count--;
         
         Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//camera.mp3"); 
        }
    },1000); 
            
        timer.cancel();
         
           
        }
        else if(count==3)
        {
         jLabel4.setText("Sony W830 HD LED TV");
         jLabel3.setIcon(resizeIcon("/tv1.jpg"));
         String str="<html><b>Price</b>: ₹33,279.00"
                    + "<br/>Resolution: HD Ready (1366x768) | Refresh Rate: 60 hertz"
                    + "<br/>Smart TV Features: Android TV | Voice Search | Google Play |"
                 + "<br/>Warranty Information: 1 year warranty"
                    + "<br/>Display: X Reality Pro | HDR | Live Colour Display | Motionflow XR100"
                 + "<br/>Sound : 20 Watts Output | Clear Phase | Dolby Audio</html>";
         jLabel5.setText(str);
         jButton1.setVisible(true);
         count--;
         
         Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//sony.mp3"); 
        }
    },1000); 
            
        timer.cancel();
         
           
        }
        else if(count==2)
        {
         
         jLabel4.setText("Apple iPhone 11 Red");
         jLabel3.setIcon(resizeIcon("/mobile1.jpg"));
         String str="<html><b>Price</b>: ₹54,900.00<br/><b>Model Name</b>: IPhone 11 64GB Red"
                 + "<br/><b>Wireless Carrier</b>: Unlocked for All Carriers<br/><b>Brand</b>: Apple"
                 + "<br/><b>Memory Storage Capacity</b>: 64 GB</html>";
         jLabel5.setText(str);
         jButton1.setVisible(true);
         jButton3.setVisible(false);
         count--;
         Timer timer = new Timer();
            new java.util.Timer().schedule(new TimerTask(){
        @Override
        public void run() {
            new PlayAudio().playAudio("C://botvoice//phone.mp3"); 
        }
    },1000); 
            
        timer.cancel();
        
            
        }
        
    }
    ImageIcon resizeIcon(String path)
    {
        ImageIcon icon=new ImageIcon (getClass().getResource(path));
        Image image = icon.getImage().getScaledInstance(150, 200, Image.SCALE_DEFAULT); // transform it 
        icon = new ImageIcon(image);
        return icon;
        
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}