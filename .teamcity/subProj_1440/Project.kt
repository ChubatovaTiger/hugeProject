package subProj_1440

import subProj_1440.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1440")
    name = "subProj 1440"

    buildType(subProj_bt_1440_0)
    buildType(subProj_bt_1440_2)
    buildType(subProj_bt_1440_1)
    buildType(subProj_bt_1440_4)
    buildType(subProj_bt_1440_3)
    buildType(subProj_bt_1440_5)
})
