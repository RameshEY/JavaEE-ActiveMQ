JavaEE ActiveMQ MDB Example
===================
Es wird eine kleine JavaEE Anwendung geschrieben, die über REST eine ActiveMQ Nachricht versendet.
Zudem gibt es ein ActiveMQListener, der Nachrichten über einen MDB empfangen kann.

#External ActiveMQ Broker Einstellungen
Wenn ein external ActiveMQ Broker verwendet werden soll, dann muss dies vorher eingestellt werden!
https://access.redhat.com/documentation/en-us/red_hat_jboss_a-mq/6.1/html/integrating_with_jboss_enterprise_application_platform/deployrar-installrar

# Installation
Folgendes Kommando ausführen:
```
mvn clean install
```
Anschließend die .war Datei auf euren JBoss/Wildfly Server legen

# GET/POST Tests
POST
```
$ curl -X POST 'http://localhost:8080/app/send?message=Max%20Mustermann'
```

# Nützliche Links
- web.xml http://docs.jboss.org/resteasy/docs/2.2.1.GA/userguide/html/Installation_Configuration.html
- jboss-web.xml https://docs.jboss.org/jbossweb/7.0.x/appdev/jbossweb.html
- standalone.xml https://access.redhat.com/documentation/en-us/red_hat_jboss_a-mq/6.1/html/integrating_with_jboss_enterprise_application_platform/deployrar-installrar