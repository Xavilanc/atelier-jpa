## URL Pour tester dans le navigateur:
(avant toutes chose)
> créer une DB vide avec mysql
> et mettre à jour le fichier application.properties (cf quête Spring JPA hibernate)


# Read all (tout les wilders)
http://localhost:8080/readall

# Read by Id (ici l'id 3)
http://localhost:8080/read?id=3

# Get by Age (ex: les wilders qui ont 39 ans)
http://localhost:8080/getByAge?age=39

# Create (ex: Toto a 20 ans)
http://localhost:8080/create?name=Toto&age=20

# Update (ex: le wilder en id=1 à 38 ans)
http://localhost:8080/update?id=1&age=38

# Delete (ex: supprimer l'id 5)
http://localhost:8080/delete?id=5
