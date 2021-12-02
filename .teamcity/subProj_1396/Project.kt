package subProj_1396

import subProj_1396.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1396")
    name = "subProj 1396"

    buildType(subProj_bt_1396_4)
    buildType(subProj_bt_1396_3)
    buildType(subProj_bt_1396_5)
    buildType(subProj_bt_1396_0)
    buildType(subProj_bt_1396_2)
    buildType(subProj_bt_1396_1)
})
