# Maven als Build-Tool

* Status: accepted
* Datum: 2023-04-18

## Kontext und Problemstellung

Es muss entschieden werden, mit welchem Build-Tool gearbeitet werden soll.

## Berücksichtigte Optionen

* Maven
* Gradle
* Ant

## Ergebnis der Entscheidung

Ausgewählte Option: "Maven", Es wurde entschieden, dass Maven das Build-Tool für das Projekt darstellt. 

- Einfache Konfiguration durch XML-Dateien
- Einfache Abhängigkeitsverwaltung durch das zentrale Repository
- Möglichkeit zur Erstellung von Artefakten wie JARs, WARs oder EARs
- Unterstützung von Plugins, um zusätzliche Funktionalität bereitzustellen

### Positives
* Die große Nutzer-Community von Maven sorgt für eine ausgezeichnete Unterstützung und reichlich Ressourcen bei Problemen.
* Mit Hilfe von Plugins können zusätzliche Funktionalitäten wie beispielsweise die Integration von Test-Frameworks oder die Erstellung von Dokumentation in Maven leicht bereitgestellt werden.
* Die zentrale Verwaltung von Abhängigkeiten durch Maven stellt sicher, dass nur kompatible Versionen verwendet werden, was die Stabilität und Kompatibilität der Anwendung verbessert.

### Negatives 

* Im Vergleich zu anderen Build-Tools wie Gradle kann die Build-Zeit von Maven länger sein, da es mehr Overhead / zusätzliche Ressourcen gibt.
* Die Konfiguration von Maven erfordert möglicherweise mehr Zeit und Anstrengung, da sie durch XML-Dateien erfolgt und nicht so intuitiv ist wie bei anderen Build-Tools.


## Pros und Cons der Alternativen 

### Gradle

#### Pros
- Bessere Performance -> bessere skalierbarkeit bei großen Projekten
- Bessere Integration (z.B. mit IDEs)

#### Cons
- Komplexere Umsetzung für Anfänger
- Komplexere Build-Sprache 

### Ant

#### Pros
- Vergleichsweise höhere Anpassungsfähigkeit und Flexibilität
- Hohe Kompabilität im Bezug zu anderen Build-Tools und IDEs

#### Cons
- Projektstruktur nicht standardisiert
- Plugin Unterstützung ist geringer
