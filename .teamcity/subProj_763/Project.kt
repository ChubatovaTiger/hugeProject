package subProj_763

import subProj_763.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_763")
    name = "subProj 763"

    buildType(subProj_bt_763_5)
    buildType(subProj_bt_763_4)
    buildType(subProj_bt_763_1)
    buildType(subProj_bt_763_0)
    buildType(subProj_bt_763_3)
    buildType(subProj_bt_763_2)
})
