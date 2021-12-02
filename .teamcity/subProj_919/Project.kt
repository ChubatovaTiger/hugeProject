package subProj_919

import subProj_919.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_919")
    name = "subProj 919"

    buildType(subProj_bt_919_5)
    buildType(subProj_bt_919_4)
    buildType(subProj_bt_919_3)
    buildType(subProj_bt_919_2)
    buildType(subProj_bt_919_1)
    buildType(subProj_bt_919_0)
})
