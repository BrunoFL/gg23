# ggj23


## Lancer
```shell
docker-compose -f dev.yml up
./mvnw spring-boot:run
```

Pour l'acces à la base de dev :
- user: postgres
- mdp: pass


- appli : http://0.0.0.0:8080
- base : http://0.0.0.0:8181


## Créer la base
- Se connecter à la base : http://0.0.0.0:8181
- Cliquer sur db en haut
- Créer une base de données
- ggj23

## Arreter
```shell
docker-compose -f dev.yml stop
```
