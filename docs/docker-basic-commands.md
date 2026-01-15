```docker exec -it <container_id_or_name> <command>```
“docker exec -it lets you run commands interactively inside a running container without restarting it, which is useful for debugging and inspection.”
```docker exec -t 5bdd380e79bc python --version```
| Command       | What it does                                    |
| ------------- | ----------------------------------------------- |
| `docker run`  | Starts a **new container** and runs a command   |
| `docker exec` | Runs a command **inside an existing container** |

