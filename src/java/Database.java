import java.sql.*;

public class Database {
    static Connection cn;
    static Statement stmnt;
    static String URL="jdbc:mysql://localhost:3306/";
    static String username="root";
    static String pass="123456";
    public static void main(String args[]){
        String imac="21.5-inch (diagonal) LED-backlit display with IPS technology.1920x1080 resolution with support for millions of colours";
        String imr="The new iMac with Retina 5K display doesn’t stop with an amazing screen. With a quad-core Intel Core processor available at up to 4.0GHz, the latest AMD graphics, an advanced Fusion Drive, and Thunderbolt 2, there’s a very powerful Mac behind all those pixels.";
        String imm="Mac mini makes everyday tasks a breeze with fourth-generation Intel Core processors, a flash storage option that’s up to 50 per cent faster and wireless performance up to three times quicker than its predecessor. With Intel Iris Graphics or Intel HD Graphics 5000, it also delivers graphics performance up to 90 per cent faster than the previous generation. And with great connectivity features like Thunderbolt 2 and support for HDTV, Mac mini makes the perfect centrepiece to any setup.";
        String ma="11.6-inch (diagonal) LED-backlit glossy widescreen display with support for millions of colours.Supported resolutions:\n" +
                    "1366x768 (native), 1344x756 and 1280x720 pixels at 16:9 aspect ratio; 1152x720 and 1024x640 pixels at 16:10 aspect ratio; 1024x768 and 800x600 pixels at 4:3 aspect ratio";
        String mp="Display: 13.3-inch (diagonal) LED-backlit glossy widescreen display\n" +
                    "with support for millions of colours\n" +
                    "\n" +
                    "Supported resolutions: 1280x800 (native), 1152x720, 1024x640 and 800x500 pixels at 16:10 aspect ratio; 1024x768, 800x600 and 640x480 pixels at 4:3 aspect ratio; 1024x768, 800x600 and 640x480 pixels at 4:3 aspect ratio stretched; 720x480 pixels at 3:2 aspect ratio; 720x480 pixels at 3:2 aspect ratio stretched";
        String ipfs="Iphone 4s are the best in all parts whether it is camera performance design-anything specs. Display 3.50-inch - retina display - saffire glass Processor 800MHz - apple a5 Front Camera 0.3-megapixel Resolution 640x960 pixels RAM 512MB OS iOS 6.1.3 - upgradable to ios 7 Storage 16GB - non expandable Rear Camera 8-megapixel Battery capacity 1430mAh.Good camera good performance goood aluminum body";
        String ipfv="Iphone 5 are the best in all parts whether it is camera performance design-anything specs. Display 3.50-inch - retina display - saffire glass Processor 800MHz - apple a5 Front Camera 0.3-megapixel Resolution 640x960 pixels RAM 512MB OS iOS 6.1.3 - upgradable to ios 7 Storage 16GB - non expandable Rear Camera 8-megapixel Battery capacity 1430mAh.Good camera good performance goood aluminum body";
        String ipfvs="Height: 123.8 mm (4.87 inches)\n" +
                        "Width: 58.6 mm (2.31 inches)\n" +
                        "Depth: 7.6 mm (0.30 inches)\n" +
                        "Weight: 112 grams (3.95 ounces)\n"+
                        "Retina display\n" +
                       "4-inch (diagonal) LED-backlit widescreen Multi‑Touch display with IPS technology\n" +
                        "1136x640-pixel resolution at 326 ppi\n" +
                        "800:1 contrast ratio (typical)\n" +
                        "500 cd/m2 max brightness (typical).";
        String ips="New 8-megapixel iSight camera with 1.5µ pixels\n" +
                    "\n" +
                    "Autofocus with Focus Pixels\n" +
                    "\n" +
                    "ƒ/2.2 aperture\n" +
                    "\n" +
                    "Optical image stabilisation (iPhone 6 Plus only)\n" +
                    "\n" +
                    "True Tone flash\n" +
                    "\n" +
                    "Five-element lens\n" +
                    "\n" +
                    "Hybrid IR filter\n" +
                    "\n" +
                    "Backside illumination sensor\n" +
                    "\n" +
                    "Sapphire crystal lens cover\n" +
                    "\n" +
                    "Auto image stabilisation\n" +
                    "\n" +
                    "Auto HDR for photos\n" +
                    "\n" +
                    "Improved face detection\n" +
                    "\n" +
                    "Exposure control\n" +
                    "\n" +
                    "Panorama (up to 43 megapixels)\n" +
                    "\n" +
                    "Burst mode\n" +
                    "\n" +
                    "Tap to focus\n" +
                    "\n" +
                    "Photo geotagging\n" +
                    "\n" +
                    "Timer mode\n"+
                    "4.7-inch (diagonal) LED-backlit widescreen Multi‑Touch display with IPS technology\n" +
                    "\n" +
                    "1334x750-pixel resolution at 326 ppi\n" +
                    "\n" +
                    "1400:1 contrast ratio (typical)";
        String ip="5MP photos\n" +
                    "Autofocus\n" +
                    "Face detection\n" +
                    "Backside illumination\n" +
                    "Five-element lens\n" +
                    "Hybrid IR filter\n" +
                    "ƒ/2.4 aperture\n" +
                    "Tap to focus video or still images\n" +
                    "Tap to control exposure for video or still images\n" +
                    "Photo and video geotagging\n" +
                    "HDR photos\n" +
                    "Panorama\n"+"Retina display\n" +
                    "\n" +
                    "9.7-inch (diagonal) LED-backlit Multi-Touch display with IPS technology\n" +
                    "2048x1536 resolution at 264 pixels per inch (ppi)\n" +
                    "Fingerprint-resistant oleophobic coating";
        String ipat="8MP iSight camera\n" +
                    "Autofocus\n" +
                    "ƒ/2.4 aperture\n" +
                    "Five-element lens\n" +
                    "Hybrid IR ﬁlter\n" +
                    "Backside illumination\n" +
                    "Improved face detection\n" +
                    "Exposure control\n" +
                    "Panorama (up to 43MP)\n" +
                    "Burst mode\n" +
                    "Tap to focus\n" +
                    "Photo geotagging\n" +
                    "Timer mode\n"+"Retina display\n" +
                    "\n" +
                    "9.7-inch (diagonal) LED-backlit widescreen Multi-Touch display with IPS technology\n" +
                    "2048-by-1536-pixel resolution at 264 ppi\n" +
                    "Fingerprint-resistant oleophobic coating\n" +
                    "Fully laminated display\n" +
                    "Antireflective coating";
        String ipm="7.9-inch (diagonal) LED‑backlit Multi‑Touch display with IPS technology\n" +
                    "1024x768 resolution at 163 pixels per inch (ppi)\n" +
                    "Fingerprint-resistant oleophobic coating";
        String ipmt="Retina display\n" +
                    "7.9-inch (diagonal) LED‑backlit Multi‑Touch display with IPS technology\n" +
                    "2048x1536 resolution at 326 pixels per inch (ppi)\n" +
                    "Fingerprint-resistant oleophobic coating";
        String ipmth="Retina display\n" +
                    "7.9-inch (diagonal) LED‑backlit Multi‑Touch display with IPS technology\n" +
                    "2048x1536 resolution at 326 pixels per inch (ppi)\n" +
                    "Fingerprint-resistant oleophobic coating";
        String ipt="AirPlay mirroring and video out to Apple TV (2nd and 3rd generation)\n" +
                    "Video mirroring and video out support: up to 1080p through Lightning Digital AV Adapter and Lightning to VGA Adapter (adapters sold separately)\n" +
                    "H.264 video up to 1080p, 30 frames per second, Main Profile level 4.1 with AAC-LC audio up to 160 Kbps, 48kHz, stereo audio in .m4v, .mp4 and .mov file formats\n" +
                    "MPEG-4 video up to 2.5 Mbps, 640x480 pixels, 30 frames per second, Simple Profile with AAC-LC audio up to 160 Kbps per channel, 48kHz, stereo audio in .m4v, .mp4 and .mov file formats\n" +
                    "Motion JPEG (M-JPEG) up to 35 Mbps, 1280x720 pixels, 30 frames per second, audio in ulaw, PCM stereo audio in .avi file format\n"+"Frequency response: 20Hz to 20,000Hz\n" +
                    "Audio formats supported: AAC (8 to 320 Kbps), Protected AAC (from iTunes Store), HE‑AAC, MP3 (8 to 320 Kbps), MP3 VBR, Audible (formats 2, 3, 4, Audible Enhanced Audio, AAX and AAX+), Apple Lossless, AIFF and WAV\n" +
                    "User-configurable maximum volume limit";
        String ipn="H.264 video: 720x576 pixels, 30 frames per second; Baseline, Main and High-Profile level 3.0 with AAC-LC audio up to 256 Kbps; 48kHz; stereo audio in .m4v, .mp4 and .mov file formats\n" +
                    "MPEG-4 video: up to 2.5 Mbps, 720x576 pixels, 30 frames per second; Simple Profile with AAC-LC audio up to 256 Kbps; 48kHz; stereo audio in .m4v, .mp4 and .mov file formats"+"Frequency response: 20Hz to 20,000Hz\n" +
                    "Audio formats supported: AAC (8 to 320 Kbps), Protected AAC (from iTunes Store), HE-AAC, MP3 (8 to 320 Kbps), MP3 VBR, Audible (formats 2, 3, 4, Audible Enhanced Audio, AAX and AAX+), Apple Lossless, AIFF and WAV\n" +
                    "User-configurable maximum volume limit";
        String ipsh="Frequency response: 20Hz to 20,000Hz\n" +
                    "Audio formats supported: AAC (8 to 320 Kbps), Protected AAC (from iTunes Store), MP3 (8 to 320 Kbps), MP3 VBR, Audible (formats 2, 3, 4, Audible Enhanced Audio, AAX and AAX+), Apple Lossless, AIFF and WAV";
        
        try{
            Class.forName("com.mysql.jdbc.driver");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try{
            cn= DriverManager.getConnection(URL,username,pass);
            stmnt=cn.createStatement();
            stmnt.execute("CREATE DATABASE onlineproject");//; is needed only on command line
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        try{
            stmnt.execute("USE onlineproject");
            stmnt.execute(" CREATE TABLE customer( c_id INT(5) PRIMARY KEY AUTO_INCREMENT,c_name VARCHAR(30),c_no INT(30),c_email VARCHAR(50),c_pass VARCHAR(30),c_cpass VARCHAR(30),c_amt INT(20)) ");
            stmnt.execute("CREATE TABLE address(c_id INT(5),line1 VARCHAR(50),line2 VARCHAR(50),city VARCHAR(20),state VARCHAR(20),pin INT(10),FOREIGN KEY(c_id) references customer(c_id) ON UPDATE CASCADE ON DELETE CASCADE)");
            stmnt.execute("CREATE TABLE items(i_id INT(5) PRIMARY KEY AUTO_INCREMENT,i_name VARCHAR(30),avail INT(10),price INT(15),specs VARCHAR(2000),img VARCHAR(100),acc VARCHAR(50))");
            stmnt.execute("CREATE TABLE cart(cart_id INT(5) PRIMARY KEY AUTO_INCREMENT,prod VARCHAR(25),price INT(10),c_id INT(5),i_id INT(5),FOREIGN KEY(c_id) references customer(c_id) ON UPDATE CASCADE ON DELETE CASCADE,FOREIGN KEY(i_id) references items(i_id) ON UPDATE CASCADE ON DELETE CASCADE)");
            stmnt.execute("CREATE TABLE orders(or_no INT(5) PRIMARY KEY AUTO_INCREMENT,time VARCHAR(30),product VARCHAR(30),price INT(10),c_id INT(5),FOREIGN KEY(c_id) references customer(c_id) ON UPDATE CASCADE ON DELETE CASCADE)");
            stmnt.execute("CREATE TABLE ratings(time VARCHAR(20),comments VARCHAR(200),c_id INT(5),i_id INT(5),FOREIGN KEY(c_id) references customer(c_id) ON UPDATE CASCADE ON DELETE CASCADE,FOREIGN KEY(i_id) references items(i_id) ON UPDATE CASCADE ON DELETE CASCADE)");
            stmnt.execute("CREATE TABLE log(id INT,name VARCHAR(40))");
            stmnt.executeUpdate("INSERT INTO log VALUES(1,'')");
            stmnt.execute("CREATE TABLE iflag(id INT,item INT)");
            stmnt.executeUpdate("INSERT INTO iflag VALUES(1,0)");
            
        }catch(SQLException exep){
            System.out.println(exep.getMessage());
        }
        try{
            stmnt.executeUpdate("INSERT INTO items VALUES(1,'iMAC',20,80000,'"+imac+"','img/dbms_images/imac/imac.png','Magic mouse and Wireless keyboard')");
            stmnt.executeUpdate("INSERT INTO items VALUES(2,'iMAC Retina',20,120000,'"+imr+"','img/dbms_images/imac/imacretina.png','Magic mouse and Wireless keyboard')");
            stmnt.executeUpdate("INSERT INTO items VALUES(3,'iMAC Mini',20,49900,'"+imm+"','img/dbms_images/imac/imacmini.png','Magic mouse and Wireless keyboard')");
            stmnt.executeUpdate("INSERT INTO items VALUES(4,'Macbook Air',20,58900,'"+ma+"','img/dbms_images/macbook/macbook_air.png','Magic mouse and Wireless keyboard')");
            stmnt.executeUpdate("INSERT INTO items VALUES(5,'Macbook Pro',20,66100,'"+mp+"','img/dbms_images/macbook/macbook_pro-13-15.jpg','Magic mouse and Wireless keyboard')");
            stmnt.executeUpdate("INSERT INTO items VALUES(6,'iPhone 4s',20,32500,'"+ipfs+"','img/dbms_images/iphone/4sall.jpg','iPhone leather case')");
            stmnt.executeUpdate("INSERT INTO items VALUES(7,'iPhone 5',20,42490,'"+ipfv+"','img/dbms_images/iphone/5sall.jpg','iPhone leather case')");
            stmnt.executeUpdate("INSERT INTO items VALUES(8,'iPhone 5s',20,50000,'"+ipfvs+"','img/dbms_images/iphone/5ssilver.jpg','iPhone leather case')");
            stmnt.executeUpdate("INSERT INTO items VALUES(9,'iPhone 6',20,71500,'"+ips+"','img/dbms_images/iphone/6gold.jpg','iPhone leather case')");
            stmnt.executeUpdate("INSERT INTO items VALUES(10,'iPad Air',20,28900,'"+ip+"','img/dbms_images/ipad/ipadair.jpg','Beats Headphone by Dr. Dre')");
            stmnt.executeUpdate("INSERT INTO items VALUES(11,'iPad Air 2',20,35900,'"+ipat+"','img/dbms_images/ipad/ipadair2.jpg','Beats Headphone by Dr. Dre')");
            stmnt.executeUpdate("INSERT INTO items VALUES(12,'iPad Mini',20,17900,'"+ipm+"','img/dbms_images/ipad/ipadmini.jpeg','Beats Headphone by Dr. Dre')");
            stmnt.executeUpdate("INSERT INTO items VALUES(13,'iPad Mini2',20,21900,'"+ipmt+"','img/dbms_images/ipad/ipadmini2.jpg','Beats Headphone by Dr. Dre')");
            stmnt.executeUpdate("INSERT INTO items VALUES(14,'iPad Mini3',20,28900,'"+ipmth+"','img/dbms_images/ipad/ipadmini3.jpg','Beats Headphone by Dr. Dre')");
            stmnt.executeUpdate("INSERT INTO items VALUES(15,'iPod Shuffle',20,3700,'"+ipsh+"','img/dbms_images/ipod/ipodshuffle.jpg','Beats Earphones by Dr. Dre')");
            stmnt.executeUpdate("INSERT INTO items VALUES(16,'iPod Nano',20,11900,'"+ipn+"','img/dbms_images/ipod/ipodnano.jpeg','Beats Earphones by Dr. Dre')");
            stmnt.executeUpdate("INSERT INTO items VALUES(17,'iPod Touch',20,20900,'"+ipt+"','img/dbms_images/ipod/ipodtouch.jpeg','Beats Earphones by Dr. Dre')");
        }catch(SQLException exept){
            System.out.println(exept.getMessage());
        }
    }
}
