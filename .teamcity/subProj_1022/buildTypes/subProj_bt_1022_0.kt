package subProj_1022.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*

object subProj_bt_1022_0 : BuildType({
    name = "bt 1022 0"

    params {
        password("env.ppwd", "credentialsJSON:22315edf-7a6e-41f0-905f-7799fb08e9cd")
    }
})
