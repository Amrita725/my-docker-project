# Docker Volumes

It is a very common requirement to persisit data in a Docker Container beyound the lifetime of a container. A Docker Volume is a persistent storage mechanism used by Docker to store data outside the container’s writable layer, so data is not lost when containers stop or are removed.

It is a very common requirement to persist the data in a Docker container beyond the lifetime of the container. However, the file system of a Docker container is deleted/removed when the container dies.

## Why we need them ?  
- Containers are ephemeral  
- Data inside containers is lost on removal  
- Volumes solve this by storing data on the host  

## Basic Docker volume commands
Create a volume  
``` docker volume create my-volume ```

List volumes  
``` docker volume ls ```

Inspect a volume  
```docker volume inspect my-volume```

Use a volume with a container  
```docker run -d -v my-volume:/data nginx```

Remove a volume  
```docker volume rm my-volume```

