## Kotlin Multiplatform programming library template
This is a bare-bones template for building a library used by Kotlin JVM and KotlinNative
desktop projects

##### Source tree

          commonMain
           /      \  
      jvmMain    nativeCommon
                  /        \  
          linuxX64Main   mingwX64Main

## Create a new library project _MyNewProject_ from this template

 * clone this project to a local directory named _MyNewProject_ (do not fork, you won't send pull requests)
 * update `settings.gradle.kts` and change
   * `set rootProject.name = "_MyNewProject_"`
 * update `build.gradle.kts` and change
   * `group = "_MyDomain_"`
   * `version = "x.y-SNAPSHOT"`

 * replace the LICENCE.txt with a license of your liking
   * https://choosealicense.com/
   * https://docs.github.com/en/free-pro-team@latest/github/creating-cloning-and-archiving-repositories/licensing-a-repository
 * delete `.git` directory (you probably won't want to keep the Git history of this template)
   * create a fresh Git repository (`git init`)
 * prepare the source files (just the bare initial basics)
 * setup your `.gitignore`  

Happy coding!