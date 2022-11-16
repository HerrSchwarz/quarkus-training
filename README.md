# Craft-Night Quarkus Project
## Requitements
Install the following:

- Java
- Quarkus

There is no need to install the build tool, as Maven and Gradle Wrappers will be generated during setup.

## Generate application
Generate the application by running

```bash
quarkus create app <app_name>
```

You can add group and artifact ids as options or change the build tool used. Default is Maven, but Gradle is available as well. See

```bash
quarkus create app --help
```
Another option is to use the Maven plugin:

```bash
mvn "io.quarkus:quarkus-maven-plugin:create"
```

## Start application
You can either start the application using quarkus:

```bash
quarkus dev
```

or use the Maven plugin:

```bash
mvn quarkus:dev
```

Open `localhost:8080/hello` to see the greeting from the applicatoin.

## Dev Dashboard
Goto `localhost:8080/q/dev` to see the dahsboard.

## Hot reload
Open the one file generated in `src/main/<packages>/GreetingResource.java` and change the message. Go directly to your browser and refresh the page. The greetings message should be updated without a restart of the application.

You can also copy the GreetingsResource and add a new path with a different message. This should also be available immediatly.

## Tests
There was a test generated. Find it and alter the test. Go to the console, where you started the app, the test should already be executed. To rerun it press `r`.

##