# Basic Commands


## Docker system & info  
```
docker --version  
docker info  
docker system df  
docker system prune  
```

## Images  

``` 
List images   docker images  
Pull image    docker pull nginx  
Build image   docker build -t my-image .  
Remove image  docker rmi image_id
Image tag     docker image tag two-tier:latest amrita725/two-tier:latest -- docker image tag creates a new name (tag) for an existing Docker image.
Push images   docker push amrita725/two-tier:latest  -- dockerhub login and then push the image 
```
## Containers  
```
Run a container   docker run nginx  
                  docker run -d -p 8080:80 nginx  
                  docker run -it ubuntu bash  

List containers   docker ps  
                  docker ps -a  

Stop/start container    docker stop container_id    
                        docker start container_id    

Remove container   docker rm container_id
```

## Exec & logs  
```
Access running container        docker exec -it container_id bash


View logs                        docker logs container_id  
                                 docker logs -f container_id  
```
## Volumes

```
docker volume create my-volume  
docker volume ls  
docker volume inspect my-volume  
docker volume rm my-volume
docker run -v my-volume:/data nginx
```

## Networks  
```
docker network ls
docker network create my-network
docker network inspect my-network
docker network rm my-network
```

## Cleanup 
```
Remove stopped containers:     docker container prune   
Remove unused images:          docker image prune   
Remove everything unused:      docker system prune -a  

```
## Docker Compose (basics)
```
docker compose up
docker compose up -d
docker compose down
```


```docker exec -it <container_id_or_name> <command>```  
“docker exec -it lets you run commands interactively inside a running container without restarting it, which is useful for debugging and inspection.”
```docker exec -t 5bdd380e79bc python --version```
| Command       | What it does                                    |
| ------------- | ----------------------------------------------- |
| `docker run`  | Starts a **new container** and runs a command   |
| `docker exec` | Runs a command **inside an existing container** |

