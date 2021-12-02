package subProj_1841

import subProj_1841.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1841")
    name = "subProj 1841"

    buildType(subProj_bt_1841_3)
    buildType(subProj_bt_1841_2)
    buildType(subProj_bt_1841_5)
    buildType(subProj_bt_1841_4)
    buildType(subProj_bt_1841_1)
    buildType(subProj_bt_1841_0)
})
