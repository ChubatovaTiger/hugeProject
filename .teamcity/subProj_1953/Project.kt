package subProj_1953

import subProj_1953.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1953")
    name = "subProj 1953"

    buildType(subProj_bt_1953_0)
    buildType(subProj_bt_1953_1)
    buildType(subProj_bt_1953_2)
    buildType(subProj_bt_1953_3)
    buildType(subProj_bt_1953_4)
    buildType(subProj_bt_1953_5)
})
