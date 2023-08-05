package Lesson_13;

import java.util.Scanner;
    public class HekayeZamani {


        private static void sakitqalsin() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Yerində təxminən 10 saniyə sakit uzanan Yusif bu variantın onun üçün keçərli olmadığını" +
                    " görüb AQQQQQA deyərək etirazını bildirib ekstra şuluqlar axtarır.");
            System.out.println("1) 10 saniyə şuluq vaxtınnan keçdiyi səbəbi ilə əsəbləşərək  Super Mario oyuncaqını dişləyir");
            System.out.println("2) Yatağının yanındaki pərdəyə tərəf iməkləyərək pərdəni dartır");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Marionu dişləyən zaman yeni çıxarmaq istədiyi dişləri qaşındığı üçün daha çox dişləyir" +
                            " yorularaq yatır");
                    System.exit(0);
                case 2:
                    System.out.println("Pərdəni dartan zaman pəncərədən həyətdə olan itimiz CEK-i görüb uzun müddət" +
                            " maraq ilə baxır");
                    System.exit(0);
            }
        }


        private static void suluqetsin() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Yusif üçün ən ideal variant seçildiyindən əlavə sevinc hissi ilə bildiyi bütün səsləri çıxararaq ev əhalisini səsləyib," +
                    " oyuncaqları ilə oynadıqdan bir müddət sonra gördüyü iş darıxdırıcı gəldiyindən yeni variantlar axtarır");
            System.out.println("1.Öz yatağından çıxmağa çalışsın");
            System.out.println("2.Tısbağa oyuncağına tərəf iməkləyərək tısbağanı dişləsin ");

            int secim = scanner.nextInt();


            switch (secim) {
                case 1:
                    System.out.println("Öz yatağından çıxmağa çalışanda yeni ideyalar ağlına gəlir bu dəfə yorğanında götürüb onnan biryerdə qalxır ki çıxsın yatağından");
                    if (secim == 1) {
                        System.out.println("Hələ çox körpə olduğundan yataqdan çıxa bilmir ");
                        System.out.println("1) Bərkdən qışqıraraq atasını yuxudan oyatmağa çalışır");
                        System.out.println("2) Çıxmaq üçün bütün variantlardan istifadə edir ");
                        int secim3 = scanner.nextInt();
                        switch (secim3) {
                            case 1:
                                System.out.println("Nəhayət istədiyinə nail oldu.Atası yuxudan oyanır.");
                                System.exit(0);
                            case 2:
                                System.out.println("Hələ çox tez olduğundan niyyətinə 10 dəqiqə sonra davam etmək üçün" +
                                        "yatmaq qərarına gəlir");
                                System.exit(0);
                        }
                    }
                case 2:
                    System.out.println("Tısbağa oyuncağını dişləyərək daha çox gülməyə başlayır biraz yorulub başını tısbağa üstə qoyur");
                    if (secim == 2) {
                        System.out.println("Biraz dincəldikdən sonra yenidən variantlar fikirləşir");
                        System.out.println("1) Çox enerji sərf elədiyindən dincəlir");
                        System.out.println("2) Bütün şuluqlar ilə yanaşı arada AQQQUU deyərək atasını yuxudan oyatmağa çalışır");
                        int secim2 = scanner.nextInt();
                        switch (secim2) {
                            case 1:
                                System.out.println("Enerjisi bol olduğundan biraz dincələn kimi yenidən oynamağa başlayır");
                                System.exit(0);
                            case 2:
                                System.out.println("Atası dərhal sevdiyi kəlimə olan AQQQUUnu eşidərək yuxudan durur.");
                                System.exit(0);
                        }
                    }
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Səhər saat 05:35 günün ilk işıqları otaqı bürüməyə başlayıb artıq.Hər zaman olduğu kimi " +
                    " Yusif bəydə gün işıqlarını görər görməz yuxusundan ayılmışdır. Dünən etdiyi şuluqlara son verməsi " +
                    "məqsədi ilə saat 23:00 radələrində öz istəyindən kənar yatmağa məcbur edildiyindən. Səhər gözünü açar " +
                    "açmaz bugün hansı şuluqları etməli olduğunu düşünür");
            boolean Yusif = true;
            while (Yusif) {
                System.out.println("1) Şuluq etməsin.Yerində sakit sakit oyuncaqları ilə oynasın");
                System.out.println("2) Bərkdən bütün ailə üzvlərini çağırıb,oyuncaqlara tərəf iməkləyib , oyuncaqlar ilə oynasın");

                int secim = scanner.nextInt();

                switch (secim) {
                    case 1:
                        sakitqalsin();
                        break;
                    case 2:
                        suluqetsin();
                        break;
                    default:
                        System.out.println("1 və ya 2 daxil edin.");
                }
            }
        }
    }