package subProj_1682

import subProj_1682.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1682")
    name = "subProj 1682"

    buildType(subProj_bt_1682_2)
    buildType(subProj_bt_1682_1)
    buildType(subProj_bt_1682_0)
    buildType(subProj_bt_1682_5)
    buildType(subProj_bt_1682_4)
    buildType(subProj_bt_1682_3)
})
