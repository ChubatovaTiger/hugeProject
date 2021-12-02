package subProj_1462

import subProj_1462.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1462")
    name = "subProj 1462"

    buildType(subProj_bt_1462_1)
    buildType(subProj_bt_1462_2)
    buildType(subProj_bt_1462_0)
    buildType(subProj_bt_1462_5)
    buildType(subProj_bt_1462_3)
    buildType(subProj_bt_1462_4)
})
