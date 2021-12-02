package subProj_739

import subProj_739.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_739")
    name = "subProj 739"

    buildType(subProj_bt_739_3)
    buildType(subProj_bt_739_4)
    buildType(subProj_bt_739_5)
    buildType(subProj_bt_739_0)
    buildType(subProj_bt_739_1)
    buildType(subProj_bt_739_2)
})
