# TDD - 13/05/2022

Le sources "live" de ma session *"Les bases du TDD par l'exemple"* pour Groupama.

# Sujets du Kata

## Calcul de prix

* HT : 3 articles à 1,21 € + 0 % ⇒ “3.63 €”
* TTC : 3 articles à 1,21 € + 5 % ⇒ “3.81 €”
* TTC : 3 articles à 1,21 € +20 % ⇒ “4.36 €”

> → “TDC” = “Correction Pilotée par les Tests”

On ajoute des réductions :

* \> 1000 € → Remise 3% :
    * Ex : 5 x 345,00 € + taxe 10% → “1840.58 €”
* \> 5000 € → Remise 5% :
    * Ex : 5 x 1299,00 € + taxe 10% → “6787.28 €”

## Driver et mock

Un `Processor` possède une méthode `doJob()` qui récupère des données en base via un `Dao` et les transmets via
une `Api`. 