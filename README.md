# jazzer-custom-hooks

This repository shows how one could build custom hooks in a dedicated library and use them during a fuzzing run.
The example is very contrived but shows how fuzzing blocks could be overcome by using custom hooks.

# Project structure

- **lib** Library containing a custom hook.
- **app** Example application using methods intercepted by the custom hooks. Also includes a fuzz target to that 
just executes the `main` method of the application. 

# How-to

1. Install Jazzer as [described in its readme](https://github.com/CodeIntelligenceTesting/jazzer#using-the-provided-binaries)
2. Build the whole project with Gradle
```shell
./gradlew build
```
3. Test the example application
```shell
java -jar app/build/libs/app.jar
```
4. Fuzz the application with Jazzer
```shell
jazzer --cp=app/build/libs/app.jar:lib/build/libs/lib.jar --custom_hooks=com.code_intelligence.hooks.ClockHooks --target_class=com.code_intelligence.example.ExampleFuzzTarget
```
5. Alternatively autofuzz the application
```shell
 jazzer --cp=app/build/libs/app.jar:lib/build/libs/lib.jar --custom_hooks=com.code_intelligence.hooks.ClockHooks --autofuzz=com.code_intelligence.example.ExampleApplication::main
```
