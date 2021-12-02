package subProj_1763

import subProj_1763.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1763")
    name = "subProj 1763"

    buildType(subProj_bt_1763_0)
    buildType(subProj_bt_1763_1)
    buildType(subProj_bt_1763_2)
    buildType(subProj_bt_1763_3)
    buildType(subProj_bt_1763_4)
    buildType(subProj_bt_1763_5)
})
