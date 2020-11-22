# Basic Docker File

FROM centos:7

# COPY src/bun.rpm dest/bun.rpm
# For this project: cp /var/lib/jenkins/workspace/hao-job/java/rpm/target/rpm/testproject/RPMS/noarch/testproject-1.0.0-1.noarch.rpm  $GIT_REPO/league-of-legends-repo
#    rmp will also live in $GIT_REPO/java/rpm/target/rpm/testproject/RPMS/noarch/testproject-1.0.0-1.noarch.rpm
# COPY league-of-legends-repo.rpm league-of-legends-repo.rpm

# Need to copy file from jenkins build into same location as the dockerfile
# cp /var/lib/jenkins/workspace/hao-job/java/rpm/target/rpm/testproject/RPMS/noarch/testproject-1.0.0-1.noarch.rpm  league-of-legends-repo.rpm

COPY league-of-legends-repo.rpm league-of-legends-repo.rpm

RUN yum -y update \
  && yum -y install java-11-openjdk.x86_64 \
  && yum -y install league-of-legends-repo.rpm 

CMD apps/testproject/bin/runjava.sh dumbun.MyServer 
  

# Build image with:
#    docker build --tag lolrepo:latest . 
# Run the container
#    docker run -d -p 8000:8000 --name lol lolrepo:latest


