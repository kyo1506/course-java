package aulas.oo_avancado;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class ClienteHttpClient {

    static ExecutorService executorService = Executors.newFixedThreadPool(6, runnable -> {
        Thread thread = new Thread(runnable);
        System.out.println("Nova thread criada :: "+ (thread.isDaemon() ? "daemon" : "") + "Thread Group :: " + thread.getThreadGroup());
        return thread;
    });

    public static void main(String[] args) throws Exception{
        connectAkamaiHttp11Cliente();
    }

    private static void connectAkamaiHttp11Cliente() throws IOException, InterruptedException {
        System.out.println("Running HTTP/1.1 example...");
        try
        {
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis();
            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code :: "+response.statusCode());
            System.out.println("Status Code :: "+response.headers());
            List<Future<?>> futureList = new ArrayList<>();

            response.body()
                    .lines()
                    .filter(line -> line.trim().startsWith("<img height"))
                    .map(line -> line.substring(line.indexOf("src='") + 5, line.indexOf("'/>")))
                    .forEach(image -> {
                        Future<?> imgFuture = executorService.submit(() -> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com" + image))
                                    .build();

                            try {
                                HttpResponse<String> imgResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem Carregada :: " + imgResponse.statusCode());
                            } catch (IOException | InterruptedException e) {
                                System.out.println("Mensagem de erro durante requisição da imagem:: " + e.getMessage());
                            }
                        });

                        futureList.add(imgFuture);
                        System.out.println("Submmited Images :: " + image);
                    });

            futureList.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println("Mensagem de erro ao esperar carregar a imagem:: " + e.getMessage());
                }
            });

            long end = System.currentTimeMillis();

            System.out.println("Tempo de carregamento total :: " + (end - start) + "ms");
        }finally {
            executorService.shutdown();
        }
    }

    private static void connectAndPrintUrlJavaOracle()
    {
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();

        HttpClient httpClient = HttpClient.newHttpClient();

        try {
            HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code :: "+response.statusCode());
            System.out.println("Status Code :: "+response.headers());
        } catch (IOException | InterruptedException e) {
            System.out.println("Mensagem de erro genérica :: " + e.getMessage());
        }
    }
}
