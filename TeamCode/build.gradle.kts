plugins {
    id("dev.frozenmilk.teamcode") version "11.0.0-1.0.0"
    id("dev.frozenmilk.sinister.sloth.load") version "0.2.4"
}

repositories {
	mavenLocal()
}

ftc {
    kotlin()
    sdk.TeamCode()
    implementation(dairy.Sloth)
}

val slothboardVersion = findProperty("slothboard.version") as String? ?: "1.0.0"

dependencies {
    implementation("com.acmerobotics.slothboard:dashboard:$slothboardVersion")
}
