# TomP2P_Test

Un simple programme de test de TomP2P

## Getting Started

Ces Instructions vont vous permettre d'avoir une version fonctionnelle du logiciel sur votre machine

### Prérequis

Soyez surs d'avoir Gradle d'installé

```
instruction d'installation sur : https://gradle.org/install/
```

### Installation

Toutes les sources nécessaires sont déja présentes sur ce repos. Il suffit donc de "build & run" via gradle

```
gradle build
```

## Utilisation

Ce programme a pour but principal de tester concrètement la Librairie TomP2P.
Ici il sera question d'échanger seulement des informations (get et put) entre deux ou plusieurs utilisateurs(peers) au sein d'un réseau local.

## Détails

Pour entrer dans un réseau P2P, un noeud a besoin d'un autre noeud déja dans le réseau (Phase de "bootstrap"). S'il n'existe pas de tels noeuds, alors il s'agit d'un noeud racine qui servir pour les futurs arrivants.
Une fois qu'un peer est connecté à un réseau, il devient composant de la DHT comme les autres peers.
Il est alors possible possible à l'utilisateur de rajouter des informations dans la DHT, et ainsi les partager avec d'autres utilisateurs.
TomP2P_Test est ici utilisé pour permettre à plusieurs developpeurs de tester les fonctionnalités de TomP2P.

### le Projet SXP ###
Ce projet existe dans le seul but de tester les fonctionnalités de TomP2P avant de l'intégrer au Projet TomSXP.

Les mécanismes utilisés dans ce programme (put get, routage...), bien que traitant actuellement des données simples (chaînes de caractères), sont les mêmes mécanismes pouvant être utilisés dans SXP mais cette fois ci pour gérer des services. Bien entendu, SXP possède des fonctionnalités comme *l'advertisement* qui est un type de message envoyé lorsqu'un nouveau service est disponible pour en avertir les autres utilisateurs.


## Versioning

Ce projet a été déplacé ainsi il s'agit de la première version présente(incomplete cependant)

## Authors

* **Pierre TINLAND** - *developpeur / Chef de Projet* - [peadarDumnonii](https://github.com/peadarDumnonii)
* **Walid BIRJAM** - *developpeur / Testeur* - [DoubleVVdouze](https://github.com/DoubleVVdouze)
* **Alexandre D'AMBRA** - *developpeur / Rédacteur* - [Dambralex](https://github.com/Dambralex)

et voici ci-joint la liste des [contributors](https://github.com/your/project/contributors) ayant participé a ce projet

## License

Ce projet est sous licence libre GPL3.0
