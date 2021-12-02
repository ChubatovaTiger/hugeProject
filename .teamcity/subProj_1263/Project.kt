package subProj_1263

import subProj_1263.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1263")
    name = "subProj 1263"

    buildType(subProj_bt_1263_5)
    buildType(subProj_bt_1263_4)
    buildType(subProj_bt_1263_1)
    buildType(subProj_bt_1263_0)
    buildType(subProj_bt_1263_3)
    buildType(subProj_bt_1263_2)
})
