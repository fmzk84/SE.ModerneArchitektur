# 

**About arc42**

arc42, the template for documentation of software and system
architecture.

Template Version 8.2 EN. (based upon AsciiDoc version), January 2023

Created, maintained and © by Dr. Peter Hruschka, Dr. Gernot Starke and
contributors. See <https://arc42.org>.

<div class="note">

This version of the template contains some help and explanations. It is
used for familiarization with arc42 and the understanding of the
concepts. For documentation of your own system you use better the
*plain* version.

</div>

## Aufgabenstellung

Der Dokumentendruck benötigt nach einer neuen Rechtsgrundlage individuelle Simulationsergebnise von Fahrzeugen. Ziel ist es eine Schnittstelle für den Dokumentendruck zu entwickeln. Hierfür müssen hauptsächlich bestehende Klassen angebunden werden. Ziel ist es eine funktionale Sofware unter Einhaltung der Clean-Code-Regeln zu entwickeln. Zusätzlich soll eine gute Dokumentation geschaffen werden.

## Primary Features

- Schnittstelle zwischen den Abteilungen Druck, Entwicklung und Logistik mit Anbindung der VECTO-Library
- gibt bei Eingabe einer gültigen Fahrzeugkonfiguration ein richtiges Simulationsergebnis zurück
- Clean-Code
- ausführliche Dokumentation

## Qualitätsziele

| Qualitätsziel   | Motivation und Erläuterung        |
|-------------|----------------|
| *Änderbarkeit* | *Es muss schnell auf neue Gesetzesänderungen reagiert werden können. Passiert dies nicht, kann es zu Strafen oder Produktionsstopps kommen.* |
| *Zuverlässigkeit* | *Die Software muss in der Lage sein große Mengen an Daten verarbeiten und weiterleiten zu können.* |
| *Funktionalität* | *Die Software soll die  für sie definierten Anforderungen effizient und fehlerfrei erfüllen.* |

## Stakeholder

Hier erfolgt ein kurzer Überblick über die Stakeholder, also Personen, Gruppen oder Organisationen, welche ein spezifisches Interesse oder eine spezifische Anforderung an die Software haben.

* Abteilung Dokumentendruck
* Abteilung Fahrzeugentwicklung
* Abteilung Logisitk
* Entwickler der Software
* Geschäftsführung

# Randbedingungen

Das Projekt beinhaltet folgende Vorgaben und Randbedingungen:

Vorgaben:
- Es soll ein austausch mit einer **Datenbank** stattfinden
- Es soll **Java** als Programmiersprache zur Entwicklung genutzt werden.
- Es soll einen **Output** für den Druck erzeugt werden

Randbedingungen:
- **Vecto-Libary:** Eine Vecto-Libary welche die CO2-Werte von schweren Nutzfahrzeuge simuliert.
- Folgende 3 API
- **Logistik-API:** Eine API welche Daten wie Baummuster, Produktionsdatum und Konfiguration
  entgegennimmt und Daten zu Gewicht und Abmessung ausgibt.
- **Fahrzeug-API:** Eine API welche eine Konfiguration entgegennimmt und die Messdaten ausgibt.
- **Dokumentendruck-API:** Eine API welche eine Konfiguration entgegennimmt und Daten zum individuellen
  Simulationsergebnis ausgibt.
  
# Bausteinsicht

<div class="formalpara-title">

**Content**

</div>

The building block view shows the static decomposition of the system
into building blocks (modules, components, subsystems, classes,
interfaces, packages, libraries, frameworks, layers, partitions, tiers,
functions, macros, operations, data structures, …) as well as their
dependencies (relationships, associations, …)

This view is mandatory for every architecture documentation. In analogy
to a house this is the *floor plan*.

<div class="formalpara-title">

**Motivation**

</div>

Maintain an overview of your source code by making its structure
understandable through abstraction.

This allows you to communicate with your stakeholder on an abstract
level without disclosing implementation details.

<div class="formalpara-title">

**Form**

</div>

The building block view is a hierarchical collection of black boxes and
white boxes (see figure below) and their descriptions.

![Hierarchy of building blocks](images/05_building_blocks-EN.png)

**Level 1** is the white box description of the overall system together
with black box descriptions of all contained building blocks.

**Level 2** zooms into some building blocks of level 1. Thus it contains
the white box description of selected building blocks of level 1,
together with black box descriptions of their internal building blocks.

**Level 3** zooms into selected building blocks of level 2, and so on.

See [Building Block View](https://docs.arc42.org/section-5/) in the
arc42 documentation.

# Laufzeitsicht

Hier wird der Programmablauf textuell beschrieben werden.

1. Die Abteilung Dokumentendruck hat eine Fahrzeugkonfiguration und benötigt die Simulationsergebnisse für diese spezifische Simulation.
2. Die Abteilung Dokumentendruck sendet die Fahrzeugkonfiguration über eine Schnittstelle an die Anwendung.
3. Die Anwendung sendet jeweils über eine eigene Schnittstelle die Fahrzeugkonfiguration an die Abteilungen Fahrzeugentwicklung und Logisitk.
4. Die Abteilung Fahrzeugentwicklung sendet über ihre Schnittstelle Messdaten zu den einzelnen Bauteilen an die Anwendung.
4. Gleichzeitig sendet die Abteilung Logistik über ihre Schnittstelle das zur Fahrzeugkonfiguration gehörende Gewicht und die Abmessungen an die Anwendung.
5. Die Anwendung mit den gesammelten Daten und der integrierten Vecto-Libraray führt die Anwendung die Simulation durch und erstellt die Messergebnisse.
6. Die Anwendung sendet das Messergebniss an den Dokumentendruck mit einem Zeitstempel zurück.

# Architekturentscheidungen

</div>

Architekturentscheidungen sind wichtige und/oder große Entscheidugen, welche einen hohen Einfluss auf den weiteren Ablauf des Projekts haben. Wir haben diese Entscheidungen als Architectual Decision Records (kurz ADRs) aufgezeichnet.
Die Architekturentscheidungen haben wir zur besseren Lesbarkeit als einzelne MADRs ausgegliedert. Diese sind als einzelne Dateien im Repository zu finden. Sie sind nach folgenden Schema benannt: 01-Titel_der_Entscheidung.md

Trotzdem soll hier eine kurze Zusammenfassung gegeben werden. Wir haben uns bei der Entwicklung der Software für eine Schichtenarchitektur entschieden. 
Als Build-Tool wurde Maven benutzt und als Programmiersprache Java. Es wurde geplant die Software zukünftig containerisiert laufen zu lassen. 
Die Begründungen und Alternativen zu den Einzelnen Entscheidungen sind in den MADRs zu finden.

# Risiken und technische Schulden

<div class="formalpara-title">

**Contents**

</div>

Eine Liste der möglichen technischen Risiken oder Schulden, die mit der Architektur der Software verbunden sind. Diese entstehen, wenn Fehler beim Design 
und der Planung der Architektur oder der Erstellung der Dokumentation gemacht werden.

<div class="formalpara-title">

**Motivation**

</div>

“Risk management is project management for grown-ups” (Tim Lister,
Atlantic Systems Guild.)

This should be your motto for systematic detection and evaluation of
risks and technical debts in the architecture, which will be needed by
management stakeholders (e.g. project managers, product owners) as part
of the overall risk analysis and measurement planning.

<div class="formalpara-title">

**Form**

</div>

List of risks and/or technical debts, probably including suggested
measures to minimize, mitigate or avoid risks or reduce technical debts.

See [Risks and Technical Debt](https://docs.arc42.org/section-11/) in
the arc42 documentation.
