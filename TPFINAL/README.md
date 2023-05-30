# Système de Facturation
## Clean Code
Le code a été écrit en anglais et de manière structurée pour assurer une bonne lisibilité. Chaque classe a une responsabilité unique conformément au principe de responsabilité unique. Les noms des méthodes et des variables sont descriptifs pour indiquer clairement leur utilité.

## Functional Programming Style
La programmation fonctionnelle a été utilisée là où elle était nécessaire. Des interfaces fonctionnelles ont été créées pour les taxes, ce qui rend le système plus flexible et évolutif. Aucune boucle for ou while n'a été utilisée, au lieu de cela, j'ai utilisé des méthodes de flux (stream) et forEach.

## Test Driven Development (TDD)
Tout le développement a été effectué en utilisant TDD. Avant l'implémentation de chaque fonctionnalité, un test a été écrit pour vérifier cette fonctionnalité. Ceci a assuré que toutes les fonctionnalités ont été correctement testées et ont satisfait aux conditions requises.

## Design Pattern
Le système utilise le Design Pattern Strategy pour calculer les taxes sur les produits. Cela rend le système plus flexible et permet d'ajouter facilement de nouvelles stratégies de calcul de taxe si nécessaire.

## Améliorations possibles
Bien que mon code soit fonctionnel, il y a toujours des améliorations possibles :

- Je pourrais ajouter une gestion d'erreur plus robuste pour traiter des situations imprévues, comme des types de produits inconnus, des entrées utilisateur incorrectes, prix réduits ou autres. J'ai pu commencé certains tests que j'ai dû mettre en commentaire dans "ProductTest.java" afin de ne pas bousiller le code final. 

- Actuellement, le système suppose que chaque produit scanné est un nouvel item distinct. Donc si plusieurs exemplaires du même produit sont scannés, le code considère ce même produit en tant que nouveau produit. Cela pourrait être optimisé en incrémentant simplement la quantité d'un produit déjà scanné.
