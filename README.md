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

Etant donné les problèmes qu'il peut y avoir avec TomP2P pour récupérer les source (site down fréquemment en ce moment), toutes les sources nécessaires sont déja présentes sur ce repos. Il suffit donc de "build & run" via gradle

```
gradle build
```

## Détails


Pour entrer dans un réseau P2P, un noeud a besoin d'un autre noeud déja dans le réseau. S'il n'existe pas de tel noeuds, alors il s'agit d'un noeud primaire.
Une fois connecté a un réseau, un terminal aide a la construction de la DHT associée au réseau, partitionnée entre les différents terminaux.
Il est alors possible possible à l'utilisateur de rajouter des informations dans la DHT, et ainsi la partager avec d'autres utilisateurs
TomP2P_Test est ici utilisé pour permettre à plusieurs developpeurs de tester les fonctionnalités de TomP2P, facilitant la création de Noeuds et la gestion d'une DHT.


## Utilisation

Ce programme a pour but principal de tester la Librairie TomP2P, permettant de réaliser un système de transfert de ficher via un protocole Peer to Peer.
Ici il sera question d'échanger des informations entre deux ou plusieurs utilisateurs.

## Utilisation Avancée

Ce projet existe dans le seul but de tester les fonctionnalités de TomP2P avant de l'intégrer au Projet TomSXP. Il est donc conseillé de le modifier pour tester les fonctionnalités de la DHT de TomP2P.

## Versioning

Ce projet a été déplacé ainsi il s'agit de la première version présente.

## Authors

* **Walid BIRJAM** - *developpeur* - [DoubleVVdouze](https://github.com/DoubleVVdouze)
* **Alexandre D'AMBRA** - *developpeur* - [Dambralex](https://github.com/Dambralex)
* **Pierre TINLAND** - *developpeur* - [peadarDumnonii](https://github.com/peadarDumnonii)

et voici ci-joint la liste des [contributors](https://github.com/your/project/contributors) ayant participé a ce projet

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
