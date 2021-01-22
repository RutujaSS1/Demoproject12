#!/bin/bash
javadoc -docletpath target/DemoProject-0.0.1-SNAPSHOT-jar-with-dependencies.jar -doclet com.AutomationTest.DemoProject.Doclet "$@"
