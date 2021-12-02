package subProj_1022.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

object subProj_bt_1022_0 : BuildType({
    name = "bt 1022 0"

    artifactRules = "+:a.txt => ./"

    params {
        password("env.ppwd", "credentialsJSON:d9065c72-de9e-4b1e-9bd8-fcc34c90dcee")
    }

    steps {
        script {
            enabled = false
            scriptContent = "echo %env.ppwd% > a.txt"
        }
        step {
            type = "Bigproject_subProj_1022_Bt10220"
            executionMode = BuildStep.ExecutionMode.DEFAULT
            param("sec", "credentialsJSON:03c848ae-0be2-4173-b32d-04c0a8621c8d")
            param("a", "a")
            param("b", "b")
            param("env.ppwd", "credentialsJSON:4f9e06b7-b6b6-44dc-afd1-0cbcb0dd2cde")
            param("c", "c")
            param("system.ppwd", "credentialsJSON:4f9e06b7-b6b6-44dc-afd1-0cbcb0dd2cde")
        }
    }
})
