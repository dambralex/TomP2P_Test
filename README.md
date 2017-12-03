# TomP2P_Test

Un simple programme de test de TomP2P

## Getting Started

Ces instructions vont vous permettre d'avoir une version fonctionnelle du logiciel sur votre machine

### Prérequis

Soyez surs d'avoir Gradle d'installé

```
instructions d'installation sur : https://gradle.org/install/
```

### Installation

Toutes les sources nécessaires sont déja présentes sur ce dépôt. Il suffit donc de "build & run" via gradle

```
gradle run -PappArgs={ID},{KEY}
```
*pour les tests, on propose 1 pour {ID} et {test.me}*

## Utilisation

Ce programme a pour but principal de tester concrètement la Librairie TomP2P, afin d'en comprendre les mécanismes, en vue d'une future implémentation de l'API *Network* de SXP.
Ici il sera question d'échanger des informations en écrivant ou en lisant dans la DHT (via *get* et *put*), entre deux ou plusieurs utilisateurs (*peers*) au sein d'un réseau local.

## Détails

Pour entrer dans un réseau P2P, un noeud a besoin d'un autre noeud déja dans le réseau (Phase de "bootstrap"). S'il n'existe pas un tel noeud, alors il s'agit du noeud racine, autour duquel le réseau sera construit, car il servira de noeud de rendez vous pour les futurs arrivants.
Une fois qu'un peer est connecté à un réseau, il devient composant de la DHT comme les autres peers.
Il a alors la capacité d'intéragir avec la DHT. Il peut aussi servir de noeud de bootstrap.
TomP2P_Test est ici utilisé pour permettre à plusieurs développeurs de tester les fonctionnalités de TomP2P.

### Le Projet SXP
Le programme TomP2P_Test existe dans le seul but de tester les fonctionnalités de TomP2P avant de l'intégrer au [Projet SXP](https://github.com/pja35/SXP)

Les mécanismes utilisés dans TomP2P_Test (put, get, routage...), bien que traitant actuellement des données simples (chaînes de caractères), sont les mêmes que ceux pouvant être utilisés dans SXP pour des données plus complexes, comme des services ou des items. Bien entendu, SXP possède des fonctionnalités supplémentaires comme *l'advertisement* qui est un type de message particulier, envoyé lorsqu'un nouveau service est disponible pour en avertir de sa présence les autres utilisateurs. Ainsi, les peers connectés au réseau savent à tout moment quel est le contenu de la DHT. Ceci n'est pas géré nativement par TomP2P.

Des essais infructueux d'implémentation de l'interface du module Network de SXP ont été réalisés, et sont accessibles dans le dossier [TomSXP](https://github.com/dambralex/TomP2P_Test/tree/master/TomSXP)

## TO DO  

Envoi et réception de messages

## Versioning

Ce projet a été déplacé ainsi il s'agit de la première version présente(incomplète cependant)

## Authors

* **Pierre TINLAND** - *développeur / Chef de Projet* - [peadarDumnonii](https://github.com/peadarDumnonii)
* **Walid BIRJAM** - *développeur / Testeur* - [DoubleVVdouze](https://github.com/DoubleVVdouze)
* **Alexandre D'AMBRA** - *développeur / Rédacteur* - [Dambralex](https://github.com/Dambralex)

Liste des [contributors](https://github.com/your/project/contributors)

## License

Ce projet est sous licence libre GPL3.0
