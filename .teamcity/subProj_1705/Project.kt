package subProj_1705

import subProj_1705.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1705")
    name = "subProj 1705"

    buildType(subProj_bt_1705_4)
    buildType(subProj_bt_1705_3)
    buildType(subProj_bt_1705_5)
    buildType(subProj_bt_1705_0)
    buildType(subProj_bt_1705_2)
    buildType(subProj_bt_1705_1)
})
