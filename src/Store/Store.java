package Store;

import java.lang.reflect.Array;
import java.util.*;

public class Store {
    Set<Brand> brands;
    ArrayList<CellPhone> cellPhones;
    ArrayList<Notebook> notebooks;
    public void store(){
        brands = new TreeSet<>(Comparator.comparing(Brand::getName));
        cellPhones = new ArrayList<>();
        notebooks = new ArrayList<>();
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
            int selectPhoneProcess;
            int selectNotebookProcess;
            switch (select){
                case 1:
                    listAddOrRemove();
                    selectNotebookProcess = inp.nextInt();
                    switch (selectNotebookProcess){
                        case 1:
                            listNotebooks(notebooks);
                            break;
                        case 2:
                            addNotebook(notebooks);
                            break;
                        case 3:
                            System.out.println("Notebook silme işlemi");
                            removeItemNotebook(notebooks);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Lütfen doğru seçim yapınız !");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Cep telefonu işlemleri");
                    listAddOrRemove();
                    selectPhoneProcess = inp.nextInt();
                    switch (selectPhoneProcess){
                        case 1:
                            listCellPhones(cellPhones);
                            break;
                        case 2:
                            addCellPhone(cellPhones);
                            break;
                        case 3:
                            System.out.println("Ürün silme işlemleri");
                            removeItemCellPhone(cellPhones);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Lütfen doğru seçimi yapınız");
                            break;
                    }
                    break;
                case 3:
                    listBrands(brands);
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
    public void removeItemNotebook(ArrayList<Notebook> notebooks){
        listNotebooks(notebooks);
        Scanner inp = new Scanner(System.in);
        System.out.print("Silmek istediğiniz Notebook'un ID'sini giriniz : ");
        int wantRemoveId = inp.nextInt();
        inp.nextLine();
        System.out.println("Silmek istediğiniz ürün --->");
        System.out.println(notebooks.get(wantRemoveId-1));
        System.out.println("Silmek istediğinize emin misiniz E/H");
        String choice = inp.nextLine().toUpperCase();
        inp.nextLine();
        if (choice.equals("E")){
            notebooks.remove(wantRemoveId-1);
            System.out.println("Ürün başarıyla silindi !!");
            for (int i = wantRemoveId - 1; i < notebooks.size(); i++) {
                notebooks.get(i).setId(i + 1);
            }
        }else if(choice.equals("H")) {
            System.out.println("Ürün silinmedi !!!");
        }else {
            System.out.println("Doğru seçim yapmadınız !!!");
        }
    }

    public void removeItemCellPhone(ArrayList<CellPhone> cellPhones){
        listCellPhones(cellPhones);
        Scanner inp = new Scanner(System.in);
        System.out.print("Silmek istediğiniz telefonun ID'sini giriniz : ");
        int wantRemoveId = inp.nextInt();
        inp.nextLine();
        System.out.println("Silmek istediğiniz ürün --->");
        System.out.println(cellPhones.get(wantRemoveId-1));
        System.out.println("Silmek istediğinize emin misiniz E/H");
        String choice = inp.nextLine().toUpperCase();
        inp.nextLine();
        if (choice.equals("E")){
            cellPhones.remove(wantRemoveId-1);
            System.out.println("Ürün başarıyla silindi !!");
            for (int i = wantRemoveId - 1; i < cellPhones.size(); i++) {
                cellPhones.get(i).setId(i + 1);
            }
        }else if(choice.equals("H")) {
            System.out.println("Ürün silinmedi !!!");
        }else {
            System.out.println("Doğru seçim yapmadınız !!!");
        }

    }


    public void listAddOrRemove(){
        System.out.println("1- Ürünleri listele");
        System.out.println("2- Ürün ekle");
        System.out.println("3- Ürün sil");
        System.out.println("0- Çıkış");
    }


    public void listNotebooks(ArrayList<Notebook> notebooks){
        System.out.println("Notebooklar listeleniyor...");
        for (Notebook notebook: notebooks){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("ID : "+ notebook.getId() +", İsim : " +notebook.getBrand().getName()+ " " +notebook.getName() +
                    ", Fiyat : " + notebook.getPrice() + " TL"+ ", Marka : " + notebook.getBrand().getName()
                    + ", Ekran : " + notebook.getScreenSize() +
                    ", Ram : " + notebook.getRam() + " GB");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    public void listCellPhones(ArrayList<CellPhone> cellPhones){
        System.out.println("Telefonlar listeleniyor..");
        for (CellPhone cellPhone: cellPhones){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("ID : "+ cellPhone.getId() +", İsim : " +cellPhone.getBrand().getName()+ " " +cellPhone.getName() +
                    ", Fiyat : " + cellPhone.getPrice() + " TL" + ", Marka : " + cellPhone.getBrand().getName() + ", Depolama : " + cellPhone.getMemory() + " GB"
            + ", Ekran : " + cellPhone.getScreenSize() + ", Pil : " + cellPhone.getBatteryCapacity() +
                    ", Ram : " + cellPhone.getRam() +" GB" +", Renk : " + cellPhone.getColor());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
    public void addCellPhone(ArrayList<CellPhone> cellPhones){
        Scanner inp = new Scanner(System.in);
        System.out.print("Telefon adını giriniz : ");
        String selectedName = inp.nextLine();
        System.out.print("Ürünün fiyatını giriniz : ");
        int selectedPrice = inp.nextInt();
        inp.nextLine();
        System.out.print("Ürünün depolama kapasitesini giriniz : ");
        String selectedMemory = inp.nextLine();
        System.out.print("Ürünün ekran boyutlarını giriniz : ");
        String selectedScreenSize = inp.nextLine();
        System.out.print("Ürünün pil kapasitesini giriniz : ");
        int selectedBatteryCapacity = inp.nextInt();
        inp.nextLine();
        System.out.print("Ürünün Ram kapasitesini giriniz : ");
        String selectedRam = inp.nextLine();
        System.out.print("Ürünün rengini giriniz : ");
        String selectedColor = inp.nextLine();
        System.out.print("Ürünün indirim miktarını giriniz : ");
        int selectedDiscount = inp.nextInt();
        inp.nextLine();
        System.out.print("Ürünün stok miktarını giriniz : ");
        int selectedStock = inp.nextInt();
        inp.nextLine();
        System.out.println("Marka ID'si: ");
        listBrandsWithId(brands);
        System.out.println("Marka ID'si seçiniz ");
        int brandId = inp.nextInt();
        // Seçilen markayı bul
        Brand selectedBrand = null;
        for (Brand brand : brands) {
            if (brand.getId() == brandId) {
                selectedBrand = brand;
                break;
            }
        }
        if (selectedBrand == null) {
            System.out.println("Geçersiz marka ID'si. Cep telefonu eklenemedi.");
        }else {
            CellPhone newPhone = new CellPhone(selectedName,selectedBrand,selectedPrice,selectedDiscount,selectedStock,selectedScreenSize,selectedRam,selectedColor,selectedBatteryCapacity,selectedMemory);
            cellPhones.add(newPhone);
        }
    }
    public void addNotebook(ArrayList<Notebook> notebooks){
        Scanner inp = new Scanner(System.in);
        System.out.print("Ürünün adını giriniz : ");
        String selectedName = inp.nextLine();
        System.out.print("Ürünün fiyatını giriniz : ");
        int selectedPrice = inp.nextInt();
        inp.nextLine();
        System.out.print("Ürünün ekran boyutlarını giriniz : ");
        String selectedScreenSize = inp.nextLine();
        System.out.print("Ürünün Ram kapasitesini giriniz : ");
        String selectedRam = inp.nextLine();
        System.out.print("Ürünün indirim miktarını giriniz : ");
        int selectedDiscount = inp.nextInt();
        inp.nextLine();
        System.out.print("Ürünün stok miktarını giriniz : ");
        int selectedStock = inp.nextInt();
        inp.nextLine();
        System.out.println("Marka ID'si: ");
        listBrandsWithId(brands);
        System.out.println("Marka ID'si seçiniz ");
        int brandId = inp.nextInt();
        // Seçilen markayı bul
        Brand selectedBrand = null;
        for (Brand brand : brands) {
            if (brand.getId() == brandId) {
                selectedBrand = brand;
                break;
            }
        }
        if (selectedBrand == null) {
            System.out.println("Geçersiz marka ID'si. Cep telefonu eklenemedi.");
        }else {
            Notebook newNotebook = new Notebook(selectedName,selectedBrand,selectedPrice,selectedDiscount,selectedStock,selectedScreenSize,selectedRam);
            notebooks.add(newNotebook);
        }
    }


    public void listBrands(Set<Brand> brands){
        for (Brand brand: brands){
            System.out.println("- " + brand.getName());
        }
    }
    public void listBrandsWithId(Set<Brand> brands){
        for (Brand brand: brands){
            System.out.println("-" + brand.getId() + " " + brand.getName());
        }
    }
}
