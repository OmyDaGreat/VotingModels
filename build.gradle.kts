plugins {
  kotlin("jvm") version "2.1.20"
}

group = "io.github.omydagreat"
version = "1.0.0"

repositories {
  mavenCentral()
  maven {
    url = uri("https://maven.pkg.github.com/omydagreat/kotlinutils")
    credentials {
      username = System.getenv("USERNAME") ?: "OmyDaGreat"
      password = System.getenv("GITHUB_TOKEN")
    }
  }
}

dependencies {
  val kUtilsV = "1.1.0"
  val wekaKtV = "0.0.7"
  testImplementation(kotlin("test"))
  implementation("io.github.omydagreat:kotlinutils:$kUtilsV")
  implementation("com.github.steven-lang:weka-kt:$wekaKtV")
}

tasks.test {
  useJUnitPlatform()
}
kotlin {
  jvmToolchain(21)
}