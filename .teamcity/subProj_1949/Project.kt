package subProj_1949

import subProj_1949.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1949")
    name = "subProj 1949"

    buildType(subProj_bt_1949_5)
    buildType(subProj_bt_1949_0)
    buildType(subProj_bt_1949_4)
    buildType(subProj_bt_1949_3)
    buildType(subProj_bt_1949_2)
    buildType(subProj_bt_1949_1)
})
