package subProj_1708

import subProj_1708.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1708")
    name = "subProj 1708"

    buildType(subProj_bt_1708_5)
    buildType(subProj_bt_1708_4)
    buildType(subProj_bt_1708_1)
    buildType(subProj_bt_1708_0)
    buildType(subProj_bt_1708_3)
    buildType(subProj_bt_1708_2)
})
