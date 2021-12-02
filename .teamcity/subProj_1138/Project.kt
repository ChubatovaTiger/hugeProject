package subProj_1138

import subProj_1138.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1138")
    name = "subProj 1138"

    buildType(subProj_bt_1138_0)
    buildType(subProj_bt_1138_3)
    buildType(subProj_bt_1138_4)
    buildType(subProj_bt_1138_1)
    buildType(subProj_bt_1138_2)
    buildType(subProj_bt_1138_5)
})
