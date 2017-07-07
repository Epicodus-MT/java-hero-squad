apply plugin: 'java'
apply plugin: 'application'

archivesBaseName = "friend-letter"
version = '1.0'
mainClassName = "App"

repositories {
  mavenCentral()
}

dependencies {
  compile group: 'com.sparkjava', name: 'spark-core', version: '2.3'
  testCompile group: 'junit', name: 'junit', version: '4.+'
  compile group: 'org.apache.velocity', name: 'velocity', version: '1.7'
}
