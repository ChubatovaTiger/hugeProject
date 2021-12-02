package subProj_1801

import subProj_1801.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1801")
    name = "subProj 1801"

    buildType(subProj_bt_1801_1)
    buildType(subProj_bt_1801_0)
    buildType(subProj_bt_1801_5)
    buildType(subProj_bt_1801_4)
    buildType(subProj_bt_1801_3)
    buildType(subProj_bt_1801_2)
})
