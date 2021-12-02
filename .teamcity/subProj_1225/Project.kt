package subProj_1225

import subProj_1225.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1225")
    name = "subProj 1225"

    buildType(subProj_bt_1225_0)
    buildType(subProj_bt_1225_1)
    buildType(subProj_bt_1225_2)
    buildType(subProj_bt_1225_3)
    buildType(subProj_bt_1225_4)
    buildType(subProj_bt_1225_5)
})
