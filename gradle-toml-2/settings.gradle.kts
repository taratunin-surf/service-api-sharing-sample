rootProject.name = "gradle-toml-2"

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("../libs.versions.toml"))
            // overwrite dependency version
            version("bootVersion", "2.6.4")
        }
    }
}
