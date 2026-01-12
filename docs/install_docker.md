## INSTALL DOCKER

For Demo, create an Ubuntu EC2 Instance on AWS. Login to the EC2 instance and run the below commands to install docker.

```
sudo apt update
sudo apt install docker.io -y
```

### Start Docker and Grant Access

After installing docker using the sudo access, don't miss the step to Start the Docker daemon and grant acess to the user which is used to interact with docker and run docker commands.

Always ensure the docker daemon is up and running.

### Start Docker daemon

Use the below command to verify if the docker daemon is actually started and Active

```
sudo systemctl status docker
```

If you notice that the docker daemon is not running, you can start the daemon using the below command

```
sudo systemctl start docker
```


### Grant Access to your user to run docker commands

To grant access to your user to run the docker command, add the user to the Docker Linux group. Docker group is create by default when docker is installed.

```
sudo usermod -aG docker ubuntu
```

In the above command `ubuntu` is the name of the user. The command says to modify the user and add it to a group named docker. You can change the username appropriately ($USER).

**NOTE:** : You need to logout and login back for the changes to be reflected.


### Docker is Installed, up and running 🥳🥳

Use the same command again, to verify that docker is up and running.

```
docker ps
```

Output should look like:

```
CONTAINER ID   IMAGE             COMMAND           CREATED      STATUS      PORTS  
```
