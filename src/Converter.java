public class Converter {
    int convertToKm(int steps) {
        int km = steps * 75 / 100000;
        return km;
    }

    int converterStepsTokilocallories(int steps) {
        int kn;
        kn = steps * 50;
        int kk = kn / 1000;
        return kk;
    }
}
