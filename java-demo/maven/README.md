Assumes prior knowledge of maven.

We provide the default settings.xml in ../maven/ 

Copy it into the developers ~/.m2 directory or if using Jenkins into the Jenkins Manage files -> GLobal Maven Settings.xml (also add it into maven settings.xml if you want to be sure)

Edit the Mirrors section as required in order for users to access the repository. 

Edit the servers section so that the relevant credentials are added to access the repository.

Jenkins Kubernetes Settings
# Greg to add
Jenkins Maven Settings
# Greg to add
 -- Navigate to Jenkins -> Manage Jenkins -> Configure System
 -- Navigate to the Nexus Repository Manager Servers Section and enter the details for nexus 2 or 3
    e.g. 
    Name: Nexus 2
    ID: nexus-2
    Server Url: www.nexus2.project.name/nexus or www.nexus3.project.name
    Credentials: Enter as required

Jenkins Slave
# Greg to add