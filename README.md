# TDD - Agile Grenoble - 25/11/2020

Le sources "live" de ma session *"Les bases du TDD par l'exemple"* à Agile Grenoble 2020.

# Diaporama
[Le diaporama de la session est ici.](https://drive.google.com/file/d/1abbRrrnl134oXtEO2-aq7AyBA-t9U08N/view?usp=sharing)

# Sujet du Kata

Calcul de prix :
* HT : 3 articles à 1,21 € + 0 % ⇒ “3.63 €”
* TTC : 3 articles à 1,21 €  + 5 % ⇒ “3.81 €”
* TTC : 3 articles à 1,21 €  +20 % ⇒ “4.36 €”
> → “TDC” = “Correction Pilotée par les Tests”

On ajoute des réductions :
* \> 1000 € → Remise 3% :
  * Ex : 5 x 345,00 € + taxe 10% → “1840.58 €”
* \> 5000 € → Remise 5% :
  * Ex : 5 x 1299,00 € + taxe 10% → “6787.28 €”
