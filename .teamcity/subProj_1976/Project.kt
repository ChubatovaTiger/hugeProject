package subProj_1976

import subProj_1976.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1976")
    name = "subProj 1976"

    buildType(subProj_bt_1976_0)
    buildType(subProj_bt_1976_1)
    buildType(subProj_bt_1976_2)
    buildType(subProj_bt_1976_3)
    buildType(subProj_bt_1976_4)
    buildType(subProj_bt_1976_5)
})
