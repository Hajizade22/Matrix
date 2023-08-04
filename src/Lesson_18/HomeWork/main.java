package Lesson_18.HomeWork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws InsufficientStockException, NegativeNumberException, InsufficientAmount, NotFound {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Salam online elektronika mağazamıza xoş gəlmişsiniz");

            ShoppingSystem kondisioner1 = new ShoppingSystem(0, "LG", 10, 500);
            ShoppingSystem kondisioner2 = new ShoppingSystem(1, "Samsung", 10, 600);
            ShoppingSystem soyuducu1 = new ShoppingSystem(2, "Vestel", 10, 1000);
            ShoppingSystem soyuducu2 = new ShoppingSystem(3, "Beko", 10, 950);
            ShoppingSystem tv1 = new ShoppingSystem(4, "Sony", 10, 2000);
            ShoppingSystem tv2 = new ShoppingSystem(5, "Shivaki", 10, 1450);
            ShoppingSystem telefon1 = new ShoppingSystem(6, "Samsung", 10, 2500);
            ShoppingSystem telefon2 = new ShoppingSystem(7, "Apple", 10, 3000);

            ShoppingSystem[] electronics = new ShoppingSystem[8];
            electronics[0] = kondisioner1;
            electronics[1] = kondisioner2;
            electronics[2] = soyuducu1;
            electronics[3] = soyuducu2;
            electronics[4] = tv1;
            electronics[5] = tv2;
            electronics[6] = telefon1;
            electronics[7] = telefon2;

            System.out.println("Bazaya daxil olmaq istəyirsinizsə parolu daxil edin");
            String password = scanner.nextLine();
            if (password.equalsIgnoreCase("Java154")) {
                System.out.println("Siz Bazaya daxil oldunuz");
                System.out.println();
                for (ShoppingSystem a : electronics) {
                    System.out.println(a);
                }
                System.out.println();
                System.out.println("Hansı sıra nömrəli məhsulun total dəyərinə baxmaq istəyirsinizsə daxil edin" + "\nQeyd: Sıra nömrələri Array ilə nəzərə alınıb yazılsın");
                System.out.println();
                int mehsul = scanner.nextInt();
                System.out.println("Mehsul № " + mehsul + " total dəyər " + electronics[mehsul].getTotalAmount() + " ₼");
                System.exit(0);
            } else {
                System.out.println("Yalnış parol sizi istifadəçi kimi online mağazaya yönləndiririk");
            }
            System.out.println("Alış etmək istədiyiniz məhsul kateqoriyasını seçin \n 1.Kondisioner \n 2.Soyuducu \n 3.TV \n 4.Telefon");

            int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("Sizə 2  model təklif edə bilərik");
                System.out.println("1.LG\n2.Samsung");
                int secondChoice = scanner.nextInt();
                if (secondChoice == 1) {
                    System.out.println(kondisioner1.getNameOfProduct() + ": Qiymət " + kondisioner1.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > kondisioner1.getQuantity()) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity <= 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= kondisioner1.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (kondisioner1.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (kondisioner1.getPrice() > pay || kondisioner1.getPrice() * quantity > pay) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }

                } else if (secondChoice == 2) {
                    System.out.println(kondisioner2.getNameOfProduct() + ": Qiymət " + kondisioner2.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > kondisioner2.getQuantity()) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity <= 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= kondisioner2.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (kondisioner2.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (kondisioner2.getPrice() > pay || pay < kondisioner2.getPrice() * quantity) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }
                } else {
                    throw new NotFound("Yalnız 1 və 2 daxil edə bilərdiniz");
                }
            } else if (choice == 2) {
                System.out.println("Sizə 2  model təklif edə bilərik");
                System.out.println("1.Vestel\n2.Beko");
                int secondChoice = scanner.nextInt();
                if (secondChoice == 1) {
                    System.out.println(soyuducu1.getNameOfProduct() + ": Qiymət " + soyuducu1.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > soyuducu1.getQuantity()) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity <= 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= soyuducu1.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (soyuducu1.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (soyuducu1.getPrice() > pay || soyuducu1.getPrice() * quantity > pay) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }

                } else if (secondChoice == 2) {
                    System.out.println(soyuducu2.getNameOfProduct() + ": Qiymət " + soyuducu2.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > 10) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity < 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= soyuducu2.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (soyuducu2.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (soyuducu2.getPrice() > pay || pay < soyuducu2.getPrice() * quantity) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }

                } else {
                    throw new NotFound("Yalnız 1 və 2 daxil edə bilərdiniz");
                }
            } else if (choice == 3) {
                System.out.println("Sizə 2  model təklif edə bilərik");
                System.out.println("1.Sony\n2.Shivaki");
                int secondChoice = scanner.nextInt();
                if (secondChoice == 1) {
                    System.out.println(tv1.getNameOfProduct() + ": Qiymət " + tv1.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > tv1.getQuantity()) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity <= 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= tv1.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (tv1.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (tv1.getPrice() > pay || tv1.getPrice() * quantity > pay) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }

                } else if (secondChoice == 2) {
                    System.out.println(tv2.getNameOfProduct() + ": Qiymət " + tv2.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > tv2.getQuantity()) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity <= 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= tv2.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (tv2.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (tv2.getPrice() > pay || pay < tv2.getPrice() * quantity) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }
                } else {
                    throw new NotFound("Yalnız 1 və 2 daxil edə bilərdiniz");
                }
            } else if (choice == 4) {
                System.out.println("Sizə 2  model təklif edə bilərik");
                System.out.println("1.Samsung\n2.Apple");
                int secondChoice = scanner.nextInt();
                if (secondChoice == 1) {
                    System.out.println(telefon1.getNameOfProduct() + ": Qiymət " + telefon1.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > telefon1.getQuantity()) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity <= 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= telefon1.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (telefon1.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (telefon1.getPrice() > pay || telefon1.getPrice() * quantity > pay) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }

                } else if (secondChoice == 2) {
                    System.out.println(telefon2.getNameOfProduct() + ": Qiymət " + telefon2.getPrice());
                    System.out.println("Zəhmət olmasa alış etmək istədiyiniz sayı daxil edin");
                    int quantity = scanner.nextInt();
                    if (quantity > telefon2.getQuantity()) {
                        throw new InsufficientStockException("Hal hazırda stockda qeyd etdiyiniz qədər məhsulumuz yoxdur");
                    } else if (quantity <= 0) {
                        throw new NegativeNumberException("Yoxu var etməyi bacarmırıq");
                    }
                    System.out.println("Zəhmət olmasa ödəyəcəyiniz məbləği qeyd edin");
                    int pay = scanner.nextInt();
                    if (pay >= telefon2.getPrice() * quantity) {
                        System.out.println("Siz uğurla alış etdiniz sizə " + (pay - (telefon2.getPrice() * quantity)) + " ₼ qalıq qaytarıldı");
                    } else if (pay < 0) {
                        throw new NegativeNumberException("Kredit üçün Banka müraciət edin");
                    } else if (telefon2.getPrice() > pay || pay < telefon2.getPrice() * quantity) {
                        throw new InsufficientAmount("Sizin qeyd etdiyiniz məbləğ yetərli deyil");
                    }
                } else {
                    throw new NotFound("Yalnız 1 və 2 daxil edə bilərdiniz");
                }
            } else {
                throw new NegativeNumberException("1 və 4 daxil olmaqla bir ədəd seçilməli idi");
            }
        } catch (InputMismatchException e) {
            System.out.println("Yalnız rəqəm daxil edin");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Qeyd etdiyiniz sıra nömrəsi ilə məhsul yoxdur");
        }
    }
}

