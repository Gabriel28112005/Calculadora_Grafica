package org.example;

import lombok.*;

/* Solo he conseguido que funcione Lombok con las siguientes configuraciones:
    - Compilador y versión --> Javak 21
    - Proyect structure:
        - SDK --> Eclipse temurin 21
        - Language level --> SDK default
    - pom.xml:
        - maven compiler source y target:
            <maven.compiler.source>21</maven.compiler.source>
            <maven.compiler.target>21</maven.compiler.target>

        - Dependencies y plugins de Lombok:
            <dependencies>
                <!-- Dependencias de Lombok -->
                <dependency>
                    <groupId>org.projectlombok</groupId>
                    <artifactId>lombok</artifactId>
                    <version>1.18.36</version>
                    <scope>provided</scope>
                </dependency>
            </dependencies>

            <build>
                <!-- Plugins de Lombok -->
                <plugins>
                    <plugin>
                        <groupId>org.apache.maven.plugins</groupId>
                        <artifactId>maven-compiler-plugin</artifactId>
                        <version>3.13.0</version>
                        <configuration>
                            <annotationProcessorPaths>
                                <path>
                                    <groupId>org.projectlombok</groupId>
                                    <artifactId>lombok</artifactId>
                                    <version>1.18.36</version>
                                </path>
                            </annotationProcessorPaths>
                        </configuration>
                    </plugin>
                </plugins>
            </build>

 */

@NoArgsConstructor @AllArgsConstructor @Getter @Setter @ToString

public class Prueba_Lombok {
    private int id;
    private String nombreUsuario;
    private int contrasena;

}