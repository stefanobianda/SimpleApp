# SimpleApp

Enable display support for linux system:

`export DISPLAY=:0.0`

`xhost +local:docker`

Create image and assign a tag

`docker build -t simpleapp:1.0.1 .`

Start the docker images:

`docker run -e DISPLAY -v /tmp/.X11-unix:/tmp/.X11-unix simpleapp:1.0.1 &`

