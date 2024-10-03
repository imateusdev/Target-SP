import org.json.JSONArray;
import org.json.JSONObject;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FaturamentoDiario {
    public static void main(String[] args) throws Exception {
        // Usando InputStream para ler o arquivo faturamento.json
        InputStream is = FaturamentoDiario.class.getClassLoader().getResourceAsStream("faturamento.json");

        if (is == null) {
            System.out.println("Arquivo não encontrado!");
            return;
        }

        String content = new String(is.readAllBytes());

        // Processar o JSON
        JSONObject json = new JSONObject(content);
        JSONArray faturamento = json.getJSONArray("faturamento");

        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;
        double soma = 0;
        int diasComFaturamento = 0;

        for (int i = 0; i < faturamento.length(); i++) {
            double valor = faturamento.getJSONObject(i).getDouble("valor");
            if (valor > 0) {
                if (valor < menor)
                    menor = valor;
                if (valor > maior)
                    maior = valor;
                soma += valor;
                diasComFaturamento++;
            }
        }

        double media = soma / diasComFaturamento;
        int diasAcimaDaMedia = 0;

        for (int i = 0; i < faturamento.length(); i++) {
            double valor = faturamento.getJSONObject(i).getDouble("valor");
            if (valor > media) {
                diasAcimaDaMedia++;
            }
        }

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Dias acima da média: " + diasAcimaDaMedia);
    }
}
