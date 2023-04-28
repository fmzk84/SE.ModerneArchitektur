# Docker für Container

* Status: planned
* Datum: 2023-04-18

## Kontext und Problemstellung

Die Anweundung soll eine hohe Sklaierbarkeit und Konsistenz haben, dafür sollen Container benutzt werden.

## Berücksichtigte Optionen

* Docker
* Podman


## Ergebnis der Entscheidung

Ausgewählte Option: "Docker", Es wurde entschieden, dass Dcoker das Tool für die Containerisierung wird. 

- Einfach zu lernen und anzuwenden
- Ermöglicht eine hohe Konsisitenz und Skalierbarkeit durch Container
- ermöglicht  eine effizientere Ressourcennutzung mit weniger Overhead

### Positives
* Docker ist recht einfach und mit nur wenigen Befehlen nutzbar.
* Docker ist das einzige Programm dieser Art mit dem die Gruppenmitglieder bisher gearbeitet haben.

### Negatives 

* Je nachdem wie man es anwendet nicht alles kostenlos
* Basiert auf Linux, daher auf anderen Betriebssystemen eventuell bessere Alternativen
* Kommunikation läuft immer über Docker-Daemon

## Pros und Cons der Alternativen 

### Podman

#### Pros
- höhere Sicherheit da kein Daemon nötig

#### Cons
- Komlizierter in der Anwendung
- Keine Erfahrung mit dem Programm
