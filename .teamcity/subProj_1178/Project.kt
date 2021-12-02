package subProj_1178

import subProj_1178.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1178")
    name = "subProj 1178"

    buildType(subProj_bt_1178_5)
    buildType(subProj_bt_1178_1)
    buildType(subProj_bt_1178_2)
    buildType(subProj_bt_1178_3)
    buildType(subProj_bt_1178_4)
    buildType(subProj_bt_1178_0)
})
