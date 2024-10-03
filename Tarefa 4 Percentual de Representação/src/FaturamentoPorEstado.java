import java.text.DecimalFormat;

public class FaturamentoPorEstado {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;

        double percentualSP = (sp / total) * 100;
        double percentualRJ = (rj / total) * 100;
        double percentualMG = (mg / total) * 100;
        double percentualES = (es / total) * 100;
        double percentualOutros = (outros / total) * 100;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Percentual de SP: " + df.format(percentualSP) + "%");
        System.out.println("Percentual de RJ: " + df.format(percentualRJ) + "%");
        System.out.println("Percentual de MG: " + df.format(percentualMG) + "%");
        System.out.println("Percentual de ES: " + df.format(percentualES) + "%");
        System.out.println("Percentual de Outros: " + df.format(percentualOutros) + "%");
    }
}