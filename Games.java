import java.util.Random;

public class Games {

    /*
     * ДОП: Сделать гонки:
     * - задаём растояние
     * - едут до финиша.
     * Сказать кто победит.
     */

    private static int defaultIndex;
    static {
        defaultIndex = 1;
    }

    private int distance;
    private int id;
    private Random rand;

    public Games() {
        this.distance = 0;
        this.id = defaultIndex;
        defaultIndex++;
    }

    public void startGame(Cars c1, Cars c2, Cars c3) {

        this.rand = new Random();
        this.distance = rand.nextInt(100, 200);
        System.out.printf("Игра %d началачь, дистанция трассы равна: %d\n", id, distance);
        int dist1 = 0;
        int dist2 = 0;
        int dist3 = 0;

        while (true) {
            dist1 += rand.nextInt(5, 10);
            dist2 += rand.nextInt(5, 10);
            dist3 += rand.nextInt(5, 10);

            if (dist1 >= this.distance || dist2 >= this.distance || dist3 >= this.distance) {
                if (dist1 > dist2 && dist1 > dist3) {
                    System.out.printf("Гонка %d завершена. Победил автомобиль: %s\n", id, c1.getModel());
                } else if (dist2 > dist1 && dist2 > dist3) {
                    System.out.printf("Гонка %d завершена. Победил автомобиль: %s\n", id, c2.getModel());
                } else if (dist3 > dist1 && dist3 > dist2) {
                    System.out.printf("Гонка %d завершена. Победил автомобиль: %s\n", id, c3.getModel());
                } else {
                    System.out.printf("Гонка %d завершена. Одновременно пришли два или три автомобиля\n", id);
                }
                c1.setMileage(dist1);
                c2.setMileage(dist2);
                c3.setMileage(dist3);
                return;
            }
        }
    }
}
