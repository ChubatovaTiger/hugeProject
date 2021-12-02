package subProj_1888

import subProj_1888.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1888")
    name = "subProj 1888"

    buildType(subProj_bt_1888_2)
    buildType(subProj_bt_1888_1)
    buildType(subProj_bt_1888_0)
    buildType(subProj_bt_1888_5)
    buildType(subProj_bt_1888_4)
    buildType(subProj_bt_1888_3)
})
