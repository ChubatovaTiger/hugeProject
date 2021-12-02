package subProj_1187

import subProj_1187.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1187")
    name = "subProj 1187"

    buildType(subProj_bt_1187_3)
    buildType(subProj_bt_1187_4)
    buildType(subProj_bt_1187_5)
    buildType(subProj_bt_1187_0)
    buildType(subProj_bt_1187_1)
    buildType(subProj_bt_1187_2)
})
