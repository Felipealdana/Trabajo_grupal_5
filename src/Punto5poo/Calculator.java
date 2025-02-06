package Punto5poo;

class Calculator {
    double[] Notas;

    public Calculator() {
        Notas = new double[5];
    }

    double calculateAverage() {
        double suma = 0;
        for (double nota : Notas) {
            suma += nota;
        }
        return suma / Notas.length;
    }

    double calculateDeviation() {
        double avg = calculateAverage();
        double sum = 0;
        for (int i = 0; i < Notas.length; i++) {
            sum += Math.pow(Notas[i] - avg, 2);
        }
        return Math.sqrt(sum / Notas.length);
    }

    double calculateMin() {
        double min = Notas[0];
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] < min) {
                min = Notas[i];
            }
        }
        return min;
    }

    double calculateMax() {
        double max = Notas[0];
        for (int i = 0; i < Notas.length; i++) {
            if (Notas[i] > max) {
                max = Notas[i];
            }
        }
        return max;
    }
}

