# SubtitlesToTranscript

## O aplikacji

**SubtitlesToTranscript** to prosta aplikacja stworzona w celu rozwiązania problemu tworzenia transkrypcji i napisów do filmów. Problem ten wydaje się błahy, jednak każda z tych operacji wymaga osobnych działań w programach do tworzenia napisów, co generuje dodatkowe koszty, szczególnie gdy usługi te pobierają opłaty za minutę wygenerowanego tekstu na podstawie wideo.

Aby zoptymalizować ten proces i wyeliminować niepotrzebne koszty, stworzyłem prosty program, który usuwa niepotrzebne znaczniki z plików napisów, pozostawiając czysty tekst transkrypcji.

## Jak to działa?

Aplikacja wczytuje plik napisów (np. w formacie `.srt`) i usuwa z niego:
- Znaczniki czasowe (np. `00:00:01 --> 00:00:05`)
- Numery linii (sekwencyjne numerowanie występujące w plikach napisów)

Efektem końcowym jest czysta transkrypcja dialogów z filmu, bez zbędnych znaczników.

## Użycie
### Uruchamianie z linii komend

1. Skompiluj plik `Main.java`:

    ```bash
    javac Main.java
    ```

2. Uruchom aplikację, podając ścieżkę do pliku z napisami oraz plik, w którym ma zostać zapisany wynik:

    ```bash
    java Main <sciezka_do_pliku_napisow> <sciezka_do_pliku_wynikowego>
    ```

### Przykład

Aby przetworzyć plik z napisami `film.srt` i zapisać wynik jako `transkrypcja.txt`, użyj komendy:

```bash
java Main film.srt transkrypcja.txt
```


