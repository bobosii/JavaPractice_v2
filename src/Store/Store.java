package Store;

import java.lang.reflect.Array;
import java.util.*;

public class Store {
    Set<Brand> brands;
    ArrayList<Product> products;
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

    public void listMenu(Set<Brand> brands){
        for (Brand brand: brands){
            System.out.println("- " + brand.getName());
        }
    }
}
