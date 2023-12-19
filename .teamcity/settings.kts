import jetbrains.buildServer.configs.kotlin.v2019_2.*

import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.PullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

version = "2023.05"

project {

   // vcsRoot(HttpsGithubComGradleGradleGit)


    val numProjects=12
    val numConfigurationsPerProject=800


    for (i in 0..numProjects) {
        subProject {
            id("subProj_$i")
            name = "subProj $i"

            for (j in 0..numConfigurationsPerProject) {
                buildType {
                    id("subProj_bt2_$i" + "_$j")
                    name = "bt2 $i $j"
  if (j > 798) {
if (i > 10) {
  
    
    vcs {
        root(AbsoluteId("Project2_Perf"))
    }

    triggers {
        vcs {
           
        }
    }

}    //endif
}    //endif

                }
            }
        }
    }
}






