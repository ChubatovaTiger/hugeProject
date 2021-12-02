package subProj_953

import subProj_953.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_953")
    name = "subProj 953"

    buildType(subProj_bt_953_5)
    buildType(subProj_bt_953_0)
    buildType(subProj_bt_953_2)
    buildType(subProj_bt_953_1)
    buildType(subProj_bt_953_4)
    buildType(subProj_bt_953_3)
})
