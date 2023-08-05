package Lesson_24.HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicketManagementSystem {
    private List<Ticket> ticketList;
    private Scanner scanner;

    public TicketManagementSystem() {
        this.ticketList = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("======= Terminal əsaslı Bilet İdarəetmə Sistemi =======");
            System.out.println("1. Yeni bilet yarad");
            System.out.println("2. Bütün biletleri göstər");
            System.out.println("3. Statusa görə bilet göstər");
            System.out.println("4. Prioritəyə görə bilet göstər");
            System.out.println("5. Bilet statusunu yenilə");
            System.out.println("6. Çıxış");

            System.out.print("Seçiminizi daxil edin: ");
            int secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.println("\n===== Yeni Bilet Yarat =====");
                    System.out.print("Bilet başlığını daxil edin: ");
                    String basliq = scanner.nextLine();
                    System.out.print("Bilet açıqlamasını daxil edin: ");
                    String aciqlama = scanner.nextLine();
                    System.out.print("Bilet prioritetini daxil edin (Yüksək/Orta/Aşağı): ");
                    String prioritet = scanner.nextLine();

                    Ticket yeniBilet = new Ticket(basliq, aciqlama, prioritet);
                    ticketList.add(yeniBilet);

                    System.out.println("Bilet ID ilə uğurla yaradıldı: " + yeniBilet.getBiletID());
                    break;

                case 2:
                    System.out.println("\n===== Bütün Biletleri Göstər =====");
                    if (ticketList.isEmpty()) {
                        System.out.println("Heç bir bilet tapılmadı.");
                    } else {
                        biletleriGoster(ticketList);
                    }
                    break;

                case 3:
                    System.out.println("\n===== Statusa görə Bilet Göstər =====");
                    System.out.print("Bilet statusunu daxil edin (Açıq/Gözləmədə/Bağlandı): ");
                    String statusFiltr = scanner.nextLine();
                    List<Ticket> statusaGoreFiltr = statusaGoreBiletleriFiltr(ticketList, statusFiltr);
                    if (statusaGoreFiltr.isEmpty()) {
                        System.out.println(statusFiltr + " statusunda bilet tapılmadı.");
                    } else {
                        biletleriGoster(statusaGoreFiltr);
                    }
                    break;

                case 4:
                    System.out.println("\n===== Prioritəyə görə Bilet Göstər =====");
                    System.out.print("Bilet prioritetini daxil edin (Yüksək/Orta/Aşağı): ");
                    String prioritetFiltr = scanner.nextLine();
                    List<Ticket> prioriteteGoreFiltr = prioriteteGoreBiletleriFiltr(ticketList, prioritetFiltr);
                    if (prioriteteGoreFiltr.isEmpty()) {
                        System.out.println(prioritetFiltr + " prioritetində bilet tapılmadı.");
                    } else {
                        biletleriGoster(prioriteteGoreFiltr);
                    }
                    break;

                case 5:
                    System.out.println("\n===== Bilet Statusunu Yenilə =====");
                    System.out.print("Statusu yeniləmək üçün bilet ID-ni daxil edin: ");
                    int yenilenecekBiletID = scanner.nextInt();
                    scanner.nextLine();

                    Ticket yenilenecekBilet = biletTap(ticketList, yenilenecekBiletID);
                    if (yenilenecekBilet == null) {
                        System.out.println(yenilenecekBiletID + " ID-li bilet tapılmadı.");
                    } else {
                        System.out.println("Cari status: " + yenilenecekBilet.getStatus());
                        System.out.print("Yeni statusu daxil edin (Açıq/Gözləmədə/Bağlandı): ");
                        String yeniStatus = scanner.nextLine();

                        if (yeniStatus.equalsIgnoreCase("Açıq") || yeniStatus.equalsIgnoreCase("Gözləmədə") || yeniStatus.equalsIgnoreCase("Bağlandı")) {
                            yenilenecekBilet.setStatus(yeniStatus);
                            System.out.println("Status uğurla yeniləndi.");
                        } else {
                            System.out.println("Yalnız 'Açıq', 'Gözləmədə' və 'Bağlandı' statusları daxil edilməlidir.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("\nProgramdan çıxılır...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Yanlış seçim. Zəhmət olmasa yenidən cəhd edin.");
                    break;
            }
        }
    }

    private void biletleriGoster(List<Ticket> biletler) {
        System.out.println("------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-30s | %-30s | %-10s | %-10s |\n",
                "ID", "Başlıq", "Açıqlama", "Status", "Prioritet");
        System.out.println("------------------------------------------------------------------------");
        for (Ticket bilet : biletler) {
            System.out.printf("| %-5d | %-30s | %-30s | %-10s | %-10s |\n",
                    bilet.getBiletID(), bilet.getBasliq(), bilet.getAciqlama(),
                    bilet.getStatus(), bilet.getPrioritet());
        }
        System.out.println("------------------------------------------------------------------------");
    }

    private List<Ticket> statusaGoreBiletleriFiltr(List<Ticket> biletler, String status) {
        List<Ticket> filtrBiletler = new ArrayList<>();
        String[] statusSecimleri = {"Açıq", "Gözləmədə", "Bağlandı"};
        boolean uygunStatus = false;

        for (String secim : statusSecimleri) {
            if (status.equalsIgnoreCase(secim)) {
                uygunStatus = true;
                break;
            }
        }

        if (uygunStatus) {
            for (Ticket bilet : biletler) {
                if (bilet.getStatus().equalsIgnoreCase(status)) {
                    filtrBiletler.add(bilet);
                }
            }
        } else {
            System.out.println("Yalnız 'Açıq', 'Gözləmədə' və 'Bağlandı' statusları üçün filtrasiya etmək mümkündür.");
        }

        return filtrBiletler;
    }

    private List<Ticket> prioriteteGoreBiletleriFiltr(List<Ticket> biletler, String prioritet) {
        List<Ticket> filtrBiletler = new ArrayList<>();
        for (Ticket bilet : biletler) {
            if (bilet.getPrioritet().equalsIgnoreCase(prioritet)) {
                filtrBiletler.add(bilet);
            }
        }
        return filtrBiletler;
    }

    private Ticket biletTap(List<Ticket> biletler, int biletID) {
        for (Ticket bilet : biletler) {
            if (bilet.getBiletID() == biletID) {
                return bilet;
            }
        }

        return null;
    }
}