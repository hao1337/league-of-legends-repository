# Basic Docker File

FROM centos:7

# COPY src/bun.rpm dest/bun.rpm
# For this project: cp /var/lib/jenkins/workspace/hao-job/java/rpm/target/rpm/testproject/RPMS/noarch/testproject-1.0.0-1.noarch.rpm  $GIT_REPO/league-of-legends-repo
COPY league-of-legends-repo.rpm league-of-legends-repo.rpm

RUN yum -y update \
  && yum -y install java \
  && yum -y install league-of-legends-repo.rpm \
  && apps/testproject/bin/runjava.sh dumbun.MyServer 
  

# Build image with:
#    docker build --tag imagename:latest . 
# Run the container
#    docker run -d -p 4000:4000 --name imgName imagename:latest


