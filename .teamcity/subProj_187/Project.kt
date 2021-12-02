package subProj_187

import subProj_187.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_187")
    name = "subProj 187"

    buildType(subProj_bt_187_1)
    buildType(subProj_bt_187_0)
    buildType(subProj_bt_187_3)
    buildType(subProj_bt_187_2)
    buildType(subProj_bt_187_5)
    buildType(subProj_bt_187_4)
})
