# Maven als Build-Tool

* Status: accepted
* Datum: 2023-04-05

## Kontext und Problemstellung

Es muss entschieden werden, welches Architektumuster für die Software benutzt wird.

## Berücksichtigte Optionen

* Schichtenarchitektur
* Pipes-and-filter
* Client-Server-Architektur

## Ergebnis der Entscheidung

Ausgewählte Option: "Schichtenarchitektur", Es wurde entschieden, dass Programm in einer Schichtenarchitektur zu entwerfen. 

- strukturgebendes Muster
- mehere Ebenen und Module mit klarer Trennung
- hohe Änderbarkeit wegen Information hiding

### Positives
* Die klare Struktur ermöglicht ein programminternes "Berechtigungskonzept"
* Durch das Berechtigungskonzept wird Information Hiding ermöglicht, was durch klar definierte Abhängigkeiten zu einer hohen Änderbarkeit führt
* Gut für unseren konkreten Anwendungsfall geeignet.

### Negatives 

* In bestimmten fällen kann die feste Struktur auch negative Folgen haben.
* Teilweise ein komplizierter Aufbau, was zusätzliche Entwicklungszeit bedeutet.

## Pros und Cons der Alternativen 

### Pipes and Filter

#### Pros
- Gut für Batchverarbeitung
- Auch gut für unseren Anwendungsfall geeignet

#### Cons
- Viele Änderungen an bestehenden Dateien nötig um das Muster zu erreichen

### Client-Server-Architektur

#### Pros
- Sehr flexibles Architekturmuster
- Leicht zu erreichen

#### Cons
- Nicht wirklich für unser Projekt geeignet
