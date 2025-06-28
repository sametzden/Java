import java.util.Scanner;

import abstractClass.Animal;
import abstractClass.Cat;
import abstractClass.Dog;

import inheritance.Manager;
import interfaces.Lamp;
import interfaces.PowerControl;
import interfaces.Tv;
import javaornek1.Company;

public class App {
    
    public static void main(String[] args) throws Exception {
        

        // kullanıcıdan alınan girdi  bizim string bir alt stringi mi
            
        // Scanner scann = new Scanner(System.in);
        // System.out.print("Bir String Girin: ");
        // String stAlinan = scann.nextLine();
        // String st2Alinan = "abcdextuaseqsamert";
        // char[] st = stAlinan.toCharArray();
        // char[] st2 =st2Alinan.toCharArray();   
        // int flag = 1;
        // for(int i = 0; i<=st2.length-st.length;i++){
        //     boolean eslesme = true;
        //     for(int j = 0;j<st.length;j++){
        //         if(st2[i+j]!=st[j])
        //         {
        //             eslesme = false;
        //             break;
        //         }
            
        //     }
        //     if (eslesme) {
        //         flag = 1;
        //         break;
        //     }
        // }
        // System.out.print(flag); 
            
        

        
        /*
        * Bir String veriliyor. Bu stringi tersten yazdıran bir fonksiyon yaz.
        * hello
        * olleh
        */
        // String st = "hello";
        // String ters = "";

        // for(int i = st.length()-1;i>=0;i--){
        //     ters += st.charAt(i);
        // }
       
        // System.out.print(ters);
        
       

        /*Bir tam sayı n veriliyor. n terimli Fibonacci serisini yazdıran bir Java fonksiyonu yaz. */
        // Scanner scan = new Scanner(System.in);
        // System.out.print("Bir Sayi girin: ");
        // int sayi = scan.nextInt();
        // int fb = 0;
        // int fb2 = 1;
        // int temp;
        // for(int i=0;i<sayi;i++){
        //     System.out.print( fb+ "  \t");
        //     temp =fb2;
        //     fb2 = fb2 + fb;
        //     fb = temp;

        //}


        // string bir sayı ifadesini int a cevir

        // String strSayi = "123";
        // int sayi = 0;
        // int onluk = 1;
        // for(int i = strSayi.length()-1;i>=0;i--){
        //     sayi+= (strSayi.charAt(i) -'0')*onluk;
        //     onluk*=10;
        // }
        // System.err.println(sayi+1);




        // try 
        // {
        //     String dosyaYolu = "C:\\Users\\samet\\OneDrive\\Masaüstü\\dosya.txt";

        //     File dosya = new File(dosyaYolu);
        //     Scanner scanner = new Scanner(dosya);
        //     scanner.useDelimiter(",");

        //     while (scanner.hasNext()) {
        //     String token = scanner.next();
        //     System.out.println(token);
        // }

        // scanner.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("Dosya bulunamadı: " + e.getMessage());
        
        // }


        // ArrayList<String> band = new ArrayList<String>();
        // band.add("Paul");
        // band.add("Pete");
        // band.add("John");
        // band.add("George");
        // System.out.println(band);
        // int location = band.indexOf("Pete");
        // band.remove (location);
        // System.out.println(band);
        // System.out.println("At index 1: " + band.get(1));
        // band.add(2, "Ringo");
        // System.out.println("Size of the band: " + band.size());
        // int index = 0;
        // while (index < band.size())
        // {
        //     System.out.println(band.get(index));
        //     index++;
        // }

        // String takim1 = "Galatasaray";
        // String takim2 = "Galatasaray";
        // int r;    
        // r = takim1.compareTo(takim2);
        // System.out.println(r);
        // boolean b = takim1.equals(takim2);
        // System.out.println(b); 
        // b = takim1 == takim2;
        // System.out.println(b); 

        // Kullanıcıdan üç tam sayı al ve bu sayılardan en kucugu ekrana yazdır
        // System.out.print("3 tane sayi girin:");
        // Scanner scan =new Scanner(System.in);
        // int sayi1 = scan.nextInt();
        // int sayi2 = scan.nextInt();
        // int sayi3 = scan.nextInt();
        // int enkucuk = 0;
        // if(sayi1<sayi2)
        //     if(sayi1<sayi3)
        //         enkucuk = sayi1;
        //     else enkucuk = sayi3;
        // else 
        //     if(sayi2<sayi3)
        //         enkucuk = sayi2;
        //     else enkucuk = sayi3;
        // System.err.println("en kücük "+enkucuk );




        // bir tam sayıyı ters cevir
        //Scanner scanner = new Scanner(System.in);
        // int sayi = scanner.nextInt();
        // 1234
        // int ters =0;
        // while(sayi>0){
        //     int elimizdeki = sayi - (sayi/10) *10;
        //     sayi = sayi /10;
        //     ters = ters *10+ elimizdeki ;
          
        // }
        // System.out.println(ters);


        //Kullanıcıdan bir N sayısı al ve aşağıdaki gibi bir sayı üçgeni çizdir.
        // Her satırda o satır numarasına kadar sayılar yazılacak
        // Scanner scanner = new Scanner(System.in);
        // int sayi = scanner.nextInt();

        // for(int i =1; i<=sayi; i++)
        // {
        //     for(int j =1; j<=i;j++)
        //     {
        //         System.out.print(j+ " ");
        //     }
        //     System.err.println("");
        // }



        //Kullanıcıdan bir N sayısı al ve
        // Fibonacci serisinin ilk N terimini ekrana yazdır. Fibonacci serisi şu şekilde başlar: 0, 1, 1, 2, 3, 5, 8..
        // int n = scanner.nextInt();
        // int a = 0;
        // int b = 1;
        // int temp =0;
        // for(int i = 0; i<n;i++)
        // {   
        //     System.out.println(a + " ");
        //     temp = b;
        //     b = a+ b;
        //     a= temp;
        // }


        //-------------------------------FİNAL-------------------------------


        // Student st1 = new Student("samet",21);
        // st1.printInfo();
        

        // kapsülleme
        // BankAccount ba = new BankAccount();
        // ba.deposit(10000);
        // double balance =ba.getBalance();
        // System.out.println("current balance " + balance);
        // ba.setOwnerName("samet");
        // System.out.println("ownername " + ba.getOwnerName());
        // ba.withdraw(12000);
        // ba.withdraw(5000);
        // System.out.println("current balance " + ba.getBalance());

        //kalıtım

        // employee üst sınıf manager alt sınıf 
        // her manager bir employee ama her employee bir manager değil

        // Employee e1 = new Employee("calisan",1000);
        // e1.printInfo();

        // Employee e2 = new Manager("manager1", 1500, "cs");
        // e2.printInfo(); 
        // // burda e2 employee olarak tanımlansa da managerdan üretiliyor 



        // abstact class

        // Animal[] animals = {
        //     new Dog("pati"),
        //     new Cat("minik")

        // };
        
        // for(Animal a: animals){
        //     a.printName();
        //     a.makeSound();
        // }


        // interfaces


        // PowerControl[] devices = {
        //     new Tv(),
        //     new Lamp()
        // };

        // for (PowerControl d : devices) {
        //     d.turnOn();
        //     d.turnOf();
        // }


        //------javaörnek1-----
        // Company company = new Company();
        // company.addEmployee(0,new javaornek1.Employee("samet", 22, 1000) );
        // company.addEmployee(1,new javaornek1.Employee("x", 25, 1000) );
        // company.addEmployee(2,new javaornek1.Employee("y", 27, 2123) );
        // company.addEmployee(3,new javaornek1.Employee("z", 29, 7000) );
        // company.addEmployee(4,new javaornek1.Employee("q", 52, 500) );

        // int totalSalary = company.calculateTotalSalary(company.getEmployees());
        // System.out.println(totalSalary);

        // javaornek1.Employee oldest = company.findOldestEmployee(company.getEmployees());
        // System.out.println(oldest.getAge());
        // System.out.println(oldest.getName());
    }
 
}