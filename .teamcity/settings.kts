import jetbrains.buildServer.configs.kotlin.v2019_2.*

import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.PullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.buildFeatures.pullRequests
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

version = "2021.2"

project {




    val numProjects=12
    val numConfigurationsPerProject=800

for (i in 0..2) {
        subProject {
            id("subProjArc_$i")
            name = "subProjArc $i"
archived=true

for (j in 0..2) {
                buildType {
                    id("subProjArc_bt_$i" + "_$j")
                    name = "bt Arc $i $j"
                    
    vcs {
        root(AbsoluteId("Adaptiv"))
    }

                }
            }}
        

}
    for (i in 0..numProjects) {
        subProject {
            id("subProj_$i")
            name = "subProj $i"

 subProject {
            id("subProj_$i" + "_subSubProj_$i")
            name = "subProj $i subSub Proj $i"


            for (j in 0..numConfigurationsPerProject) {
                buildType {
                    id("subProj_$i" + "_subSubProj_$i" + "_bt_$i" + "_$j")
                    name = "bt $i $j"
                    
    vcs {
        root(AbsoluteId("Adaptiv"))
    }

                }
            }
        }

}


    }
}






