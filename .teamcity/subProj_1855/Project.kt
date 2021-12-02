package subProj_1855

import subProj_1855.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1855")
    name = "subProj 1855"

    buildType(subProj_bt_1855_0)
    buildType(subProj_bt_1855_2)
    buildType(subProj_bt_1855_1)
    buildType(subProj_bt_1855_4)
    buildType(subProj_bt_1855_3)
    buildType(subProj_bt_1855_5)
})
