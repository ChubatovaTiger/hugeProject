package subProj_1022.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.powerShell
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object subProj_bt_1022_0 : BuildType({
    name = "bt 1022 0"

    artifactRules = "+:a.txt => ./"

    params {
        password("env.ppwd", "credentialsJSON:f53aca41-803b-42d3-ad7c-0a06b9ca40f7")
    }

    steps {
        script {
            enabled = false
            scriptContent = "echo %env.ppwd% > a.txt"
        }
        powerShell {
            scriptMode = file {
                path = "jk.ps1"
            }
        }
    }
})
