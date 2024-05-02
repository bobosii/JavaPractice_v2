package Store;

import java.lang.reflect.Array;
import java.util.*;

public class Store {
    Set<Brand> brands;
    ArrayList<CellPhone> cellPhones;
    ArrayList<Notebook> notebooks;
    public void store(){
        brands = new TreeSet<>(Comparator.comparing(Brand::getName));
        Brand samsung = new Brand("Samsung");
        Brand lenovo = new Brand("Lenovo");
        Brand apple = new Brand("Apple");
        Brand huawei = new Brand("Huawei");
        Brand casper = new Brand("Casper");
        Brand asus = new Brand("Asus");
        Brand hp = new Brand("HP");
        Brand xiaomi = new Brand("Xiaomi");
        Brand monster = new Brand("Monster");
        brands.add(samsung);
        brands.add(lenovo);
        brands.add(apple);
        brands.add(huawei);
        brands.add(casper);
        brands.add(asus);
        brands.add(hp);
        brands.add(xiaomi);
        brands.add(monster);

        CellPhone iphone = new CellPhone("İphone 11",apple,7379,
                0,1,"6.1",
                "8 GB","Mavi", 4000,"64 GB");

        CellPhone galaxy = new CellPhone("Galaxy A51",samsung,3199,
                0,1,"6.5",
                "6 GB","Siyah",4000,"128 GB");

        CellPhone redmi = new CellPhone("Redmi Note 10 Pro 8GB",xiaomi,4012,
                0,1,"6.5","12 GB",
                "Beyaz",4000,"128 GB");

        Notebook mateBook = new Notebook("Matebook 14",huawei,7000,0,1,"14.0","16 GB");
        Notebook v14IGL = new Notebook("V14 IGL",lenovo,3699,0,1,"14.0","14");
        Notebook tufGaming = new Notebook("Tuf Gaming",asus,8199,0,1,"15.6","15.6 GB");

        cellPhones.add(iphone);
        cellPhones.add(galaxy);
        cellPhones.add(redmi);
        notebooks.add(mateBook);
        notebooks.add(v14IGL);
        notebooks.add(tufGaming);
    }


    public void menu(){
        Scanner inp = new Scanner(System.in);
        boolean cont = true;
        store();

        while (cont){
            System.out.println("Mağazaya hoş geldiniz");
            System.out.println("1- Notebook işlemleri");
            System.out.println("2- Cep telefonu işlemleri");
            System.out.println("3- Markaları listele");
            System.out.println("0- Çıkış");
            int select = inp.nextInt();
            switch (select){
                case 1:
                    System.out.println("Notebook işlemleri");
                    break;
                case 2:
                    System.out.println("Cep telefonu işlemleri");
                    break;
                case 3:
                    listMenu(brands);
                    break;
                case 0:
                    System.out.println("Tekrar bekleriz <3");
                    cont = false;
                    break;
                default:
                    System.out.println("Lütfen doğru seçim yapınız.");
                    break;
            }
        }

    }

    public void listCellPhones(ArrayList<CellPhone> cellPhones){
        System.out.println("Telefonlar listeleniyor..");
        for (CellPhone cellPhone: cellPhones){
            System.out.println(cellPhone.getName() + ", "  ); //  Continue this think.
        }
    }


    public void listMenu(Set<Brand> brands){
        for (Brand brand: brands){
            System.out.println("- " + brand.getName());
        }
    }
}
