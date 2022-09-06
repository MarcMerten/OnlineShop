# OnlineShop
_To test java skills_

**Problemstellung:**

- Eine Fastfoodkette möchte den Bestellvorgang digitalisieren.
- Dafür soll ein Webservice _(Dieses Spring Boot Projekt)_ erstellt werden.
- Dieser Webservice soll folgende APIs anbieten:
  - Das anlegen einer Bestellung
    - Hier kommt die Bestellungs-ID zurück
  - Das Abfragen aller Bestellungen _(Parameter: Keine)_
    - Hier kommt eine Liste von Bestellungs IDs zurück
  - Das Abfragen der Produkte einer bestimmten Bestellung _(Parameter: Bestelungs-ID)_
    - Hier kommt eine Liste der Produkte zurück
    - Beispiel: **[2xBürger, 1xMittlere Pommes, 3xKleines Getränk]**
  - Das hinzufügen eines Produktes zu der Bestellung _(Parameter: Bestellungs-ID, Product-ID)_
  - Das entfernen eines Produktes von der Bestellung _(Parameter: Bestellungs-ID, Product-ID)_
  - Das abbrechen der Bestellung: _(Parameter: Bestellungs-ID)_
- Zusätzlich möchte der Manager sehen können wie oft ein Produckt bereits bestellt wurde, dass soll aber nur er können. _(Denk dir was aus)_
- Das Bezahlen der Bestellung und damit der Abschluss wird erstmal nicht beachtet
- Es soll eine Liste von Produkten vorher angelegt werden, nicht existierende Produkte können der Bestellung nicht hinzugefügt werden und sind daher mit einer Fehlermeldung für den Kunden zu beantworten
- Es sind sinnvolle Unittests für das Programm anzulegen. Fehler die im Betrieb auftreten beeinträchtigen die Fastfoodkette und sind daher vertraglich mit Geldstrafen für den Softwareentwickler verbunden