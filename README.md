# TDD chez Raise Partner le 18/12/2019

Le sources "live" de ma session **"Les bases du TDD par l'exemple"**.

# Diaporama
[Le diaporama de la session est ici.](./TDD-Raise_partner-18_12_2019.pdf)

# Sujet du Kata 

## Calcul de prix :

* HT : 3 articles à 1,21 € + 0 % ⇒ “3.63 €”
* TTC : 3 articles à 1,21 €  + 5 % ⇒ “3.81 €”
* TTC : 3 articles à 1,21 €  +20 % ⇒ “4.36 €”
> → “TDC” = “Correction Pilotée par les Tests”

On ajoute des réductions :
* \> 1000 € → Remise 3% :
  * Ex : 5 x 345,00 € + taxe 10% → “1840.58 €”
* \> 5000 € → Remise 5% :
  * Ex : 5 x 1299,00 € + taxe 10% → “6787.28 €”

## Notifier par mail :

* Un `Notifier` avec une méthode `notifyAllUsers("coucou")` qui récupère les adresses mails dans 
une base de donnée et demande l'envoi de mails à un service `Mailer`.
