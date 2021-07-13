# java-api-docker
This is an example project how to dockerize the java API project

check docker images
~~~
docker images
~~~

To stop all docker process:
~~~
docker stop $(docker ps -a -q)
~~~

To run remote docker image:
~~~
 docker run --name sample-java-api -p 8083:8083 -d <dockerhub-username>/sample-java-api
~~~

Run Local image as container:
~~~
docker run -d -p 8083:8083 sample-java-api
~~~

To pull docker image
~~~
 docker pull <dockerhub-username>/sample-java-api
~~~

To remove all container from local:
~~~
docker rmi -f $(docker images -a -q)
~~~
To build new image:
~~~
 docker build -t sample-java-api .
~~~
To Push newly build image:
~~~
docker login

docker tag sample-java-api <dockerhub-username>/sample-java-api

docker push <dockerhub-username>/sample-java-api
~~~
