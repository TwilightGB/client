FROM 192.168.250.83:52800/zcm9/centos7-java-base:openjdk1.8.0.151
MAINTAINER zsoft
COPY ./docker-app.def /root/docker-app.def
COPY ./ribbon-0.0.1-SNAPSHOT.jar /root/lib/
EXPOSE 8082
RUN mkdir -p /root/logs \
    && chmod +x /root/docker-app.def

LABEL zcm.logs.app="/root/logs/ribbon/*.log"
LABEL zcm.logs.app.tag="project=kp"
ENV APP_NAME=ribbon
VOLUME /root/logs

ENTRYPOINT ["/usr/local/bin/tini", "-g", "--", "docker-entrypoint.sh"]
CMD ["start"]
