public class Converter {
    int convertToKm(int steps) {
        double Km = steps / 0.75;
        return steps;
    }

    int converterStepsTokilocallories(int steps) {
        int Kn;
        Kn = steps / 50;
        int Kk = Kn / 1000;
        return Kk;
    }
}
